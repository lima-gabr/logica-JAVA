
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gabriel.lima10
 */
public class Repeticao03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int n=0;
        int maior = 0;
        for(int c=0; c<=10;c++){
            
            System.out.print("Digite um numero: ");
            n = sc.nextInt();
            
            if(n > maior){
                maior = n;
            }
        }
        
        System.out.println("MAIOR NUMERO DIGITADO:" + maior);
    }
}
