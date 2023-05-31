
package geometria.meuPrograma;

import geometria.Retangulo;

public class Main {
    public static void main(String[] args) {
        Retangulo r1 = new Retangulo(10, 1);
        
        double areaRetangulo = r1.calcularArea();
        double perimetroRetangulo = r1.calcularPerimetro();
        
        System.out.println("Area do retangulo: " + areaRetangulo + "\nPerimetro do retangulo: " + perimetroRetangulo );
    }
}

