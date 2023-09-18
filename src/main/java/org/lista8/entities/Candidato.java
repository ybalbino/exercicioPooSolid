package org.lista8.entities;

public class Candidato {
    private int matricula;
    private double nota;

    public Candidato(int matricula, double nota) {
        this.matricula = matricula;
        this.nota = nota;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Matrícula: " + matricula + ", Nota: " + nota;
    }
}
