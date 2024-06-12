class Departamento  {
    private String nmDpartamento;
    private String descricao;
    private int cdEmpresa;

    public void CriarDepartamento(String nmDpartamento,String descricao, int cdEmpresa){
        this.nmDpartamento = nmDpartamento;
        this.descricao = descricao;
        this.cdEmpresa = cdEmpresa;

    }

    public String getNmDpartamento() {
        return nmDpartamento;
    }

    public void setNmDpartamento(String nmDpartamento) {
        this.nmDpartamento = nmDpartamento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCdEmpresa() {
        return cdEmpresa;
    }

    public void setCdEmpresa(int cdEmpresa) {
        this.cdEmpresa = cdEmpresa;
    }
}

