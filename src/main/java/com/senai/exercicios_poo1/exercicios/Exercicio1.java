package com.senai.exercicios_poo1.exercicios;

import javax.swing.*;

//leia seu nome e idade e escreva na tela
public class Exercicio1 implements Exercicio {

    private static String nome;
    private static Integer idade;

    public static void execute() {
        try {
            inputNameAndIdade();
            showResultado();
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Valor digitado inválido!\n"+ e.getMessage());
        }
    }

    private static void inputNameAndIdade(){
        nome = JOptionPane.showInputDialog("Qual seu nome?");
        idade = Integer.parseInt(JOptionPane.showInputDialog("Qual sua idade?"));
    }

    private static void showResultado() {
        JOptionPane.showMessageDialog(null, "Nome = " + nome + "\nIdade = " + idade);
    }
}
