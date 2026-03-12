package Prática;

import java.util.Scanner;

// Declare uma variável do tipo double e uma variável do tipo int. Faça o casting da variável double para int e imprima o resultado. OK

// Declare uma variável do tipo char (letra) e uma variável do tipo String (palavra). Atribua valores a essas variáveis e concatene-as 
// em uma mensagem. OK

public class Principal {
public static void main(String[] args) {
  Scanner leitura = new Scanner(System.in);

    // aplicando conceito básico de concanetação de string e chamando outra classe
      Soma sm = new Soma(); // cria um novo objeto, que é de classe Soma.java
        System.out.println("Primeira nota: " + sm.x);
        System.out.println("Segunda nota: " + sm.y);
          System.out.println("Soma de duas notas decimais: " + sm.total);

        System.out.println("---------------------");
            
    // aplicando casting explícito, de double para int
      int nt = (int) (sm.x + sm.y);
          System.out.println("Nota (sem casas decimais): " + nt);

        System.out.println("---------------------");

    // aplicando valores a variáveis do tipo char e string
      char letra = 'P';
        String palavra = "ALMEIRAS";
          System.out.println("Senha de 8 dígitos " + letra + palavra);

        System.out.println("---------------------");

    // aplicando uma lógica simples de preco do produto * quantidade para saber o valor total
      Vendas ve = new Vendas();
        System.out.println("Preço do produto: " + ve.precoProduto);
        System.out.println("Quantidade: " + ve.qtde);
          System.out.println("Valor total: " + ve.total);

        System.out.println("---------------------");

    // aplicando lógica em java, com uma conversão básica de dólar para reais
      Conversão co = new Conversão();
        System.out.println("Valor em dólar: " + co.valorEmDolares);
        System.out.println("Valor equivalente a 1 dólar: " + co.valorEmReais);
          System.out.println("Valor da conversão: " + co.conversão);

        System.out.println("---------------------");

    // aplicando a lógica em java, com um desconto em determinado produto e seu valor
      Soma so = new Soma();
        System.out.println("Preço original: " + so.precoOriginal);
        System.out.println("Porcentagem do desconto: %" + so.desconto);
          so.precoOriginal = so.precoFinal;
            System.out.println("Valor final (com desconto): " + so.precoOriginal);

        System.out.println("----------------------");
        
    // aplicando scanner para leitura de dados
      double nota = 0;
      double media = 0;
        for (int i = 0; i < 4; i++) {
          System.out.println("Nota: ");
            nota = leitura.nextDouble();
            media += nota;
      }
    System.out.println("Média final das notas: " + media / 4);
  }
}