import java.util.Scanner;

class Ex21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome,sexo;

        System.out.print("Digite um nome com mas de 3 caracteres: ");
        nome = scan.next();
        
        while ( nome.length()<= 3 ) { 
            System.out.println("ERRO: nome menor que 3 caracteres!");
            s
            System.out.print("Digite um nome com mas de 3 caracteres: ");
            nome = scan.next();
            
        }
        System.out.println("Digite uma idade entre 0 e 150");
        int idade = scan.nextInt();
        while (idade < 0 || idade > 150) {
            System.out.println("Idade invalida");

            System.out.print("Digite uma idade entre 0 e 150: ");
            idade = scan.nextInt();
           
        }
        System.out.println("Digite o seu sexo f/m ");
        sexo = scan.next();
        while (!sexo.equalsIgnoreCase("f") && !sexo.equalsIgnoreCase("m")) {
           System.out.println("Erro! Digite apenas 'f' ou 'm'.");
           System.out.print("Digite o sexo novamente: ");
           sexo = scan.next();
} System.out.println("Digite o estado civil (s, c, v, d): ");
        String estadoCivil = scan.next();

        while (!estadoCivil.equalsIgnoreCase("s") && 
               !estadoCivil.equalsIgnoreCase("c") && 
               !estadoCivil.equalsIgnoreCase("v") && 
               !estadoCivil.equalsIgnoreCase("d")) {
            
            System.out.println("Erro! Use: s (solteiro), c (casado), v (viúvo) ou d (divorciado).");
            System.out.print("Digite novamente: ");
            estadoCivil = scan.next();
        }

        System.out.println("--- CADASTRO CONCLUÍDO ---");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Sexo: " + sexo.toUpperCase());
        System.out.println("Estado Civil: " + estadoCivil.toUpperCase());
            
        

       
        scan.close();
    }
}