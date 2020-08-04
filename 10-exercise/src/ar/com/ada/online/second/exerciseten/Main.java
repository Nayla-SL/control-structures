package ar.com.ada.online.second.exerciseten;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Determine a qué lugar podrá ir de vacaciones una persona, considerando que la línea de
        //autobuses “La tortuga” cobra por kilómetro recorrido. Se debe considerar el costo del
        //pasaje tanto de ida, como de vuelta; los datos que se conocen y que son fijos son:
        //México, 750 km; P.V., 800 km; Acapulco, 1200 km, y Cancún, 1800 km. También se debe
        //considerar la posibilidad de tener que quedarse en casa.


        double holidayBudget;
        double pricePerKm;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese el dinero que planea gastar en sus vacaciones $");
        holidayBudget = keyboard.nextDouble();

        System.out.print("Ingrese el valor del kilómetro $");
        pricePerKm = keyboard.nextDouble();

        if (holidayBudget >= pricePerKm * 1800 * 2) {
            System.out.printf("Usted puede ir a Cancún");
        } else if (holidayBudget >= pricePerKm * 1200 * 2) {
            System.out.printf("Usted puede ir a Acapulco");
        } else if (holidayBudget >= pricePerKm * 1200 * 2) {
            System.out.printf("Usted puede ir a Acapulco");
        } else if (holidayBudget >= pricePerKm * 800 * 2) {
            System.out.printf("Usted puede ir a P.V.");
        } else if (holidayBudget >= pricePerKm * 750 * 2) {
            System.out.printf("Usted puede ir a México");
        } else {
            System.out.printf("No le alcanza el presupuesto, debe quedarse en casa.");
        }
    }
}
