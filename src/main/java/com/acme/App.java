package com.acme;

public class App {
    public String getGreeting() {
        return "Welcome to the sample app.";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }
}
