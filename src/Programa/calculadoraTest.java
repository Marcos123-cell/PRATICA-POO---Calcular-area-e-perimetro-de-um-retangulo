package Programa;

import Dominio.Calculadora;

import java.util.Scanner;

/*
1. Calculadora simples

Crie uma classe Calculadora com métodos para somar, subtrair, multiplicar e dividir dois números.

Atributos: num1, num2

Métodos: somar(), subtrair(), multiplicar(), dividir()

2. Conta Bancária

Crie uma classe ContaBancaria com:

Atributos: saldo, titular

Métodos: depositar(double valor), sacar(double valor)

Evite que o saldo fique negativo.

3. Retângulo

Crie uma classe Retangulo:

Atributos: largura, altura

Métodos: calcularArea(), calcularPerimetro()

4. Livro

Crie uma classe Livro com:

Atributos: titulo, autor, anoPublicacao

//Método: exibirInfo() para imprimir os dados do livro

5. Pessoa

Crie uma classe Pessoa com:

Atributos: nome, idade, altura

Métodos: fazerAniversario() (aumenta a idade) e dizerOla() (exibe uma saudação com o nome)

6. Carro

Crie uma classe Carro com:

Atributos: marca, modelo, velocidadeAtual

Métodos: acelerar(int incremento), frear(int decremento), mostrarVelocidade()

7. Conta de Luz

Crie uma classe ContaDeLuz com:

Atributos: nomeCliente, consumoKw, valorKw

Método: calcularTotal() (retorna consumo × valor por kW)

8. Aluno

Crie uma classe Aluno com:

Atributos: nome, nota1, nota2, nota3

Método: calcularMedia()

Método: estaAprovado() (media ≥ 7 → aprovado, senão reprovado)

9. Jogo de Dados

Crie uma classe Dado com:

Atributo: valor

Método: rolar() que sorteia um número de 1 a 6

Método: mostrarValor()

10. Temporizador

Crie uma classe Temporizador com:

Atributos: horas, minutos, segundos

Métodos: incrementarSegundos(), incrementarMinutos(), incrementarHoras()

Método: mostrarHora()
 */
public class calculadoraTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculadora calc = new Calculadora();

        System.out.println("Bem-vindo ao programa calculadora, calculamos somente dosi numeros!");

        System.out.print("\nDigite o 1° numero: ");
        calc.setNum1(sc.nextDouble());

        System.out.print("Digite o 2° numero: ");
        calc.setNum2(sc.nextDouble());

        System.out.println("\nAgora falta você me falar qual operação você deseja.\n1 - para somar\n2 - para subtrair\n3 - para multiplicar\n4 - para dividir");
        calc.setOperacao(sc.nextInt());



            if(calc.getOperacao() == 1) {
                System.out.println("A soma de " + calc.getNum1() + " e " + calc.getNum2() + " é " + calc.somar());
            }

            else if(calc.getOperacao() == 2) {
                System.out.println("A subtração de " + calc.getNum1() + " e " + calc.getNum2() + " é " + calc.subtrair());
            }

            else if(calc.getOperacao() == 3) {
                System.out.println("A multiplicação de " + calc.getNum1() + " e " + calc.getNum2() + " é " + calc.multiplicar());
            }

            else if(calc.getOperacao() == 4) {
                System.out.println("A divisão de " + calc.getNum1() + " e " + calc.getNum2() + " é " + calc.dividir());
            }

            else{
                System.out.println("Resposta invalida.");
        }
    }
}
