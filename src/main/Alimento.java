package main;

import java.util.Scanner;

public class Alimento {
    String nome;
    double quantidade;
    double calorias;
    double proteinas;
    double carboidratos;
    double gorduras;

    public String getNome() {
        return nome;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public double getCalorias() {
        return calorias;
    }

    public double getProteinas() {
        return proteinas;
    }

    public double getCarboidratos() {
        return carboidratos;
    }

    public double getGorduras() {
        return gorduras;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public void setCalorias(double calorias) {
        this.calorias = calorias;
    }

    public void setProteinas(double proteinas) {
        this.proteinas = proteinas;
    }

    public void setCarboidratos(double carboidratos) {
        this.carboidratos = carboidratos;
    }

    public void setGorduras(double gorduras) {
        this.gorduras = gorduras;
    }

    public double calcularCalorias() {
        double kcal = (proteinas * 4) + (carboidratos * 4) + (gorduras * 9);
        return kcal;
    }

    @Override
    public String toString() {
        return "Alimento{" +
                "nome='" + nome + '\'' +
                ", quantidade=" + quantidade +
                ", calorias=" + calorias +
                ", proteinas=" + proteinas +
                ", carboidratos=" + carboidratos +
                ", gorduras=" + gorduras +
                '}';
    }

    /*public void printarInfo() {
        System.out.println(
                "Nome: " + nome + "\n" +
                "Quantidade: " + quantidade + "g\n" +
                "Calorias: " + calorias + "kcal\n" +
                "Proteinas: " + proteinas + "g\n" +
                "Carboidratos: " + carboidratos + "g\n" +
                "Gorduras: " + gorduras + "g\n"
                );
    }*/

    public static void main(String[] args) {
        Alimento a1 = new Alimento();
        Scanner t = new Scanner(System.in);
        System.out.println("Nome: "); a1.setNome(t.nextLine());
        System.out.println("Quantidade(g): "); a1.setQuantidade(t.nextDouble());
        System.out.println("Proteinas: "); a1.setProteinas(t.nextDouble());
        System.out.println("Carboidratos: "); a1.setCarboidratos(t.nextDouble());
        System.out.println("Gorduras: "); a1.setGorduras(t.nextDouble());

        // Calcular calorias
        a1.setCalorias(a1.calcularCalorias());

        System.out.println(a1.toString());

    }
}
