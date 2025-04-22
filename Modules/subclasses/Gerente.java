package Modules.subclasses;

import Modules.Funcionario;

public class Gerente extends Funcionario{
 
    public Gerente(long cpf, String nome, String departamento, int salario) {
        super(cpf,nome, departamento, salario);// Chama o construtor da superclasse Funcionario
    }
    public void realizarReuniao() {
        System.out.println("Fazendo reunião");
    }
    @Override
     public void mostrarDados() {
        System.out.println("Os dados do Gerente são:");
        System.out.println("Nome: " + nome + "\nDepartamento: " + departamento + "\nSalario: " + salario + "\nCPF: " + cpf);
        System.out.println("Atividade no Momento:");
        realizarReuniao();
        
    }
}   