package com.senai.exercicios_poo1.exercicios;

import javax.swing.*;
import java.io.IOException;

//Verifique qual o maior valor digitado
public class Exercicio3 implements Exercicio {

    private int maiorValor;
    private int valor1;
        private int valor2;

        @Override
        public void execute() {
            try {
                inputValores();
                maiorValor = setMaiorValor();
                showResultado();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Valor digitado inválido!\n" + e.getMessage());
n            }
}
.showI
private void inputValores() {
        valor1 = Integer.parseInt(JOptionPaneputDialog("Digite um número:"));
        valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número:"));
    }

    private int setMaiorValor() throws IOException {
        return Math.max(valor1, valor2);
    }

    @Override
    public void showResultado() {
        JOptionPane.showMessageDialog(null, "O maior número é: " + maiorValor);
    }
}
