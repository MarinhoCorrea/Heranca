package Classes.subclasses;

import Classes.Funcionario;

public class Gerente extends Funcionario{
 
    public Gerente(String nome, String departamento, int salario) {
        super(nome, departamento, salario);
    }
    public void realizarReuniao() {
        System.out.println("Fazendo reunião");
    }
    @Override
     public void mostrarDados() {
        System.out.println("Os dados do Gerente são:");
        System.out.println("Nome: " + nome + "\nDepartamento: " + departamento + "\nSalario: " + salario);
    }
}   