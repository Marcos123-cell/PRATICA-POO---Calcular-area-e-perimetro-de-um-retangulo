package Dominio;

public class ContaLuz {
    private String contaCliente;
    private double consumoKw;
    public static final double valorKw = 0.64;

    public ContaLuz(String contaCliente, double consumoKw){
        this.contaCliente = contaCliente;
        this.consumoKw = consumoKw;
    }

    public double  calcularTotal(){
        return this.consumoKw * valorKw;

    }

    public void exibirDados(){
        System.out.println("Cliente: " + this.contaCliente + ".");
        System.out.println("Consumiu: " + this.consumoKw + "KWh.");
        System.out.println("Com o KWh valendo 0.64 centavos");
        System.out.println("Ficara: R$ " + calcularTotal() + " Reais");
    }
}
