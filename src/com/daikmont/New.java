package com.daikmont;

import java.util.Arrays;

//Надо создать масссив и заполнить его рандомными числами,
//        Надо написать метод который будет принимать массив,
//        в теле массива надо написать такую логику
//        которая найдет самое маленькое число
public class New {
    public static void main(String[] args) {
        int[] massive = {3, 5, 7, 43, 6543, 345, 3, 6, 8, 7};
        sortArray(massive);

    }
    public static void sortArray(int[] mas){
        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length-1; i++) {
                if(mas[i] > mas[i+1]){
                    isSorted = false;

                    buf = mas[i];
                    mas[i] = mas[i+1];
                    mas[i+1] = buf;
                }
            }
        }
        System.out.println(Arrays.toString(mas));
    }

}
