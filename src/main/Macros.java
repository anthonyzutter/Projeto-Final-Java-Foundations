package main;

import java.util.Scanner;

public class Macros {
    int proteinas;
    int carboidratos;
    int gorduras;
    double porcentagemProteinas = 0.20;
    double porcentagemCarboidratos = 0.50;
    double porcentagemGorduras = 0.30;

    public int getProteinas() {
        return proteinas;
    }

    public int getCarboidratos() {
        return carboidratos;
    }

    public int getGorduras() {
        return gorduras;
    }

    public void setProteinas(int proteinas) {
        this.proteinas = proteinas;
    }

    public void setCarboidratos(int carboidratos) {
        this.carboidratos = carboidratos;
    }

    public void setGorduras(int gorduras) {
        this.gorduras = gorduras;
    }

    public void setPorcentagemProteinas(double porcentagemProteinas) {
        this.porcentagemProteinas = porcentagemProteinas;
    }

    public void setPorcentagemCarboidratos(double porcentagemCarboidratos) {
        this.porcentagemCarboidratos = porcentagemCarboidratos;
    }

    public void setPorcentagemGorduras(double porcentagemGorduras) {
        this.porcentagemGorduras = porcentagemGorduras;
    }

    public void escolherPorcentagemMacros(int escolha) {
        Scanner s = new Scanner(System.in);
        System.out.println("1 - Usar porcentagem de macros padrão \n" +
                "2 - Personalizar porcentagem de macros");
        switch (escolha) {
            case 1:
                System.out.println("Macros padrão: 20% Proteina, 50% Carboidrato, 30% Gordura");
                break;
            case 2:
                System.out.println("Digite a porcentagem de proteina: ");
                double proteina = s.nextDouble() / 100;
                System.out.println("Digite a porcentagem de carboidrato: ");
                double carboidrato = s.nextDouble() / 100;
                System.out.println("Digite a porcentagem de gordura: ");
                double gorduras = s.nextDouble() / 100;
                alterarPorcentagemMacros(proteina, carboidrato, gorduras);
                break;
            default:
                throw new IllegalStateException("Valor inesperado");
        }
    }

    public void alterarPorcentagemMacros(double proteinas, double carboidratos, double gorduras) {
        setPorcentagemProteinas(proteinas);
        setPorcentagemCarboidratos(carboidratos);
        setPorcentagemGorduras(gorduras);
    }

    public void calcularMacronutrientes(double tdee) {
        setProteinas((int) (tdee * porcentagemProteinas) / 4);
        setCarboidratos((int) (tdee * porcentagemCarboidratos) / 4);
        setGorduras((int) (tdee * porcentagemGorduras) / 9);
    }
}
