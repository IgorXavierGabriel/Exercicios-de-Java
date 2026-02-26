import java.util.Random;

class Ex75 {
    public static void main(String[] args) {
        int[][] Matriz = new int[3][3];
        Random gerador = new Random();
      

        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz.length; j++) {
                Matriz[i][j]= gerador.nextInt(10); 
            
            }
            System.out.println(); 
        }
        int quantPar = 0;
        int quantImpar= 0;
        for (int i = 0; i < Matriz.length ; i++){
           for(int j = 0; j <Matriz.length; j++){
            if (Matriz[i][j] % 2 ==0) {
                quantPar++;
                
            } else {
                quantImpar++;
            }
           }

        } System.out.println("A quantidade de numero par : " + quantPar);
          System.out.println("A quantidade de numero impar  e : " + quantImpar);
        }
        
    }
