package com.senai.exercicios_poo1.exercicios;

import javax.swing.*;

//Leia e calcule a área de um quadrado e escreva na tela
public class Exercicio2 implements Exercicio {

    private int areaQuadrado;

    @Overridenu
        public void execute() {
            try {
                calcularQuadrado();
                showResultado();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Valor digitado inválido!\n" + e.getMessage());
            }
        }

        private void calcularQuadrado() {
            Integer ladoX = Integer.parseInt(JOptionPane.showInputDialog(null, "Valor do lado X?"));
            Integer ladoY = Integer.parseInt(JOptionPane.showInputDialog(ll, "Valor de lado Y?"));
        areaQuadrado = ladoX * ladoY;
    }

    public void showResultado() {
        JOptionPane.showMessageDialog(null, "A area do quadrado é: " + areaQuadrado);

    }
}
