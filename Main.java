import java.util.ArrayList;
import java.util.Scanner;
import Modules.*;
import Modules.subclasses.*;


public class Main {
    public static void main(String[] args) {
        // Criação de variáveis
        Scanner teclado = new Scanner(System.in);
        int op = 0;
         // Criação de ArrayLists
         ArrayList<Estagiario> listaEstagiarios = new ArrayList<>();
         ArrayList<Desenvolvedor> listaDesenvolvedores = new ArrayList<>();
         ArrayList<Gerente> listaGerentes = new ArrayList<>();

        
        // Laço de repetição para o menu interativo
        do {
            op = Metodos.menu(teclado);
            switch (op) {
                case 1:
                    Metodos.CadastrarFuncionario(teclado, listaGerentes, listaDesenvolvedores, listaEstagiarios);

                    break;
                case 2:
                    Metodos.ExibirDadosGerais(teclado, listaGerentes, listaDesenvolvedores, listaEstagiarios);
                    break;
                case 3:
                    Metodos.ExibirDadosEspecificos(teclado, listaGerentes, listaDesenvolvedores, listaEstagiarios);
                    break;
                case 4:
                    Metodos.BaterPonto(teclado, listaGerentes, listaDesenvolvedores, listaEstagiarios);
                    break;
                case 5:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
            
        } while (op != 5);
        teclado.close();
    }
}