package Dominio;

public class Carro {
    private String marca;
    private String modelo;
    private int velocidadeAtual;


    public String resposta1;
    public String resposta2;
    public String resposta3;

    public Carro(String marca, String modelo, int velocidadeAtual){
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadeAtual = velocidadeAtual;
    }

    public void acelerar(int valor){
        this.velocidadeAtual = this.velocidadeAtual + valor;
    }

    public void frear(int valor){
        this.velocidadeAtual = this.velocidadeAtual - valor;
    }

    public void mostrarVelocidade(){
        System.out.println("Você esta a " + this.velocidadeAtual + " km/h");
    }
}
