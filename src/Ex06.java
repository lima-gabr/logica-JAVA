
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Gabriel
 */
public class Ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double a,b,c;
        
        System.out.print("A: ");
        a = sc.nextDouble();
        System.out.print("B: ");
        b = sc.nextDouble();
        System.out.print("C: ");
        c = sc.nextDouble();
        
        
        double area_tr = (a * c)/2;
        System.out.printf("\nArea do triangulo retangulo: %.2f\n", area_tr);
        
        double area_cir = Math.PI * Math.pow(c,2);
        System.out.printf("Area do círculo: %.2f\n", area_cir);
        
        double area_trap = (a+b)* c / 2;
        System.out.printf("Area do trapézio: %.2f\n", area_trap);
        
        double area_quad = Math.pow(b,2);
        System.out.printf("Area do quadrado: %.2f\n", area_quad);
        
        double area_ret = a * b;
        System.out.printf("Area do retangulo: %.2f\n", area_ret);
        
        double per_ret = 2 * (a+b);
        System.out.printf("Perimetro do retangulo: %.2f\n", per_ret);
        
        
        
        
        
        
    }
}
