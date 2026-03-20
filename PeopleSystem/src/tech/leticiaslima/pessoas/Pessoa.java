package tech.leticiaslima.pessoas;
//atributos

public class Pessoa {
    protected String nome;
    protected String dataNascimento;
    protected String endereco;
    protected String telsCotato;


    //metodos
    public void cadastrar(){};
    public int obteridade() {
        return 0;

    };
//get and set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelsCotato() {
        return telsCotato;
    }

    public void setTelsCotato(String telsCotato) {
        this.telsCotato = telsCotato;
    }
}
