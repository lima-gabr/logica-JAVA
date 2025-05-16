
import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Numero natural N: ");
    int n = sc.nextInt();  // melhor usar int, já que N é natural

    double s = 0.0;

    for (int i = 1; i <= n; i++) {
        // alterna o sinal usando (-1)^(i+1)
        s += Math.pow(-1, i + 1) * (1.0 / i);
    }

    System.out.printf("Resultado: %.2f\n", s);
    sc.close();
}
 
}
