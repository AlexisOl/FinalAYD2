package org.example;

public class Circulo implements AreasFiguras {


    @Override
    public Double area(String shape, double... dimensions) {
        return Math.PI * dimensions[0] * dimensions[0];
    }
}
