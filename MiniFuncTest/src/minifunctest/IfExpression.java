/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minifunctest;

/**
 *
 * @author FurkanÖztürk
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

class IfExpression extends Expression {

 private ConditionalExpression condition;
    private Expression trueExp;
    private Expression falseExp;

    public IfExpression(ConditionalExpression condition, Expression trueExp, Expression falseExp) {
        this.condition = condition;
        this.trueExp = trueExp;
        this.falseExp = falseExp;
    }

    @Override
    public Expression execute() {
        if ((Boolean) condition.getValue()) {
            return trueExp.execute();
        } else {
            return falseExp.execute();
        }
    }

    @Override
    public String toString() {
        return "if " + condition + " { " + trueExp + " } else { " + falseExp + " }";
    }

    @Override
    public Object getValue() {
        return execute().getValue();
    }
}
