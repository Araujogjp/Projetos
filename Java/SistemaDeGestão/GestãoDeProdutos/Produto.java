public class Produto {
    private int codProd;
    private String nomeProd;
    private Double valorProd;
    private int estoqueProd;
    private Fornecedor f;
    
    public Produto(int codProd, String nomeProd, double valorProd, int estoqueProd, Fornecedor f){
        this.codProd = codProd;
        this.nomeProd = nomeProd;
        this.valorProd = valorProd;
        this.estoqueProd = estoqueProd;
        this.f = f;
    }

    // Getters
    public int getCodProd() {
        return codProd;
    }

    public String getNomeProd() {
        return nomeProd;
    }

     public Double getValorProd() {
        return valorProd;
    }
     
    public int getEstoqueProd() {
        return estoqueProd;
    }

    public Fornecedor getF() {
        return f;
    }

    public void setNomeProd(String nomeProd) {
        this.nomeProd = nomeProd;
    }

    public void setValorProd(Double valorProd) {
        this.valorProd = valorProd;
    }

    public void setEstoqueProd(int estoqueProd) {
        this.estoqueProd = estoqueProd;
    }

    public void setF(Fornecedor f) {
        this.f = f;
    }
 
    
}
