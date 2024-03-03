package com.mycompany.exercicios_aula1.exercicios;

import javax.swing.*;

import java.text.DecimalFormat;
import java.text.NumberFormat;

import static java.lang.Math.sqrt;

public class Exercicio7 implements Exercicio{

    public static void execute(){
        double inputNumero = Double.parseDouble(JOptionPane.showInputDialog("Digite um numero: "));
        double raizQuadrada = Math.sqrt(inputNumero);

        NumberFormat numberFormat = new DecimalFormat("#0.00");
        String raizQuadradaFormatada = numberFormat.format(raizQuadrada);

        JOptionPane.showMessageDialog(null, "A raiz quadrada do número " + inputNumero + " é " + raizQuadradaFormatada);

    }
}
