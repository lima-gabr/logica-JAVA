
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Gabriel
 */
public class Ex16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Digite a hora que iniciou o jogo:  ");
        int inicial = sc.nextInt();
        System.out.print("Digite a hora que terminou o jogo: ");
        int fim = sc.nextInt();
        
        int tempo;

        if(inicial > fim){
            tempo = 24 - inicial + fim;
        } else if (inicial == fim){
            tempo = 24;
        }else {
            tempo = fim - inicial;
        }
     
        
        System.out.printf("\nO jogo durou %d hora(s)\n", tempo);
        
    }
}
