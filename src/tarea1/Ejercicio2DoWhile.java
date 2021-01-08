/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea1;

import java.util.Scanner;
/**
 *
 * @author Diego
 */
public class Ejercicio2DoWhile {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        int i = 0;
        int contador = 0;
        do{
            System.out.print("Ingrese numero " + (i + 1) + ": ");
            int n = sc.nextInt();
            numero = numero + n;
            contador++;
            i++;
            sc.nextLine();
        } while (i < 5);
        
        sc.close();
        
        double prom = (double) numero/contador;
        System.out.println("El promedio es: " + prom); 
    }
    
}
