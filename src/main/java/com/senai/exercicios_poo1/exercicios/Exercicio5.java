package com.senai.exercicios_poo1.exercicios;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

//Imprima os numero de 1 a 100 na tela
public class Exercicio5 implements Exercicio {
    public static void execute() {
        List<Integer> resultado = new ArrayList<>();

        for (int x = 1; x <= 100; x++) {
            resultado.add(x);
        }

        String string = resultado.toString();
        int metadeString = string.length() / 2;
        String stringResultado = string.substring(0, metadeString) + "\n" + string.substring(metadeString);

        JOptionPane.showMessageDialog(null, stringResultado);
    }
}
