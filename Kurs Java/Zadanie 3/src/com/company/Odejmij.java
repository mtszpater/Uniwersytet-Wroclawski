package com.company;

/**
 * author @pater
 */
public class Odejmij extends Operator2Arg {
    private Wyrazenie a;
    private Wyrazenie b;

    public Odejmij(Wyrazenie a, Wyrazenie b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double oblicz() {
        return a.oblicz() - b.oblicz();
    }

    @Override
    public String toString() {
        return "(" + a + "-" + b + ")";
    }
}