package code.exemplos;

public class exemploCase {
  public static void main(String args[]) {
    int opcao;
    System.out.println("Informe opçcao do caixa: 1 para sacar e 2 deposito 3 para saldo");
    opcao = 3;
    switch (opcao) {
      case 1:

        break;
      case 2:
        System.out.println("Digite o valor para deposito");
        break;
      case 3:
        System.out.println("o seu saldo é:");
        break;
    }
  }
}
