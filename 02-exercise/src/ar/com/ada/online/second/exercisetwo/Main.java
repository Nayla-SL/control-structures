package ar.com.ada.online.second.exercisetwo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Realice un algoritmo para determinar el sueldo semanal de un trabajador con base en
        //las horas trabajadas y el pago por hora, considerando que después de las 40 horas cada
        //hora se considera como excedente y se paga el doble. Construya el diagrama de flujo, el
        //pseudocódigo.

        int workedHours;
        double pricePerHour;
        double weeklySalary;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de horas trabajadas: ");
        workedHours = keyboard.nextInt();

        System.out.print("Ingrese el valor que se paga por hora $");
        pricePerHour = keyboard.nextDouble();

        if (workedHours <= 40) {
            weeklySalary = workedHours * pricePerHour;
        } else {
            weeklySalary = (40 * pricePerHour) + ((workedHours - 40) * (pricePerHour * 2);
        }

        System.out.print("Le corresponde un salario de $" + weeklySalary);



    }
}
