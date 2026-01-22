package iPhone;

public class Main {
    public static void main(String[] args) {
        iPhone iphone = new iPhone();
        
    
        System.out.println("===========================================");
        iphone.tocar();
        iphone.selecionarMusica("Lose Yourself");
        iphone.pausar();
        System.out.println("\n");

        iphone.ligar("11999999999");
        iphone.atender();
        System.out.println("\n");

        iphone.exibirPagina("https://www.apple.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
        System.out.println("===========================================");
    }
}
