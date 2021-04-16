public class Genero {
    private int codigo;
    private String descricao;
    
    public Genero() {
        codigo = 0;
        descricao = "Aaa";
    }

    public Genero(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
  
    @Override
	public String toString() {
		return "Genero [ Codigo: " + codigo + ", Descricao: " + descricao + " ]";
	}
}
 