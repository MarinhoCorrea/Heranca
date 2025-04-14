import java.time.LocalDateTime;
public class Funcionario{
    public String nome;
    public String departamento;
    public int salario;

    //Construtor
    public Funcionario(String nome, String departamento, int salario) {
        this.nome = nome;
        this.departamento = departamento;
        this.salario = salario;
    }
    //Setters
    public void SetNome(String nome) {
        this.nome = nome;
    }
    public void SetDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public void SetSalario(int salario) {
        this.salario = salario;
    }
    //Getters
    public String getNome() {
        return nome;
    }
    public String getDepartamento() {
        return departamento;
    }
    public int getSalario() {
        return salario;
    }
    
    //Métodos de Manipulação dos Dados
    public void mostrarDados() {
        System.out.println("Nome: " + nome + "\nDepartamento: " + departamento + "\nSalario: " + salario);
    }
    public int baterPonto(){
        LocalDateTime dataHoraAtual = LocalDateTime.now();
        System.out.println("Ponto batido em: " + dataHoraAtual);
        return 0;
    }

}
