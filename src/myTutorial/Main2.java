package myTutorial;

abstract class Forma {
    public abstract double calcularArea();
    public abstract void mostrarInformacion();
}
class Circulo extends Forma {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Círculo - Radio: " + radio);
    }
}

class Rectangulo extends Forma {
    private double ancho;
    private double alto;

    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    public double calcularArea() {
        return ancho * alto;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Rectángulo - Ancho: " + ancho + ", Alto: " + alto);
    }
}


public class Main2 {
	public static void main(String[] args) {
        Forma circulo = new Circulo(5);
        Forma rectangulo = new Rectangulo(4, 6);

        Forma[] formas = {circulo, rectangulo};

        for (Forma forma : formas) {
            forma.mostrarInformacion();
            System.out.println("Área: " + forma.calcularArea());
            System.out.println();
        }
    }
}
