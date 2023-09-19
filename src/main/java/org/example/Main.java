package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numInicial;
        do {
            System.out.println("Escriba el número inicial (0 para salir): ");
            numInicial = sc.nextInt();
            if(numInicial == 0){
                System.exit(0);
            }
            System.out.println("Escriba el número final: ");
            int numFinal = sc.nextInt();

            int contador = 0;

            System.out.println("Buscando primos...");
            for (int i = numInicial; i <= numFinal; i++) {
                if (esPrimo(i)) {
                    contador++;
                    System.out.println(i);
                }
            }
            System.out.println("Se han encontrado " + contador + " numeros primos en el intervalo");
        } while (numInicial != 0);
    }
    public static boolean esPrimo(int numero) {
        if (numero == 0 || numero == 1 || numero == 4) {
            return false;
        }
        for (int x = 2; x < numero / 2; x++) {
            if (numero % x == 0)
                return false;
        }
        return true;
    }
}