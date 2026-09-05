package br.edu.unipe;

public class Losango implements FiguraGeometrica {
    private double diagonal1;
    private double diagonal2;

    public Losango(double diagonal1, double diagonal2) {
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }

    @Override
    public double calculaArea() {
        return (this.diagonal1 * this.diagonal2) / 2.0;
    }

    @Override
    public String getNomeFigura() {
        return "Losango";
    }

    @Override
    public String toString() {
        return getNomeFigura() + " [Diagonal 1: " + diagonal1 + ", Diagonal 2: " + diagonal2 + ", Área: " + calculaArea() + "]";
    }
}
