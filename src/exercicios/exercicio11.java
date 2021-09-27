package exercicios;

import java.util.Scanner;

public class exercicio11 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int temperatura, matricula = 0;



    while(matricula != -1){

      System.out.println("Por favor informe sua matricula: ");
      matricula = scanner.nextInt();

      System.out.println("Por favor digite sua temperatura: ");
      temperatura = scanner.nextInt();

      if(temperatura > 37){
        System.out.println("É maior");
      }
    }



  }
}
