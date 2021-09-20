package exercicios;
import java.util.Scanner;

public class exercicio9 {
  public static void main(String[] args) {
    int contador = 1;
    int media = 0;
    int nota = 0;
    Scanner scanner = new Scanner(System.in);

    while(contador <= 3){
      System.out.println("Digite uma nota: ");
      nota = nota + scanner.nextInt();
      contador++;
    }
    media = nota / 3;
    System.out.println("O Total das notas foi: " + nota + " e a media é: "+ media);
    scanner.close();
  }
}