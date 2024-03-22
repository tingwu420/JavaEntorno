package modelos;

public class Rectangulo extends Figuras{

    private int base;
    private int altura;

    public Rectangulo() {
        this.base = 0; 
        this.altura = 0; 
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public String toString() {
        return "Base: " + base + ", Altura: " + altura;
    }

    public int calcularPerimetro() {
        return 2 * (base + altura);
    }
}