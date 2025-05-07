package org.example;

public class Triangulo implements AreasFiguras {
    @Override
    public Double area(String shape, double... dimensions) {
        return dimensions[0] * dimensions[1] / 2;
    }
}
