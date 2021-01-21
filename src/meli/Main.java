package meli;

import java.util.Scanner;

public class Main {

    private static int charCount(String s,char c){
        int cont=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)==c){
                cont++;
            }
        }
        return cont;
    }

    public static boolean cumpleCondicion(int i,int m, int d){
        //convierto a string
        String s = Integer.toString(i);
        char c = (char) (d+'0');

        return charCount(s,c)==m;

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese cantidad de numeros que quiere ver: ");
        int n = scanner.nextInt();

        System.out.println("Ingrese cuantas veces se repite el numero: ");
        int m = scanner.nextInt();

        System.out.println("Ingrese cual es el numero que se repite: ");
        int d = scanner.nextInt();

        int i=1;
        int cont=0;

        while (cont<n){
            if(cumpleCondicion(i,m,d)){
                System.out.println(i);
                cont++;
            }
            i++;
        }
        scanner.close();
    }
}
