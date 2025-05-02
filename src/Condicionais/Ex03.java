
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Gabriel
 */
public class Ex03 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        int a, b;
        
        System.out.print("Digite o numero A: ");
        a = sc.nextInt();
        System.out.print("Digite o numero B: ");
        b = sc.nextInt();
        
        int resultado = (a*a) + (b*b);
        
        System.out.printf("\nO resultado da soma dos quadrados e de %d\n", resultado);
        
    }
}
