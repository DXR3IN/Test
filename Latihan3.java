/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Irfan090323;
import java.util.Scanner;
/**
 *
 * @author LAB-MM
 */
public class Latihan3 {
    public static void main(String[] args){
        int a,b,c,n1,n2;
        Scanner keyboard = new Scanner(System.in);
        
        a = keyboard.nextInt();
        b = keyboard.nextInt();
        c = keyboard.nextInt();
        
        n1 = (a > b) ?a:b;
        n2 = (n1 > c) ?n1:c;
        System.out.println("Number 1 = "+a);
        System.out.println("Number 2 = "+b);
        System.out.println("Number 3 = "+c);
        System.out.println("Nilai tertinggi = "+n2);    
    }
}
