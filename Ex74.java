import java.util.Random;

class Ex74 {
    public static void main(String[] args) {
        int[][] Matriz = new int[10][10];
        Random gerador = new Random();
      

        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz.length; j++) {
                Matriz[i][j]= gerador.nextInt(10); 
            
            }
            System.out.println(); 
        }
        int maiorL = 0;
        int maiorC= 0;
        for (int i = 0; i < Matriz[5].length ; i++){
            if (maiorL < Matriz[5][i]) {
                maiorL = Matriz[5][i];
                
            }
                
            }
        for (int j = 0; j< Matriz[7].length; j++){
            if (maiorC < Matriz[7][j]) {
                maiorC = Matriz[7][j];
                
            }

        } System.out.println("O maior da linha 5 e : " + maiorL);
          System.out.println("O maior da coluna 7  e : " + maiorC);
        }
        
    }
