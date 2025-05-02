
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Gabriel
 */
public class Ex17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Digite o valor de A:  ");
        int a = sc.nextInt();
        System.out.print("Digite o valor de B:  ");
        int b = sc.nextInt();
        System.out.print("Digite o valor de C:  ");
        int c = sc.nextInt();
        System.out.print("Digite o valor de D:  ");
        int d = sc.nextInt();
        
        if((b>c && d>a) && (c + d > a + b) && (c > 0 && d > 0) && a % 2 == 0){
            System.out.println("Valores aceitos!");
        } else{
            System.out.println("Valores nao aceitos. ");
        }
        
    }
}
