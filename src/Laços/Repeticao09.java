

import java.util.Scanner;
public class Repeticao09 {


    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);


        System.out.print("Quantos alunos tem na turma? ");
        int qtd = sc.nextInt();


        int c=1;
        double contNota = 0;

        while (c<=qtd){

            System.out.printf("Digite a nota do aluno %d: ",c);
            double nota = sc.nextDouble();

            contNota += nota;

            c++;

        }

        double media = contNota/qtd;

        System.out.printf("A media da sala e de %.1f", media);


    }

}
