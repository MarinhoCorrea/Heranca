package Modules;
import java.util.Scanner;

import Modules.subclasses.*;
import java.util.ArrayList;

public class Metodos {
    
    // Função Menu
    public static int menu(Scanner teclado) {
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Cadastrar Funcionário");
        System.out.println("2 - Exibir Dados Cadastrados");
        System.out.println("3 - Escolha do tipo de funcionário (Gerente, Desenvolvedor ou Estagiário) para exibir os dados");
        System.out.println("4 - Bater Ponto");
        System.out.println("5 - Sair do sistema");
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
        // Menu para cadastrar funcionário
        System.out.println("Selecionado: Cadastrar Funcionário");
        System.out.println("Digite o cargo do funcionário (Gerente, Desenvolvedor ou Estagiario): ");
        String cargo = teclado.next();
        System.out.println("Digite o nome do funcionário: ");
        String nome = teclado.next(); 
        System.out.println("Digite o departamento do funcionário: ");
        String departamento = teclado.next();
        System.out.println("Digite o salário do funcionário: ");
        int salario = teclado.nextInt();
        System.out.println("Digite o CPF do funcionário: ");
        long cpf = teclado.nextLong();
        // Verifica o cargo e cria o funcionário correspondente
        if (cargo.equalsIgnoreCase("Gerente")) {
            Gerente gerente = new Gerente(cpf, nome, departamento, salario);
            listaGerentes.add(gerente);
            System.out.println("Funcionário Gerente cadastrado com sucesso!");
        } else if (cargo.equalsIgnoreCase("Desenvolvedor")) {
            Desenvolvedor desenvolvedor = new Desenvolvedor(cpf, nome, departamento, salario);
            listaDesenvolvedores.add(desenvolvedor);
            System.out.println("Funcionário Desenvolvedor cadastrado com sucesso!");
        } else if (cargo.equalsIgnoreCase("Estagiario")) {
            Estagiario estagiario = new Estagiario(cpf, nome, departamento, salario);
            listaEstagiarios.add(estagiario);
            System.out.println("Funcionário Estagiário cadastrado com sucesso!");
        } else {
            System.out.println("Cargo inválido! Tente novamente.");
        }
    }
    // Função para Exibir dados gerais 
    // Ao chamar essa função, ela irá exibir os dados de todos os funcionários cadastrados
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
            System.out.println("Selecionado: Escolha do tipo de funcionário (Gerente, Desenvolvedor ou Estagiario) para exibir os dados \n");
            System.out.println("Digite o cargo que deseja ver os dados cadastrados (Gerente, Desenvolvedor ou Estagiario): ");
            String cargoEscolhido = teclado.next();
            // Verifica o cargo e exibe os dados correspondentes
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
            } else if (cargoEscolhido.equalsIgnoreCase("Estagiario")) {
                System.out.println("Funcionários Estagiários cadastrados:");
                for (Estagiario estagiario : listaEstagiarios) {
                    estagiario.mostrarDados();
                }
            } else {
                System.out.println("Cargo inválido! Tente novamente.");
            }
        }
        // Função para Bater Ponto , onde o usuário escolhe o cargo do funcionário que deseja bater ponto
        public static void BaterPonto(
            //passando os parâmetros necessários para o método
            Scanner teclado,
            ArrayList<Gerente> listaGerentes,
            ArrayList<Desenvolvedor> listaDesenvolvedores,
            ArrayList<Estagiario> listaEstagiarios
        ) {
            System.out.println("Selecionado: Bater Ponto");
            System.out.println("Digite o cargo do funcionário que deseja bater ponto (Gerente, Desenvolvedor ou Estagiário): ");
            String cargo = teclado.next();
            // Verifica o cargo e chama o método de bater ponto correspondente
            if (cargo.equalsIgnoreCase("Gerente")) {
                System.out.println("Digite o nome do Gerente que deseja bater ponto: ");
                String nomeGerente = teclado.next();
                for (Gerente gerente : listaGerentes) {
                    if (gerente.getNome().equalsIgnoreCase(nomeGerente)) {
                        System.out.println("Gerente " + nomeGerente + " está batendo ponto.");
                        gerente.baterPonto();
                    } else {
                        System.out.println("Gerente não encontrado!");
                    }
                }
            } else if (cargo.equalsIgnoreCase("Desenvolvedor")) {
                System.out.println("Digite o nome do Desenvolvedor que deseja bater ponto: ");
                String nomeDesenvolvedor = teclado.next();
                for (Desenvolvedor desenvolvedor : listaDesenvolvedores) {
                    if (desenvolvedor.getNome().equalsIgnoreCase(nomeDesenvolvedor)) {
                        System.out.println("Desenvolvedor " + nomeDesenvolvedor + " está batendo ponto.");
                        desenvolvedor.baterPonto();
                    } else {
                        System.out.println("Desenvolvedor não encontrado!");
                    }
                }
            } else if (cargo.equalsIgnoreCase("Estagiario")) {
                System.out.println("Digite o nome do Estagiario que deseja bater ponto: ");
                String nomeEstagiario = teclado.next();
                for (Estagiario estagiario : listaEstagiarios) {
                    if (estagiario.getNome().equalsIgnoreCase(nomeEstagiario)) {
                        System.out.println("Estagiário " + nomeEstagiario + " está batendo ponto.");
                        estagiario.baterPonto();
                    } else {
                        System.out.println("Estagiário não encontrado!");
                    }
                }
            } else {
                System.out.println("Cargo inválido! Tente novamente.");
            }
        }
}

