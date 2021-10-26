package exercicios;

import java.util.Scanner;

public class exercicio16 {
  public static void main(String[] args) {
    int [] valores = new int [3];
    Scanner scanner = new Scanner(System.in);

    for (int i = 0; i < valores.length; i++) {
      System.out.println("Digite uma nota: ");
      valores[i] = scanner.nextInt();
    }

    for(int i : valores){
      System.out.println("Valores triplicados: " + i * 3);
    }
    scanner.close();
  }
}
