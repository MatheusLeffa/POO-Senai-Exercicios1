package com.mycompany.exercicios_aula1.exercicios;

import javax.swing.*;

//Leia e calcule a área de um quadrado e escreva na tela
public class Exercicio2 implements Exercicio {

    private static int areaQuadrado;

    public static void execute() {
        try {
            calcularQuadrado();
            showResultado();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Valor digitado inválido!\n" + e.getMessage());
        }
    }

    private static void calcularQuadrado() {
        Integer ladoX = Integer.parseInt(JOptionPane.showInputDialog(null, "Valor do lado X?"));
        Integer ladoY = Integer.parseInt(JOptionPane.showInputDialog(null, "Valor de lado Y?"));
        areaQuadrado = ladoX * ladoY;
    }

    private static void showResultado() {
        JOptionPane.showMessageDialog(null, "A area do quadrado é: " + areaQuadrado);

    }
}
