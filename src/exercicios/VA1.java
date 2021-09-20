/* Desenvolva um programa em java ou Portugol contendo os seguintes requisitos.
  a) Informe o primeiro nome
  b) Informe o segundo nome
  c) Imprima o nome completo
 */

package exercicios;
import java.util.Scanner;

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
