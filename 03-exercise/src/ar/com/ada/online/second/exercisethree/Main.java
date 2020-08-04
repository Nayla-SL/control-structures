package ar.com.ada.online.second.exercisethree;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //
        //El 14 de febrero una persona desea comprarle un regalo al ser querido que más aprecia en //
        // ese momento, su dilema radica en qué regalo puede hacerle, las alternativas que tiene son //las siguientes:
        //Tarjeta $10.00 o menos
        //Chocolates $11.00 a $100.00
        //Flores $101.00 a $250.00
        //Anillo Más de $251.00

        double amountMoney;
        String present;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de dinero que desea gastar : $");
        amountMoney = keyboard.nextDouble();

        if (amountMoney > 250) {
            present = "un anillo";
        } else if (amountMoney > 100) {
            present = "flores";
        } else if (amountMoney > 10) {
            present = "chocolates";
        } else if (amountMoney > 0) {
            present = "una tarjeta";
        } else {
           present = "nada";
        }
        System.out.print("Usted puede comprar de regalo: " + present);
    }
}



