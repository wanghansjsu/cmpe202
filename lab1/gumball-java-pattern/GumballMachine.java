import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class GumballMachine {
 
	State soldOutState;
	State noEnoughCoinState;
	State hasEnoughCoinState;

	State state = soldOutState;

	int cost;
	int count = 0;
	/*
	Model 1: Accept one quarter only, cost one quarter;
	Model 2: Accept at most two quarters, cost two quarters;
	Model 3: Accept all kinds of coins, cost 50 cents;
	*/
	int model;
	int sum = 0;

	int penny = 1;
	int nickel = 5;
	int dime = 10;
	int quarter = 25;

	Stack<Integer> coinsInside = new Stack<>();
 
	public GumballMachine(int numberGumballs, int model) {
		soldOutState = new SoldOutState(this);
		noEnoughCoinState = new NoEnoughCoinState(this);
		hasEnoughCoinState = new HasEnoughCoinState(this, model);

		this.count = numberGumballs;
		this.model = model;

		this.cost = (model == 1) ? this.quarter : (2 * this.quarter);
		
 		if (numberGumballs > 0) {
			state = noEnoughCoinState;
		} 
	}

	public void insertPenny() {
		if(this.model != 3) {
			System.out.println("Whoa, penny is not supported by this machine!");
			return;
		}
		state.insertCoin(this.penny);
	}

	public void insertNickel() {
		if(this.model != 3) {
			System.out.println("Whoa, nickel is not supported by this machine!");
			return;
		}
		state.insertCoin(this.nickel);
	}

	public void insertDime() {
		if(this.model != 3) {
			System.out.println("Whoa, dime is not supported by this machine!");
			return;
		}
		state.insertCoin(this.dime);
	}

	public void insertQuarter() {
		state.insertCoin(this.quarter);
	}

	public void ejectCoin() {
		state.ejectCoin();
	}
 
	public void turnCrank() {
		state.turnCrank();
		state.dispense();
	}

	public String returnExtraCoin() {
		Integer[] coins = new Integer[]{this.quarter, this.dime, this.nickel, this.penny};
		Arrays.sort(coins, Collections.reverseOrder());

		int size = coins.length;
		int[] num = new int[size];
		for(int i = 0; i < size; i++) {
			num[i] = this.sum / coins[i];
			this.sum %= coins[i];
		}

		String res = num[0] + " quarter(s), " + num[1] + " dime(s), "
				   + num[2] + " nickel(s), " + num[3] + " penny(s) returned";
		return res;
	}

	void setState(State state) {
		this.state = state;
	}
 
	void releaseBall() {
		System.out.println("A gumball comes rolling out the slot...");
		if (count != 0) {
			count = count - 1;
		}
	}
 
	int getCount() {
		return count;
	}
 
	void refill(int count) {
		this.count = count;
		this.sum = 0;
		state = noEnoughCoinState;
	}

    public State getState() {
		return state;
    }

    public State getSoldOutState() {
		return soldOutState;
    }

    public State getNoEnoughCoinState() {
        return noEnoughCoinState;
    }

    public State getHasEnoughCoinState() {
		return hasEnoughCoinState;
    }

    public String getGumballModel() {
		if(this.model == 1) {
			return "Gumball Model #2004";
		} else if(this.model == 2) {
			return "Gumball Model #2006";
		} else {
			return "Gumball Model #2008";
		}
	}
 
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nMighty Gumball, Inc.");
		result.append("\nJava-enabled Standing " + getGumballModel());
		result.append("\nInventory: " + count + " gumball");
		if (count != 1) {
			result.append("s");
		}
		result.append("\n");
		result.append("Machine is " + state + "\n");
		return result.toString();
	}
}
