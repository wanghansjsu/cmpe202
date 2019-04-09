import java.util.function.BinaryOperator;

public enum StrategyEnum {
    ADD((x, y) -> x + y),
    SUB((x, y) -> x - y),
    MUL((x, y) -> x * y);

    private BinaryOperator<Integer> operator;

    StrategyEnum(BinaryOperator<Integer> operator) {
        this.operator = operator;
    }

    public BinaryOperator<Integer> get() {
        return operator;
    }
}

