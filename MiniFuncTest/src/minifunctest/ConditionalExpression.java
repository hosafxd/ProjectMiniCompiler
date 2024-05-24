/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minifunctest;

/**
 *
 * @author FurkanÖztürk
 */
class ConditionalExpression extends Expression{
 private Expression exp1;
    private Expression exp2;
    private ConditionalOperator cop;

    public ConditionalExpression(Expression exp1, Expression exp2, ConditionalOperator cop) {
        this.exp1 = exp1;
        this.exp2 = exp2;
        this.cop = cop;
    }

    @Override
    public Boolean getValue() {
        Comparable val1 = (Comparable) exp1.getValue();
        Comparable val2 = (Comparable) exp2.getValue();

        switch (cop) {
            case Equal: return val1.equals(val2);
            case NotEqual: return !val1.equals(val2);
            case Less: return val1.compareTo(val2) < 0;
            case LessEqual: return val1.compareTo(val2) <= 0;
            case Greater: return val1.compareTo(val2) > 0;
            case GreaterEqual: return val1.compareTo(val2) >= 0;
            default: throw new IllegalStateException("Unknown operator: " + cop);
        }
    }

    @Override
    public Expression execute() {
        return this;
    }

    @Override
    public String toString() {
        return "(" + exp1.toString() + " " + cop.toString() + " " + exp2.toString() + ")";
    }
}