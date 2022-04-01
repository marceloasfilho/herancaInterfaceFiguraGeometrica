package entities;

public class Triangulo extends AbstractFormaGeometrica {

    private Double base;
    private Double altura;

    public Triangulo(String cor, Double base, Double altura) {
        super(cor);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public Double area() {
        return (this.base * this.altura) / 2;
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }
}
