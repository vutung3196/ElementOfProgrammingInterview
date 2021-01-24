package com.chapter1;

public class NumberOfBitsSetToOne {

    public static void main(String[] args) {
        System.out.println(calculate(1234));
        System.out.println(calculate(1235));
        System.out.println(calculate(1236));
        System.out.println(calculate(1237));
	    // write your code here
    }

    static short calculate(int number) {
        short result = 0;
        while (number != 0) {
            result += number & 1;
            // right shift
            number >>>= 1;
        }
        return result;
    }
}
