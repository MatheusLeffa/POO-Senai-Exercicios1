package com.mycompany.exercicios_aula1.exercicios.calculadora;

public interface ICalculadora {

    float somar(float x, float y) throws RuntimeException;

    float subtrair(float x, float y) throws RuntimeException;

    float multiplicar(float x, float y) throws RuntimeException;

    float dividir(float x, float y) throws RuntimeException;

    String resultado() throws RuntimeException;

    void apagarMemoria() throws RuntimeException;
}
