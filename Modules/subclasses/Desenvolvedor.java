package Modules.subclasses;

import Modules.Funcionario;

public class Desenvolvedor extends Funcionario {
    // Construtor
    public Desenvolvedor(long cpf, String nome, String departamento, int salario) {
        super(cpf, nome, departamento, salario);// Chama o construtor da superclasse Funcionario
    }
    public void programar() {
        System.out.println("Desenvolvendo software");
    }
    @Override
     public void mostrarDados() {
        System.out.println("Os dados do Desenvolvedor são:");
        System.out.println("Nome: " + nome + "\nDepartamento: " + departamento + "\nSalario: " + salario  + "\nCPF: " + cpf);
        System.out.println("Atividade no Momento:");
        programar();
    }
}
