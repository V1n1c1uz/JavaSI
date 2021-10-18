package provas;

import java.util.Scanner;

public class VA2 {

  public static void main(String args[]) {

    int opcao = 0, notas1 = 0, notas2 = 0, notas3 = 0, notas4 = 0, notas5 = 0, notas6 = 0;

    Scanner scanner = new Scanner(System.in);


    while (opcao != - 1) {
      
      System.out.println(" ================================ PESQUISA DE SATISFAÇÃO ===================================");
      
      System.out.println("Sendo 1 - Muito ruim | Sendo 2 - Ruim | Sendo 3 - Bom | Sendo 4 - Muito bom | Sendo 5 - Excelente | Sendo 6 - Excepcional\n");
      opcao = scanner.nextInt();

      switch(opcao) {
        
        case 1:
        notas1 = notas1 + 1;
        break;

        case 2:
        notas2 = notas2 + 1;
        break;

        case 3:
        notas3 = notas3 + 1;
        break;

        case 4:
        notas4 = notas4 + 1;
        break;

        case 5:
        notas5 = notas5 + 1;
        break;

        case 6:
        notas6 = notas6 + 1;
        break;

      }

    }
    
    scanner.close();
    System.out.println("Resultado das notas Muito Ruim: " + notas1 + 
    " | Resultado das notas Ruim: " + notas2 + 
    " | Resultado das notas Bom: " + notas3 + 
    " | Resultado das notas Muito bom: " + notas4 + 
    " | Resultado das notas Excelente: " + notas5 + 
    " | Resultado das notas Excepcional: " + notas6);
  }
}
