package main;

import java.util.Scanner;

public class Pessoa {
    String nome;
    String objetivo;
    char sexo;
    int idade;
    int altura;
    double peso;
    double atividade;
    double bmr;
    double tdee;

    public Pessoa(String nome, char sexo, String objetivo, int idade, int altura, double peso, int atividade) {
        this.nome = nome;
        this.sexo = sexo;
        this.objetivo = objetivo;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.atividade = atividade;
    }

    public String getNome() {
        return nome;
    }

    public char getSexo() {
        return sexo;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public int getIdade() {
        return idade;
    }

    public int getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public double getAtividade() {
        return atividade;
    }

    public double getTdee() {
        return tdee;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public static void printNivelDeAtividade() {
        System.out.println("Nivel de atividade: \n" +
                "1 - Sedentario(Não faz exercício físico) \n" +
                "2 - Pouco ativo(Exercício 1-2 dias na semana) \n" +
                "3 - Ativo(Exercício 3-5 dias na semana) \n" +
                "4 - Bastante ativo(Exercício 6-7 dias na semana) \n" +
                "5 - Extremamente ativo(Exercício 2 vezes por dia todos os dias)");
    }

    public void setAtividade(double atividade) {
        if (atividade == 1) {
            this.atividade = 1.2;
        } else if (atividade == 2) {
            this.atividade = 1.375;
        } else if (atividade == 3) {
            this.atividade = 1.55;
        } else if (atividade == 4) {
            this.atividade = 1.725;
        } else if (atividade == 5) {
            this.atividade = 1.9;
        }
    }

    public double calcularObjetivo() {
        if (objetivo.contains("ganhar")) {
            return 500;
        } else if (objetivo.contains("perder")) {
            return -500;
        } else if (objetivo.contains("manter")) {
            return 0;
        } else {
            throw new IllegalStateException("Valor inesperado: " + objetivo);
        }
    }

    public void calcularBMR() {
        switch (sexo) {
            case 'M':
                bmr = 10 * peso + 6.25 * altura - 5 * idade + 5;
                break;
            case 'F':
                bmr = 10 * peso + 6.25 * altura - 5 * idade - 165;
                break;
            default:
                throw new IllegalStateException("Valor inesperado: " + sexo);
        }
    }

    public void calcularTDEE() {
        calcularBMR();
        tdee = bmr * atividade + calcularObjetivo();
    }
}
