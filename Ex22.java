class Ex22 {
    public static void main(String[] args) {
        double cidadeA = 80000;
        double cidadeB = 200000; // Geralmente a cidade B começa maior nesse exercício
        int anos = 0;

        // Enquanto a cidade A for menor que a B, a gente continua calculando
        while (cidadeA < cidadeB) {
            cidadeA = cidadeA * 1.03;   // Cresce 3%
            cidadeB = cidadeB * 1.015;  // Cresce 1.5%
            anos++;
        }

        System.out.println("A cidade A ultrapassará a B em " + anos + " anos.");
    }
}