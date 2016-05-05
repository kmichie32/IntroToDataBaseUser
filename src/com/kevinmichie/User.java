package com.kevinmichie;

import java.util.HashSet;
import java.util.Set;

public class User {

    String username;
    String password;
    int age;
    Set<Integer> orderIDs;

    public User(String customUserName, String customPassword,
                int customAge, Set<Integer> customOrderIDs){

        this.username = customUserName;
        this.password = customPassword;
        this.age = customAge;
        this.orderIDs = customOrderIDs;


    }

    public static void main(String[] args) {
	// write your code here
        Set a = new HashSet<>();
        a.add(1212);
        User kevin = new User("kmichie32", "theRealKevinMichie", 25, a);
    }
}
