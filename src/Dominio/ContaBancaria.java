package Dominio;

public class ContaBancaria {
    private double saldo;
    private String titular;
    public double valor;
    public String apelido;


    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void setTitular(String titular){
        this.titular = titular;
    }

    public String getTitular(){
        return this.titular;
    }

    public void depositar(double valor){
        this.saldo += valor;

    }

    public void sacar(double valor){
        if(this.saldo > 0){
            this.saldo -= valor;
        }

        else{
            System.out.println("saldo insulficiente.");
        }
    }


}
