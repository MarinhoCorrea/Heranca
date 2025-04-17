package Classes.subclasses;

import Classes.Funcionario;

public class Estagiario extends Funcionario {

    public Estagiario(String nome, String departamento, int salario) {
        super(nome, departamento, salario);
    }
    public void fazerTarefa() {
        System.out.println("Realizando tarefa de estagiário");
    }
    @Override
     public void mostrarDados() {
        System.out.println("Os dados do Estagiário são:");
        System.out.println("Nome: " + nome + "\nDepartamento: " + departamento + "\nSalario: " + salario);
    }
}
