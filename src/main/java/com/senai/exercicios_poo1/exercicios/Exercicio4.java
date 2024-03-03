package com.senai.exercicios_poo1.exercicios;

import javax.swing.*;
import java.text.DecimalFormat;
import java.text.NumberFormat;

//Leia 3 notas fornecidas de um aluno, e calcule a média da nota do aluno
public class Exercicio4 implements Exercicio {

    public static void execute() {
        try {
            String alunoNome = JOptionPane.showInputDialog("Qual o nome do aluno?");
            double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 1:"));
            double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 2:"));
            double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 3:"));
            double media = (nota1 + nota2 + nota3) / 3;
            NumberFormat numberFormat = new DecimalFormat("#0.00");
            String mediaFormated = numberFormat.format(media);

            JOptionPane.showMessageDialog(null, "Nota do " + alunoNome + " = " + mediaFormated);

            if (media >= 7.0) {
                JOptionPane.showMessageDialog(null, alunoNome + " está APROVADO!");
            } else if (media < 5.0) {
                JOptionPane.showMessageDialog(null, alunoNome + " está REPROVADO!");
            } else {
                JOptionPane.showMessageDialog(null, alunoNome + " está de RECUPERAÇÃO!");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Valor digitado inválido!\n" + e.getMessage());

        }
    }
}
