package com.senai.exercicios_poo1.exercicios.calculadora;

public interface ICalculadora {

    float somar(float x, float y);

    float subtrair(float x, float y);

    float multiplicar(float x, float y);

    float dividir(float x, float y);

    String resultado();

    void apagarMemoria();
}
