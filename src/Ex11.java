
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Gabriel
 */
public class Ex11 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Digite um numero: ");
        int n = sc.nextInt();
        
        
        if(n < 0){
            System.out.println("Numero negativo!");
        }else{
            System.out.println("Numero positivo!");
        }
        
    }
}
