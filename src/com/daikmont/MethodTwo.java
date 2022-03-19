package com.daikmont;
//        напишите метод который принимает в свои параметры массив,
//        в теле метода найдите сумму всех элементов массива


public class MethodTwo {

    static int summary = 0;

    public static void main(String[] args) {
        int[] array = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        inputArray(array);
    }

    public static void inputArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            summary = summary + array[i];
        }
        System.out.print("Answer: " + summary);
    }
}
