package tech.leticiaslima.apps;

import tech.leticiaslima.pessoas.Cliente;
import tech.leticiaslima.pessoas.Funcionario;

public class Application {
    public static void main(String[] args) {
        // Criar e preencher objeto Cliente
        Cliente cliente = new Cliente();
        cliente.setNome("João Silva");
        cliente.setDataNascimento("15/05/1985");
        cliente.setEndereco("Rua A, 123");
        cliente.setTelsCotato("(11) 99999-9999");
        cliente.setCodigo("CLI001");
        cliente.setProfissao("Engenheiro");

        // Criar e preencher objeto Funcionario
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Maria Oliveira");
        funcionario.setDataNascimento("20/03/1990");
        funcionario.setEndereco("Rua B, 456");
        funcionario.setTelsCotato("(11) 88888-8888");
        funcionario.setMatricula(12345);
        funcionario.setCargo("Analista");
        funcionario.setSalario("5000.00");
        funcionario.setDataAdmissao("01/01/2020");

        // Imprimir dados no console
        System.out.println("Dados do Cliente:");
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Data de Nascimento: " + cliente.getDataNascimento());
        System.out.println("Endereço: " + cliente.getEndereco());
        System.out.println("Telefone: " + cliente.getTelsCotato());
        System.out.println("Código: " + cliente.getCodigo());
        System.out.println("Profissão: " + cliente.getProfissao());

        System.out.println("\nDados do Funcionário:");
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Data de Nascimento: " + funcionario.getDataNascimento());
        System.out.println("Endereço: " + funcionario.getEndereco());
        System.out.println("Telefone: " + funcionario.getTelsCotato());
        System.out.println("Matrícula: " + funcionario.getMatricula());
        System.out.println("Cargo: " + funcionario.getCargo());
        System.out.println("Salário: " + funcionario.getSalario());
        System.out.println("Data de Admissão: " + funcionario.getDataAdmissao());
    }
}

