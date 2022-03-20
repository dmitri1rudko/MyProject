package com.daikmont;

//Напишите метод который будет возвращать строку, но в параметры принимать число,
//если число будет четным пусть метод возвращает слово "четные числа" если нечетные то "нечетные числа"

public class MethodFour {
    public static void main(String[] args) {
        String str = returnString(4);
        System.out.println(str);
    }

    public static String returnString(int num) {
        if (num % 2 == 0) {
            return "Четное";
        }else if(num % 2 != 0) {
            return "Нечетное";
        }
        return "error";
    }
}
