
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Gabriel
 */
public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
           
        System.out.printf("Qual o valor de L? ");
        double l = sc.nextDouble();
        
        
        double area = l*l;
        
        System.out.printf("A area do quadrado e de %.2f", area);
        
    }
}
