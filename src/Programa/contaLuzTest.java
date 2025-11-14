package Programa;

import Dominio.ContaLuz;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;


public class contaLuzTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Vamos calcular quanto que você ira pagar na sua conta de luz?");

        System.out.print("Certo, para começarmos, me diga seu nome : ");
        String contaCliente = sc.nextLine();

        System.out.print("Por Ultimo, quanto KWh você consumiu este mês até agora: ");
        double consumoKw = sc.nextDouble();

        ContaLuz cl = new ContaLuz(contaCliente, consumoKw);

        System.out.println("Agora iremos calcular:");

        cl.exibirDados();



    }
}
