package exercicios;

import java.util.Scanner;

public class exercicio13 {
  public static void main(String[] args){
   
  int nota, soma = 0;
  double media = 0;
  Scanner scanner = new Scanner(System.in);

  for (int i = 1; i <= 3; i++) {
    System.out.println("Informe a nota:");
    nota = scanner.nextInt();
    soma = soma + nota;
    media = soma / 12;
    }
    scanner.close();
    System.out.println("A media é: "+ media);
  }
}
