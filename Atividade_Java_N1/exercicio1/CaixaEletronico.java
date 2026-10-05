import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] notas = {200, 100, 50, 20, 10, 5, 2};

        System.out.print("Valor inteiro do saque: ");
        int valorSaque = entrada.nextInt();
        int restante = valorSaque;

        // 1 e 3 nao podem ser formados com as notas disponiveis.
        if (valorSaque == 1 || valorSaque == 3) {
            System.out.println("Nao e possivel realizar esse saque com essas notas.");
        } else {
            System.out.println("Notas:");
            for (int nota : notas) {
                int quantidade = restante / nota;
                int sobra = restante % nota;

                // Evita deixar 1 ou 3 reais para as notas menores.
                if (quantidade > 0 && (sobra == 1 || sobra == 3)) {
                    quantidade--;
                }

                if (quantidade > 0) {
                    System.out.println(quantidade + " x R$ " + nota);
                    restante = restante - quantidade * nota;
                }
            }
        }
        entrada.close();
    }
}
