import java.time.LocalDateTime;

public class vendedor extends funcionario{
    private double comissao;
    private int numVendas;

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public int getNumVendas() {
        return numVendas;
    }

    public void setNumVendas(int numVendas) {
        this.numVendas = numVendas;
    }

    public vendedor(String nome, String cpf, double comissao, int numVendas, LocalDateTime horaEntrada, LocalDateTime horaSaida){
        super(nome, cpf, horaEntrada, horaSaida);
        this.comissao = comissao;
        this.numVendas = numVendas;
    }

    @Override
    public double calcSalario(){
        double salMinimo =  1621.00;
        double salario = salMinimo + (this.comissao*this.numVendas);
        return salario;
    }
}
