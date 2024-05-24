package minifunctest;

import java.util.Scanner;
import java.util.*;
public class StudentTestCases {

	private StudentTestCases() { }
	
	
	static void handleIfStatement(Scanner scanner) {
    System.out.println("if 'enter expression 1' ? 'enter expression 2' : 'enter expression 3'");

    // Get the condition
    System.out.println("Enter condition (e.g., 17 < 23):");
    String condition = scanner.nextLine();
    ConditionalExpression condExp = parseCondition(condition);


    System.out.println("Enter expression if true:");
    String trueExpression = scanner.nextLine();
    Expression trueExp = parseExpression(trueExpression);

  
    System.out.println("Enter expression if false:");
    String falseExpression = scanner.nextLine();
    Expression falseExp = parseExpression(falseExpression);

    // Create and evaluate the if expression
    IfExpression ifExp = new IfExpression(condExp, trueExp, falseExp);
    Expression result = ifExp.execute();


    System.out.println(ifExp + " = " + result.getValue());
}

private static ConditionalExpression parseCondition(String condition) {
    // Add spaces around the operators for easier splitting
    condition = condition.replaceAll("([<>=!]+)", " $1 ");


    String[] parts = condition.trim().split("\\s+");
    if (parts.length != 3) {
        throw new IllegalArgumentException("Invalid condition format");
    }

    Expression exp1 = parseLiteral(parts[0]);
    Expression exp2 = parseLiteral(parts[2]);
    ConditionalOperator cop = parseOperator(parts[1]);

    return new ConditionalExpression(exp1, exp2, cop);
}

private static ConditionalOperator parseOperator(String op) {
    switch (op) {
        case "<": return ConditionalOperator.Less;
        case ">": return ConditionalOperator.Greater;
        case "<=": return ConditionalOperator.LessEqual;
        case ">=": return ConditionalOperator.GreaterEqual;
        case "==": return ConditionalOperator.Equal;
        case "!=": return ConditionalOperator.NotEqual;
        default: throw new IllegalArgumentException("Invalid operator: " + op);
    }
}

private static Expression parseExpression(String expr) {

    if (expr.matches("-?\\d+(\\.\\d+)?")) {

        return parseLiteral(expr);
    } else {
     
        return new StringLiteral(expr);
    }
}

private static Expression parseLiteral(String literal) {
    // If the literal is enclosed in double quotes, treat it as a string literal
    if (literal.startsWith("\"") && literal.endsWith("\"")) {
        return new StringLiteral(literal.substring(1, literal.length() - 1));
    }

    // Otherwise, try parsing the literal as a numeric value
    try {
        if (literal.contains(".")) {
            return new DoubleLiteral(Double.parseDouble(literal));
        } else {
            return new IntegerLiteral(Integer.parseInt(literal));
        }
    } catch (NumberFormatException e) {
        throw new IllegalArgumentException("Invalid literal: " + literal);
    }
   

}
    
        
        // student test case 2
    
 static void testCase2() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter an expression:");
    String input = scanner.nextLine().replaceAll("\\s+", "");

 
    char operator = findOperator(input);


    double operand1 = Double.parseDouble(input.substring(0, input.indexOf(operator)));


    double operand2 = Double.parseDouble(input.substring(input.indexOf(operator) + 1, input.lastIndexOf('=')));

    
    double result = Double.parseDouble(input.substring(input.lastIndexOf('=') + 1));

    //expected result based on the operator
    double expected;
    switch (operator) {
        case '+':
            expected = operand1 + operand2;
            break;
        case '-':
            expected = operand1 - operand2;
            break;
        case '*':
            expected = operand1 * operand2;
            break;
        case '/':
            expected = operand1 / operand2;
            break;
        default:
            throw new IllegalArgumentException("Invalid operator: " + operator);
    }

    // Check if the result matches the expected value
    boolean isCorrect = Double.compare(result, expected) == 0;

    System.out.println("Result: " + isCorrect);
}

// find the operator
private static char findOperator(String input) {
    for (int i = 0; i < input.length(); i++) {
        char ch = input.charAt(i);
        if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
            return ch;
        }
    }
    throw new IllegalArgumentException("No operator found in the input");
}



public static void recursiveSort(double[] array, int n) {
        if (n == 1) {
            return;
        }

        // Find the maximum element in the array and place it at the end
        for (int i = 0; i < n - 1; i++) {
            if (array[i] > array[i + 1]) {
                double temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
            }
        }

        // Recursively sort the rest of the array
        recursiveSort(array, n - 1);
    }

    // Student test case 3
    public static void testCase3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers separated by spaces:");

        // Read the input line and split by one or more spaces
        String input = scanner.nextLine().trim();
        String[] tokens = input.split("\\s+");

       
        double[] numbers = new double[tokens.length];
        for (int i = 0; i < tokens.length; i++) {
            numbers[i] = Double.parseDouble(tokens[i]);
        }

    
        recursiveSort(numbers, numbers.length);     // Sort recursively

       
        System.out.println("Sorted numbers:");  // Print sorted array
        for (double number : numbers) {
            if ((int) number == number){
            System.out.print((int)number + " ");}
            else{System.out.print(number + " ");}
        
        }
        System.out.println("");
    }
	
}
