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
public class Ejercicio2FOR {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        int i;
        int contador = 0;
        for(i = 1; i < 6; i++){
            System.out.print("Ingrese numero " + i + ": ");
            int n = sc.nextInt();
            numero = numero + n;
            contador++;
            sc.nextLine();
            
        }
        
        sc.close();
        
        double prom = (double) numero/contador;
        System.out.println("El promedio es: " + prom);
    }   
}
