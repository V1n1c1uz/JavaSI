package provas;

import java.util.Scanner;

public class VA3 {
  public static void main(String args[]) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Informe o a quantidade de funcionarios");
    int funcionarios = scanner.nextInt();

    int[] salarios = new int[funcionarios];
    int[] novosalario = new int[funcionarios];
    int soma = 0, media = 0;

    for (int i = 0; i < funcionarios; i++) {

      System.out.println("Informe o salario desse funcionario");
      salarios[i] = scanner.nextInt();

      if (salarios[i] <= 280) {
        novosalario[i] = salarios[i] + (salarios[i] / 100) * 20;
        soma += novosalario[i];
        System.out.println(novosalario[i]);
      }

      if (salarios[i] >= 280 && salarios[i] <= 700) {
        novosalario[i] = salarios[i] + (salarios[i] / 100) * 15;
        soma += novosalario[i];
        System.out.println(novosalario[i]);
      }

      if (salarios[i] >= 700 && salarios[i] <= 1500) {
        novosalario[i] = salarios[i] + (salarios[i] / 100) * 10;
        soma += novosalario[i];
        System.out.println(novosalario[i]);
      }

      if (salarios[i] > 1500) {
        novosalario[i] = salarios[i] + (salarios[i] / 100) * 5;
        soma += novosalario[i];
        System.out.println(novosalario[i]);
      }

    }

    media = soma / funcionarios;

    System.out.println("====================================");

    System.out.println("Média de novos salários: " + media + "\n");


    System.out.println("Salarios abaixo de 750:");

    for (int i = 0; i < funcionarios; i++) {

      if (salarios[i] < 750) {
        System.out.println(novosalario[i]);
      }

    }

    scanner.close();

  }
}
