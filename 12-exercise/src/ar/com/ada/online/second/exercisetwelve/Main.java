package ar.com.ada.online.second.exercisetwelve;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*Realice un algoritmo que permita determinar el sueldo semanal de un trabajador con
        base en las horas trabajadas y el pago por hora, considerando que a partir de la hora
        número 41 y hasta la 45, cada hora se le paga el doble, de la hora 46 a la 50, el triple, y
        que trabajar más de 50 horas no está permitido. Represente el algoritmo mediante el
        diagrama de flujo y el pseudocódigo
    */

        int workedHours;
        double hourlyWage;
        double weeklySalary;

        Scanner keyboard = new Scanner(System.in);

        System.out.printf("Ingrese la cantidad de horas trabajadas: ");
        workedHours = keyboard.nextInt();

        System.out.printf("Ingrese el valor por hora $");
        hourlyWage = keyboard.nextDouble();

        weeklySalary = 0;


        if (workedHours > 50) {
            System.out.printf("No está permitido trabajar más de 50 horas semanales");
        } else if (workedHours > 40 && workedHours <= 45) {
            weeklySalary = (40 * hourlyWage) + (workedHours - 40) * (hourlyWage * 2);
        } else if (workedHours > 45 && workedHours <= 50) {
            weeklySalary = (40 * hourlyWage) + (workedHours - 45) * (hourlyWage * 3) + 5 * (hourlyWage * 2);
        } else if (workedHours <= 40) {
            weeklySalary = workedHours * hourlyWage;
        }

        System.out.println("El sueldo de esta semana es $" + weeklySalary);


    }
}
