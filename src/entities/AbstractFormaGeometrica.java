package entities;

public abstract class AbstractFormaGeometrica implements FormaGeometrica{
    private String cor;

    public AbstractFormaGeometrica(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
