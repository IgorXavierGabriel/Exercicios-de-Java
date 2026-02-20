import java.util.Scanner;

class Ex65 {
    public static void main(String[] args) {
       
       
        int[] vetorA = new int[10];
        int cont = 0;
        int cont2 = 0;

        for (int i = 0; i < vetorA.length; i++) {
            
            vetorA[i] = (int)Math.round(Math.random());

        }

        for (int i = 0; i <vetorA.length; i++) {
            if (vetorA[i] == 1) {
                cont ++;
                
            }else if (vetorA[i] == 0) {
                cont2 ++; 
                
            }
        } System.out.println("A quantidade de numero 1 no Vetor e : " + cont);
        System.out.println("A quantidade de numero 0 no Vetor e : " + cont2);
        
    }
}