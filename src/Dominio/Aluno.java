package Dominio;
/*
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
public class Aluno {
    private String nome;
    private double nota1;
    private double nota2;
    private double nota3;
    private double nota4;

    public Aluno(String nome, double nota1, double nota2, double nota3, double nota4){
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
    }

    public double calcularMedia(){
        return (nota1 + nota2 + nota3 + nota4) / 4;
    }

    public void estaAprovado(){
        if(calcularMedia() > 7){
            System.out.println("Você foi aprovado, sua nota foi " + calcularMedia());
        }

        else if(calcularMedia() > 5 && calcularMedia() < 7){
            System.out.println("Você ficou de recuperação, sua nota foi " + calcularMedia());
        }

        else{
            System.out.println("você foi reprovado, sua nota foi " + calcularMedia());
        }
    }
}
