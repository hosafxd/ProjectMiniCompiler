/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minifunctest;

/**
 *
 * @author FurkanÖztürk
 */
public class NotExpression extends Expression {
    private final Expression exp;

    public NotExpression(Expression exp) {
        this.exp = exp;
    }

    @Override
    Object getValue() {
        return !(Boolean) exp.getValue();
    }

    @Override
    Expression execute() {
        return new BooleanLiteral(!(Boolean) exp.getValue());
    }

    @Override
    public String toString() {
        return "not(" + exp + ")";
    }
}