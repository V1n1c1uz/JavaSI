/*
1) Desenvolva um programa em Java ou Portugol contendo os seguintes requisitos:

a) Calcular a média de 6 notas de alunos.
b) identificar qual é a menor e maior nota.

*/

package provas;
import java.util.Scanner;

class calcularMedia {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
 
    int contador = 0, resultado = 0, media = 0, maior = 0, menor = 999999;
 
    while (contador <= 5) {
      contador = contador + 1;
      System.out.print("Digite sua nota: ");
      int nota = scanner.nextInt();
 
      resultado = resultado + nota;
      media = resultado / 6;
 
      if (nota > maior) {
        maior = nota;
      }
      if (nota <= menor) {
        menor = nota;
      }
 
    }
 
    System.out.print("As media das notas é: " + media);
    System.out.print("\nA maior nota: " + maior);
    System.out.print("\nMenor nota: " + menor);
    scanner.close();
  }
}


/* 
2) Desenvolva um programa em java ou Portugol contendo os seguintes requisitos.

a) Informe o primeiro nome
b) Informe o segundo nome
c) Imprima o nome completo

 */


public class VA1 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Informe o primeiro nome: ");
    String firstName = scanner.nextLine();
    System.out.print("Informe o segundo nome: ");
    String lastName = scanner.nextLine();

    System.out.println("Seu nome completo é: " + firstName + " " + lastName);

    scanner.close();
  }
}
