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
}
