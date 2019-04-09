package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("10 số fibonaci đầu tiên");
        for (int i = 0; i < 10; i++) {
            System.out.print(fibonaci(i) + " ");
        }

    }

    static int fibonaci(int n) {

        if (n < 0) {
            return -1;
        } else if (n == 0 || n == 1) {
            return n;
        } else {
            return fibonaci(n - 1) + fibonaci(n - 2);
        }
    }
}
