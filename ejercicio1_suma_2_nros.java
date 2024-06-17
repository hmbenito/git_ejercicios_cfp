package Ejercicios;

import java.util.Scanner;
/**
 *
 * @author hmb
 */
  
public class ejercicio1_suma_2_nros {
public static Scanner input = new Scanner(System.in);
public static Scanner sumandos = new Scanner(System.in);
  
public static void main (String [] args) { 
    int num1, num2, suma;
    
    num1 = 0;
    num2 = 0;
    suma = 0;

    System.out.println("ingrese un numero entero Num1");
        num1 = sumandos.nextInt();
  System.out.println("ingrese un numero entero Num2");
        num2 = sumandos.nextInt();
        suma = num1 + num2;
    System.out.println("El resultado de la suma es :");
    System.out.println(suma);
    }
        }