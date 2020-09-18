package ua.com.alevel.binarytutor;

import ua.com.alevel.binarytutor.test.Test;

public class Main {

    public static void main(String[] args) {
        Test test = new Test();
        int reverse = test.reverse(187309857);
        System.out.println("reverse = " + reverse);
    }
}
