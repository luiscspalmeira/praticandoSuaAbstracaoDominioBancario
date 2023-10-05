import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        // Lê o tipo de cofre (primeira linha da entrada)
        Scanner scanner = new Scanner(System.in);    
        String tipoCofre = scanner.nextLine();       
        
        // TODO: Implemente a condição necessário para a verificação dos cofres seguros:
        if (tipoCofre.equalsIgnoreCase("digital")) {   
            int senhaCofreDigital = Integer.parseInt(scanner.nextLine());
            int validaSenhaCofreDigital = Integer.parseInt(scanner.nextLine());
        CofreDigital cofreDigital = new CofreDigital(senhaCofreDigital);                       
            if( cofreDigital.validarSenha(validaSenhaCofreDigital) == true){
                cofreDigital.exibirDetalhes();
                System.out.println("Cofre aberto!");
            }else{
                cofreDigital.exibirDetalhes();
                System.out.println("Senha incorreta!");
            } 
        }else{
             CofreFisico cofreFisico = new CofreFisico();
            cofreFisico.exibirDetalhes();
        }
              
    }    
}