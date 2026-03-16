package Projetos.NumeroSecreto;

import java.util.Scanner;

public class InterFaceJogo {

    public void iniciar() {

        Scanner ler = new Scanner(System.in); // para entrada de dados do usuário
        GeradorNumero gerador = new GeradorNumero(); // criamos um objeto
        Jogador jogador = new Jogador(); // criamos um objeto

        int numeroSecreto = gerador.getNumeroSecreto(); // acessamos o numero secreto com getter, que é uma forma segura
        int escolha;

        System.out.println("Bem vindo ao jogo da adivinhação!");
        System.out.println("Você tem 5 tentativas! Boa sorte");
        System.out.println();

        do {
            System.out.println("Escolha um numero: ");
            escolha = ler.nextInt(); // indicamos que vamos receber e ler um valor do tipo inteiro

            jogador.AdicionarTentativa(); // para adicionar tentativas

            if (escolha == numeroSecreto) {
                System.out.println("Parabéns você acertou! O numero secreto é " + numeroSecreto);

            } else if (escolha < numeroSecreto) {
                System.out.println("Numero secreto é maior que " + escolha);
                System.out.println("Tentativas usadas: " + jogador.getTentativas());
                System.out.println();

            } else {
                System.out.println("Numero secreto é menor que " + escolha);
                System.out.println("Tentativas usadas: " + jogador.getTentativas());
                System.out.println();

            }
        } while (escolha != numeroSecreto && jogador.getTentativas() < 5); // condição de parada para o laço de repetição

        if (escolha != numeroSecreto) {
            System.out.println("Você perdeu! O numero secreto era " + numeroSecreto);
        }

        ler.close(); // para fechar a entrada de dados do Scanner
    }
}