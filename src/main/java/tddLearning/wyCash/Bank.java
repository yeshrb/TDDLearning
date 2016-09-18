package tddLearning.wyCash;

import java.util.HashMap;

/**
 * Created by lijunjie on 16/9/18.
 */
public class Bank {

    private static HashMap<String, Double> rateTable = new HashMap<String, Double>();

    static {
        rateTable.put("USD",1.0);
        rateTable.put("CHF",0.5);
    }

    public static Cash plus(Cash augend, Cash addend) {

        int amount = toDollar(augend) + toDollar(addend) ;
        return new Cash(amount,"USD");
    }

    private static int toDollar(Cash cash) {
        int amount = (int) (cash.getAmount()* rateTable.get(cash.getCurrency()));
        return amount;
    }


}
