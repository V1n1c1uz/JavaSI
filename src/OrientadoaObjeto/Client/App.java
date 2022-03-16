package OrientadoaObjeto.Client;

import java.util.Scanner;

import OrientadoaObjeto.Client.Class.Cliente;

public class App {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Cliente client = new Cliente();

    System.out.println("Informe ó código");
    int code = scanner.nextInt();
    client.setCode(code);

    System.out.println("Informe o nome do cliente");
    String name = scanner.next().toLowerCase();
    client.setName(name);

    System.out.println("Informe ó tipo J ou P");
    String type = scanner.next().toLowerCase();
    client.setType(type);

    System.out.printf("Codigo: %d%nNome: %s%nTipo: %s", code, name, type);
    
    scanner.close();

  }
}