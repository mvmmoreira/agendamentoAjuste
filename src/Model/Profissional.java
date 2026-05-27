package Model;

public class Profissional {
    private int idProfissional;
    private String nome;
    private String crefito;
    private String telefone;
    private String especialidade;

    public Profissional(){};

    public Profissional(
            int idProfissional,
            String nome,
            String crefito,
            String telefone,
            String especialidade
    ){
        this.idProfissional = idProfissional;
        this.nome = nome;
        this.crefito = crefito;
        this.telefone = telefone;
        this.especialidade = especialidade;

    }

    public int getIdProfessional(){
        return idProfissional;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCrefito(){
        return crefito;
    }
    public void setCrefito(String crefito){
        this.crefito = crefito;
    }

    public String getTelefone(){
        return telefone;
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

    public String getEspecialidade(){
        return especialidade;
    }
    public void setEspecialidade(String especialidade){
        this.nome = especialidade;
    }

}
