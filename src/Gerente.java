import java.util.Scanner;

public class Gerente extends Cargo{

    private int numeroFuncionarios;
    private String projectSupervisionado;


    public void CriarGerencia(@org.jetbrains.annotations.NotNull Scanner scanner) {
        System.out.println("qual o codigo do cargo?\n");
        this.setNmCargo(scanner.nextLine());

        System.out.println("Qual o codigo do cargo?\n");
        this.setCodCargo(scanner.nextInt());

        System.out.println("o Cargo cadastrado é de gerente? (sim:1)(não:2)\n");
        int resposta = scanner.nextInt();

        do {  System.out.println("Quantos funcionarios esse Gerente tem como subordinados:\n");
            this.setNumeroFuncionarios(scanner.nextInt());

            System.out.println("Qual  ome do projeto supervisionado:\n");
            this.setProjectSupervisionado(scanner.nextLine());

        } while (resposta == 1);


            }


    public int getNumeroFuncionarios() {
        return numeroFuncionarios;
    }

    public void setNumeroFuncionarios(int numeroFuncionarios) {
        this.numeroFuncionarios = numeroFuncionarios;
    }

    public String getProjectSupervisionado() {
        return projectSupervisionado;
    }

    public void setProjectSupervisionado(String projectSupervisionado) {
        this.projectSupervisionado = projectSupervisionado;
    }
}
