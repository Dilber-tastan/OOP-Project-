package com.example.oopproje;

public class user extends people {
    String name ;
    String job;
   // constructor

    public user(String name, String job) {
        this.name = name;
        this.job = job;
        System.out.println("user created");
    }
}
