package modelos;

public class Circulo extends Figuras{

    private double radio;

    /**Constructor
     * Radio del círculo.
     */
    public Circulo() {
        this.radio = 1.0; // 
    }

    /**
     * @param Radio del círculo.
     */
    public Circulo(double radio) {
        this.radio = radio;
    }

 
    public double getRadio() {
        return radio;
    }

    /**
     * @param Radio:int
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }

    /**
     * return
     */
    public String toString() {
        return "Círculo con radio: " + radio;
    }
 
    /**
     * Método calcularArea
     */
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    /**
     * Método calcularPerimtro
     */
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
}