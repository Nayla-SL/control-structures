package ar.com.ada.online.second.exercisesix;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Determinar el costo y el descuento que tendrá un artículo. Considere que si su precio es
        //mayor o igual a $200 se le aplica un descuento de 15%, y si su precio es mayor a $100
        //pero menor a $200, el descuento es de 12%, y si es menor a $100, sólo 10%

        double itemPrice;
        double itemDiscount;
        double itemFinalCost;

        Scanner keyboard = new Scanner(System.in);

        System.out.printf("Ingrese el precio del producto $");
        itemPrice = keyboard.nextDouble();

        itemDiscount = itemPrice * 1;
        itemFinalCost = itemPrice;

        if (itemPrice >= 200) {
            itemDiscount = itemPrice * 0.15;
            itemFinalCost = itemPrice - itemDiscount;
        } else if (itemPrice > 100) {
            itemDiscount = itemPrice * 0.12;
            itemFinalCost = itemPrice - itemDiscount;
        } else if (itemPrice <= 100) {
            itemDiscount = itemPrice * 0.10;
            itemFinalCost = itemPrice - itemDiscount;
        }
        System.out.print("El precio final del producto es $" + String.format("%.2f", itemFinalCost) + " .En el ha obtenido un descuento de $" + String.format("%.2f",itemDiscount));

    }
}
