package ar.com.ada.online.second.exerciseseven;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // El presidente de la república ha decidido estimular a todos los estudiantes de una
        //universidad mediante la asignación de becas mensuales, para esto se tomarán en
        //consideración los siguientes criterios:
        //Para alumnos mayores de 18 años con promedio mayor o igual a 9, la beca será de
        //$2000.00; con promedio mayor o igual a 7.5, de $1000.00; para los promedios menores
        //de 7.5 pero mayores o iguales a 6.0, de $500.00; a los demás se les enviará una carta de
        //invitación incitándolos a que estudien más en el próximo ciclo escolar.
        //A los alumnos de 18 años o menores de esta edad, con promedios mayores o iguales a
        //9, se les dará $3000; con promedios menores a 9 pero mayores o iguales a 8, $2000;
        //para los alumnos con promedios menores a 8 pero mayores o iguales a 6, se les dará
        //$100, y a los alumnos que tengan promedios menores a 6 se les enviará carta de
        //invitación. Realice el algoritmo correspondiente y represéntelo con un diagrama de flujo.

        int studentsAge;
        double scholarship;
        double studentsAverage;

        Scanner keyboard = new Scanner(System.in);

        System.out.printf("Ingrese la edad del alumno: ");
        studentsAge = keyboard.nextInt();

        System.out.printf("Ingrese el promedio del alumno: ");
        studentsAverage = keyboard.nextDouble();

        if (studentsAge > 18) {
            if (studentsAverage >= 9) {
                scholarship = 2000;
            } else if (studentsAverage >= 7.5) {
                scholarship = 1000;
            } else if (studentsAverage >= 6) {
                scholarship = 500;
            } else {
                scholarship = 0;
                System.out.printf("Tu promedio no es suficiente, estudia más el próximo ciclo escolar para recibir la beca");
            }
        } else {
            if (studentsAverage >= 9) {
                scholarship = 3000;
            } else if (studentsAverage >= 8) {
                scholarship = 2000;
            } else if (studentsAverage >= 6) {
                scholarship = 100;
            } else {
                scholarship = 0;
                System.out.printf("Tu promedio no es suficiente, estudia más el próximo ciclo escolar para recibir la beca");
            }

        }
        System.out.print("La beca que le corresponde es de $" + scholarship);
    }
}
