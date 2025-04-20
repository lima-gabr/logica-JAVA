
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Gabriel
 */
public class Ex13 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Digite um numero: ");
        int n1 = sc.nextInt();
        System.out.println("Digite um numero: ");
        int n2 = sc.nextInt();
        System.out.println("Digite um numero: ");
        int n3 = sc.nextInt();
        
        if(n1>n2 && n1>n3){
            System.out.printf("O maior e %d\n", n1);
        }else if(n2>n3){
            System.out.printf("O maior e %d\n", n2);
        } else{
            System.out.printf("O maior e %d\n", n3);
        }
    }
}
