package com.example;

import java.io.*;

public class Principal {
    public static void main(String[] args) {
        leerEntradaArchivo("src\\main\\java\\com\\example\\entrada.txt");
        leerEntradaStdin("src\\main\\java\\com\\example\\stdin.txt");
    }

    public static void leerEntradaStdin(String rutaArchivo) {
        FileReader fr;
        try {
            fr = new FileReader(rutaArchivo);
            BufferedReader br = new BufferedReader(fr);

            double radio = Double.parseDouble(br.readLine());

            double area = Math.PI * radio * radio;
            double perimetro = 2 * Math.PI * radio;

            // Imprimir los resultados
            System.out.println("El área de la circunferencia es: " + area);
            System.out.println("El perímetro de la circunferencia es: " + perimetro);



        } catch (FileNotFoundException e) {
            System.out.println("Error al leer el archivo " + rutaArchivo);
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Error al leer el archivo " + rutaArchivo);
            e.printStackTrace();
        }
        System.out.println("Archivo leido satisfactoriamente");
    }

    public static void leerEntradaArchivo(String rutaArchivo) {
        FileReader fr;
        try {
            fr = new FileReader(rutaArchivo);
            BufferedReader br = new BufferedReader(fr);
            /*
             * String lineaActual = br.readLine();
             * while (lineaActual != null) {
             * System.out.println(lineaActual);
             * lineaActual = br.readLine();
             * }
             */
            int entero = Integer.parseInt(br.readLine());
            double flotante = Double.parseDouble(br.readLine());
            String cadena = br.readLine();

            System.out.println("El entero leído es: " + entero);
            System.out.println("El número de punto flotante es: " + flotante);
            System.out.println("La cadena leída es \"" + cadena + "\"");

            System.out.println("¡Hola " + cadena + "! La suma de " + entero + " y " + flotante + " es "
                    + (entero + flotante) + ".");
            System.out.println("La división entera de " + flotante + " y " + entero + " es "
                    + ((int) (flotante / entero)) + " y su resto es " + (flotante % entero) + ".");

        } catch (FileNotFoundException e) {
            System.out.println("Error al leer el archivo " + rutaArchivo);
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Error al leer el archivo " + rutaArchivo);
            e.printStackTrace();
        }
        System.out.println("Archivo leido satisfactoriamente");
    }

}
