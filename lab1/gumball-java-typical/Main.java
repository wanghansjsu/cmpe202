public class Main {

	public static void main(String[] args) {
		// Model 1
		GumballMachine gumballMachine = new GumballMachine(5, 1);

		System.out.println(gumballMachine);

		gumballMachine.insertCoins(25);
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);

		// Model 2
		GumballMachine gumballMachine = new GumballMachine(5, 2);

        System.out.println(gumballMachine);

		gumballMachine.insertCoins(25);
		gumballMachine.turnCrank();
		gumballMachine.insertCoins(25);
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);

		// Model 3
		GumballMachine gumballMachine = new GumballMachine(5, 3);

		System.out.println(gumballMachine);

		gumballMachine.insertCoins(25);
		gumballMachine.turnCrank();
		gumballMachine.insertCoins(15);
		gumballMachine.insertCoins(5);
		gumballMachine.insertCoins(10);
		gumballMachine.insertCoins(10);
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);
	}
}