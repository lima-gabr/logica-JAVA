
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Gabriel
 */
public class Ex12 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        double l,r;
        
        System.out.print("Digite o tamanho de L: ");
        l = sc.nextDouble();
        System.out.print("Digite o tamanho de R: ");
        r = sc.nextDouble();
        
        
        double areaq,raioc;
        
        areaq = Math.pow(l,2);
        raioc = Math.PI * Math.pow(r,2);
        
        System.out.printf("\narea do quadrado: %.2f\n",areaq);
        System.out.printf("raio do circulo: %.2f\n",raioc);
        
        if(areaq > raioc){
            System.out.println("O maior e o quadrado.");
        }
        else{
            System.out.println("O maior e o circulo.");
        }
    }
}
