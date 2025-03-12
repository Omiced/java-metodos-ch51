import com.generation.metodos.Ejemplos;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        //instancia de la clase ejemplos
        Ejemplos ejemplo = new Ejemplos();
        ejemplo.oddEven(200);
        ejemplo.oddEven(50);
        System.out.println(ejemplo.getFactorial(3));
        System.out.println(ejemplo.getIVA(200));
        System.out.println("precio +  iva");
        System.out.println(ejemplo.getPrecioWithIVA(200));
        //usando metodo estatico
        Ejemplos.greetings();
        Ejemplos.getChessBoard(10);
        System.out.println("Area de un triangulo");
        System.out.println(Ejemplos.getArea(5,3));
        System.out.println(Ejemplos.getDescuento(-100));
        int suma = sumar(2,4);
        System.out.println(suma);

    }

    public static int sumar(int a, int b){
        return a + b;
    }


}