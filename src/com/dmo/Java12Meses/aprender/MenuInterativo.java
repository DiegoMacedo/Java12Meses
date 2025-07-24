package com.dmo.Java12Meses.aprender;

import java.util.Scanner;

public class MenuInterativo {
    public static void main(String[] args) {
        int diaDaSemana;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe um número de 1 a 7 para selecionar o dia da semana:");
          

        diaDaSemana = teclado.nextInt();

        switch (diaDaSemana){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Erro");
                break;
        }
    }
}
