/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ders_12;

import java.util.Scanner;

/**
 *
 * @author Barış Adsız
 */
public class Ders_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the your birthday: ");
        int age = input.nextInt();
        
        if(age > 18)
            System.out.println("Reşitsiniz");
        else
            System.out.println("Reşit değilsiniz");
    }
    
}
