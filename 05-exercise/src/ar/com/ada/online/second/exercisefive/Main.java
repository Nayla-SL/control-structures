package ar.com.ada.online.second.exercisefive;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Se tiene el nombre y la edad de tres personas. Se desea saber el nombre y la edad de la
        //persona de menor edad.

        int ageOne, ageTwo, ageThree;
        String nameOne;
        String nameTwo;
        String nameThree;
        int ageMinor;
        String nameMinor;

        Scanner keyboard = new Scanner(System.in);

        System.out.printf("Ingrese la edad y el nombre de la primer persona: ");
        ageOne = keyboard.nextInt();
        nameOne = keyboard.next();

        System.out.printf("Ingrese la edad y el nombre de la segunda persona: ");
        ageTwo = keyboard.nextInt();
        nameTwo = keyboard.next();

        System.out.printf("Ingrese la edad y el nombre de la tercer persona: ");
        ageThree = keyboard.nextInt();
        nameThree = keyboard.next();

        ageMinor = 0;
        nameMinor = "Nadie";

        if (ageOne < ageTwo && ageOne < ageThree) {
            ageMinor = ageOne;
            nameMinor = nameOne;
        } else if (ageTwo < ageOne && ageTwo<ageThree) {
            ageMinor = ageTwo;
            nameMinor = nameTwo;
        } else if (ageThree< ageOne && ageThree<ageTwo){
            ageMinor = ageThree;
            nameMinor = nameThree;
        } else {
            System.out.printf("Hay dos personas con la misma edad");
        }

        System.out.print(nameMinor + " es la persona menor y tiene " + ageMinor + " años");






    }
}
