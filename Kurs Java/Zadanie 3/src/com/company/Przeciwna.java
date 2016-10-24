/*
 * Copyright (c) 2016. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.company;

/**
 * author @pater
 */
public class Przeciwna extends Operator1Arg{
    private Wyrazenie a;

    public Przeciwna(Wyrazenie a) {
        this.a = a;
    }

    @Override
    public double oblicz() {
        return a.oblicz() * (-1.0);
    }
    @Override
    public String toString() {
        return "(-1)*" + a;
    }

}