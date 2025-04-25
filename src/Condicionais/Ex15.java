
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Gabriel
 */
public class Ex15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Digite o valor de A: ");
        double a = sc.nextDouble();
        System.out.print("Digite o valor de B: ");
        double b = sc.nextDouble();
        System.out.print("Digite o valor de C: ");
        double c = sc.nextDouble();
        
        if(b==0 || c==0){
        
            System.out.println("\nImpossivel Calcular.\n");
        }else{
            double delta = Math.pow(b,2)-4*a*c;
            System.out.printf("Delta: %.1f", delta);
            
            
            if(delta <0){      
                System.out.println("\nA equacao nao possui raizes reais.\n");
            }else if(delta == 0){
                double x = -b/(2*a);
                System.out.printf("\nX e igual a %.1f\n", x);
            }else{
                
                double x = (-b + Math.sqrt(delta)) / 2*a;
                double x1 = (-b - Math.sqrt(delta)) / 2*a;
                
                System.out.printf("\nX1: %.1f",x);
                System.out.printf("\nX2: %.1f\n",x1);
            }
        }
        
        
    }
}
