package meli;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean band, a;
        int numero, j = 0, s = 2, m;

        System.out.println("Cuantos primos quieres generar");
        Scanner entrada = new Scanner(System.in);
        numero = entrada.nextInt();

        for (int x = 1; x <= numero; x++) {

            a = false;
            while (!a) {

                m = 2;
                band = true;

                while ((band) && (m < s)) {
                    if(s % m == 0){
                        band = false;
                    } else {
                        m = m +1;
                    }
                }
                if(band){
                    j = j +1;
                    System.out.println("El numero primo "+j+" es "+s);
                    a = true;
                }
                s = s+1;
            }
        }
    }
}
