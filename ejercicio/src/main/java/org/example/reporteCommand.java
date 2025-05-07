package org.example;

public interface reporteCommand {
    void print(String customer);
    void printLineItem(String item);
    void printTotal(double total);
}
