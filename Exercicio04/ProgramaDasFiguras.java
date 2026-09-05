package br.edu.unipe;

public class ProgramaDasFiguras {
    public static void main(String[] args) {
        GerenteDeFiguras gerente = new GerenteDeFiguras();

        Triangulo t1 = new Triangulo(2.0, 3.0);
        gerente.adicionaFigura(t1);

        Losango l1 = new Losango(4.0, 5.0);
        Losango l2 = new Losango(6.0, 8.0);
        gerente.adicionaFigura(l1);
        gerente.adicionaFigura(l2);

        gerente.imprimeFiguras();

        double areaTotal = gerente.calculaAreaTotalDeFiguras();
        System.out.println("\nÁrea Total de todas as figuras: " + areaTotal);

        System.out.println("Maior área entre as figuras: " + gerente.getMaiorAreaDeFigura());
    }
}
