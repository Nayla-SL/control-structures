package ar.com.ada.online.second.exercisefour;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //El dueño de un estacionamiento requiere un diagrama de flujo con el algoritmo que le permita determinar cuánto
        // debe cobrar por el uso del estacionamiento a sus clientes. Las tarifas que se tienen son las siguientes:
        // a. Las dos primeras horas a $5.00 c/u.
        // b. Las siguientes tres a $4.00 c/u.
        // c. Las cinco siguientes a $3.00 c/u.
        // d. Después de diez horas el costo por cada una es de dos pesos

        int hoursParked;
        double totalPrice;

        Scanner keyboard = new Scanner(System.in);

        System.out.printf("Ingrese la cantidad de horas que el auto ha estado estacionado: ");
        hoursParked = keyboard.nextInt();

        if (hoursParked <= 2) {
            totalPrice = hoursParked * 5;
        } else if (hoursParked <= 5) {
            totalPrice = 2 * 5 + (hoursParked - 2) * 4;
        } else if (hoursParked <= 10) {
            totalPrice = 2 * 5 + 3 * 4 + (hoursParked - 5) * 3;
        } else {
            totalPrice = 2*5 + 3*4 + 5*3 + (hoursParked * 2);
        }
        System.out.print("El total a pagar es $" + totalPrice);



    }
}
