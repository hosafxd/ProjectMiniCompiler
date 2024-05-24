/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minifunctest;

/**
 *
 * @author FurkanÖztürk
 */
public class AddExpression extends Expression {
    private Expression exp1, exp2;

    public AddExpression(Expression exp1, Expression exp2) {
        this.exp1 = exp1;
        this.exp2 = exp2;
    }

    @Override
    Object getValue() {
        Object val1 = exp1.getValue();
        Object val2 = exp2.getValue();
        if (val1 instanceof String || val2 instanceof String) {
            return val1.toString() + val2.toString();
        } else if (val1 instanceof Double || val2 instanceof Double) {
           double result=((Number) val1).doubleValue() + ((Number) val2).doubleValue();
       if (result == (int) result) {
                return (int) result;
            } else {
                return result;
       }} else {
            return ((Number) val1).intValue() + ((Number) val2).intValue();
        }
    }

    @Override
   Expression execute() {
    Object val1 = exp1.getValue();
    Object val2 = exp2.getValue();
    if (val1 instanceof String || val2 instanceof String) {
        return new StringLiteral(val1.toString() + val2.toString());
    } else if (val1 instanceof Double || val2 instanceof Double) {
       double result = ((Number) val1).doubleValue() + ((Number) val2).doubleValue();
            if (result == (int) result) {
                return new IntegerLiteral((int) result);
            } else {
                return new DoubleLiteral(result);
            }
        } else {
            int result = ((Number) val1).intValue() + ((Number) val2).intValue();
            return new IntegerLiteral(result);
        }
    }
}