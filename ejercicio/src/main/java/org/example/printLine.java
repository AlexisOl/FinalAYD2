package org.example;

public class printLine implements reporteCommand {

    @Override
    public void print(String customer) {
    }

    @Override
    public void printLineItem(String item) {
        System.out.println(" - Item: " + item);

    }

    @Override
    public void printTotal(double total) {

    }
}
