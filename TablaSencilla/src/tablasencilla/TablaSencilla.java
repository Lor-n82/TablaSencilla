/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablasencilla;

import java.util.Scanner;

/**
 *
 * @author loren
 */
public class TablaSencilla {
public static Scanner tc=new Scanner (System.in);
public static String [] puntos= {"J1","J2"};
public static String [] alumnos= {"Pepe","Pablo"};
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [][] tabla= cargarTabla();
        printarTabla(tabla);
    
    }
    public static int [][] cargarTabla(){
        int [][] tabla=new int [2][2];
        for (int fila=0;fila<tabla.length;fila++){
            for (int col=0; col<tabla[0].length;col++){
                System.out.print("Introduce el dato para la fila "+(fila+1)+" columna "+(col+1)+" : ");
            tabla[fila][col]=tc.nextInt();
            }
            System.out.println();
        }
        return tabla;
    }
    public static void printarTabla(int [][] tabla){
        for (int i=0;i<tabla[0].length;i++){
            System.out.print("\t"+puntos[i]);
        }
            System.out.println();
            System.out.println("\t----------");
            
         for (int fila=0;fila<tabla.length;fila++){
             System.out.print(alumnos[fila]);
            for (int col=0; col<tabla[0].length;col++){
                System.out.print("\t"+tabla[fila][col]);
            }
             System.out.println("");
    }
    }
}
