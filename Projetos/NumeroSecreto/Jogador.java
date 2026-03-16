package Projetos.NumeroSecreto;

// nesse arquivo aplicamos o encapsulamento, para controlar as tentativas do jogador
public class Jogador {
    
    private int tentativas; // variável privada, não pode ser acessada diretamente

    public void AdicionarTentativa() { // metodo para adicionar tentativas
        tentativas++;
    }
    
    public int getTentativas() { // permite acessar o numero secreto com segurança
        return tentativas;
    }
}
