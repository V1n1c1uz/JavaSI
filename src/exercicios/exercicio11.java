package exercicios;

import java.util.Scanner;

public class exercicio11 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int temperatura, matricula = 0, totalPositivo = 0, totalSuspeito = 0;
    String TeveContato;
    while (matricula != -1) {

      System.out.println("Por favor informe sua matricula: ");
      matricula = scanner.nextInt();

      if (matricula != -1) {

        System.out.println("Por favor digite sua temperatura: ");
        temperatura = scanner.nextInt();

        if (temperatura > 37) {

          System.out.println("Você teve algum contato com uma pessoa com covid? ");
          TeveContato = scanner.next().toLowerCase();

          if (TeveContato.equals("sim")) {
            totalPositivo = totalPositivo + 1;
          } else {
            totalSuspeito = totalSuspeito + 1;
          }
        }
      }
    }
    System.out.println("Quantidade de alunos com suspeita: " + totalSuspeito + " Quantidade de alunos com COVID positivo: " + totalPositivo);
    scanner.close();
  }
}
