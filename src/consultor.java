import java.time.LocalDateTime;

public class consultor extends funcionario{
    private double valorHora;
    private int horasTrabalhadas;

    public consultor(String nome, String cpf, double valorHora, int horasTrabalhadas, LocalDateTime horaEntrada, LocalDateTime horaSaida){
        super(nome, cpf, horaEntrada, horaSaida);
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public double calcSalario() {
        double salario = valorHora * horasTrabalhadas;
        return salario;
    }
    
}
