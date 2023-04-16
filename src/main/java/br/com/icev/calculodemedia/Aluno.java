package br.com.icev.calculodemedia;

public class Aluno {
    private String nome;
    private double notas[] = new double[3];
    private double media;

    public Aluno(String nome, double nota1, double nota2, double nota3) {
        this.nome = nome;
        this.notas[0] = nota1;
        this.notas[1] = nota2;
        this.notas[2] = nota3;
        calcMedia(notas);
    }

    public double getMedia() {
        return media;
    }

    private void calcMedia(double[] notas){
        double acc = 0;
        for(double nota : notas) {
            acc += nota;
        }
        System.out.println(acc);
        media = acc/notas.length;
    }
    @Override
    public String toString() {
        return "[" + nome + '\'' +
                "," + media +
                ']';
    }
}
