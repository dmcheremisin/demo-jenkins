package org.example.demo;

/**
 * Hello world!
 */
public class App
{

    private final String message = "Hello World!";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }

    private String getMessage() {
        return message;
    }

    private String getAnotherMessage() {
        return "Another message!!";
    }

}
