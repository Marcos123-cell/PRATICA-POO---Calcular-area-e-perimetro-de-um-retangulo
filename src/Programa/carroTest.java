package Programa;

import Dominio.Carro;

import java.util.Scanner;

public class carroTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Vamos simular um jogo de carro!");

        System.out.print("\nMe fale a marca do seu carro favorito: ");
        String marca = sc.nextLine();

        System.out.print("\nMe fale agora o modelo do seu carro favorito: ");
        String modelo = sc.nextLine();

        System.out.print("\nCerto, agora vamos supor que você esteja andando com ele. me fale quantos km por hora você estaria: ");
        int velocidadeAtual = sc.nextInt();

        Carro car = new Carro(marca, modelo, velocidadeAtual);

        car.mostrarVelocidade();

        sc.nextLine();
        System.out.println("\nDeseja acelerar ou frear?(1 - acelerar | 2 - frear)");
        car.resposta1 = sc.nextLine();

        if(car.resposta1.equals("1")){
            System.out.println("Quantos km você vai acelerar? ");
            car.acelerar(sc.nextInt());

            sc.nextLine();
            car.mostrarVelocidade();
            System.out.println("\nDeseja frear?(1 - sim | 2 - não)");
            car.resposta2 = sc.nextLine();

            if(car.resposta2.equals("1")){
                System.out.println("Quantos km você vai frear? ");
                car.frear(sc.nextInt());

                car.mostrarVelocidade();
                System.out.println("\nChegamos ao fim do programa, obrigado por ficar até aqui!" );
            }
        }

        else if(car.resposta1.equals("2")){
            System.out.println("Quantos km você vai frear? ");
            car.frear(sc.nextInt());

            car.mostrarVelocidade();
            System.out.println("\nDeseja acelerar?(1 - sim | 2 - não)");
            car.resposta2 = sc.nextLine();

            if(car.resposta2.equals("1")){
                System.out.println("Quantos km você vai acelerar? ");
                car.acelerar(sc.nextInt());

                car.mostrarVelocidade();
                System.out.println("\nChegamos ao fim do programa, obrigado por ficar até aqui!" );
            }

        }
    }
}
