public class Lampada {
    // Atributo: representa o estado da lâmpada
    private boolean ligada;

    // Construtor: define que a lâmpada começa desligada por padrão
    public Lampada() {
        this.ligada = false;
    }

    // Método para ligar a lâmpada
    public void ligar() {
        ligada = true;
        System.out.println("A lâmpada foi ligada.");
    }

    // Método para desligar a lâmpada
    public void desligar() {
        ligada = false;
        System.out.println("A lâmpada foi desligada.");
    }

    // Método para verificar o status atual
    public void mostrarEstado() {
        if (ligada) {
            System.out.println("Status atual: Acesa.");
        } else {
            System.out.println("Status atual: Apagada.");
        }
    }
}