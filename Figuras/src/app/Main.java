package app;

public abstract class Main {

	public static void main(String[] args) {
     
        Circulo circulo1 = new Circulo(); 
        Circulo circulo2 = new Circulo(3.5); 
        
    
        System.out.println("Círculo 1:");
        System.out.println("Radio: " + circulo1.getRadio());
        System.out.println("Área: " + circulo1.calcularArea());
        System.out.println("Perímetro: " + circulo1.calcularPerimetro());
        System.out.println();

        System.out.println("Círculo 2:");
        System.out.println("Radio: " + circulo2.getRadio());
        System.out.println("Área: " + circulo2.calcularArea());
        System.out.println("Perímetro: " + circulo2.calcularPerimetro());
        
        Rectangulo rectangulo1 = new Rectangulo(4, 5);

        System.out.println("Rectángulo 1:");
        System.out.println("Ancho: " + rectangulo1.getAncho());
        System.out.println("Alto: " + rectangulo1.getAlto());
        System.out.println("Área: " + rectangulo1.calcularArea());
        System.out.println("Perímetro: " + rectangulo1.calcularPerimetro());
        System.out.println();
    }
}
