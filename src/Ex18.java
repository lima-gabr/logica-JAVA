
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Gabriel
 */
public class Ex18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o valor de A:  ");
        int a = sc.nextInt();
        System.out.print("Digite o valor de B:  ");
        int b = sc.nextInt();
        System.out.print("Digite o valor de C:  ");
        int c = sc.nextInt();       
        
        int troca = 0;
        
     
        if(b>a && b>c){
            troca = b;
            b = a;
            a = troca;
            
        } else if(c>a && c>b){
              troca = c;
              c = a;
              a = troca;
          }
        
        if(a >= b+c){
            System.out.println("NAO FORMA TRIANGULO");
        } else if(Math.pow(a,2)> Math.pow(b,2) + Math.pow(c,2)){
            System.out.println("TRIANGULO OBTUSANGULO");
        }
        
        if(Math.pow(a,2)== Math.pow(b,2) + Math.pow(c,2)){
            System.out.println("TRIANGULO RETANGULO");
        }
        
        if(Math.pow(a,2)< Math.pow(b,2) + Math.pow(c,2)){
            System.out.println("TRIANGULO ACUTANGULO");
        }
        
        if((a==b && a==c) && (b==c && c==b)){
            System.out.println("TRIANGULO EQUILATERO");
        }
        
        if ((a==b && a!=c) || (b==a && b!=c) || (c==a && c!=b) || (b==c && c!=a && b!=a)){
            System.out.println("TRIANGULO ISOSCELES");
        }
         
    }
}
