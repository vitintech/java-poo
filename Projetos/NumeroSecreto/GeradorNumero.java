package Projetos.NumeroSecreto;

import java.util.Random;

// nesse arquivo aplicamos o encapsulamento, para gerar um numero secreto
public class GeradorNumero {

    private int numeroSecreto; // variavel privada, não pode ser acessada diretamente

    public GeradorNumero() { // metodo onde geramos o numero secreto entre 1 a 100
        Random random = new Random();
        numeroSecreto = random.nextInt(100) + 1; // esse + 1 usamos para dizer que ele tem que gerar de 1 a 100 ao inves de 0 a 99
    }

    public int getNumeroSecreto() { // permite acessar o numero secreto com segurança
        return numeroSecreto;
    }
}
