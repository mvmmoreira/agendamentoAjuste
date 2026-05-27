package Model;

public class Procedimento {
    private int idProcedimento;
    private String nome;
    private String tipo;
    private Double valor;
    private int duracao;


    public Procedimento(){};

    public Procedimento(
            int idProcedimento,
            String nome,
            String tipo,
            Double valor,
            int duracao
    ){
        this.idProcedimento = idProcedimento;
        this.nome = nome;
        this.tipo = tipo;
        this.valor = valor;
        this.duracao = duracao;
    }

    private int getIdProcedimento(){
        return idProcedimento;
    }


    private String getNome(){
        return nome;
    }
    private void setNome(String nome){
        this.nome = nome;
    }

    private String gettipo(){
        return nome;
    }
    private void setTipo(String tipo){
        this.tipo = tipo;
    }

    private Double getvalor(){
        return valor;
    }
    private void setValor(Double valor){
        this.valor = valor;
    }

    private int getDuracao(){
        return duracao;
    }
    private void setDuracao(int duracao){
        this.duracao = duracao;
    }
}


