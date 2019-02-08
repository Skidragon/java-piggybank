package com.lambdaschool;

import java.util.ArrayList;

public class PiggyBank {
    private static ArrayList<String> moneyList = new ArrayList<String>();
    private String name;
    private static int maxId = 0;
    private int id = 0;
    public double total;

    public PiggyBank(String name) {
        maxId++;
        id = maxId;
        this.name = name;
    }

    public void add(Money money, int quantity) {
        total += money.getValue() * quantity;
        if(money.getType() == "coin") {
            moneyList.add(quantity + " " + money.getName());
        }
        else if(money.getType() == "bill") {
            moneyList.add("$" + (int) (money.getValue() * quantity));
        }
    }
    public void printContents() {
        int size = moneyList.size();
        for(int i = 0; i < size; i++) {
            System.out.println(moneyList.get(i));
        }
    }
    public String getTotal() {
        return "The piggy banks holds $" + total;
    }
}
