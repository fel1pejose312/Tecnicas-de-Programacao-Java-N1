public class Funcionario {
    private String nome;
    private String cargo;
    private double salario;

    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public void aumentarSalario(double percentual) {
        salario = salario + salario * percentual / 100;
    }

    public double calcularSalarioAnual() {
        return salario * 12;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.printf("Salario mensal: R$ %.2f%n", salario);
        System.out.printf("Salario anual: R$ %.2f%n", calcularSalarioAnual());
        System.out.println();
    }
}
