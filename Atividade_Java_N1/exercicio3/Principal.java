import java.util.Locale;

public class Principal {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR"));
        Funcionario f1 = new Funcionario("Ana", "Analista", 3000);
        Funcionario f2 = new Funcionario("Bruno", "Assistente", 2000);
        Funcionario f3 = new Funcionario("Carla", "Desenvolvedora", 4000);
        Funcionario f4 = new Funcionario("Diego", "Tecnico", 2500);
        Funcionario f5 = new Funcionario("Elisa", "Supervisora", 5000);

        f1.aumentarSalario(10);
        f2.aumentarSalario(5);
        f3.aumentarSalario(15);
        f4.aumentarSalario(8);
        f5.aumentarSalario(12);

        f1.exibirDados();
        f2.exibirDados();
        f3.exibirDados();
        f4.exibirDados();
        f5.exibirDados();
    }
}
