import java.util.ArrayList;
    public class Cliente {
        private int codigoCli;
        private String nomeCli;
        private String enderecoCli;
        private String bairroCli;
        private String cidadeCli;
        private String ufCli;
        private String cepCli;
        private String telefoneCli;
        private String cpf;
        private String rg;
        private ArrayList<Venda> vendas;

        public Cliente(int codigoCli, String nomeCli, String enderecoCli, String bairroCli, String cidadeCli, String ufCli, String cepCli, String telefoneCli, String cpf, String rg){
            this.codigoCli = codigoCli;
            this.nomeCli = nomeCli;
            this.enderecoCli = enderecoCli;
            this.bairroCli = bairroCli;
            this.cidadeCli = cidadeCli;
            this.ufCli = ufCli;
            this.cepCli = cepCli;
            this.telefoneCli = telefoneCli;
            this.cpf = cpf;
            this.rg = rg;
            this.vendas = new ArrayList<>();
        }

        public int getCodigoCli() {
            return codigoCli;
        }

        public String getNomeCli() {
            return nomeCli;
        }

        public String getEndereco() {
            return enderecoCli;
        }

        public String getBairro() {
            return bairroCli;
        }

        public String getCidade() {
            return cidadeCli;
        }

        public String getUf() {
            return ufCli;
        }

        public String getCep() {
            return cepCli;
        }

        public String getTelefone() {
            return telefoneCli;
        }

        public String getCpf() {
            return cpf;
        }

        public String getRg() {
            return rg;
        }

        public void setNome(String nome) {
            this.nomeCli = nome;
        }

        public void setCidade(String cidade) {
            this.cidadeCli = cidade;
        }

        public void setBairro(String bairro) {
            this.bairroCli = bairro;
        }

        public void setCep(String cep) {
            this.cepCli = cep;
        }

        public void setEndereco(String endereco) {
            this.enderecoCli = endereco;
        }

        public void setTelefone(String telefone) {
            this.telefoneCli = telefone;
        }

        public void setUf(String uf) {
            this.ufCli = uf;
        } 

        public void adicionarVenda(Venda v){
            this.vendas.add(v);
        }

        public ArrayList<Venda> getVendas(){
            return this.vendas;
        }
    }
