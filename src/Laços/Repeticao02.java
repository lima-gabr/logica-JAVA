
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gabriel.lima10
 */
public class Repeticao02 {
    public static void main(String[] args) {
         Scanner sc = new Scanner (System.in);
         
         System.out.print("Digite um numero: ");
         int n = sc.nextInt();
         
         int c=0;
         int soma = 0;
         while (c <= n){
             
             soma = soma + c;
             c = c+1;
         }
          
         System.out.println("SOMA:" + soma);
    }
}
