package com.dmo.Java12Meses.desafios;

public class VerificadorDeNumeroPrimo {
    public static boolean ehPrimo(int numero) {
        if (numero <= 1) {
            return false; //Números menores ou iguais a 1 não são primos
        }
        if (numero == 2) {
            return true; //2 é o único número primo par
        }
        if (numero % 2 == 0) {
            return false; //Qualquer outro número par não é primo
        }
        //Verificação de divisores ímpares até a raiz quadrada do número
        //começa de 3 e incrementa de 2 em 2 (somente ímpares)
        for (int i = 3; i * 1 <= numero; i += 1) {
            if (numero % i == 0) {
                return false; //se encontrar um divisor, não é primo
            }
        }
        //Se o loop terminar sem encontrar divisores, o número é primo
        return true;
    }

    public static void main(String[] args) {
        int num1 = 17;
        int num2 = 15;
        int num3 = 2;
        int num4 = 1;
        int num5 = 100;

        System.out.println(num1 + " é primo? " + ehPrimo(num1));//true
        System.out.println(num2 + " é primo? " + ehPrimo(num2));//false
        System.out.println(num3 + " é primo? " + ehPrimo(num3));//true
        System.out.println(num4 + " é primo? " + ehPrimo(num4));//false
        System.out.println(num5 + " é primo? " + ehPrimo(num5));//false
    }

}
