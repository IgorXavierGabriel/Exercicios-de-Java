import java.util.Scanner;

class Ex03{
    public static void main (String [] args)
     { Scanner scan = new Scanner(System.in);
        System.out.println("Digite uma letra F/M: ");
        char letra = scan.next().charAt(0);
        if (letra == 'f' || letra == 'F') {
            System.out.println( " O sexo e Feminino");
            
        } 
        else if (letra == 'm'  || letra== 'M') {
            System.out.println( " O sexo e Masculino");
            
        }
            
        else System.out.println( " sexo desconhecido");

        

        
    }
}