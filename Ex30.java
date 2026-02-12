import java.util.Scanner;

class Ex30 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tabu;
        int multiplicação = 0; 
        System.out.println("Escolha qual tabuada vai ser iniciada de 1 a 10: ");
        tabu = scan.nextInt();
        for(int i = 1; i < 11; i ++){
            multiplicação = tabu * i; 
            System.out.println(tabu + " x " + i + " = " + multiplicação);
            

        

        scan.close();
    }
}
}