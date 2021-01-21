package meli;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Ingresa el numero");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 0;
        while (n > 0) {
            if (i % 2 == 0 & i > 0) {
                System.out.println( i + " Es par ");
                n--;
            }
            i++;
        }
    }
}
