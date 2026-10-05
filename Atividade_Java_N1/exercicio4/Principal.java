import java.util.Locale;

public class Principal {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR"));
        Funcionario[] funcionarios = {
            new Funcionario("Ana", 2500),
            new Gerente("Bruno", 5000),
            new Vendedor("Carla", 2000, 12000)
        };

        for (Funcionario funcionario : funcionarios) {
            System.out.printf("%s - salario final: R$ %.2f%n",
                    funcionario.getNome(), funcionario.calcularSalario());
        }
    }
}
