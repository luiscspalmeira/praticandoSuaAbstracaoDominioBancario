import java.util.Scanner;

public class App {
    public static void main(String[] args){
        // Lendo os dados de Entrada:
        Scanner scanner = new Scanner(System.in);
        int numeroConta = Integer.parseInt(scanner.nextLine());
        String nomeTitular = scanner.nextLine();
        double saldo = Double.parseDouble(scanner.nextLine());

        //TODO: Criar uma instância de "ContaBancaria" com os valores de Entrada.
        ContaBancaria contaBancaria = new ContaBancaria(numeroConta, nomeTitular, saldo);
        
        
        //TODO: Imprimir as informações da conta usando o objeto criado no TODO acima.
        System.out.println("Informacoes:");
        System.out.println("Conta: "+contaBancaria.getConta());
        System.out.println("Titular: "+contaBancaria.getTitular());
        System.out.println("Saldo: R$ "+contaBancaria.getSaldo());
    }
}
