package ar.com.ada.online.second.exerciseeight;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Cierta empresa proporciona un bono mensual a sus trabajadores, el cual puede ser por
        //su antigüedad o bien por el monto de su sueldo (el que sea mayor), de la siguiente
        //forma:
        //Cuando la antigüedad es mayor a 2 años pero menor a 5, se otorga 20 % de su sueldo;
        //cuando es de 5 años o más, 30 %. Ahora bien, el bono por concepto de sueldo, si éste es
        //menor a $1000, se da 25 % de éste, cuando éste es mayor a $1000, pero menor o igual a
        //$3500, se otorga 15% de su sueldo, para más de $3500. 10%.


        double salary;
        int seniority;
        int percentageBonusSeniority;
        int percentageBonusSalary;


        Scanner keyboard = new Scanner(System.in);

        System.out.printf("Ingrese el sueldo del empleado: ");
        salary = keyboard.nextDouble();

        System.out.printf("Ingrese la antiguedad del empleado: ");
        seniority = keyboard.nextInt();

        percentageBonusSalary = 0;
        percentageBonusSeniority = 0;

        if (seniority > 2 && seniority < 5) {
            percentageBonusSeniority = 20;
        } else if (seniority >= 5) {
            percentageBonusSeniority = 30;
        }
        if (salary < 1000){
            percentageBonusSalary = 25;
        }   else if (salary >= 1000) {
            percentageBonusSalary = 15;
        } else if (salary > 3500 ){
            percentageBonusSalary = 10;
        }

        if (percentageBonusSalary > percentageBonusSeniority) {
            System.out.print("El bono que le corresponde es de " + percentageBonusSalary + "%");
        } else {
            System.out.print("El bono que le corresponde es de " + percentageBonusSeniority + "%");
        }

    }
}
