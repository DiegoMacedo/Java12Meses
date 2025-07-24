package com.dmo.Java12Meses.desafios;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Calculadora {
    Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.menu();
        calculadora.fecharTeclado();

    }

    public void menu() {
        int escolha = 0;
        System.out.println("Infome qual operação irá efetuar: ");
        System.out.println("        1 - ADIÇÃO                ");
        System.out.println("        2 - SUBTRAÇÃO             ");
        System.out.println("        3 - MULTIPLICAÇÃO         ");
        System.out.println("        4 - DIVISÃO               ");
        escolha = teclado.nextInt();

        switch (escolha) {
            case 1:
                System.out.println("O resultado da sua ADIÇÃO é: " + somar(0, 0));
                break;
            case 2:
                System.out.println("O resultado da sua SUBTRAÇÃO é: " + subtrair(0, 0));
                break;
            case 3:
                System.out.println("o resultado da sua MULTIPLICAÇÃO é: " + multiplicar(0, 0));
                break;
            case 4:
                System.out.println("O resultado da sua DIVISÃO é: " + dividir(0, 0));
                break;
            default:
                System.out.println("Finalizando o programa");
                break;
        }
    }

    public double somar(double numero1, double numero2) {
        System.out.println("Informe o 1º valor: ");
        numero1 = teclado.nextDouble();
        System.out.println("Informe o 2º valor: ");
        numero2 = teclado.nextDouble();
        double resultado = numero1 + numero2;
        return resultado;
    }

    public double subtrair(double numero1, double numero2) {
        System.out.println("Informe o 1º valor: ");
        numero1 = teclado.nextDouble();
        System.out.println("Informe o 2º valor: ");
        numero2 = teclado.nextDouble();
        double resultado = numero1 - numero2;
        return resultado;
    }

    public double multiplicar(double numero1, double numero2) {
        System.out.println("Informe o 1º valor: ");
        numero1 = teclado.nextDouble();
        System.out.println("Informe o 2º valor: ");
        numero2 = teclado.nextDouble();
        double resultado = numero1 * numero2;
        return resultado;
    }

    public double dividir(double numero1, double numero2) {
        System.out.println("Informe o 1º valor: ");
        numero1 = teclado.nextDouble();
        System.out.println("Informe o 2º valor: ");
        numero2 = teclado.nextDouble();
        double resultado = numero1 / numero2;
        return resultado;
    }
    public void fecharTeclado(){
        teclado.close();
    }

}
