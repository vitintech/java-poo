package Projetos;

import java.util.Random;
import java.util.Scanner;

public class Jogo {
    public static void main(String[] args) {
        int tentativas = 0;
        int numero;
        int numEscolhido;

        Scanner ler = new Scanner(System.in);

        System.out.println("Bem vindo ao Jogo da Adivinhação!");
        System.out.println();

            System.out.println("Descrição: ");
                System.out.println("Você vai ter 5 tentativas");
                System.out.println("A cada tentativa errada você recebera uma dica");
                System.out.println("Um número aleatório de 1 a 100 será gerado");
                System.out.println("Você deve escolher um número entre 1 e 100");
                System.out.println("Boa sorte!");
            System.out.println();
        
        numero = new Random().nextInt(100) + 1; // Dessa forma conseguimos gerar um número aleatório
            do {
                System.out.println("Escolha um número: ");
                  numEscolhido = ler.nextInt();
                  tentativas++;

                if (numEscolhido == numero) {
                    System.out.println("Parabéns você acertou o número secreto! " + numero);

                } else if (numEscolhido < numero) {
                    System.out.println("Número sorteado é maior " + numEscolhido);

                } else {
                    System.out.println("Número sorteado é menor " + numEscolhido);
                }
            System.out.println("Tentativas restantes: " + (5 - tentativas));
            System.out.println();

            } while (numEscolhido != numero && tentativas < 5);
            
        if (numEscolhido != numero) {
            System.out.println("Você perdeu, o número era " + numero);
        }

        ler.close();
    }
}