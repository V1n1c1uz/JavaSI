package exercicios;

import java.util.Scanner;

public class exercicio22 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int soma = 0, media = 0;

    System.out.println("Informe o tamanho do array");
    int valores = scanner.nextInt();

    int[] notas = new int[valores];
    int[] maior = new int[valores];
    int[] menor = new int[valores];

    for (int i = 0; i < valores; i++) {
      System.out.println("Digite uma nota");
      notas[i] = scanner.nextInt();
      soma += notas[i];
    }

    media = soma / notas.length;

    for (int i = 0; i < notas.length; i++) {

      if (notas[i] > media) {
        maior[i] = notas[i];
        System.out.println("======================================");
        System.out.println("As notas maiores: " + maior[i]);

      }

      if (notas[i] < media) {
        menor[i] = notas[i];
        System.out.println("======================================");
        System.out.println("As notas menores: " + menor[i]);

      }
    }
    scanner.close();
  }
}
