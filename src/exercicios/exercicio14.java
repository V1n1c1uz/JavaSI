package exercicios;

import java.util.Scanner;

public class exercicio14 {
  public static void main(String[] args) {

    String opcao;
    Scanner scanner = new Scanner(System.in);
    float saque, deposito, transferencia, saldo = 1500, operacao = 0;

    System.out.println("Por gentileza informe qual operação deseja realizar: ");
    opcao = scanner.next().toLowerCase();

    switch (opcao) {

      case "saque":
        System.out.println("Por gentileza informe o valor do saque: ");
        saque = scanner.nextFloat();

        if (saque > saldo) {
          System.out.println("Você não tem saldo suficiente para essa operação");
          break;
        }

        operacao = saldo - saque;
        System.out.println("Você efetuo um saque de: R$" + saque + " seu novo saldo: R$" + operacao);
        break;

      case "deposito":

        System.out.println("Por gentileza informe o valor que deseja depositar: ");
        deposito = scanner.nextFloat();

        operacao = saldo + deposito;
        System.out.println("Você efetuo um deposito de: R$" + deposito + " seu novo saldo: R$" + operacao);

        break;

      case "transferencia":

        System.out.println("Por gentileza informe o valor que deseja transferir: ");
        transferencia = scanner.nextFloat();

        if (transferencia > saldo) {
          System.out.println("Você não tem saldo suficiente para essa operação");
          break;
        }

        operacao = saldo - transferencia;
        System.out.println("Você efetuo uma transferência de: R$" + transferencia + " seu novo saldo: R$" + operacao);

        break;

      case "saldo":

        System.out.println("Você possui um saldo no valor de: R$" + saldo);

        break;
    }

    scanner.close();
  }

}
