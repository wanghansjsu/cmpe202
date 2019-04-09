package source;

public class Context {
    private Strategy strategy;

    public Context(String strategy) {
        switch (strategy) {
            case "add":
                this.strategy = new Add();
                break;
            case "sub":
                this.strategy = new Sub();
                break;
            default:
                this.strategy = new Mul();
                break;
        }

    }

    public int getResult(int x, int y) {
        return strategy.count(x, y);
    }
}
