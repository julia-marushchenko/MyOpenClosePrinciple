package com.ocp;

public class Contractor implements Employee{
    @Override
    public double calculateBonus(String employee) {
        return 500 * 0.02;
    }
}
