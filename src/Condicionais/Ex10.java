
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Gabriel
 */
public class Ex10 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Nome do vendedor: ");
        String nome = sc.nextLine();
        
        System.out.print("Salario fixo: R$");
        double salario = sc.nextDouble();
        
        System.out.print("Total de vendas efetuadas (em dinhero): R$");
        double vendas = sc.nextDouble();
        
        System.out.printf("\nSalario fixo: R$%.2f", salario);
        
        double comissao = vendas * 0.15;
        System.out.printf("\nComissao: R$%.2f",comissao);
        
        System.out.printf("\nValor a ser pago ao vendedor %s: R$%.2f\n", nome, salario+comissao);
        
        
    }
}
