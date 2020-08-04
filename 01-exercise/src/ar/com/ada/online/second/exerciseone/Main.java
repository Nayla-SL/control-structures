package ar.com.ada.online.second.exerciseone;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Realice un algoritmo para determinar si una persona puede votar con base en su edad
        //en las próximas elecciones. Construya el diagrama de flujo y el pseudocódigo.

        int votersAge;
        int legalAge;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese la edad legal para votar en su país: ");
        legalAge = keyboard.nextInt();

        System.out.print("Ingrese la edad de la persona que desea votar: ");
        votersAge = keyboard.nextInt();

        if (votersAge >= legalAge) {
            System.out.printf("La persona puede votar");
        } else {
            System.out.printf("La persona no puede votar");
        }


    }
}
