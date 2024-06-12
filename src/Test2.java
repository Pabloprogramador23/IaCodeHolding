import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Test2 {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int continuar;

    List<Funcionario> funcionarios = new ArrayList<>();
    List<Empresa> emp = new ArrayList<>();
    List<Departamento> departa = new ArrayList<>();
    


    do {


        System.out.println("Bom dia usuário escolha qual opção que deseja:\n");
        System.out.print("Digite 1 para Criar novo Funcionário\n");
        System.out.print("digite 2 para criar nova Empresa\n");
        System.out.print("Digite 3 para criar novo departamento\n");
        System.out.println("Digite 4 para consultar Funcionário");
        int iswitch = s.nextInt();
        


        switch (iswitch) {

            case 1:
                System.out.println("Digite a opção desejada:");
                System.out.println("Digite 1 para cadastrar Funcionário:");
                System.out.println("digite 2 para alterar Salário:");
                int funSwitch = s.nextInt();
                s.nextLine();

                    switch (funSwitch) {

                        case 1 :
                        funcionarios.add(criarFuncionario(s));
                          break;
                        case 2:
                        alterarSalario(funcionarios, s);
                            break;
                        default:
                            System.out.println("opção não encontrada.");
                            break;
                    }

                //funcionarios.add(criarFuncionario(s));
                break;
            case 2:
                emp.add(criarEmpresa(s));
                
                break;
            case 3:
                departa.add(criarDepartamento(s));
            break;

            case 4:
                imprimirFuncionario(funcionarios, s);
                break;
                

            default:
                System.out.println("Opção inválida ");
                break;
            }

        System.out.println("você deseja continuar seu cadastro de Funcionários?(1 p/sim e 2 p/ não)");
                continuar = s.nextInt();
                   

        }  while(continuar == 1);

         System.out.println("finish");
        
              
         s.close();
    }

       




   public static Funcionario criarFuncionario(Scanner s){

        System.out.println("Agora digite o código do Funcionário:\n");
        int codFunc = s.nextInt();
        s.nextLine();

        
        System.out.println("Digite o nome do Funcionário:");
        String nomeFunc = s.nextLine();

        System.out.print("Digite o nome do Departamento:");
        String departFunc = s.nextLine();

      

        System.out.println("Agora digite o salário:");
            double salarioFunc = s.nextDouble();
            s.nextLine();

        System.out.println("Digite a data de Nascimento:(dd/MM/yyyy)");
        String dataNascimento = s.nextLine();
        
        
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate nscData = LocalDate.parse(dataNascimento, dtf); 
     
    
        Funcionario f1 = new Funcionario();
        

        f1.setNmFuncionario(nomeFunc);
        f1.setCdFuncionario(codFunc);
        f1.setSalario(salarioFunc);
        f1.setDepart(departFunc);
        f1.setDtNascimento(nscData);

        return f1;
    
    
    } 
    

    //metodo pra aumentar o salario do Cidadão
    public static void alterarSalario(List<Funcionario> funcionarios, Scanner s)  {
        System.out.println("Digite o index do funcionário:");
        int index = s.nextInt();
        s.nextLine();
        System.out.println("agora digite o aumento desejado");
        int aumento = s.nextInt();
        double salario = funcionarios.get(0).getSalario();
        salario += aumento;
        funcionarios.get(index).setSalario(salario);
        
    }
 

    public static Departamento criarDepartamento(Scanner s){
        System.out.print("digite o código do Departamento:");
        int  codeDeparta = s.nextInt();
        s.nextLine();

        System.out.println("Digite o nome do Departamento:");
        String nomeDeparta = s.nextLine();

        System.out.println("Digite a descrição do Departamento:");
        String  descriptDeparta = s.nextLine();

        Departamento depart = new Departamento();

        depart.setCdEmpresa(codeDeparta);
        depart.setNmDpartamento(nomeDeparta);
        depart.setDescricao(descriptDeparta);

        return depart;

    }
    
    
    public static Empresa criarEmpresa(Scanner s){
    System.out.println("Você escolheu a opção de criar Empresa:");
    System.out.println("Digite o código da Empresa:");
    int codeEmp = s.nextInt();
    s.nextLine();

    System.out.print("Digite o nome da Empresa:");
        String nmEmpresa = s.nextLine();
        
    System.out.println("Digite o endereço da Empresa");
        String endEmpresa = s.nextLine();

    System.out.println("Digite o ramo da Empresa:");
        String tipoRamos = s.nextLine();

        


    Empresa emp = new Empresa();
        emp.setCode(codeEmp);
        emp.setNmEmpresa(nmEmpresa);
        emp.setEndEmpresa(endEmpresa);
        emp.setTipoRamos(tipoRamos);
        return emp;

    }

    public static void imprimirFuncionario(List<Funcionario> funcionarios, Scanner s){
        System.out.println("digite o index do funcionário que deseja consultar");
        int index =  s.nextInt();
        s.nextLine();
        System.out.println("o funcionario de nome "+ funcionarios.get(index).getNmFuncionario() +
        "com nascimento "+ funcionarios.get(index).getDtNascimento() + 
        " com sódigo " + funcionarios.get(index).getCdFuncionario() +
        " e salário " + funcionarios.get(index).getSalario());
    }
     
     
    

      
    
    
}
