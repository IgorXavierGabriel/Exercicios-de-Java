import java.util.Scanner;

class Ex44{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite a quantidade de turma: ");
        int turmas = scan.nextInt();
        int somaAlunos = 0;

        for (int i = 1; i<= turmas ; i ++) {
            System.out.println("Digite a quantidade de alunos da turma: ");
            int alunos = scan.nextInt();
            if (alunos <= 40) {
                somaAlunos +=   alunos;

                
            }else { System.out.println("Uma turma não pode ter mas tem 40 alunos");
            i--;}


        }  int media = somaAlunos / turmas;
        System.out.println(" A media das turma são :" + media);
        
      
    }
}