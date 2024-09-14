/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author casti
 */
public class Ejemplo4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa la temperatura en grados centígrados: ");
        double centigrados = scanner.nextDouble();
        
        double fahrenheit = 32 + (9 * centigrados / 5);
        
        System.out.println(centigrados + " grados centígrados equivalen a " + fahrenheit + " grados Fahrenheit.");
    }
}
