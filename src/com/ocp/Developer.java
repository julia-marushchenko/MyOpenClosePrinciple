package com.ocp;

public class Developer  implements Employee{
    @Override
    public double calculateBonus(String employee) {
        return 2000 * 0.1;
    }
}
