
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Gabriel
 */
public class Ex08 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        System.out.print("A: ");
        int a = sc.nextInt();
        System.out.print("B: ");
        int b = sc.nextInt();
        System.out.print("C: ");
        int c = sc.nextInt();
        System.out.print("D: ");
        int d = sc.nextInt();
        
        double media = (a + b + c + d) / 4;
        
        System.out.printf("\nMedia: %.2f\n", media);
    }
}
