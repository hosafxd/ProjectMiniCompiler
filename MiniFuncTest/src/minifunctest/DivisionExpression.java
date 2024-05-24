/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minifunctest;

/**
 *
 * @author FurkanÖztürk
 */
public class DivisionExpression extends Expression {
    private Expression exp1, exp2;

    public DivisionExpression(Expression exp1, Expression exp2) {
        this.exp1 = exp1;
        this.exp2 = exp2;
    }

      @Override
    Object getValue() {
        double val1 = ((Number) exp1.getValue()).doubleValue();
        double val2 = ((Number) exp2.getValue()).doubleValue();
        
        double result = val1 / val2;
        if (result == (int) result) {
            return (int) result;
        } else {
            return result;
        }
    }

    @Override
    Expression execute() {
        double val1 = ((Number) exp1.getValue()).doubleValue();
        double val2 = ((Number) exp2.getValue()).doubleValue();
        
        double result = val1 / val2;
        if (result == (int) result) {
            return new IntegerLiteral((int) result);
        } else {
            return new DoubleLiteral(result);
        }
    }
}