package com.dmo.Java12Meses.aprender;

import java.util.Scanner;

public class Validacao {
    public static void main(String[] args) {
        String user = "c";
        String password = "3020";
        int opcao;

        Scanner teclado = new Scanner(System.in);

        System.out.println("------------------------------------------------");
        System.out.println("|             1 - Login                         |");
        System.out.println("|             2 - Mostrar Usuário               |");
        System.out.println("|             3 - Mostrar Senha                 |");
        System.out.println("|             0 - Sair                          |");
        System.out.println("|                                               |");
        System.out.println("------------------------------------------------");
        System.out.println("Digite a opçao desejada:");
        opcao = teclado.nextInt();
        teclado.nextLine();

        switch (opcao){
            case 1:
                String userKeyboard;
                String passKeyboard;
                System.out.print("Usuário: ");
                userKeyboard = teclado.nextLine();

                System.out.print("Senha: ");
                passKeyboard = teclado.nextLine();


                if(userKeyboard.equals(user) && passKeyboard.equals(password)){
                    System.out.println("Acesso permitido!!!");
                } else if (userKeyboard.equals(user) && !passKeyboard.equals(password)) {
                    System.out.println("Acesso negado, Senha incorreta");

                } else if (!userKeyboard.equals(user) && passKeyboard.equals(password)) {
                    System.out.println("Acesso negado, Usuário incorreto");

                }else {
                    System.out.println("Acesso negado, Usuário e Senha incorretos");
                }
                break;
            case 2:
                System.out.println("Seu usuário é: " + user);
                break;
            case 3:
                System.out.println("Sua senha é: " + password);
                break;
            case 0:
                System.out.println("Saindo do programa, Até mais!");
                break;
            default:
                System.out.println("Opção inválida. Por favor, escolha uma opção entre 0 e 3.");
                break;
        }

    teclado.close();
    }
}
