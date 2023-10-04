import java.util.Scanner;

public class Desafio {

  public static void main(String[] args) {
    // Lendo os dados de Entrada:
    Scanner scanner = new Scanner(System.in);
    String titular = scanner.nextLine();
    int numeroConta = Integer.parseInt(scanner.nextLine());
    double saldo = Double.parseDouble(scanner.nextLine());
    double taxaJuros = Double.parseDouble(scanner.nextLine());

    ContaPoupanca contaPoupanca = new ContaPoupanca(numeroConta, titular, saldo, taxaJuros);

    System.out.println("Conta Poupanca:");
    contaPoupanca.exibirInformacoes();
  }
}