package com.senai.exercicios_poo1.exercicios;

import javax.swing.*;

//Verifique qual o maior valor digitado
public class Exercicio3 implements Exercicio {

    public static void execute() {
        try {
            int maiorValor;
            int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
            int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número:"));
            maiorValor = Math.max(valor1, valor2);
            JOptionPane.showMessageDialog(null,"O maior número é: "+ maiorValor);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Valor digitado inválido!\n"+ e.getMessage());

        }
    }
}
