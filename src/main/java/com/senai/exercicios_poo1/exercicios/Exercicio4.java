package com.senai.exercicios_poo1.exercicios;

import javax.swing.*;
import java.text.DecimalFormat;
import java.text.NumberFormat;

//Leia 3 notas fornecidas de um aluno, e calcule a média da nota do aluno
public class Exercicio4 implements Exercicio {

    public static void execute() {
        try {
            float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 1:"));
            float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 2:"));
            float nota3 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 3:"));
            float media = (nota1 + nota2 + nota3) / 3;

            JOptionPane.showMessageDialog(null, "Média do aluno = " + media);

            if (media >= 7.0) {
                JOptionPane.showMessageDialog(null, "Aluno APROVADO!");
            } else if (media < 5.0) {
                JOptionPane.showMessageDialog(null, "Aluno REPROVADO!");
            } else {
                JOptionPane.showMessageDialog(null, "Aluno RECUPERAÇÃO!");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Valor digitado inválido!\n" + e.getMessage());

        }
    }
}
