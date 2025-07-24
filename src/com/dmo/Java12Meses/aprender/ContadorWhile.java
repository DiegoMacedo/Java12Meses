package com.dmo.Java12Meses.aprender;

public class ContadorWhile {
    public static void main(String[] args) {

        int[] numeros = {10, 5, 8, 12, 3};
        int soma = 0;

        System.out.println("Calculando a soma dos elementos do array: ");
        for (int i = 0; i < numeros.length; i++){
            soma += numeros[i];
        }
        System.out.println("A soma dos elementos é: " + soma);
        System.out.println("Oi");
    }
}
