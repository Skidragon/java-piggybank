package com.lambdaschool;

public class Main {

    public static void main(String[] args) {
        Coin penny = new Coin("Penny",  .01);
        Coin nickle = new Coin("Nickle",  .05);
        Coin dime = new Coin("Dime",  .10);
        Coin quarter = new Coin("Quarter",  .25);

        Bill dollar = new Bill("1 Dollar Bill", 1);

        PiggyBank piggyBank = new PiggyBank("Simon's piggy bank");

        piggyBank.add(quarter,1);
        piggyBank.add(dime,1);
        piggyBank.add(dollar,5);
        piggyBank.add(nickle, 3);
        piggyBank.add(dime, 7);
        piggyBank.add(dollar, 1);
        piggyBank.add(penny, 10);

        piggyBank.printContents();
        System.out.println(piggyBank.getTotal());

    }
}
