package com.senai.exercicios_poo1.exercicios;

import javax.swing.*;
import java.text.DecimalFormat;
import java.text.NumberFormat;

//Leia do teclado um valor 'x', e após calcule a raiz quadrada do número
public class Exercicio7 implements Exercicio {

    public static void execute() {
        double inputNumero = Double.parseDouble(JOptionPane.showInputDialog("Digite um numero: "));
        double raizQuadrada = Math.sqrt(inputNumero);

        NumberFormat numberFormat = new DecimalFormat("#0.00");
        String raizQuadradaFormatada = numberFormat.format(raizQuadrada);

        JOptionPane.showMessageDialog(null, "A raiz quadrada do número " + inputNumero + " é " + raizQuadradaFormatada);

    }
}
