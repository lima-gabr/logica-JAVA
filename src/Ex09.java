
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Gabriel
 */
public class Ex09 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Numero de cadastro: ");
        int cadastro = sc.nextInt();
        System.out.println(" ");
        
        System.out.print("Numero de horas trabalhadas: ");
        int hrs = sc.nextInt();
        System.out.println(" ");
        
        System.out.print("Valor por hora:  ");
        double valor = sc.nextDouble();
        
        
        double salario = valor * hrs;
        
        System.out.printf("\nO funcionado de cadastro %d tem o salario de R$ %.2f\n", cadastro, salario);
        
        
        
    }
}
