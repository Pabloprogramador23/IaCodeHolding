class Empresa {
    private String nmEmpresa;
    private int code;
    private String endEmpresa;
    private String tipoRamos;

    //contrutor de empresa tá prestando, mas precisa criar variaveis no pricipal.
         //  public  void criarEmpresa(String nmEmpresa, String code, String endEmpresa, String tipoRamos){
          //  this.nmEmpresa = nmEmpresa;
          //  this.code = code;
           // this.endEmpresa = endEmpresa;
          //  this.tipoRamos = tipoRamos;


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getNmEmpresa() {
        return nmEmpresa;
    }

    public void setNmEmpresa(String nmEmpresa) {
        this.nmEmpresa = nmEmpresa;
    }

    public String getEndEmpresa() {
        return endEmpresa;
    }

    public void setEndEmpresa(String endEmpresa) {
        this.endEmpresa = endEmpresa;
    }

    public String getTipoRamos() {
        return tipoRamos;
    }

    public void setTipoRamos(String tipoRamos) {
        this.tipoRamos = tipoRamos;
    }
}


