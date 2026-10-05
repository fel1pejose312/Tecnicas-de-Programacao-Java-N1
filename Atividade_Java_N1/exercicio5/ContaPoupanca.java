public class ContaPoupanca extends Conta {
    private double percentualRendimento;

    public ContaPoupanca(String numero, String titular,
                        double saldo, double percentualRendimento) {
        super(numero, titular, saldo);
        this.percentualRendimento = percentualRendimento;
    }

    @Override
    public double calcularSaldo() {
        // 2 significa 2%. Retorna o saldo MAIS o rendimento.
        return getSaldo() + getSaldo() * percentualRendimento / 100;
    }
}
