import java.util.Locale;

public class Principal {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR"));
        ContaCorrente corrente1 = new ContaCorrente("001", "Ana", 1000, 20);
        ContaCorrente corrente2 = new ContaCorrente("002", "Bruno", 2000, 30);
        ContaPoupanca poupanca1 = new ContaPoupanca("003", "Carla", 1000, 2);
        ContaPoupanca poupanca2 = new ContaPoupanca("004", "Diego", 3000, 1);

        corrente1.depositar(500);
        corrente1.sacar(200);
        corrente2.depositar(200);
        corrente2.sacar(100);
        poupanca1.depositar(300);
        poupanca1.sacar(100);
        poupanca2.depositar(500);
        poupanca2.sacar(500);

        System.out.println("CONTAS CORRENTES");
        exibirConta(corrente1);
        exibirConta(corrente2);
        System.out.println("CONTAS POUPANCA");
        exibirConta(poupanca1);
        exibirConta(poupanca2);
    }

    public static void exibirConta(Conta conta) {
        System.out.println("Conta: " + conta.getNumero());
        System.out.println("Titular: " + conta.getTitular());
        System.out.printf("Saldo apos depositos e saques: R$ %.2f%n", conta.getSaldo());
        System.out.printf("Saldo calculado: R$ %.2f%n", conta.calcularSaldo());
        System.out.println();
    }
}
