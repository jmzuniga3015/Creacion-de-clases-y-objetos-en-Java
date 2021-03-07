
package Ejercicio_3;
///Diseñe e implemente una clase para trabajar con triángulos isósceles. 
//Defina atributos para la base y la altura,
//proporcione un método constructor, métodos getter y setter e implemente métodos para calcular: 
//el área, la longitud de
//sus lados iguales, el perímetro, el valor del ángulo vértice

public class Triangulo {
    private int base=0, altura=0;

    public Triangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
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

   
    
}
