package aplicativos;

import java.io.IOException;
import java.util.Scanner;
public class AppPilotos {
    public static void main(String[] args) throws InterruptedException, IOException {
        final int MAX_ELEMENTOS = 2;
        int numb = 0;
        int opcao, qtdCadastrados = 0;
        Pessoa[] pilotos = new Pessoa[MAX_ELEMENTOS];
        Scanner in = new Scanner(System.in);

        do {
            System.out.println("\n****\nMENU\n****\n");
            System.out.println("1 - Cadastrar piloto");
            System.out.println("2 - Listar pilotos cadastrados");
            System.out.println("3 - Localizar piloto pelo CPF");
            System.out.println("4 - Aumentar espaço de armazenamento");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");

            opcao = in.nextInt();
            in.nextLine(); // Tira o ENTER que ficou na entrada na instrução anterior

            if (opcao == 1) {
                // Se não tem mais espaço no vetor, caio fora
                if (numb <= 0) {
                    if (qtdCadastrados == MAX_ELEMENTOS) {
                        System.out.println("\nNão há espaço para cadastrar novos pilotos.");
                        voltarMenu(in);
                        continue;
                    }
                } else if (qtdCadastrados == numb) {
                    System.out.println("\nNão há espaço para cadastrar novos pilotos.");
                    voltarMenu(in);
                    continue;
                }

                // Cadastre seu piloto aqui
                System.out.println("\nInformações de seu piloto: ");

                System.out.println("\nNome: ");
                String nome = in.nextLine();

                System.out.println("\nCPF: ");
                long cpf = in.nextLong();
                in.nextLine();

                System.out.println("\nBreve: ");
                Long breve = in.nextLong();
                in.nextLine();

                System.out.println("\nMatrícula: ");
                Long matricula = in.nextLong();
                in.nextLine();

                System.out.println("\nEsse piloto tem uma aeronave?\nSe sim, informe Modelo: ");
                String modelo = in.nextLine();

                System.out.println("\nCategoria da Aeronave: ");
                String categoria = in.nextLine();

                Pessoa pil = new Aeronave(nome, cpf, breve, matricula, modelo, categoria);

                pilotos[qtdCadastrados] = pil;

                qtdCadastrados++;

                System.out.println("\nPiloto cadastrado com sucesso.");
                voltarMenu(in);

            } else if (opcao == 2) {
                // Se não tem ninguém cadastrado no vetor, caio fora
                if (qtdCadastrados == 0) {
                    System.out.println("\nNão há motoristas cadastrados para exibir.");
                    voltarMenu(in);
                    continue;
                }

                // Exiba os pilotos aqui

                for (int i = 0; i < qtdCadastrados; i++) {
                    System.out.println("Os pilotos: " + pilotos[i].getNome());
                }

                voltarMenu(in);
            } else if (opcao == 3) {
                System.out.println("CPF, please:\n ");
                long cpf0 = in.nextLong();
                in.nextLine();

                for (int i = 0; i < qtdCadastrados; i++) {
                    if (cpf0 == pilotos[i].getCpf()) {

                        System.out.println("O piloto: \n\nNome: " + pilotos[i].getNome() + ". \nCPF: "
                                + pilotos[i].getCpf() + ".\nBREVE: " + ((Pilotos) pilotos[i]).getBreve()
                                + ".\nMatrícula: " + (((Pilotos) pilotos[i]).getMatricula()
                                        + ". \nOs dados da aeronave são: \nMODELO: "
                                        + ((Aeronave) pilotos[i]).getModelo()
                                        + " CATEGORIA: " + ((Aeronave) pilotos[i]).getCategoria()));
                        i = qtdCadastrados + 1;
                    }
                }
                voltarMenu(in);
            } else if (opcao == 4) {

                System.out.println("Quantos cadastro deseja fazer? ");
                numb = in.nextInt();
                in.nextLine();// pegar valor do usuário
                Pessoa[] novoVetor = new Pessoa[numb];
                int tamanhoVetorInicial = pilotos.length;
                System.out.println(" valor do novo vetor: " + novoVetor.length);
                for (int i = 0; i < tamanhoVetorInicial; i++) {
                    novoVetor[i] = pilotos[i];

                }

                pilotos = new Pessoa[numb];

                for (int i = 0; i < tamanhoVetorInicial; i++) {
                    pilotos[i] = novoVetor[i];

                }
                System.out.println(pilotos.length);

                voltarMenu(in);
                continue;

            } else if (opcao != 0) {
                System.out.println("\nOpção inválida!");
            }
        } while (opcao != 0);

        System.out.println("Fim do programa!");

        in.close();

    }

    private static void voltarMenu(Scanner in) throws InterruptedException, IOException {
        System.out.println("\nPressione ENTER para voltar ao menu.");
        in.nextLine();

        // Limpa toda a tela, deixando novamente apenas o menu
        if (System.getProperty("os.name").contains("Windows"))
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        else
            System.out.print("\033[H\033[2J");

        System.out.flush();
    }
}
