import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Funcionario {
    private int cdFuncionario;
    private String nmFuncionario;
    private LocalDate dtNascimento;
    private double salario;
    private String depart;
    private String cargo;


    public void criarFuncionario(int cdFuncionario, String nmFuncionario,
    LocalDate dtNascimento,double salario){
        this.cdFuncionario = cdFuncionario;
        this.nmFuncionario = nmFuncionario;
        this.salario = salario;
        this.dtNascimento = dtNascimento;

    }

     
    public int getCdFuncionario() {
        return cdFuncionario;
    }

    public void setCdFuncionario(int cdFuncionario) {
        this.cdFuncionario = cdFuncionario;
    }

    public String getNmFuncionario() {
        return nmFuncionario;
    }

    public void setNmFuncionario(String nmFuncionario) {
        this.nmFuncionario = nmFuncionario;
    }

    public String getDtNascimento() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return dtNascimento.format(dtf);
    }
    
   
    public void setDtNascimento(LocalDate dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDepart() {
        return depart;
    }

    public void setDepart(String depart) {
        this.depart = depart;
    }



    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    


}





