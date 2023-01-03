import java.util.*;

public class Main {

    public static void main(String[] args){

        List<Integer> coins = Arrays.asList(200,100,50,20,10,5,1); //List of coins
        int sum = 27;                                             //Amount of money

        while(sum > 0){
            for(Integer i: coins){                                //checks through list of coins
                if(sum >= i){
                    sum = sum - i;                                //subtracts it from the sum if it can
                    if(i <= 50){
                        System.out.println(i+ "p");
                    }else if(i == 100){
                        System.out.println("£1");
                    }else{System.out.println("£2");}
                    // optional section for putting money into pounds and pence  rather than integer pence
                    break;
                }
            }
        }

    }
}
