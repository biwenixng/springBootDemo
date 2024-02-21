package com.example.bbbbSys.Test;

import com.example.bbbbSys.pojo.User;

public class MathTest {
    public static int add(int a, int b) {
        int sum = a;
        while (b != 0) {
            sum = a ^ b;
            b = (a & b) << 1;
            a = sum;
        }
        return sum;
    }

    public static void main(String[] args) {
//        System.out.println(add(33,65))
        System.out.println( true ^ false);
    }
}
