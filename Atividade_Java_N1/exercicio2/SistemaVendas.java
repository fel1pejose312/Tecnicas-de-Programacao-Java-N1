import java.util.Locale;
import java.util.Scanner;

public class SistemaVendas {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR"));
        Scanner entrada = new Scanner(System.in);

        System.out.print("Quantidade de vendas: ");
        int quantidadeVendas = entrada.nextInt();
        double total = 0;
        double maiorVenda = 0;
        double menorVenda = 0;
        int acimaDe500 = 0;

        for (int i = 1; i <= quantidadeVendas; i++) {
            System.out.print("Valor da venda " + i + " (use virgula): ");
            double valorVenda = entrada.nextDouble();
            total += valorVenda;

            // A primeira venda e a referencia inicial de maior e menor.
            if (i == 1 || valorVenda > maiorVenda) {
                maiorVenda = valorVenda;
            }
            if (i == 1 || valorVenda < menorVenda) {
                menorVenda = valorVenda;
            }
            if (valorVenda > 500) {
                acimaDe500++;
            }
        }

        double media = 0;
        if (quantidadeVendas > 0) {
            media = total / quantidadeVendas;
        }

        double taxaComissao;
        if (total <= 1000) {
            taxaComissao = 0.03;
        } else if (total <= 5000) {
            taxaComissao = 0.05;
        } else {
            taxaComissao = 0.08;
        }
        double comissao = total * taxaComissao;

        System.out.println("\nRESUMO DO DIA");
        System.out.printf("Total vendido: R$ %.2f%n", total);
        if (quantidadeVendas > 0) {
            System.out.printf("Maior venda: R$ %.2f%n", maiorVenda);
            System.out.printf("Menor venda: R$ %.2f%n", menorVenda);
        } else {
            System.out.println("Maior e menor venda: nenhuma venda registrada.");
        }
        System.out.printf("Media das vendas: R$ %.2f%n", media);
        System.out.println("Vendas acima de R$ 500,00: " + acimaDe500);
        System.out.printf("Taxa da comissao: %.0f%%%n", taxaComissao * 100);
        System.out.printf("Comissao: R$ %.2f%n", comissao);
        entrada.close();
    }
}
