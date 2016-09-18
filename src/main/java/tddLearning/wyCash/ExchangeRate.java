package tddLearning.wyCash;

import java.util.HashMap;

public class ExchangeRate {
    static HashMap<String, Double> rateTable = new HashMap<String, Double>();

    public static HashMap<String, Double> getRateTable() {
        return rateTable;
    }
}