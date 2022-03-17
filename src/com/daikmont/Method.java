package com.daikmont;

import java.util.Scanner;

public class Method {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        if (input == 1) {
            hello();
        } else if (input == 0) {
            bye();
        } else System.out.println("Input number 1 or 0");
    }
    public static void hello() {
        System.out.println("Hello my friend");
    }

    public static void bye() {
        System.out.println("Goodbye my friend");
    }
}
