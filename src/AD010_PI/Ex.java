package AD010_PI;
import java.util.Scanner;
/*Um jogo bem simples consiste em tentar adivinhar um valor inteiro aleatório
escolhido entre 1 e 100 por um computador. O usuário/jogador terá apenas 5
chances para tentar adivinhar o valor. A cada tentativa do jogador, caso ele não
acerte, o programa deve informar se o valor digitado é maior ou menor que o
valor escolhido pelo computador. E caso o valor digitado pelo jogador tenha
diferença em módulo igual a 1 com o valor correto deverá ser impresso “TÁ
QUENTE!” (por exemplo, o computador escolheu 42 e o jogador digitou 41
ou 43). No final, deverá ser impresso “Parabéns, você ganhou o jogo!”, se o
jogador conseguiu acertar o valor escolhido pelo computador, ou “Game
Over!”, caso contrário */


public class Ex {

    public static void main(String[] args) {
        
        int aleatorio = (int)(Math.random() * (100 - 0 + 1)) + 1;

        Scanner sc = new Scanner(System.in);

        int teste = 0;

        for(int c = 0;c<5;c++){

            System.out.print("Digite um numero entre 0 e 100: ");
            int numero = sc.nextInt();


            if(numero == (aleatorio - 1) || numero == (aleatorio + 1) ){
                System.out.println("Tá quente!");
            }
                else if(numero < aleatorio){
                    System.out.println("Maior!");
                    }else if(numero > aleatorio){
                        System.out.println("Menor!");
                        } else if(numero == aleatorio){
                            System.out.println("Parabens! Você acertou.");
                            teste++;
                            break;        
                        }
        
        teste = 0;
                            
        }

        if(teste == 0){
            System.out.println("GAME OVER");
        }
     
    }


}
