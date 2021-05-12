package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Macros m1 = new Macros();
        System.out.println("Nome: ");
        String nome = s.nextLine();
        System.out.println("Sexo(M/F): ");
        char sexo = s.next().toUpperCase().charAt(0);
        System.out.println("Ganhar/Manter/Perder peso: ");
        String objetivo = s.next().toLowerCase();
        System.out.println("Idade: ");
        int idade = s.nextInt();
        System.out.println("Altura(Cm): ");
        int altura = s.nextInt();
        System.out.println("Peso(Kg): ");
        double peso = s.nextDouble();
        // Pergunta o nível de atividade física
        Pessoa.printNivelDeAtividade();
        int atividade = s.nextInt();
        Pessoa p1 = new Pessoa(nome, sexo, objetivo, idade, altura, peso, atividade);
        p1.calcularTDEE();
        System.out.println("1 - Usar porcentagem de macros padrão \n" +
                "2 - Personalizar porcentagem de macros");
        m1.escolherPorcentagemMacros(s.nextInt());

        System.out.println("Calorias necessarias para " + p1.getObjetivo() + " peso: " + p1.getTdee() + "kcal");
        m1.calcularMacronutrientes(p1.getTdee());
        System.out.println("Macros: \n" +
                "Proteinas: " + m1.getProteinas() + "g \n" +
                "Carboidratos: " + m1.getCarboidratos() + "g \n" +
                "Gorduras: " + m1.getGorduras() + "g"
        );
    }
}
