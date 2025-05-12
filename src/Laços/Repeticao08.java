public class Repeticao08 {
    public static void main(String[] args) {
        
        int contPares = 0;
        int somaPares = 0;

        for (int c = 13; c <=73; c++){
            if(c % 2 == 0){

                System.out.println(c);
                
                contPares++;

                somaPares = c + somaPares;
            }
        }

        double mediaPares;

        mediaPares  = somaPares / contPares;

        System.out.printf("Existem %d numeros pares entre 13 e 73\n", contPares);
        System.out.printf("A media de numeros pares entre 13 e 73 e de %.1f\n", mediaPares);
    }
}
