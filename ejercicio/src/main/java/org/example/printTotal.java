package org.example;

public class printTotal implements reporteCommand{

    @Override
    public void print(String customer) {

    }

    @Override
    public void printLineItem(String item) {

    }

    @Override
    public void printTotal(double total) {
        System.out.println("Total: $" + total);
    }
}
