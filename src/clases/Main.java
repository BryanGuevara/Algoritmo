/*Desarrollar un algoritmo que solicite un número entero positivo y como
resultado muestre todos los números impares entre 0 y el número
ingresado. Utilizar la estructura repetitiva “While”.*/
package clases;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Declaracion de variables y Scanner
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int n = 0;

        //Ingresar valores
        System.out.println("=============[Numero]==============");
        System.out.println("                                   ");
        System.out.print("Ingrese un numero: ");
        num = scanner.nextInt();

        //Algoritmo
        if (num > 0) {
            System.out.println("                                   ");
            System.out.println("==============[Serie]==============");
            System.out.println("                                   ");
            System.out.println("0");

            while (n <= num) {

                if (n % 2 == 0) {
                } else {
                    System.out.println(n);
                }

                n++;
            }

            System.out.println("                                   ");
            System.out.println("===================================");

        } else {

            System.out.println("                                   ");
            System.out.println("==============[Error]==============");
            System.out.println("                                   ");
            System.out.println("tiene que ser numero positivo");
            System.out.println("                                   ");
            System.out.println("===================================");

        }

    }

}
