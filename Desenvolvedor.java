public class Desenvolvedor extends Funcionario {
    // Construtor
    public Desenvolvedor(String nome, String departamento, int salario) {
        super(nome, departamento, salario);
    }
    public void programar() {
        System.out.println("Desenvolvendo software");
    }
    @Override
     public void mostrarDados() {
        System.out.println("Os dados do Desenvolvedor são:");
        System.out.println("Nome: " + nome + "\nDepartamento: " + departamento + "\nSalario: " + salario);
    }
}
