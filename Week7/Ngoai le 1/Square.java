public class Square extends Expression {
    private Expression expression;

    public Square(Expression expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        return "(" + expression.toString() + ") ^ 2"; 
    }

    @Override
    public double evaluate() {
        double res = expression.evaluate();
        return res * res;
    }
}
