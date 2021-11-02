package exercicios;

import java.util.Scanner;

public class Exercicio17 {
  public static void main(String[] args) {

    int notapesquisa = 0, idade[] = new int[10];
    String nome[] = new String[10];
    Scanner scanner = new Scanner(System.in);

    for (int i = 0; i < idade.length; i++) {

      System.out.println("Informe seu nome: ");
      nome[i] = scanner.next();

      System.out.println("Informe sua idade: ");
      idade[i] = scanner.nextInt();
    }
    System.out.println("Informe a idade para pesquisa: ");
    notapesquisa = scanner.nextInt();

    for (int i = 0; i < idade.length; i++) {
      if (idade[i] > notapesquisa) {
        System.out.println(nome[i] + " " + idade[i]);
      }
    }
    scanner.close();
  }
}
