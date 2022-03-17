package com.daikmont;

import java.util.Random;

//        напишите метод который будет принимать в свои параметры массив,
//        вызовите метод и передайте туда заполненный массив типа инт.
public class DZ {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[random.nextInt(5)];
        for (int i = 0; i < array.length-1; i++) {
            array[i] = random.nextInt();
        }
        Massive(array);
    }
    public static void Massive(int[] mass) {
        for (int i = 0; i < mass.length-1; i++) {
            System.out.println(mass[i] + " ");
        }
    }
}
