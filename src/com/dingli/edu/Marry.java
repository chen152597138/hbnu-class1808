package com.dingli.edu;

import java.util.Scanner;

public class Marry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int height = scanner.nextInt();
        double wealth = scanner.nextDouble();
        boolean appearance = scanner.nextBoolean();

        if (height > 180 && wealth > 10000 && appearance) {
            System.out.println("直接嫁了！！！！");
        } else if (height > 180 || wealth > 10000 || appearance) {
            System.out.println("勉强嫁了！！！！");
        } else {
            System.out.println("不嫁了！");
        }
    }
}
