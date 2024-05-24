/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minifunctest;

/**
 *
 * @author FurkanÖztürk
 */
public class XorExpression extends Expression {
    private final Expression exp1;
    private final Expression exp2;

    public XorExpression(Expression exp1, Expression exp2) {
        this.exp1 = exp1;
        this.exp2 = exp2;
    }

    @Override
    Object getValue() {
        return (Boolean) exp1.getValue() ^ (Boolean) exp2.getValue();
    }

    @Override
    Expression execute() {
        return new BooleanLiteral((Boolean) exp1.getValue() ^ (Boolean) exp2.getValue());
    }

    @Override
    public String toString() {
        return exp1 + " xor " + exp2;
    }
}
