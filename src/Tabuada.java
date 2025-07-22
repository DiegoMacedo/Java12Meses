import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe o valor: ");
        int valor = teclado.nextInt();

        for (int i = 0; i <= 10; i++){
            System.out.println(valor + " x " + i + " = " + valor*i);
        }
    }
}
