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


    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getTipo(){
        return tipo;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public Double getValor(){
        return valor;
    }
    public void setValor(Double valor){
        this.valor = valor;
    }

    public int getDuracao(){
        return duracao;
    }
    public void setDuracao(int duracao){
        this.duracao = duracao;
    }
}


