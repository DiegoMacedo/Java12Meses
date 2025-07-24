package com.dmo.Java12Meses.desafios;

import java.util.Scanner;

public class ConversorCF {
    public static void main(String[] args){
        double c;
        double f;
        int opcao;


        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o tipo de conersão: 1-> C para F ou 2-> F para C");
        opcao = teclado.nextInt();
        if (opcao == 1){
            System.out.println("Informe  o valor em Celcius: ");
            c = teclado.nextDouble();
           f = (c * 1.8)+32;
           System.out.println(f + " Fahrenheit");

        } else if (opcao == 2) {
            System.out.println("Informe o valor em Fahrenhit: ");
            f = teclado.nextDouble();
            c = (f-32)/1.8;
            System.out.println(c + " Celsius");
        }else {
            System.out.println("Operação inválida!!!");
        }
    }
}
