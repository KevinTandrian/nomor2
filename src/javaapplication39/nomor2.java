/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication39;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class nomor2
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int a;
     for (a=2; a<=200; a++)
     {
         if(a%2==0 && a%3!=0){
         System.out.println(a);
     }
    }
    }
}
