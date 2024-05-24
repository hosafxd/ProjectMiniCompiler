/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minifunctest;

/**
 *
 * @author FurkanÖztürk
 */
class NegateExpression extends Expression {
private Expression exp;

    public NegateExpression(Expression exp) {
        this.exp = exp;
    }

    @Override
    public Integer getValue() {
        return -((Integer) exp.getValue());
    }

    @Override
   Expression execute() {
    Object val = exp.getValue();
    if (val instanceof Integer) {
        return new IntegerLiteral(-(Integer) val);
    } else {
        return new DoubleLiteral(-(Double) val);
    }
}

    @Override
    public String toString() {
        return "-" + exp.toString();
    }
}