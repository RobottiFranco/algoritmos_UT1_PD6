package com.example;

public final class Tablero {

    public static void imprimirTablero(int largo, int ancho) {
        for (int i = 0; i < largo; i++) {
            for (int j = 0; j < ancho; j++) {
                System.out.print("# ");

            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        imprimirTablero(7, 7);

    }
}
