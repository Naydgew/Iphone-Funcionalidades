package iphone;

public class IphoneFuncionando {
    public static void main(String[] args) {
        Iphone meuIphone = new Iphone();

        
        meuIphone.selecionarMusica("Imagine Dragons - Believer");
        meuIphone.tocar();
        meuIphone.pausar();

       
        meuIphone.ligar("61 9999-8888");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

    
        meuIphone.exibirPagina("https://www.google.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}

