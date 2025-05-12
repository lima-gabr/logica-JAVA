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


    public static String receberNome(){

        Scanner sc = new Scanner (System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = sc.nextLine();

        return nome;
    } 

    public static int receberIdade(){

        Scanner sc = new Scanner (System.in);

        System.out.print("Digite a idade do aluno: ");
        int idade = sc.nextInt();

        return idade;   
    }

     public static char receberSexo(){

        Scanner sc = new Scanner (System.in);

        System.out.println("Digite o sexo do aluno. ");
        System.out.print("F ou M: ");

        char sexo = sc.next().charAt(0); 

        return sexo;
    }

    public static int calcularMaisVelho(String nome, int idade){

        int maior;
        String maiorNome;

        

        return maior;
        return maiorNome;
    }
   

    public static void main(String[] args) {
        
    }
}
