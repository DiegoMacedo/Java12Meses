package com.dmo.Java12Meses.desafios;

import java.util.Scanner;

public class CalculaMedia {
    Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        CalculaMedia cm = new CalculaMedia();
        System.out.println(cm.somaNotas(0,0));
          }

    public double somaNotas(double nota1,double nota2){
        System.out.println("Informe a 1ª nota: ");
        nota1 = teclado.nextDouble();
        System.out.println("Informe a 2ª nota: ");
        nota2 = teclado.nextDouble();
        double media = (nota1 + nota2)/2;
        return media;
    }
}
