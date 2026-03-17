package com.junit;

import java.util.Scanner;

class WrongPasswordException extends RuntimeException {
    public WrongPasswordException(String message) {
        super(message);
    }
}

public class ExpClass {

    private static final String CORRECT_PASSWORD = "admin123";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int attempts = 0;

        while (attempts < 3) {

            System.out.print("Enter Password: ");
            String input = sc.nextLine();

            if (CORRECT_PASSWORD.equals(input)) {
                System.out.println("Login Successful");
                sc.close();
                return;
            } else {
                attempts++;
                System.out.println("Wrong Password! Attempts left: " + (3 - attempts));
            }
        }

        sc.close();
        throw new WrongPasswordException("Wrong password entered 3 times. Account Locked!");
    }
}