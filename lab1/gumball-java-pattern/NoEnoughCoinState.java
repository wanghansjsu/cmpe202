

public class NoEnoughCoinState implements State {
    GumballMachine gumballMachine;

    public NoEnoughCoinState(GumballMachine gumballMachine) {
    	this.gumballMachine = gumballMachine;
    }
 
	public void insertCoin(int coin) {
		System.out.println("You inserted a coin");

		this.gumballMachine.sum += coin;
		this.gumballMachine.coinsInside.push(coin);
		if(this.gumballMachine.sum >= this.gumballMachine.cost) {
			this.gumballMachine.setState(gumballMachine.getHasEnoughCoinState());
		}
	}

	public void ejectCoin() {
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
	}
 
	public void turnCrank() {
    	System.out.println("You turned, but there's no enough coin");
	 }
 
	public void dispense() {
    	System.out.println("You need to pay first");
	} 
 
	public String toString() {
    	return "waiting for coins";
	}
}
