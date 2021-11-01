package exercicios;

import java.util.Scanner;

public class exercicio15 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] notas = new int[3];
    int nota;

    for(int i = 0; 1 < notas.length; i++) {
      System.out.println("Informe a nota: ");
      nota = scanner.nextInt();

      notas[i] = nota;
    }

    System.out.println(notas);
    scanner.close();
  }
}
