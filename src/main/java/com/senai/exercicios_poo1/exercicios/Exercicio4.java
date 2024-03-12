package com.senai.exercicios_poo1.exercicios;

import javax.swing.*;

//Leia 3 notas fornecidas de um aluno, e calcule a média da nota do aluno
public class Exercicio4 implements Exercicio {

    private float media;
    private float nota1;
    private float nota2;
    private float nota3;


    @Override
    public void execute() {
        try {
            inputNotas();
            media = (nota1 + nota2 + nota3) / 3;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Valor digitado inválido!\n" + e.getMessage());
        }
    }

    private void inputNotas() {
        nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 1:"));
        nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 2:"));
        nota3 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 3:"));
    }

    @Override
    public void showResultado() {
        JOptionPane.showMessageDialog(null, "Média do aluno = " + media);

        if (media >= 7.0) {
            JOptionPane.showMessageDialog(null, "Aluno APROVADO!");
        } else if (media < 5.0) {
            JOptionPane.showMessageDialog(null, "Aluno REPROVADO!");
        } else {
            JOptionPane.showMessageDialog(null, "Aluno RECUPERAÇÃO!");
        }
    }
}
