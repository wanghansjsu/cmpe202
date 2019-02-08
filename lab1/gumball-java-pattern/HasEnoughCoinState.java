
public class HasEnoughCoinState implements State {
	GumballMachine gumballMachine;
	int model;
 
	public HasEnoughCoinState(GumballMachine gumballMachine, int model) {
		this.gumballMachine = gumballMachine;
		this.model = model;
	}

	public void insertCoin(int coin) {
		if((this.model == 2 && this.gumballMachine.sum == (2 * this.gumballMachine.quarter))
		       || this.model == 1) {
			System.out.println("You can't insert another quarter");
			return;
		}

		System.out.println("You inserted a coin");
		gumballMachine.sum += coin;
		gumballMachine.coinsInside.push(coin);
	}

	public void ejectCoin() {
		/*
		The function will
		1) If coinsInside is not empty, return all the coins
		2) If coinsInside is empty, return coins match the sum
		*/
		if(this.gumballMachine.sum == 0) {
			System.out.println("Yo, no coin inside");
			return;
		}

		if(!this.gumballMachine.coinsInside.empty()) {
			int size = this.gumballMachine.coinsInside.size();
			for(int idx = 0; idx < size; idx++) {
				System.out.println("Coin with " + this.gumballMachine.coinsInside.pop() + " cents returned");
			}
		} else {
			System.out.println(this.gumballMachine.returnExtraCoin());
		}

		this.gumballMachine.sum = 0;
		gumballMachine.setState(gumballMachine.getNoEnoughCoinState());
	}
 
	public void turnCrank() {
		System.out.println("You turned...");

		/*
		this.gumballMachine.sum -= this.gumballMachine.cost;
		this.gumballMachine.clearStack();

		if(this.model == 3 && this.gumballMachine.sum == 0) {
			gumballMachine.setState(gumballMachine.getSoldState());
			return;
		}
		System.out.println(this.gumballMachine.sum + "left");
		*/
	}

    public void dispense() {
		/*
		The function will
		1) Deduct cost from sum
		2) Clean up coinsInside stack
		3) Change state to sold state only if sum is zero
		*/
		this.gumballMachine.releaseBall();
		this.gumballMachine.sum -= this.gumballMachine.cost;
		this.gumballMachine.coinsInside.clear();

		if(this.gumballMachine.getCount() > 0) {
			if(this.gumballMachine.sum < this.gumballMachine.cost) {
				gumballMachine.setState(gumballMachine.getNoEnoughCoinState());
			}
			System.out.println(this.gumballMachine.sum + " cent(s) left");
		} else {
			System.out.println("Oops, out of gumballs!");
			gumballMachine.setState(gumballMachine.getSoldOutState());
		}
    }
 
	public String toString() {
		return "waiting for turn of crank";
	}
}
