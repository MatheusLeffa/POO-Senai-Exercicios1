package com.senai.exercicios_poo1.exercicios.calculadora;

import javax.swing.*;

public class Calculadora implements ICalculadora {

    private float valor1 = 0;
    private float valor2 = 0;
    private String operador = "";


    public void setValor1(float valor1) {
        this.valor1 = valor1;
    }

    public void setValor2(float valor2) {
        this.valor2 = valor2;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }

    @Override
    public float somar(float x, float y) {
        return x + y;
    }

    @Override
    public float subtrair(float x, float y) {
        return x - y;
    }

    @Override
    public float multiplicar(float x, float y) {
        return x * y;
    }

    @Override
    public float dividir(float x, float y) throws RuntimeException {
        if (y == 0) {
            throw new RuntimeException("Não é possivel dividir por 0.");
        }
        return x / y;
    }

    @Override
    public String resultado() {
        try {
            float resultado = switch (this.operador) {
                case "+" -> somar(valor1, valor2);
                case "-" -> subtrair(valor1, valor2);
                case "*" -> multiplicar(valor1, valor2);
                case "/" -> dividir(valor1, valor2);
                default -> throw new RuntimeException("Não foi selecionado o operador matemático!");
            };
            return String.valueOf(resultado);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro:\n" + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            throw new RuntimeException(ex);
        }
    }

    @Override
    public void apagarMemoria() {
        try {
            valor1 = 0;
            valor2 = 0;
            operador = "";
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro:\n" + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            throw new RuntimeException(ex);
        }
    }
}
