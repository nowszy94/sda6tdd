package com.sda;

public class CalcService {
    public int calculate(String text) {
        String[] array = text.split(";");
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += Integer.valueOf(array[i]);
        }
        return sum;
    }
}
