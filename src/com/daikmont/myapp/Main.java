package com.daikmont.myapp;

import java.util.Objects;
import java.util.Scanner;

/*
                    Poultry Log Book app
    1. Ввод посаженых цыплят
    2. Установка даты первой бонитировки. Сколько секций в корпусе.
       Какой процент поголовья вмещает секция.
    3. Функция падежа и брака.(с указанием причины и создания статистики)
    4. График роста по неделям.
    5. Учет воды, отопления, электроэнергии, кормов

 */
public class Main {

    static int actual;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        addSmallChickens();
        System.out.println(actual);
    }
                    // Ввод посаженых цыплят
    public static void addSmallChickens() {

        System.out.println("Введите количество посаженых цыплят: ");
        actual = scanner.nextInt();
        mainMenu();
    }
                        // Брак
    public static void defectChicken() {
        System.out.println("Введите количество брака:");
        int defect = scanner.nextInt();
        actual -= defect;
    }
                        // Падёж
    public static void lostChicken() {
        System.out.println("Введите количество падежа:");
        int lost = scanner.nextInt();
        actual -= lost;
    }

    public static void showActual() {
        System.out.println(actual);
    }

    public static void mainMenu() {
            String cmd = scanner.next();
            System.out.println("Введите команду одну из команд: show actual, defect, lost");
            if (Objects.equals(cmd, "show actual")) showActual();
            else if (Objects.equals(cmd, "defect")) defectChicken();
            else if (Objects.equals(cmd, "lost")) lostChicken();
    }
}



