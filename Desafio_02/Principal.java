package Desafio_02;

import java.util.Scanner;

// Crie um programa que solicite ao usuário digitar um número. Se o número for positivo, exiba "Número positivo", 
// caso contrário, exiba "Número negativo". OK

// Peça ao usuário para inserir dois números inteiros. Compare os números e imprima uma mensagem indicando 
// se são iguais, diferentes, o primeiro é maior ou o segundo é maior. OK

// Crie um menu que oferece duas opções ao usuário: "1. Calcular área do quadrado" e "2. Calcular área do círculo". 
// Solicite a escolha do usuário e realize o cálculo da área com base na opção selecionada. OK

// Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10. OK

// Crie um programa que solicite ao usuário a entrada de um número inteiro. Verifique se o número é par ou ímpar e 
// exiba uma mensagem correspondente. OK

// Crie um programa que solicite ao usuário um número e calcule o fatorial desse número. OK

public class Principal {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        // prática de lógica de programação, com if e else
        System.out.println("Digite um numero: ");
            int numero = ler.nextInt();

            if (numero >= 0) {
                System.out.println();

                System.out.println("Numero digitado " + numero + " é positivo");

            } else {
                System.out.println();

                System.out.println("Numero digitado " + numero + " é negativo");
            }

        System.out.println("==========================");

        // prática de lógica de programação, com if, else e else if
        System.out.println("Agora vamos tstar outra lógica");
        System.out.println();

        System.out.println("Digite o primeiro numero: ");
            int num1 = ler.nextInt();

        System.out.println("Digite o segundo numero: ");
            int num2 = ler.nextInt();

            if (num1 == num2) {
                System.out.println();

                System.out.println("Os dois numeros digitados são iguais e do mesmo tamanho");

            } else if (num1 != num2 && num1 > num2) {
                System.out.println();

                System.out.println("Os dois numeros são diferentes");
                    System.out.println("O 1 numero " + num1 + " é maior que o 2 numero " + num2);

            } else {
                System.out.println();

                System.out.println("Os dois numeros são diferentes");
                    System.out.println("O 2 numero " + num2 + " é maior que o 1 numero " + num1);
            }

        System.out.println("==========================");

        // prática de lógica de programação, aplicando estrutura condicional switch
        System.out.println("MENU");
        System.out.println("1 - Calcular área do quadrado");
        System.out.println("2 - Calcular área do círculo");
        System.out.println("Escolha uma opção: ");
            int opcao = ler.nextInt();

        switch (opcao) {
            case 1:
                System.out.println();

                System.out.println("Digite o lado do quadrado ");
                    double lado = ler.nextDouble();

                    System.out.println();
                    
                    double areaQuadrado = lado * lado;
                      System.out.println("Área do quadrado: " + areaQuadrado);

                break;

            case 2:
                System.out.println();

                System.out.println("Digite o raio do círculo: ");
                    double raio = ler.nextDouble();

                    System.out.println();

                    double areaCirculo = Math.PI * raio * raio;
                      System.out.println("Área do círculo: " + areaCirculo);

                break;

            default:
                System.out.println("Opção inválida!");
            break;
        }

        System.out.println("==========================");

        // prática de lógica de programação aplicada a tabuada dinâmica
        int tam = 10;

        System.out.println("Digite um numero: ");
            int nm = ler.nextInt();

            System.out.println();

        System.out.println("TABUADA DO " + nm + " de 1 a " + tam);
            for (int i = 1; i <= tam; i++){
                System.out.println(i + " x " + nm + " = " + (i * nm));
            }

        System.out.println("==========================");

        // prática de lógica de programação com if e else
        System.out.println("Digite um numero inteiro: ");
            int nmo = ler.nextInt();

            if (nmo % 2 == 0) {
                System.out.println();
                System.out.println("Numero " + nmo + " é par");

            } else {
                System.out.println();
                System.out.println("Numero " + nmo + " é ímpar");
            }

        System.out.println("==========================");

        // prática de lógica de programação com laço for
        System.out.println("Digite um numero: ");
            int nrm = ler.nextInt();

        double fatorial = 1;

            for (int i = 1; i <= nrm; i++) {
                fatorial *= i;
            }

            System.out.println();
            System.out.println("Fatorial do numero " + nrm);
                System.out.println(fatorial);

        // fechamento da variável ler (de Scanner)
        ler.close();
    }
}