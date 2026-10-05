public class ContaCorrente extends Conta {
    private double taxaManutencao;

    public ContaCorrente(String numero, String titular,
                         double saldo, double taxaManutencao) {
        super(numero, titular, saldo);
        this.taxaManutencao = taxaManutencao;
    }

    @Override
    public double calcularSaldo() {
        return getSaldo() - taxaManutencao;
    }
}
