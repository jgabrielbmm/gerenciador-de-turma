package br.com.icev;

// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import br.com.icev.calculodemedia.Aluno;
import br.com.icev.calculodemedia.Turma;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Informe a quantidade de alunos: ");
        int qtdAlunos = scan.nextInt();

        Turma turma = new Turma();

        for(int i = 0; i < qtdAlunos; i++){
            System.out.println("Informe o nome do aluno: ");
            String nomeAluno = scan.next();

            System.out.println("Informe a nota 1 do aluno: ");
            double nota1 = scan.nextDouble();

            System.out.println("Informe a nota 2 do aluno: ");
            double nota2 = scan.nextDouble();

            System.out.println("Informe a nota 3 do aluno: ");
            double nota3 = scan.nextDouble();

            Aluno aluno = new Aluno(nomeAluno, nota1, nota2, nota3);

            turma.addAluno(aluno);
        }


        turma.mostrarAlunos();


        System.out.println("Média da turma = " + turma.calcMediaTurma());

    }

}