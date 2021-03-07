
package Ejercicio_1;


public class Rectangulo {
    int  longitud=0, ancho=0, area=0, perimetro=0;

    public Rectangulo(int longitud, int ancho) {
        this.longitud = longitud;
        this.ancho = ancho;
    }
    
    public int calcularArea(){
        area= ancho*longitud;
        return area;
    }
     public int calcularPerimetro(){
        perimetro=ancho+longitud+ancho+longitud;
        return perimetro;
    }
     public void mostrar(){
         System.out.println("El Area del rectangulo es:"+calcularArea());
         System.out.println("El Perimetro del rectangulo es:"+calcularPerimetro());
         System.out.println("__________________________________");
     }
}
