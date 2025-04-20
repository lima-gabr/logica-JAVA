
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Gabriel
 */
public class Ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("A: ");
        double a = sc.nextDouble();
        System.out.print("B: ");
        double b = sc.nextDouble();
        
        double hipotenusa = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        
        System.out.printf("\nA raiz hipotenusa e %.2f\n", hipotenusa);
       
    }
}
