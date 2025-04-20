
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Gabriel
 */
public class Ex04 {
    public static void main(String[] args) {
          Scanner sc = new Scanner (System.in); 
        
          System.out.println("Digite o numero: ");
          int numero = sc.nextInt();
          
          int sequencia;
          
          if (numero > 0){
              sequencia = numero + 1;
          }
          else{
              sequencia = numero -(-1);
          }
          
          System.out.printf("A sequencia de %d e %d\n",numero, sequencia);
          
          
    }
}
