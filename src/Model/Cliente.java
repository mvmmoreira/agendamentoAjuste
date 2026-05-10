package Model;

public class Cliente {
    private int idCliente;
    private String nome;
    private String telefone;
    private String email;
    private String cpf;
    private Endereco endereco;

    public Cliente(){};


    public Cliente(
            int idCliente,
            String nome,
            String telefone,
            String email,
            String cpf,
            Endereco endereco
    ){
        this.idCliente = idCliente;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public int getidCliente(){
        return idCliente;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getTelefone(){
        return telefone;
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public String getCpf(){
        return cpf;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public Endereco getEndereco(){
        return endereco;
    }
    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }
}


