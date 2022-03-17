package com.daikmont;

public class Main {

    public static void main(String[] args) {
	    User Ivan = new User("Ivan","ivan@ivan.com");
        User Dasha = new User("Dasha", "dasha@dasha.com");
        System.out.println(Ivan.userName + ":" + Ivan.userMail);

        //add user
        new AddUser();
        AddUser adduser = new AddUser();
        adduser.writeUser();
    }

}
