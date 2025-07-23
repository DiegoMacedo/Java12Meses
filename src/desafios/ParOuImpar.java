package desafios;

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] arg){
        int numero;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe um número: ");
        numero = teclado.nextInt();

        if (numero % 2 == 0){
            System.out.println("Esse número é PAR!!!");
        }else{
            System.out.println("Esse número é IMPAR!!!");
        }
    }
}
