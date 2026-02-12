import java.util.Scanner;

class Ex43 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite a quantidade de eleitores da sua cidade: ");
        int eleitores = scan.nextInt();
        int candidatoA = 0;
        int candidatoB = 0;
        int candidatoC = 0;
        String contador = "";
        for ( int i = 1; i <= eleitores; i++) {
            System.out.println("Digite o nome do seu candidato:");
            contador  = scan.next().toLowerCase();
            if (contador.equals("a") ) {
                candidatoA ++;
                
            }else if (contador.equals("b") ) {
                candidatoB ++;
                
            }else if(contador.equals("c") ){
                candidatoC ++;
            }else System.out.println("Canditado invalido");
            
        } 
        System.out.println("O Canditado A recebeu: " + candidatoA + " votos");
        System.out.println("O Canditado B recebeu: " + candidatoB + " votos");
        System.out.println("O Canditado C recebeu: " + candidatoC + " votos");


      
    }
}