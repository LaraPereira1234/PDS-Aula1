package model;

public enum ComboBox {
	Diesel("Oleo Diesel"),Comum("Gas. Comum"),Aditivada("Gas. Aditidava"),Etanol("Etanol");
	
	private String nome;
	private String preco;
    
	
	private ComboBox(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPreco() {
		return preco;
	}
	public void setPreco(String preco) {
		this.preco = preco;
	}
	
	
	

}
