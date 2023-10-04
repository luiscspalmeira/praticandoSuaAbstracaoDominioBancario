public class ContaBancaria {
    private int numero;
    private String titular;
    private double saldo;

    public ContaBancaria(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }
  
    public int getConta(){
        return numero;
    }
  
    public String getTitular(){
        return titular;
    }
  
    public double getSaldo(){
        return saldo;
    }
}
