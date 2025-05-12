public class Repeticao07 {
    
    public static void main(String[] args) {
               
        int resultado = 0;
        int cont = 0;

        while (resultado < 196){

            resultado = 7 * cont;    

            System.out.printf("7 x %d = %d\n", cont,resultado);
            
            cont = cont+1;

        }


    }
}
