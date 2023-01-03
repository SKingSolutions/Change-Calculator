import java.util.*;

public class Main {

    public static void main(String[] args){

        List<Integer> coins = Arrays.asList(200,100,50,20,10,5,2,1);  // List of coins (in pence)
        int sum = 879;                                               // Amount of money
        List<Integer> used = new ArrayList<>();                     // Empty list for used coins

        while(sum > 0){
            for(Integer i: coins){                                // Checks through list of coins
                if(sum >= i){
                    sum = sum - i;                              // Subtracts coin value from the sum if it can
                    used.add(i);                               // Populates the used coins list
                    break;
                }
            }
        }

        int length = used.size(); Integer previous = 3; used.add(0); int counter = 1; // Required for optional user
        System.out.println("Coin  Quantity");                                        //  readable functionality below
        for(int i = 0; i < length; i++ ){                                 // Optional section for saying quantity of coins used
            if(used.get(i+1) == used.get(i)){                            //  rather than saying them one after another
                counter++;
            }else {
                if (used.get(i) < 10) {                                   // Optional section for putting money into
                    System.out.println(used.get(i) + "p    " + counter); //  pounds and pence rather than integer pence
                }else if(used.get(i) <= 50){
                    System.out.println(used.get(i) + "p   " + counter);
                } else if (used.get(i) == 100) {
                    System.out.println("£1    " + counter);
                } else {
                    System.out.println("£2    " + counter);
                }
                counter = 1;
            }
        }

    }
}
