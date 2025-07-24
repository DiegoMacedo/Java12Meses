package com.dmo.Java12Meses.aprender;

public class Dia2 {
    public static void main(String[] args) {

      /* String saudacao = "OLÁ";
       String nome = "Mundo";
       int ano = 2025;

       String mensagem = saudacao + ", "+ nome +"! Bem vindo a " + ano +".";
       System.out.println(mensagem);

       StringBuilder sb = new StringBuilder();
       sb.append("Linguagem de programação: \n");
       sb.append("- Java\n");
       sb.append("- Python\n");
       sb.append("- JavaScript\n");
       sb.append("- Kotlin\n");

       String resulto = sb.toString();
       System.out.println(resulto);*/

        double n1 = 10;
        double n2 = 2;

        double soma = n1 + n2;
        double subtracao = n1 - n2;
        double multiplicacao = n1 * n2;
        double divisao = n1 / n2;

        StringBuilder sb = new StringBuilder();
        sb.append("Soma: " + soma);
        sb.append("\nSubtração: " + subtracao);
        sb.append("\nMultiplicação: " + multiplicacao);
        sb.append("\nDivisão: " +divisao);

        String calcula = sb.toString();
        System.out.println(calcula);
    }
}