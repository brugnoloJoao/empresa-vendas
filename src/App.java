
import java.time.LocalDateTime;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        vendedor v1 = new vendedor("Niclas", "123.456.789-00", 5000.0, 10, LocalDateTime.of(2026, 10, 14,12,12), LocalDateTime.of(2026, 10, 14, 18,12));

        System.out.println("Vendedor: " + v1.getNome());
        System.out.println("CPF: " + v1.getCpf());
        System.out.println("Número de vendas: " + v1.getNumVendas());
        System.out.println("Salário Total: R$ " + v1.calcSalario());

        consultor c1 = new consultor("Lucas", "987.654.321-11", 120.00, 40, LocalDateTime.of(2026, 10, 14, 6,10), LocalDateTime.of(2026, 10, 14, 14,12));

        System.out.println("Nome: " + c1.getNome());
        System.out.println("CPF: " + c1.getCpf());
        System.out.println("Salário do Consultor: R$ " + c1.calcSalario()); 

        gerente g1 = new gerente("Enzo", "123.231.156-00", 1500.00, LocalDateTime.of(2026, 10, 14,7,12), LocalDateTime.of(2026, 10, 14, 18,12));

        System.out.println("Gerente: " + g1.getNome());
        System.out.println("CPF: " + g1.getCpf());
        System.out.println("Salário Total: R$ " + g1.calcSalario());

        ArrayList<funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(v1);
        funcionarios.add(c1);
        funcionarios.add(g1);

        for (funcionario funcionario : funcionarios) {
            System.out.println("Nome: " + funcionario.getNome());
            System.out.println("Funcão: " + funcionario.getClass().getName());
            System.out.println("Salário: " + funcionario.calcSalario());
        }
    }
}
