package exercicios;

import java.util.Scanner;

public class exercicio12 {
  public static void main(String[] args) {

    int soma, pessoas, valorIngresso;

    Scanner scanner = new Scanner(System.in);

      System.out.println("Quantas pessoas assistiram o jogo? ");
      pessoas = scanner.nextInt();

      System.out.println("Qual valor do ingresso? ");
      valorIngresso = scanner.nextInt();

      soma = valorIngresso * pessoas;

      System.out.println("A Renda da partida foi de R$" + soma);
  

    scanner.close();

}
}

// - Equipe não tem controle da renda do jogo