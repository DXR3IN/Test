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
public class KondisiOperator {
    public static void main(String[] args){
        String status = "";
        int grade;
        String pil;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Masukkan nilai grade anda : ");
        grade = keyboard.nextInt();
        //mendapatkan status pelajar
        status = (grade >= 60) ?"Passed":"False";
        
        //mengoutputkan
        System.out.println(status);
    }
}
