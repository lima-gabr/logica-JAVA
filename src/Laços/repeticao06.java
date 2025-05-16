/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author gabriel.lima10
 */
public class repeticao06 {


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int maiorIdade = 0;
        String maiorNome = "";
        int c = 1;

        do{

            System.out.print("Digite o nome do aluno "+c+": ");
            String nome = sc.nextLine();
            sc.nextLine();

            System.out.print("Digite a idade do aluno "+c+": ");
            int idade = sc.nextInt();


            if(idade > maiorIdade){
                maiorIdade = idade;
                maiorNome = nome;
            }

            c++;

            System.out.println("");

        } while(c<=5);


        System.out.printf("ALUNO MAIS VELHO: %s\n", maiorNome);
        System.out.printf("IDADE DO %s: %d\n", maiorNome,maiorIdade);

    }

  
}
