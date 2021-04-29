package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Pessoa p1 = new Pessoa();
        Macros m1 = new Macros();
        System.out.println("Nome: ");
        p1.setNome(s.nextLine());
        System.out.println("Sexo(M/F): ");
        p1.setSexo(s.next().toUpperCase().charAt(0));
        System.out.println("Ganhar/Manter/Perder peso: ");
        p1.setObjetivo(s.next().toLowerCase());
        System.out.println("Idade: ");
        p1.setIdade(s.nextInt());
        System.out.println("Altura(Cm): ");
        p1.setAltura(s.nextInt());
        System.out.println("Peso(Kg): ");
        p1.setPeso(s.nextDouble());
        // Pergunta o nível de atividade física
        p1.printNivelDeAtividade();
        p1.setAtividade(s.nextInt());
        p1.calcularTDEE();
        // Pergunta se quer alterar a porcentagem dos macros
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
