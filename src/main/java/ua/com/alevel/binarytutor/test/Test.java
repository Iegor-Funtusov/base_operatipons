package ua.com.alevel.binarytutor.test;

import ua.com.alevel.binarytutor.ConvertUtil;

import java.util.ArrayList;

public class Test {

    public void algebra() {
        int a = 100;
        int b = 6;
        int sum = a + b;
        System.out.println("sum = " + sum);
        System.out.println("sum = " + (sum << 4));
        int sub = a - b;
        System.out.println("sub = " + sub);
        int mul = a * b;
        System.out.println("mul = " + mul);
        int div = a / b;
        float divD = a / b;
        System.out.println("div = " + div);
        System.out.println("divD = " + divD);

        boolean tr = 10 % 2 == 0;
        boolean fls = false;

        boolean or = tr || fls;
        boolean and = tr & fls;

        System.out.println("or = " + or);
        System.out.println("and = " + and);
    }

    public void binary() {
        for (int i = 0 ; i < 10 ; i++) {
            System.out.println("i = " + i + ", binary: " + ConvertUtil.convertNumberToBinary(i, Byte.class));
            int b = i << 2;
            System.out.println("b = " + b + ", binary: " + ConvertUtil.convertNumberToBinary(b, Byte.class));
            System.out.println("________________");
        }
    }

    public void ar() {
        int a = 87432;
        System.out.println("a * 2 = " + a * 2);
        System.out.println("a << 1 = " + (a << 1));
        System.out.println("a / 2 = " + a / 2);
        System.out.println("a >> 1 = " + (a >> 1));
    }

    public int reverse(int data) {
        int result = 0;
        boolean end = true;
        ArrayList<Integer> integers = new ArrayList<>();
        do {
            if (data / 10 < 1) {
                end = false;
            } else {
                int mod = data % 10;
                data = data - mod;
                data = data / 10;
                integers.add(mod);
            }
        } while (end);
        int reverse = 0;
        if (integers.size() != 0) {
            result = (int) (integers.get(integers.size() - 1) * Math.pow(10, integers.size()));
            for (Integer integer : integers) {

            }
        }

        return result;
//        StringBuilder s = new StringBuilder(String.valueOf(data));
//        String ss = s.reverse().toString();
//
       // dibil
//
//        return Integer.parseInt(ss);
    }
}
