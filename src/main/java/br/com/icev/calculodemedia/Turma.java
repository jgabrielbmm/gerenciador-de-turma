package br.com.icev.calculodemedia;

import java.util.ArrayList;

public class Turma {
    private ArrayList<Aluno> turma = new ArrayList<>();


    public void mostrarAlunos(){
        for(Aluno aluno : turma){
            System.out.println(aluno);
        }
    }

    public void addAluno(Aluno aluno){
        turma.add(aluno);
    }

    public double calcMediaTurma(){
        double acc = 0;
        for(Aluno aluno : turma){
            acc =+ aluno.getMedia();
        }
        return acc/turma.size();
    }

}
