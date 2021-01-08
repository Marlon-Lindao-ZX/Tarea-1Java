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
public class Ejercicio3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i;
        for(i = 0; i < 5; i++){
            System.out.print("Ingrese un año: ");
            int year = sc.nextInt();
            sc.nextLine();
            if (year % 4 == 0)
                System.out.println("El año es bisiesto");
            else
                System.out.println("El año no es bisiesto");
            
            
        }
        
        sc.close();
                
    }
    
}
