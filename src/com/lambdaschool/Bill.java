package com.lambdaschool;

public class Bill extends Money {
    private String name;
    private int value;
    private String type;
    public Bill(String name, int value) {
        this.name = name;
        this.value = value;
        this.type = "bill";
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

}
