package exercicios;

import java.util.Scanner;

public class exercicio18 {
  public static void main(String[] args) {
    int[] notas = new int[3];
    Scanner scanner = new Scanner(System.in);
    for (int i = 0; i < notas.length; i++) {
      System.out.println("Informe uma nota: ");
      notas[i] = scanner.nextInt();
    }

    System.out.println("Informe a nota que deseja zerar: ");
    int notaZerar = scanner.nextInt();

    for(int i = 0; i < notas.length; i++){
      if(notas[i] == notaZerar){
       notas[i] = 0;
      }
      System.out.println("As novas notas são: " + notas[i]);
    }
    scanner.close();
  }
}
