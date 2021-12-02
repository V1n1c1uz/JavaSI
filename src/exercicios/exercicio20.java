package exercicios;

import java.util.Scanner;

public class exercicio20 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String[] ingressos = { "a1", "b2" , "c3" };

    System.out.println("Assentos disponiveis");
    
    for (int i = 0; i < ingressos.length; i++) {
      System.out.println(ingressos[i]);
    }


    scanner.close();
  }

}
