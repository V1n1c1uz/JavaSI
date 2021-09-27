package exercicios;

import java.util.Scanner;

public class exercicio10 {

  public static void main(String[] args) {
    int quantidade = 0, valor = 0, totalVendido = 0, totalQtd = 0;

    Scanner scanner = new Scanner(System.in);
    while (quantidade != -1) {

      System.out.println("Informe a quantidade do produto: ");
      quantidade = scanner.nextInt();

      if (quantidade != -1) {
        System.out.println("Informe o valor do item comprado: ");
        valor = scanner.nextInt();

        totalQtd = totalQtd + quantidade;
        totalVendido = totalVendido + (valor * quantidade);
      }

    }
    System.out.println("A quantidade de produtos vendidos foi: " + totalQtd);
    System.out.println("O valor total de produtos vendidos foi: " + totalVendido);
    scanner.close();
  }
}