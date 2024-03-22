package modelos;

public class Rectangulo extends Figuras{
	 /**
     * Base del rectángulo.
     */
    private int base;
    /**
     * Altura del rectángulo.
     */
    private int altura;
    /**
     *Constructor
     * @param base La base del rectángulo.
     * @param altura La altura del rectángulo.
     */
    public Rectangulo() {
        this.base = 0; 
        this.altura = 0; 
    }

    public int getBase() {
        return base;
    }
    /**
     * @base:int
     */
    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }
    /**
     * @Altura:int
     */
    public void setAltura(int altura) {
        this.altura = altura;
    }
    /**
     * return
     */
    public String toString() {
        return "Base: " + base + ", Altura: " + altura;
    }
    /**
     * Método calcularPerimtro
     */
    public int calcularPerimetro() {
        return 2 * (base + altura);
    }
}