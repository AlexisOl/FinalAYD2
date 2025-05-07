package org.example;
import java.util.List;
import java.util.ArrayList;

public class FinalExample {
    public void FinalExample() {}

    public void processData(String input) {
        List<String> data = new ArrayList<>();
        String[] parts = input.split(",");
        for (String part : parts) {
            part = part.trim();
            if (part.length() > 0) {
                if (part.length() > 10) {
                    part = part.substring(0, 10);
                }
                if (part.matches("[a-zA-Z]+")) {
                    data.add(part.toUpperCase());
                }
            }
        }

        System.out.println("Data processed:");
        for (String item : data) {
            System.out.println("- " + item);
        }

        System.out.println("Total items:");
        for (String item : data) {
            System.out.println("- " + item);
        }
    }


    // restructurarcion con un objeto usuario
    public String createUser(user usuario) {
        // Validation logic mixed with creation
        if (usuario.getName() == null || usuario.getName().isEmpty()) {
            return "Name cannot be empty";
        }
        if (usuario.getEmail() == null || !usuario.getEmail().contains("@")) {
            return "Invalid email";
        }
        // ... more validations

        return "User created: " + usuario.getName();
    }

    // este debera de ser builer
    public class Order {
        private String customerName;
        private List<String> items;
        private double total;

        public void printOrderSummary() {
            ReportGenerator generator = new ReportGenerator();
            printHeader imprimir = new printHeader();
            imprimir.print(customerName);

            printLine print_line = new printLine();
            for (String item : items) {
                print_line.printLineItem(item);
            }
            printTotal totalImprimr = new printTotal();
            totalImprimr.printTotal(total);
        }
    }

    // se estructuro con command
    public class ReportGenerator {
        public void printHeader(String customer) {
            System.out.println("Order for: " + customer);
        }

        public void printLineItem(String item) {
            System.out.println(" - Item: " + item);
        }

        public void printTotal(double total) {
            System.out.println("Total: $" + total);
        }
    }





    // este debera de ser estrategy
    public double calculateArea(String shape, double... dimensions) {
        switch (shape) {
            case "circle":
                return Math.PI * dimensions[0] * dimensions[0];
            case "rectangle":
                return dimensions[0] * dimensions[1];
            case "triangle":
                return dimensions[0] * dimensions[1] / 2;
            default:
                throw new IllegalArgumentException("Unknown shape");
        }
    }
}