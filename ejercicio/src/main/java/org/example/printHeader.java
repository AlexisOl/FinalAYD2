package org.example;

public class printHeader implements reporteCommand {
    @Override
    public void print(String customer) {
            System.out.println("Order for: " + customer);
    }

    @Override
    public void printLineItem(String item) {

    }

    @Override
    public void printTotal(double total) {

    }
}
