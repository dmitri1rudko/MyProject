package com.daikmont;
//         напишите метод который будет принимать три числа,
//        и в методе найдите среднюю арифметическую этих трех цифр,
//        и верните нам значени есредней арифметической
public class MethodFive {
    public static void main(String[] args) {
        System.out.println("Средняя арифметическая: " + midlle(3, 6, 8));
    }
    public static double midlle(int a, int b, int c){
        double mid = (a + b + c)/3;
        return mid;

    }
}
