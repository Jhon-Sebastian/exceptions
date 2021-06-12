package org.sebas.pooexcepciones.ejemplo;

import javax.swing.*;

public class EjemploExcepciones {
    public static void main(String[] args) {

        Calculadora cal = new Calculadora();
        String numerador = JOptionPane.showInputDialog(null, "Ingrese el numerador: ");
        String denominador = JOptionPane.showInputDialog(null, "Ingrese el denominador: ");
        double division1 = 0;
        int calculoInterno = 0;

        try {
            //int div = Integer.parseInt(value);

            //calculoInterno = Integer.parseInt(value);
            //division1 = cal.dividir(10, calculoInterno);
            //System.out.println("Division1: " + division1);

            double division2 = cal.dividir(numerador,denominador);
            JOptionPane.showMessageDialog(null,"Division2: " + division2);


        } catch (ArithmeticException e) {
            System.out.println("Capturamos la excepción en tiempo de ejecución: " + e.getMessage());
            main(args);
        } catch (DivisionPorCeroException abc) {
            System.out.println("Error de DivisionPorCeroException(Chequet): " + abc.getMessage());
            main(args);
        } catch (FormatoNumeroException xb) {
            System.out.println("Error de formato invalido(1): " + xb.getMessage());
            //xb.printStackTrace(System.out);
        } finally {
            System.out.println("Se ejecuta siempre!");
        }

        System.out.println("Continuamos la ejecución");

    }
}
