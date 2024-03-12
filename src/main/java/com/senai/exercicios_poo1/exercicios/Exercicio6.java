package com.senai.exercicios_poo1.exercicios;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

// De 1 a 100 quais são pares e ímpares
public class Exercicio6 implements Exercicio {

    @Override
    public void execute() {
        List<Integer> impares = new ArrayList<>();
        List<Integer> pares = new ArrayList<>();

        for (int x = 1; x <= 100; x++) {
            if (x % 2 == 0) {
                pares.add(x);
            } else {
                impares.add(x);
            }
        }
        JOptionPane.showMessageDialog(null, "Impares: " + impares + "\nPares: " + pares);
    }

    @Override
    public void showResultado() {

    }
}