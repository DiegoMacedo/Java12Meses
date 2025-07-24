package com.dmo.Java12Meses.desafios;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

// O nome da classe foi alterado para refletir a nova estrutura.
public class CalculadoraRefatorada {

    // O Scanner agora é criado e gerenciado dentro do metodo que o utiliza
    // Isso evita que ele precise ser um campo da classe.

    public static void main(String[] args) {
        // Apenas criamos um objeto e iniciamos a execução.
        // O metodo main fica o mais simples possível.
        CalculadoraRefatorada calculadora = new CalculadoraRefatorada();
        calculadora.iniciar();
    }

    /**
     * Metodo principal que controla o fluxo da calculadora.
     */
    public void iniciar() {
        // Usamos try-with-resources para garantir que o Scanner seja fechado automaticamente,
        // mesmo que ocorra um erro. Isso torna o metodo fecharTeclado() desnecessário.
        // E configuramos o Locale para aceitar vírgula como decimal.
        try (Scanner teclado = new Scanner(System.in).useLocale(new Locale("pt", "BR"))) {

            while (true) { // Loop para manter o programa rodando
                exibirMenu();
                int escolha = lerOpcaoDoMenu(teclado);

                if (escolha == 0) {
                    System.out.println("Finalizando o programa. Obrigado!");
                    break; // Sai do loop while
                }

                // Se a opção for inválida, o metodo lerOpcaoDoMenu já avisou, então continuamos o loop.
                if (escolha < 1 || escolha > 4) {
                    continue;
                }

                // --- Lógica de leitura dos números foi movida para cá ---
                System.out.print("Informe o 1º valor: ");
                double numero1 = lerNumero(teclado);

                System.out.print("Informe o 2º valor: ");
                double numero2 = lerNumero(teclado);
                // --- Fim da lógica de leitura ---

                executarOperacao(escolha, numero1, numero2);

                System.out.println("\nPressione Enter para continuar...");
                teclado.nextLine(); // Aguarda o usuário pressionar Enter
            }
        }
    }

    /**
     * Exibe as opções do menu.
     */
    private void exibirMenu() {
        System.out.println("\n--- CALCULADORA ---");
        System.out.println("Qual operação deseja efetuar?");
        System.out.println("  1 - ADIÇÃO");
        System.out.println("  2 - SUBTRAÇÃO");
        System.out.println("  3 - MULTIPLICAÇÃO");
        System.out.println("  4 - DIVISÃO");
        System.out.println("  0 - SAIR");
        System.out.print("Sua escolha: ");
    }

    /**
     * Lê a opção do menu de forma segura, tratando entradas inválidas.
     *
     * @param teclado A instância do Scanner a ser usada.
     * @return O número da opção escolhida.
     */
    private int lerOpcaoDoMenu(Scanner teclado) {
        try {
            int opcao = teclado.nextInt();
            teclado.nextLine(); // Consome a quebra de linha deixada pelo nextInt()
            return opcao;
        } catch (InputMismatchException e) {
            System.out.println("ERRO: Opção inválida! Por favor, digite apenas um dos números do menu.");
            teclado.nextLine(); // Limpa a entrada inválida (ex: "abc") do buffer
            return -1; // Retorna um valor inválido para que o loop possa tratar
        }
    }

    /**
     * Lê um número double de forma segura.
     *
     * @param teclado A instância do Scanner a ser usada.
     * @return O número double lido.
     */
    private double lerNumero(Scanner teclado) {
        while (true) { // Loop até que um número válido seja inserido
            try {
                return teclado.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("ERRO: Entrada inválida. Digite um número (use vírgula para decimais).");
                System.out.print("Tente novamente: ");
                teclado.next(); // Limpa a entrada inválida do buffer
            }
        }
    }

    /**
     * Executa a operação matemática com base na escolha e nos números fornecidos.
     *
     * @param escolha A operação a ser executada.
     * @param numero1 O primeiro número.
     * @param numero2 O segundo número.
     */
    private void executarOperacao(int escolha, double numero1, double numero2) {
        double resultado;
        switch (escolha) {
            case 1:
                resultado = somar(numero1, numero2);
                System.out.printf("O resultado da sua ADIÇÃO é: %.2f\n", resultado);
                break;
            case 2:
                resultado = subtrair(numero1, numero2);
                System.out.printf("O resultado da sua SUBTRAÇÃO é: %.2f\n", resultado);
                break;
            case 3:
                resultado = multiplicar(numero1, numero2);
                System.out.printf("O resultado da sua MULTIPLICAÇÃO é: %.2f\n", resultado);
                break;
            case 4:
                try {
                    resultado = dividir(numero1, numero2);
                    System.out.printf("O resultado da sua DIVISÃO é: %.2f\n", resultado);
                } catch (ArithmeticException e) {
                    System.out.println("ERRO: " + e.getMessage());
                }
                break;
            default:
                // O tratamento de opção inválida já é feito no loop principal
                break;
        }
    }

    // --- MÉTODOS DE CÁLCULO PUROS ---
    // Note como eles agora apenas calculam, sem interagir com o usuário.

    public double somar(double numero1, double numero2) {
        return numero1 + numero2;
    }

    public double subtrair(double numero1, double numero2) {
        return numero1 - numero2;
    }

    public double multiplicar(double numero1, double numero2) {
        return numero1 * numero2;
    }

    public double dividir(double numero1, double numero2) {
        if (numero2 == 0) {
            throw new ArithmeticException("Não é possível dividir por zero.");
        }
        return numero1 / numero2;
    }
}
