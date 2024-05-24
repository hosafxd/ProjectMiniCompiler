package minifunctest;
import java.util.*;

public class MiniFuncTest {

	public static void main(String[] args) {
		
            //USER INTERFACE
        Scanner scanner = new Scanner(System.in);


       
        
        
        
		/// given test cases
		TestCases.literalTests();		
		TestCases.variableTests();
		TestCases.arithmeticExpressioTest();
		TestCases.logicalExpression();
		TestCases.conditionalExpression();
		TestCases.ifExpression();
TestCases.test999();
		/// student test cases
		
		
	  System.out.println("Enter 'if' to proceed with the if statement:");
          System.out.println("Enter 'check' to proceed with the result checker:");
           System.out.println("Enter 'sort' to proceed with sort:");
       
    String command = scanner.nextLine();
        // Normalize input: convert to lowercase and remove all spaces
        command = command.toLowerCase().replaceAll("\\s+", "");
        
                if (command.equalsIgnoreCase("if")) {
            StudentTestCases.handleIfStatement(scanner);
        } else if (command.equalsIgnoreCase("check")){
           StudentTestCases.testCase2();
        }else if (command.equalsIgnoreCase("sort")){
            StudentTestCases.testCase3();
        }
        else 
        System.out.println("Invalid command. Exiting.");
        
       
        
       
        
        
        
        
		//StudentTestCases.testCase3();
        
        
	
}

   
}