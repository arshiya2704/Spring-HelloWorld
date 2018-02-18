package com.example.helloworld;

interface Greeter {

    void setName(String name);
    String getGreeting();
}

public class Greeting implements Greeter {
    private String name;
    public void setName(String name){
        this.name= name;
    }


    public String getGreeting() {
        return("Hello World from "+ name + "!!");
    }
}

