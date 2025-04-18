
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Gabriel
 */
public class Ex01_1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Digite o valor de A: ");
        int a = sc.nextInt();
        System.out.print("Digite o valor de B: ");
        int b = sc.nextInt();
        
        int resolucao = a*b;
        
        
        System.out.printf("\n%d multiplicado por %d e igual a %d\n", a,b,resolucao);
    }
}
