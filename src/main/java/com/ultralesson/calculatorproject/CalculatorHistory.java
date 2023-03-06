package com.ultralesson.calculatorproject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CalculatorHistory {
    private List<Calculation> history = new ArrayList<>();
    private HashMap<String,Double> historyInHashMap=new HashMap<>();

    public void addCalculation(Calculation calculation) {
        history.add(calculation);
        historyInHashMap.put(calculation.getInput(),calculation.getResult());
    }

    public List<Calculation> getHistory() {
        return history;
    }

}
