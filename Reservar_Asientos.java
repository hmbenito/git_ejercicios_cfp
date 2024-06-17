package Ejercicios;

import java.util.Scanner;
/**
 *
 * @author hmb
 */

public class Reservar_Asientos {
public static Scanner input = new Scanner(System.in);
public static Scanner cargaCliente = new Scanner(System.in);       
   
            
    public static void main(String[] args) {
          
        int fila, asiento, filaReserva, asientoReserva;
        
        fila = 0;
        asiento = 0;
        filaReserva = 0;
        asientoReserva = 0;
        String butacas [][] = new String [10][10];
        boolean control, control2, continuar;
        
        String cliente;

        control = true;
        control2 = true;
        continuar = true;
        String continuar2;

        continuar2 = "Si";
        for (fila = 0; fila <= 9; fila++) {
            for (asiento = 0; asiento <= 9; asiento++) {
                butacas [fila][asiento]= "L";
            }
        }
        for (fila = 0; fila <= 9; fila++) {
            for (asiento = 0; asiento <= 9; asiento++) {
                System.out.print(butacas[fila][asiento]);
                System.out.print("fila " + (fila + 1) + " asiento " + (asiento + 1));
            }
        }
        butacas[1][1] = "X";
                   System.out.println("");
                   System.out.println("ingrese nombre cliente");
            cliente = cargaCliente.next();
            System.out.println(cliente);
        do {
            while (control == true) {
                while (control2 == true) {
                    System.out.println("ingrese fila reserva [1-10]");
                    filaReserva = input.nextInt();
                    input.nextLine();  // consume the newline
                    if (filaReserva < 11) {
                        control2 = false;
                    }
                }
                control2 = true;
                while (control2 == true) {
                    System.out.println("Ingrese asiento [1-10]");
                    asientoReserva = input.nextInt();
                    input.nextLine();  // consume the newline
                    if (asientoReserva < 11) {
                        control2 = false;
                    }
                }
                control2 = true;
                if (butacas [filaReserva-1][asientoReserva - 1].equals("X")) {
                    System.out.println(butacas[filaReserva-1][asientoReserva - 1]);
                    control = true;
                    System.out.println("tiene que elegir otra ubicacion, su eleccion esta ocupada");
                } else {
                    control = false;
                    butacas[filaReserva-1][asientoReserva-1] = "X";
                }
            }
            System.out.println(butacas[1][0]);
            System.out.println(butacas[1][1]);
            for (fila = 0; fila <= 9; fila++) {
                for (asiento = 0; asiento <= 9; asiento++) {
                    System.out.println(butacas[fila][asiento]);
                    System.out.println("fila " + (fila + 1) + " asiento " + (asiento + 1));
                }
            }
            System.out.println("Desea continuar comprando asientos? Si para continuar No para terminar");
            continuar2 = input.nextLine();
            if (continuar2.equals("Si") || continuar2.equals("si") || continuar2.equals("SI")) {
                continuar = true;
            } else {
                continuar = false;
            }
            control = true;
            control2 = true;

            // Los 10 bloques siguientes que muestran la ocupacion del teatro se puede resumir con un loop FOR/PARA, el problema que se presenta con el ARRAY/MATRIZ butacas, es que el Flowgorithm no esta reconociendo el subindice butacas[filaReserva.asientoReserva] da error y no se pudo aplicar, lo mismo se repitio en los pasos anterios y no se aplico el array con subindice.
            System.out.println("Fila 1 " + butacas[0][0] + butacas[0][1] + butacas[0][2] + butacas[0][3] + butacas[0][4] + butacas[0][5] + butacas[0][6] + butacas[0][7] + butacas[0][8] + butacas[0][9]);
            System.out.println("Fila 2 " + butacas[1][0] + butacas[1][1] + butacas[1][2] + butacas[1][3] + butacas[1][4] + butacas[1][5] + butacas[1][6] + butacas[1][7] + butacas[1][8] + butacas[1][9]);
            System.out.println("Fila 3 " + butacas[2][0] + butacas[2][1] + butacas[2][2] + butacas[2][3] + butacas[2][4] + butacas[2][5] + butacas[2][6] + butacas[2][7] + butacas[2][8] + butacas[2][9]);
            System.out.println("Fila 4 " + butacas[3][0] + butacas[3][1] + butacas[3][2] + butacas[3][3] + butacas[3][4] + butacas[3][5] + butacas[3][6] + butacas[3][7] + butacas[3][8] + butacas[3][9]);
            System.out.println("Fila 5 " + butacas[4][0] + butacas[4][1] + butacas[4][2] + butacas[4][3] + butacas[4][4] + butacas[4][5] + butacas[4][6] + butacas[4][7] + butacas[4][8] + butacas[4][9]);
            System.out.println("Fila 6 " + butacas[5][0] + butacas[5][1] + butacas[5][2] + butacas[5][3] + butacas[5][4] + butacas[5][5] + butacas[5][6] + butacas[5][7] + butacas[5][8] + butacas[5][9]);
            System.out.println("Fila 7 " + butacas[6][0] + butacas[6][1] + butacas[6][2] + butacas[6][3] + butacas[6][4] + butacas[6][5] + butacas[6][6] + butacas[6][7] + butacas[6][8] + butacas[6][9]);
            System.out.println("Fila 8 " + butacas[7][0] + butacas[7][1] + butacas[7][2] + butacas[7][3] + butacas[7][4] + butacas[7][5] + butacas[7][6] + butacas[7][7] + butacas[7][8] + butacas[7][9]);
            System.out.println("Fila 9 " + butacas[8][0] + butacas[8][1] + butacas[8][2] + butacas[8][3] + butacas[8][4] + butacas[8][5] + butacas[8][6] + butacas[8][7] + butacas[8][8] + butacas[8][9]);
            System.out.println("Fila 10 " + butacas[9][0] + butacas[9][1] + butacas[9][2] + butacas[9][3] + butacas[9][4] + butacas[9][5] + butacas[9][6] + butacas[9][7] + butacas[9][8] + butacas[9][9]);
		
            System.out.println("Empieza Loop");
            
              for (fila = 0; fila <= 9; fila++) {
            System.out.println("Fila "+(fila+1)+"  "+(butacas[fila][0])+(butacas[fila][1])+(butacas[fila][2])+(butacas[fila][3])+(butacas[fila][4])+(butacas[fila][5])+(butacas[fila][6])+(butacas[fila][7])+(butacas[fila][8])+(butacas[fila][9]));
            }
  
        } while (continuar == true);
        System.out.println("fin de programa");
    }
}