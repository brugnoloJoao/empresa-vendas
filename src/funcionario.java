
import java.time.LocalDateTime;

public abstract class funcionario {
    private String nome;
    private String cpf;
    private LocalDateTime horaEntrada;
    private LocalDateTime horaSaida;

    public funcionario(String nome, String cpf, LocalDateTime horaEntrada, LocalDateTime horaSaida){
        this.nome = nome;
        this.cpf = cpf;
        this.horaEntrada = horaEntrada;
        this.horaSaida = horaSaida;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }    

    public LocalDateTime getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(LocalDateTime horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public LocalDateTime getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(LocalDateTime horaSaida) {
        this.horaSaida = horaSaida;
    }

    public abstract double calcSalario();
    
}
