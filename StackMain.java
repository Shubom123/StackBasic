package com.stack;
import java.util.Scanner;
public class StackMain {
    public static void main(String[] args) {
        System.out.println("Welcome to stack");
        System.out.println("Enter 1 to pushing data to stack");
        System.out.println("Enter 2 to popping data from stack");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice){
            case 1:
                Operations.pushing();
                break;
            case 2:
                Operations.popping();
                break;
            default:
                System.out.println("Wrong choice");
        }
    }
}
