import java.time.LocalDateTime;

public class gerente extends funcionario{
    private double bonificacao;
    
    public double getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(double bonificacao) {
        this.bonificacao = bonificacao;
    }

    public gerente(String nome, String cpf, double bonificacao, LocalDateTime horaEntrada, LocalDateTime horaSaida){
        super(nome, cpf, horaEntrada, horaSaida);
        this.bonificacao = bonificacao;
    }

    @Override
    public double calcSalario() {
        double salMinimo = 1621.00;
        double salario = (6 * salMinimo )+ this.bonificacao;
        return salario;
    }
}
