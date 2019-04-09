public class Context {
    private StrategyEnum strategy;

    public Context(StrategyEnum strategy) {
        this.strategy = strategy;

    }

    public int getResult(int x, int y) {
        return strategy.get().apply(x, y);
    }
}
