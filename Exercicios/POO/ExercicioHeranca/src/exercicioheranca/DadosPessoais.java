package exercicioheranca;

public class DadosPessoais {
    public int idPessoa;
    public String nome, cpf;
    
    
    //metodos especiais
    public int getIdPessoa(){
        return idPessoa;
    }
    public void setIdPessoa(int idPessoa){
        this.idPessoa = idPessoa;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getCpf(){
        return cpf;
    }
    
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    
    //construtores
    public DadosPessoais(){
        this.setIdPessoa(0);
        this.setNome("");
        this.setCpf("");
    }
    
    public DadosPessoais(int idPessoa, String nome, String cpf){
        this.setIdPessoa(idPessoa);
        this.setNome(nome);
        this.setCpf(cpf);
    }
    
}
