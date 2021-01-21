package meli;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Ingresa el numero n");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println("Ingrese el numero m");
        Scanner scanner1 = new Scanner(System.in);
        int m = scanner.nextInt();
        int i = 0;
        int result = m/n;

        while (n > 0) {
            if (result%2  == 0 & i > 0) {
                System.out.println( i + " Es par ");
                n--;
            }
            i++;
        }
    }
}
