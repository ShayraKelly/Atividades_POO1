import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Cliente> clientes = new ArrayList<>();

        while (true) {
            System.out.println("1. Cadastrar Cliente");
            System.out.println("2. Listar Carros Disponíveis");
            System.out.println("3. Sair");
            System.out.print("Opção: ");

            int opcao = scanner.nextInt();

            switch (opcao){
                case 1:
                System.out.println("1. Pessoa Física\n2. Pessoa Jurídica");
                int tipoCliente = scanner.nextInt();
                if (tipoCliente == 1) {
                    System.out.print("Nome: ");
                    String nome = scanner.next();
                    System.out.print("Telefone: ");
                    String telefone = scanner.next();
                    System.out.print("Endereco: ");
                    String endereco = scanner.next();
                    System.out.println("CPF: ");
                    String cpf = scanner.next();
                    Cliente novoCliente = new Pessoa_Fisica(nome, telefone, endereco, cpf);
                    clientes.add(novoCliente);
                    System.out.println("Cadastro realizado com sucesso!");
                } else if (tipoCliente == 2) {
                    System.out.print("Nome: ");
                    String nome = scanner.next();
                    System.out.print("Telefone: ");
                    String telefone = scanner.next();
                    System.out.print("Endereco: ");
                    String endereco = scanner.next();
                    System.out.println("CNPJ: ");
                    String cnpj = scanner.next();
                    System.out.println("Nome do representante: ");
                    String nome_representante = scanner.next();
                    Cliente novoCliente = new Pessoa_Juridica(nome, telefone, endereco, cnpj, nome_representante);
                    clientes.add(novoCliente);
                    System.out.println("Cadastro realizado com sucesso!");
                }
                    break;
                case 2:
                    for (Carro carro : carrosDisponiveis) {
                        System.out.println(carro);
                    }
                    break;
                    
                case 3:
                    System.out.println("Saindo...");
                    System.exit(0);
                default:
                    System.out.println("Opção inválida!");
                }    
        }
    }
}
