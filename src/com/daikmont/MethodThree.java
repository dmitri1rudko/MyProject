package com.daikmont;
//        Напишите метод который будет принимать в себя 3 параметра
//        типа инт,  input: 4,7, 2 отсортируйте их output: 2 4 7

import java.util.Scanner;

public class MethodThree {

    static Scanner scanner = new Scanner(System.in);
    static int[] sortedArray = new int[3];

    public static void main(String[] args) {
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        inputIntSorting(a, b, c);
    }

    public static void inputIntSorting(int one, int two, int three) {
        int[] presortedArray = {one, two, three};

        for (int i = 0; i <= presortedArray.length; i++) {
            if (presortedArray[i] < presortedArray[i+1]) {
                for (int j = 0; j <= sortedArray.length; j++) {
                    sortedArray[j] += presortedArray[i];
                }
            }
        }
        readArray();
    }

    public static void readArray() {
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.println(sortedArray[i] + " ");
        }
    }
}
