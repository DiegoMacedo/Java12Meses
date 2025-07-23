package desafios;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class JogoDaAdivinhacao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numeroParaAdininhar = (int) (Math.random() * 101);
        int numeroDigitado;
        int tentativasRestantes = 6;
        boolean acertou = false;

        System.out.println("------------------------------------");
        System.out.println("  BEM-VINDO AO JOGO DA ADIVINHAÇÃO! ");
        System.out.println("------------------------------------");
        System.out.println("Estou pensando em um número entre 0 e 100.");
        System.out.println("Você tem " + tentativasRestantes + " tentativas para adivinhar!");

        while (tentativasRestantes > 0 && !acertou){
            System.out.println("\nDigite seu palpite (tentativas restantes: " + tentativasRestantes + "): ");
            numeroDigitado = teclado.nextInt();

            tentativasRestantes--;

            if (numeroDigitado == numeroParaAdininhar){
                System.out.println("\nParabéns! você acertou o número "+ numeroParaAdininhar);
                acertou = true;
            } else if (numeroDigitado < numeroParaAdininhar) {
                System.out.println("Seu número (" + numeroDigitado + ") é MENOR que o esperado. Tente Novamente!");
            }else {
                System.out.println("Seu número ("+ numeroDigitado + ") é MAIOR que o esperado. Tente Noavamente!");
            }
        }
        if(!acertou){
            System.out.println("\n--- FIM DE JOGO ---");
            System.out.println("Suas tentativas acabaram! O número correto era: " + numeroParaAdininhar);
        }

        teclado.close();
        System.out.println("Obrigado por jogar!");


    }

}
