package com.lambdaschool;

public class Coin extends Money {
    private String name;
    private double value;
    private String type;
    public Coin(String name, double value) {
        this.name = name;
        this.value = value;
        this.type = "coin";
    }

    public String getName() {
        return name;
    }

    @Override
    public double getValue() {
        return value;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Coin{" +
                "name='" + name + '\'' +
                ", value=" + value +
                ", type='" + type + '\'' +
                '}';
    }
}
