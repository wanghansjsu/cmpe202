import java.utils.Arrays;

public class GumballMachine
{

    private int coin_values;
    private int cost;
    private int machine_model;
    private int num_gumballs;
    private boolean has_enough_coins;
    private int[] supported_coins;

    public GumballMachine(int size, int model)
    {
        // initialise instance variables
        this.coin_values = 0;
        this.cost = (model == 1) ? 25 : 50;
        /*
        Model 1: Accept one quarter
        Model 2: Accept two quarters
        Model 3: Accept all coins
        */
        this.machine_model = model;
        this.num_gumballs = size;
        this.has_enough_coins = false;
        this.supported_coins = new int[]{1, 5, 10, 25};
    }

    public void insertCoins(int coin) {
        switch(this.machine_model) {
            case 1:
                if(coin == 25 && this.coin_values == 0) {
                    if(this.coin_values == 0){
                        this.coin_values += coin;
                        this.has_enough_coins = true;   
                    } else {
                        System.out.println("Only accept one quarter!");
                    }
                } else {
                    System.out.println("Quater only!");
                }
                break;
            case 2:
                if(coin == 25) {
                    if(this.coin_values == this.cost) {
                        System.out.println("Only accept two quarters!");
                    }
                    this.coin_values += coin;
                    this.has_enough_coins = (this.coin_values == this.cost) ? true : false;
                } else {
                    System.out.println("Quater only!");
                }
                break;
            case 3:
                if(Arrays.asList(supported_coins).contains(coin)) {
                    // Suppose person can keep adding coins even cost is reached
                    this.coin_values += coin;
                    this.has_enough_coins = (this.coin_values >= this.cost) ? true : false;
                } else {
                    System.out.println("Unsupported coin!");
                }
                break;
        }
    }
    
    public void turnCrank() {
        if(this.has_enough_coins) {
            if(this.num_gumballs > 0) {
                this.num_gumballs--;
                this.coin_values -= this.cost;

                if(this.coin_values < this.cost)
                    this.has_enough_coins = false;

                System.out.println( "Thanks for your quarter.  Gumball Ejected!" );
            } else {
                System.out.println( "No More Gumballs!  Sorry, can't return your quarter." ) ;
            }
        } else {
            System.out.println( "Please insert " + (machine_model == 3) ? "coins" : "quarter(s)");
        }
    }
}