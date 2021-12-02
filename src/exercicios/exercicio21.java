package exercicios;

import java.util.Scanner;

public class exercicio21 {
  public static void main(String[] args) {
    int[] valores = new int[3];
    Scanner scanner = new Scanner(System.in);

    for (int i = 0; i < valores.length; i++) {
      System.out.println("Informe um valor: ");
      valores[i] = scanner.nextInt();
    }

    System.out.println("Array em ordem\n");

    for(int i : valores){
      System.out.println(i);
    }

    System.out.println("\nArray em ordem trás para frente\n");
    
    for(int i = valores.length - 1; i >= 0; i--){
      System.out.println(valores[i]);
    }
    scanner.close();
  }

}