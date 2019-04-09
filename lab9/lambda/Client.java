public class Client {
    public static void main(String[] args) {
        int x = 8;
        int y = 6;

        //add
        System.out.println(new Context(StrategyEnum.ADD).getResult(x, y));
        //sub
        System.out.println(new Context(StrategyEnum.SUB).getResult(x, y));
        //mul
        System.out.println(new Context(StrategyEnum.MUL).getResult(x, y));
    }
}
