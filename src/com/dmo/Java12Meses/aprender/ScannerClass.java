package com.dmo.Java12Meses.aprender;

import java.util.Scanner;

public class ScannerClass {
   public static void main(String[] args){
      String nome;
      int idade;
      String saida;

      Scanner teclado = new Scanner(System.in);

      System.out.println("Informe seu nome: ");
      nome = teclado.nextLine();

       System.out.println("Informe sua idade: ");
       idade = teclado.nextInt();

       StringBuilder sb = new StringBuilder();
       sb.append(" - Seu nome é: "+nome);
       sb.append("\n - Sua idade é: "+idade);
      saida = sb.toString();

       System.out.println(sb);

   }

}
