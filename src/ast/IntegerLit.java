package ast;

public class IntegerLit extends Literal {
    int value;

    public IntegerLit(int value) {
        this.value = value;
    }

    @Override
    public String toJava() {
        return new Integer(this.value).toString();
    }
}
