package tech.leticiaslima.pessoas;

public class Funcionario extends Pessoa {

    //atributos
    private int matricula;
    private String cargo;
    private String salario;
    private String dataAdmissao;

    //metodos
     public void reajustarSalario(double percentual){
         this.salario = this.salario + this.salario * percentual / 100;
     }
     public void promover(String novoCargo){
         this.cargo = novoCargo;
     }


    //get and set

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }
}
