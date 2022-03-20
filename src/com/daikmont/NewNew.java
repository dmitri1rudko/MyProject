package com.daikmont;
//напишите метод который в параметрах будет принимать число,
//        а в методе должна быть такая операция(мы должны
//        найти сумму всех чисел до введенного нам числа)
//        input 10(1+2+3...10) output 55
public class NewNew {
    public static void main(String[] args) {
        System.out.println("output: " + method(10));
    }
    public static int method(int num){
        int sum = 0;
        for (int i = 0; i <= num; i++) {
            sum += i;
        }
        return sum;
    }
}
