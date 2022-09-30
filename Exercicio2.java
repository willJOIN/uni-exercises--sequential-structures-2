import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        int numero = 0;
        System.out.println("Digite um numero:\n");

        try {
            Scanner scanner1 = new Scanner(System.in);
            numero = scanner1.nextInt();
            scanner1.close();
        } catch (Exception ex) {
            System.out.println("Erro ao pegar numero no exercicio2():\n" + ex);
        }
        System.out.println("O numero informado foi:\n" + numero);
    }
}
