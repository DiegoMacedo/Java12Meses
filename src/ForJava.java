import java.util.Scanner;

public class ForJava {
    public static void main(String[] args) {
        int valor;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe um valor a ser contado: ");
        valor = teclado.nextInt();

        for (int i = 0; i <= valor; i++){
            System.out.println("Contagem: " + i);
        }
    }
}
