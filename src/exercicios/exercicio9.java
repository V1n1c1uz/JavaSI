package exercicios;
import java.util.Scanner;

public class exercicio9 {
  public static void main(String[] args) {
    int contador = 1, media = 0, nota = 0, somaNota = 0;
    Scanner scanner = new Scanner(System.in);

    while(contador <= 3){
      System.out.println("Digite uma nota: ");
      nota = scanner.nextInt();
      somaNota = somaNota + nota;
      contador++;
    }
    media = somaNota / 3;
    System.out.println("O Total das notas foi: " + somaNota + " e a media é: "+ media);
    scanner.close();
  }
}