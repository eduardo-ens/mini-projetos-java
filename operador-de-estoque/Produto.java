public class Produto {
    private int codigo;
    private String descricao;
    private double preço;
    public static int qtdeEstoque = 0;

    public Produto() {
        codigo = 0;
        descricao = "";
        preço = 0.00;
    }

    public int getCodigo() {
        return codigo;
    }
    
    public String getDescricao() {
        return descricao;
    }

    public double getPreço() {
        return preço;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }

    public void registrarEntrada(int quantidade) {
        if(quantidade <= 0) {
            System.out.println("Quantidade inadequada");
        } else {
            this.qtdeEstoque += quantidade;
        }
    }

    public void registrarSaida(int quantidade) {
        if(quantidade <= 0) {
            System.out.println("Quantidade inadequada");
        } else if(quantidade > this.qtdeEstoque) {
            System.out.println("Quantidade insuficiente");
        } else {
            this.qtdeEstoque -= quantidade;
        }
    }

    @Override
	public String toString() {
		return "Produto [ Codigo: " + codigo + ", Descricao: " + descricao + ", Preço: R$ " + preço + ", QtdeEstoque: " + qtdeEstoque + " ]";
	}
}
