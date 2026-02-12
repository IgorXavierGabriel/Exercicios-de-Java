import java.util.Scanner;

class Ex19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String usuario, senha;

        System.out.print("Digite seu usuario: ");
        usuario = scan.next();
        System.out.print("Digite sua senha: ");
        senha = scan.next();

        // ENQUANTO o usuário for igual à senha, ele fica preso aqui
        while (usuario.equals(senha)) { 
            System.out.println("ERRO: Senha e usuario não podem ser iguais!");
            
            System.out.print("Digite um novo usuario: ");
            usuario = scan.next();
            System.out.print("Digite uma nova senha: ");
            senha = scan.next();
        }

        // Só chega aqui quando eles forem diferentes
        System.out.println("Cadastro realizado com sucesso!");
        scan.close();
    }
}