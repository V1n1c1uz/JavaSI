package OrientadoaObjeto;

import java.util.Scanner;

public class Principal {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Informe ó primeiro número");
    double numberOne = scanner.nextDouble();

    System.out.println("Informe qual operação deseja realizar");
    String option = scanner.next().toLowerCase();

    System.out.println("Informe ó segundo número");
    double numberTwo = scanner.nextDouble();

    Calculadora calc = new Calculadora();

    calc.numberOne = numberOne;
    calc.numberTwo = numberTwo;

    switch (option) {

      case "soma":
      case "+":
        System.out.printf("%.2f + %.2f \nResultado: %.2f",
            calc.numberOne,
            calc.numberTwo,
            calc.sum());

        break;

      case "subtracao":
      case "-":
        System.out.printf("%.2f - %.2f \nResultado: %.2f",
            calc.numberOne,
            calc.numberTwo,
            calc.subtraction());

        break;

      case "multiplicacao":
      case "*":
        System.out.printf("%.2f * %.2f \nResultado: %.2f",
            calc.numberOne,
            calc.numberTwo,
            calc.multiplication());

        break;

      case "divisao":
      case "/":
        System.out.printf("%.2f / %.2f \nResultado: %.2f",
            calc.numberOne,
            calc.numberTwo,
            calc.division());

        break;

    }

    scanner.close();

  }

}
