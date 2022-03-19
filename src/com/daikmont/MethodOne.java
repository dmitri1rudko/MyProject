package com.daikmont;

import java.util.Scanner;

//        напишите метод который в праметрах будет принимать интовое значение.
//        В теле метода должна быть такая операция если вы введете 10 output: **********

public class MethodOne {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int variable = scanner.nextInt();
        System.out.println("Enter number:");
        inputInt(variable);
    }

    public static void inputInt(int var) {
        if (var == 10){
            System.out.println("*********");
        }else System.out.println("Program ended");
    }
}
