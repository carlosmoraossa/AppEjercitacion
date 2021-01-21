package meli;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Ingresa el numero n");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n%2  != 0 ) {
            System.out.println( n + " Es numero primo ");
        } else {
            System.out.println("No es numero primo");
        }
    }
}
