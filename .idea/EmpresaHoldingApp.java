import java.util.Scanner;

public class EmpresaHoldingApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        EmpresaHolding empresaHolding = new EmpresaHolding();

        int opcao;
        do {
            System.out.println("\nMenu de Opções:");
            System.out.println("1. Cadastrar Empresa");
            System.out.println("2. Cadastrar Departamento");
            System.out.println("3. Cadastrar Funcionário");
            System.out.println("4. Alterar Salário do Funcionário");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    empresaHolding.cadastrarEmpresa();
                    break;
                case 2:
                    empresaHolding.cadastrarDepartamento();
                    break;
                case 3:
                    empresaHolding.cadastrarFuncionario();
                    break;
                case 4:
                    empresaHolding.alterarSalarioFuncionario();
                    break;
                case 5:
                    System.out.println("Encerrando o programa. Obrigado!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 5);
    }
}

class EmpresaHolding {
    private final Empresa empresa; // Adicione um atributo para a empresa

    public EmpresaHolding() {
        this.empresa = new Empresa();
    }

    public void cadastrarEmpresa() {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o nome da empresa: ");
        String nome = input.nextLine();
        System.out.print("Digite o CNPJ da empresa: ");
        String cnpj = input.nextLine();

        empresa.setNome(nome);
        empresa.setCnpj(cnpj);

        System.out.println("Empresa cadastrada com sucesso!");
    }

    public void cadastrarDepartamento() {
        // Lógica para cadastrar um departamento.
        System.out.println("Departamento cadastrado com sucesso!");
    }

    public void cadastrarFuncionario() {
        // Lógica para cadastrar um funcionário.
        System.out.println("Funcionário cadastrado com sucesso!");
    }

    public void alterarSalarioFuncionario() {
        // Lógica para alterar o salário de um funcionário.
        System.out.println("Salário do funcionário alterado com sucesso!");
    }
}



    // Construtor, getters e setters
    // Implemente conforme suas necessidades
}
