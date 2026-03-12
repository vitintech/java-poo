package Prática;

import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

            System.out.println("Nome: ");
              String nome = leitura.nextLine();
        
            System.out.println("Qual sua idade: ");
              int idade = leitura.nextInt();

        System.out.println(nome);
        System.out.println(idade);
    }
}