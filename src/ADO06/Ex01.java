/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ADO06;

import java.util.Scanner;

/*
Exercício 1 - Desenvolva um programa em Java que solicite o nome e o salário atual de um funcionário. O programa deverá calcular e exibir o novo salário reajustado de acordo com as seguintes regras:
Salários inferiores a R$ 150,00 recebem um reajuste de 25%.
Salários entre R$ 150,00 e R$ 300,00 (inclusive) recebem um reajuste de 20%.
Salários entre R$ 300,01 e R$ 600,00 (inclusive) recebem um reajuste de 15%.
Salários superiores a R$ 600,00 recebem um reajuste de 10%.
Além de exibir o novo salário, o programa também deve mostrar a diferença entre o salário reajustado e o salário atual. O programa deve continuar solicitando dados de funcionários até que o usuário digite "FIM" ao ser perguntado pelo nome, momento em que o programa deve ser encerrado. Em caso de informações de salário inválidas (não positivas), o programa deve informar ao usuário.
Observações:
Utilize a classe Scanner para obter a entrada do usuário.
Implemente métodos separados para obter o nome, obter o salário, calcular o reajuste, calcular a diferença e imprimir os resultados.
O programa deve rodar em um loop contínuo até que a condição de encerramento seja atendida.
 */

 /*
 * @author Gabriel
 */
public class Ex01 {

    public static void main(String[] args) {

        int questao;

        do {

            String nome = nomeFunc();

            double salario = Salario();

            double reajuste = Reajuste(salario);

            double novoSalario = novoSalario(salario, reajuste);

            double diferenca = Diferenca(salario, novoSalario);

            imprimirDados(nome, salario, reajuste, novoSalario, diferenca);

            questao = controle();

        } while (questao != 2);

        finalizar();

    }

    public static String nomeFunc() {

        Scanner sc = new Scanner(System.in);

        System.out.println("*-- FUNÇÃO NOME --*");

        System.out.print("Digite o nome do funcionario: ");

        String nome = sc.nextLine();

        return nome;
    }

    public static double Salario() {

        Scanner sc = new Scanner(System.in);

        System.out.println("*-- FUNÇÃO SALARIO ATUAL --*");

        System.out.print("Digite o salario atual: ");

        double salario = sc.nextDouble();

        return salario;
    }

    public static double Diferenca(double salario, double novoSalario) {

        System.out.println("*-- Diferenca salario --*");

        System.out.println("Calculando diferenca...\n");

        double diferenca = novoSalario - salario;

        return diferenca;
    }

    public static double Reajuste(double salario) {

        System.out.println("*-- CALCULO --*");

        System.out.println("Calculando reajuste...\n");

        double reajuste = 0;

        if (salario <= 150) {

            reajuste = 0.25 * salario;

        } else if (salario > 150 && salario <= 300) {

            reajuste = 0.20 * salario;

        } else if (salario > 300 && salario <= 600) {

            reajuste = 0.15 * salario;

        } else {

            reajuste = 0.10 * salario;

        }

        return reajuste;

    }

    public static void finalizar() {

        System.out.println("Programa finalizado. Obrigado!\n");

    }

    public static void imprimirDados(String nome, double salario, double reajuste, double novoSalario, double diferenca) {

        System.out.printf("Nome do funcionario: %s\n", nome);

        System.out.printf("Salario atual: R$%.2f\n", salario);

        System.out.printf("Reajuste: R$%.2f\n", reajuste);

        System.out.printf("Novo salario: R$%.2f\n", novoSalario);

        System.out.printf("Diferenca: R$%.2f", diferenca);

    }

    public static double novoSalario(double salario, double reajuste) {

        double novoSalario = salario + reajuste;

        return novoSalario;
    }

    public static int controle() {

        Scanner sc = new Scanner(System.in);

        System.out.println("\nDeseja calcular salario de outro funcionario?");

        System.out.println("Digite 1 para sim e 2 para finalizar");

        int pergunta = sc.nextInt();

        return pergunta;
    }
}
