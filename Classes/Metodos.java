package Classes;
import java.util.Scanner;

import Classes.subclasses.*;

import java.util.ArrayList;

public class Metodos {
    // Função Menu
    public static int menu(Scanner teclado) {
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Cadastrar Funcionário");
        System.out.println("2 - Exibir Dados Cadastrados");
        System.out.println("3 - Escolha do tipo de funcionário (Gerente, Desenvolvedor ou Estagiário) para exibir os dados");
        System.out.println("4 - Sair do sistema");
        return teclado.nextInt();
    }
    // função para Cadastrar os Funcionarios
    public static void CadastrarFuncionario(
        //passando os parâmetros necessários para o método
        Scanner teclado,
        ArrayList<Gerente> listaGerentes,
        ArrayList<Desenvolvedor> listaDesenvolvedores,
        ArrayList<Estagiario> listaEstagiarios
        ) {
        System.out.println("Selecionado: Cadastrar Funcionário");
        System.out.println("Digite o cargo do funcionário (Gerente, Desenvolvedor ou Estagiário): ");
        String cargo = teclado.next();
        System.out.println("Digite o nome do funcionário: ");
        String nome = teclado.next(); 
        System.out.println("Digite o departamento do funcionário: ");
        String departamento = teclado.next();
        System.out.println("Digite o salário do funcionário: ");
        int salario = teclado.nextInt();
        // Verifica o cargo e cria o funcionário correspondente
        if (cargo.equalsIgnoreCase("Gerente")) {
            Gerente gerente = new Gerente(nome, departamento, salario);
            listaGerentes.add(gerente);
            System.out.println("Funcionário Gerente cadastrado com sucesso!");
        } else if (cargo.equalsIgnoreCase("Desenvolvedor")) {
            Desenvolvedor desenvolvedor = new Desenvolvedor(nome, departamento, salario);
            listaDesenvolvedores.add(desenvolvedor);
            System.out.println("Funcionário Desenvolvedor cadastrado com sucesso!");
        } else if (cargo.equalsIgnoreCase("Estagiário")) {
            Estagiario estagiario = new Estagiario(nome, departamento, salario);
            listaEstagiarios.add(estagiario);
            System.out.println("Funcionário Estagiário cadastrado com sucesso!");
        } else {
            System.out.println("Cargo inválido! Tente novamente.");
        }
    }
    // Função para Exibir dados gerais 
    public static void ExibirDadosGerais(
        //passando os parâmetros necessários para o método
        Scanner teclado,
        ArrayList<Gerente> listaGerentes,
        ArrayList<Desenvolvedor> listaDesenvolvedores,
        ArrayList<Estagiario> listaEstagiarios
    ) {
        System.out.println("Selecionado: Exibir Dados Cadastrados");
        System.out.println("Funcionários Gerentes cadastrados:");
        for (Gerente gerente : listaGerentes) {
            gerente.mostrarDados();
        }
        System.out.println("Funcionários Desenvolvedores cadastrados:");
        for (Desenvolvedor desenvolvedor : listaDesenvolvedores) {
            desenvolvedor.mostrarDados();
        }
        System.out.println("Funcionários Estagiários cadastrados:");
        for (Estagiario estagiario : listaEstagiarios) {
            estagiario.mostrarDados();
        }
    }
    // Função para Exibir dados das pessoas de determinado cargo
        public static void ExibirDadosEspecificos(
            //passando os parâmetros necessários para o método
            Scanner teclado,
            ArrayList<Gerente> listaGerentes,
            ArrayList<Desenvolvedor> listaDesenvolvedores,
            ArrayList<Estagiario> listaEstagiarios
        ) {
            System.out.println("Selecionado: Escolha do tipo de funcionário (Gerente, Desenvolvedor ou Estagiário) para exibir os dados \n");
            System.out.println("Digite o cargo que deseja ver os dados cadastrados (Gerente, Desenvolvedor ou Estagiário): ");
            String cargoEscolhido = teclado.next();
            if (cargoEscolhido.equalsIgnoreCase("Gerente")) {
                System.out.println("Funcionários Gerentes cadastrados:");
                for (Gerente gerente : listaGerentes) {
                    gerente.mostrarDados();
                }
            } else if (cargoEscolhido.equalsIgnoreCase("Desenvolvedor")) {
                System.out.println("Funcionários Desenvolvedores cadastrados:");
                for (Desenvolvedor desenvolvedor : listaDesenvolvedores) {
                    desenvolvedor.mostrarDados();
                }
            } else if (cargoEscolhido.equalsIgnoreCase("Estagiário")) {
                System.out.println("Funcionários Estagiários cadastrados:");
                for (Estagiario estagiario : listaEstagiarios) {
                    estagiario.mostrarDados();
                }
            } else {
                System.out.println("Cargo inválido! Tente novamente.");
            }
        }
}

