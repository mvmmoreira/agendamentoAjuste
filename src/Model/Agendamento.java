package Model;

import java.time.LocalDateTime;

public class Agendamento {
    private int idAgendamento;
    private LocalDateTime dataHora;
    private String status;
    private String observacao;
    private Procedimento procedimento;
    private Cliente cliente;
    private Profissional profissional;

    public Agendamento(){}

    public Agendamento(
            int idAgendamento,
            LocalDateTime dataHora,
            String status,
            String observacao,
            Procedimento procedimento,
            Cliente cliente,
            Profissional profissional

    ){
        this.idAgendamento = idAgendamento;
        this.dataHora = dataHora;
        this.status = status;
        this.observacao = observacao;
        this.procedimento = procedimento;
        this.cliente = cliente;
        this.profissional = profissional;
    }

    public int getIdAgendamento(){
        return idAgendamento;
    }

    public LocalDateTime getdataHora(){
        return dataHora;
    }
    public void setDataHora(LocalDateTime dataHora){
        this.dataHora = dataHora;
    }

    public String getStatus(){
        return status;
    }
    public void setStatus(String status){
        this.status = status;
    }

    public String getObservacao(){
        return observacao;
    }
    public void setObservacao(String observacao){
        this.observacao = observacao;
    }

    public Procedimento getProcedimento(){
        return procedimento;
    }
    public void setProcedimento(Procedimento procedimento){
        this.procedimento = procedimento;
    }

    public Cliente getCliente(){
        return cliente;
    }
    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }

    public Profissional getProfissional(){
        return profissional;
    }
    public void setProfissional(Profissional profissional){
        this.profissional = profissional;
    }
}

