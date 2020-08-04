package ar.com.ada.online.second.exercisenine;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Una compañía de seguros para autos ofrece dos tipos de póliza: cobertura amplia (A) y
        //daños a terceros (B).
        // Para el plan A, la cuota base es de $1,200, y para el B, de $950.
        // A ambos planes se les carga 10% del costo si la persona que conduce tiene por hábito
        //beber alcohol
        // 5% si utiliza lentes,
        // 5% si padece alguna enfermedad –como deficiencia cardiaca o diabetes–,
        // y si tiene más de 40 años, se le carga 20%,
        // de lo contrario sólo 10%.
        // Todos estos cargos se realizan sobre el costo base.

        String policyType;
        double initialWage;
        double aditional;
        double finalWage;
        boolean answer;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ingrese el tipo de póliza que desea contratar, siendo A: cobertura amplia y B: daños a terceros");
        policyType = keyboard.next();


        switch (policyType) {
            case "B":
                initialWage = 950;
                break;
            default:
                initialWage = 1200;
                break;
        }

        finalWage = initialWage;

        System.out.println("Por favor, conteste las próximas preguntas con true o false");

        System.out.println("¿Bebe usted alcohol?");
        answer = keyboard.nextBoolean();
        if (answer = true) {
            aditional = initialWage * 0.10;
            finalWage = finalWage + aditional;
        } else {
            finalWage = finalWage;
        }
        System.out.println("¿Utiliza lentes?");
        answer = keyboard.nextBoolean();
        if (answer = true) {
            aditional = initialWage * 0.05;
            finalWage = finalWage + aditional;
        } else {
            finalWage = finalWage;
        }
        System.out.println("¿Padece alguna enfermedad - como deficiencia cardíaca o diabetes?");
        answer = keyboard.nextBoolean();
        if (answer = true) {
            aditional = initialWage * 0.05;
            finalWage = finalWage + aditional;
        } else {
            finalWage = finalWage;
        }
        System.out.println("¿Tiene más de 40 años?");
        answer = keyboard.nextBoolean();
        if (answer = true) {
            aditional = initialWage * 0.20;
            finalWage = finalWage + aditional;
        } else if (answer = false) {
            aditional = initialWage * 0.10;
            finalWage = finalWage + aditional;
        }

        System.out.println("El costo de su seguro será de $" + finalWage);

    }


}

