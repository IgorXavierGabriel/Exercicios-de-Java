import java.util.Scanner;

class Ex10{
    public static void main (String [] args)
     { Scanner scan = new Scanner(System.in);
        System.out.println("Em que turno voce estuda M-matutino / V-vespertino / N-noturno:  ");
        char turno =  scan.next() .toLowerCase().charAt(0);
        if (turno == 'm') {
         System.out.println("Bom dia! ");
         
        }else if (turno == 'v') {
         System.out.println("Boa tarde! ");
         
        }else if (turno == 'n'){
         System.out.println("Boa noite!");

        } else System.out.println("Opcão invalida");
        
            
        }
      
        
       
        
    
    }
