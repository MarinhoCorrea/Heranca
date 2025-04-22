package Modules.subclasses;

import Modules.Funcionario;

public class Estagiario extends Funcionario {

    public Estagiario(long cpf, String nome, String departamento, int salario) {
        super(cpf, nome, departamento, salario);// Chama o construtor da superclasse Funcionario
    }
    public void fazerTarefa() {
        System.out.println("Realizando tarefa de estagiário");
    }
    @Override
     public void mostrarDados() {
        System.out.println("Os dados do Estagiário são:");
        System.out.println("Nome: " + nome + "\nDepartamento: " + departamento + "\nSalario: " + salario  + "\nCPF: " + cpf);
        System.out.println("Atividade no Momento:");
        fazerTarefa();
    }
}
