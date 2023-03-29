package com.hedima.presentacion;

public class ProbarEstructuraIf {
    public static void main(String[] args) {
        //En base a una variable decir si es mayor o menor de 18 años
        int edad = 15;
        if (edad >= 18) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
        //Declarar una variable y decir si es un número positivo o negativo
        int num = -5;
        if (num > 0) {

            System.out.println( num + " Es un número positivo");

        }  else if (num < 0) {

            System.out.println( num + " Es un número negativo");
        }

        //Declarar una variable y decir si es un número par o impar
        int num2 = 13;
        if (num2 % 2 ==0) {
            System.out.println("El número escogido " + num2 +  " es par");
        } else {
            System.out.println("El número escogido ("+ num2 +") es impar");
        }
    }
}
