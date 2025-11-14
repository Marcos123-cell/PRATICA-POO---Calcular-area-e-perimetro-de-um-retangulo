package Dominio;

public class Calculadora {
    private double num1;
    private double num2;
    private int operacao;

    public void setNum1(double num1){
        this.num1 = num1;
    }

    public double getNum1(){
        return this.num1;
    }

    public void setNum2(double num2){
        this.num2 = num2;
    }

    public double getNum2(){
        return this.num2;
    }

    public void setOperacao(int operacao){
        this.operacao = operacao;
    }

    public int getOperacao(){
        return operacao;
    }

    public double somar(){
        return this.num2 + this.num1;
    }

    public double subtrair(){
        return this.num1 - this.num2;
    }

    public double multiplicar(){
        return this.num1 * this.num2;
    }

    public double dividir(){
        return this.num1 / this.num2;
    }


}
