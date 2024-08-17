import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner carros = new Scanner(System.in);
        ArrayList<Carro> carrosDisponiveis = new ArrayList<>();
        ArrayList<Cliente> clientes = new ArrayList<>();

        carrosDisponiveis.add(new Carro(("Toyota", "Corolla", "ABC1234", 2023, 150)));
        carrosDisponiveis.add(new Carro(("Honda", "Civic", "DEF5678", 2022, 130)));

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
                    clientes.add(new PessoaFisica(nome, telefone, endereco, cpf));
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
                    clientes.add(new PessoaJuridica(nome, telefone, endereco, cnpj, nome_representante));
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