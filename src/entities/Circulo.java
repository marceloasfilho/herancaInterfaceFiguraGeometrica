package entities;

public class Circulo extends AbstractFormaGeometrica{

    private Double raio;

    public Circulo(String cor, Double raio) {
        super(cor);
        this.raio = raio;
    }

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }

    @Override
    public Double area() {
        return Math.PI * Math.pow(this.raio, 2);
    }
}
