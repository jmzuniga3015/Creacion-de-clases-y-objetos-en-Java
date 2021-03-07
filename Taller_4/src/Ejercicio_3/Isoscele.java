
package Ejercicio_3;

public class Isoscele extends Triangulo{

    public Isoscele(int base, int altura) {
        super(base, altura);
    }
    
   public int  calcularArea(){
        int area = (getBase()*getAltura())/2;
        return area;
   }
     public void calcularLongitud(){
       
   }
     public int calcularPerimetro(){
       int perimetro= 2*getAltura()+getBase();
       return perimetro;
   }
     public void calcularElAnguloDelVertice(){
       
   }
    public void mostrar(){
        System.out.println("El area es: "+calcularArea());
        System.out.println("El perimetro es: "+calcularPerimetro());
    }
}
