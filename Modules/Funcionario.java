package Modules;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Funcionario extends Pessoa{
    public String nome;
    public String departamento;
    public int salario;

    //Construtor
    public Funcionario(long cpf, String nome, String departamento, int salario) {
        super(cpf); // Chama o construtor da classe Pessoa
        this.nome = nome;
        this.departamento = departamento;
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
        System.out.println("Nome: " + nome + "\nDepartamento: " + departamento + "\nSalario: " + salario + "\nCPF: " + cpf);
    }
    public int baterPonto(){
        LocalDateTime dataHoraAtual = LocalDateTime.now();
        DateTimeFormatter Formatacao = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String dataHoraFormatada = dataHoraAtual.format(Formatacao);
        System.out.println("Ponto batido em: " + dataHoraFormatada);
        return 0;
    }

}
