package com.daikmont;

import java.util.Random;
import java.util.Scanner;

public class AddUser {
    Scanner scanner = new Scanner(System.in);
    String name, mail;

    public AddUser(){
        System.out.println("Enter user name");
        name = scanner.next();
        System.out.println("Enter user mail");
        mail = scanner.next();
    }
    public void writeUser(){
        AddUser add = new AddUser();
        Random random = new Random(10);
        add.name = String.valueOf(random.nextInt());
        add.mail = String.valueOf(random.nextInt());
    }
}

