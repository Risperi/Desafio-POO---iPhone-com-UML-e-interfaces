package iPhone;

public class iPhone implements 
        ReprodutorMusical, 
        AparelhoTelefonico, 
        NavegadorInternet {

    @Override
    public void tocar() {
        System.out.println("Tocando");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando");
    }

    @Override
    public void selecionarMusica(String musica) {
    	
    	if(musica == null || musica.isEmpty()) {
    		System.out.println("Nenhuma musica selecionada");
    	}
    	else {
        System.out.println("Selecionando música: " + musica);
    }
    	
    }


    @Override
    public void ligar(String numero) {
        if (numero == null || numero.isEmpty()) {
            System.out.println("Nenhum número informado");
            return;
        }
        System.out.println("Ligando para: " + numero);
    }


    @Override
    public void atender() {
        System.out.println("Atendendo");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    @Override
    public void exibirPagina(String url) {
        if (url == null || url.isEmpty()) {
            System.out.println("URL inválida");
            return;
        }
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }
}
