package modelos;


import java.util.*;

/**
 * 
 */
public class Rectangulo {

    /**
     * Default constructor
     */
    public Rectangulo() {
    	int base;
        int altura;
    }

    /**
     * 
     */
    private int base;

    /**
     * 
     */
    private int altura;

    /**
     * @return
     */
    public int getBase() {
        // TODO implement here
        return 0;
    }

    /**
     * @param base
     */
    public void setBase(int base) {
        // TODO implement here
    }

    /**
     * @return
     */
    public int getAltura() {
        // TODO implement here
        return 0;
    }

    /**
     * @param altura
     */
    public void setAltura(int altura) {
        // TODO implement here
    }

    /**
     * @param "base"+base + "altura"+altura
     * @return 
     */
    public String toString1() {
        // TODO implement here
    	return "base"+base + "altura"+altura;
    }

    /**
     * @return
     */
    public String toString() {
        // TODO implement here
        return "";
    }

    /**
     * @param 2*(base+altura) 
     * @return
     */
    public int calcularPerimetro() {
        return 2 * (base + altura);
    }

}