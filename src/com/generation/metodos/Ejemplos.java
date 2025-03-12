package com.generation.metodos;

public class Ejemplos {
    /*
        public visible para todo el proyecto
        private visible solo para la misma clase
        protected visible para el mismo paquete y subclases

    */
    //metodo de instancia
    public void oddEven(int limit){
        for(int i = 1; i <= limit; i++){
            if(i % 2 == 0){
                System.out.println("El numero " + i + " es par");
            }else{
                System.out.println("El numero " + i + " es impart");
            }
        }
    }

    // metodo de instancia
    public int getFactorial(int num){

        int factorial = 1;

        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public double getIVA(int precio){
        double iva = precio * 0.16;
        return iva;
    }

    public double getPrecioWithIVA(int precio){
        double iva = getIVA(precio);
        double precioTotal = precio + iva;
        return precioTotal;
    }

    //metodo estatico
    public static void greetings(){
        System.out.println("Saludos");
    }

    public static void getChessBoard(int num){
        for(int i = 0; i < num; i++){
            for(int j = 0; j < num; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static float getArea(int base, int height){
        int basePlusHeight = base * height;
        float area = basePlusHeight / 2.0f;
        return area;
    }

    /*
    * 1. de 100 a  500 -> 10% descuento
    * 2. 501  a 1000 ->  15%
    * 3. 1001 a infinito -> 20%
    * */

    public static float getDescuento(int consumo){
        if(consumo < 100)return consumo;
        if(consumo >= 100 && consumo <= 500)return consumo * 0.10f;
        if(consumo >= 501 && consumo <= 1000){
            return consumo *  0.15f;
        }else{
            return consumo * 0.20f;
        }
    }
}
