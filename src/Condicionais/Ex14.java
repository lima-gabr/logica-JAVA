
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Gabriel
 */
public class Ex14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Digite um numero: ");
        double n1 = sc.nextDouble();
        System.out.println("Digite um numero: ");
        double n2 = sc.nextDouble();
        
        double divisao;
        
        if(n1>n2){
            divisao = n1/n2;
            System.out.printf("A divisao de %f por %f e de %.2f",n1,n2,divisao);
        }else{
            divisao = n2/n1;
            System.out.printf("A divisao de %f por %f e de %.2f",n2,n1,divisao);
        }
        
        
        
    }
}
