import java.util.Scanner;

class Ex04{
    public static void main (String [] args)
     { Scanner scan = new Scanner(System.in);
        System.out.println("Digite uma letra: ");
        char letra = scan.next().toLowerCase().charAt(0);
        switch (letra) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("A letra e vogal");
                break;
        
            default:
               if (letra >= 'a' && letra <= 'z') {
                    System.out.println("Consoante");
                } else {
                    System.out.println("Não é uma letra válida.");
                }
        }
        }

        

        
    }
