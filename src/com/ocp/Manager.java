package com.ocp;

public class Manager implements Employee{
    @Override
    public double calculateBonus(String employee) {
        return 5000 * 0.2;
    }
}
