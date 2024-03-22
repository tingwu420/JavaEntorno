package modelos;

public class Circulo extends Figuras{

    private double radio;

 
    public Circulo() {
        this.radio = 1.0; // 
    }

   
    public Circulo(double radio) {
        this.radio = radio;
    }

 
    public double getRadio() {
        return radio;
    }


    public void setRadio(double radio) {
        this.radio = radio;
    }


    public String toString() {
        return "Círculo con radio: " + radio;
    }


    public double calcularArea() {
        return Math.PI * radio * radio;
    }

 
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
}