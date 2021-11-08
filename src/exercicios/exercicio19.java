package exercicios;

import java.util.Scanner;

public class exercicio19 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int[] numeros = new int[10];
    int maior = Integer.MIN_VALUE;

    for (int i = 0; i < numeros.length; i++) {
      System.out.println("Informe um número: ");
      numeros[i] = scanner.nextInt();
    }

    System.out.println("Informe outro número para multiplicação: ");
    int multiplicacao = scanner.nextInt();

    for (int i = 0; i < numeros.length; i++) {
      numeros[i] = numeros[i] * multiplicacao;

      if(numeros[i] > maior) maior = numeros[i];


      System.out.println("\n["+i+"] Resultado da Multiplicação de cada array: " + numeros[i]);
      scanner.close();
    }
    System.out.println("\nMaior valor desser array: " + maior);
  }
}
