
public class Comprador {
	// Atributos
	
	
	private String nome;
	private String CPF;
	private int idade;
	
	
	
	//Metodo construtor 
	
	public Comprador(String nome, String CPF, int idade){
		this.nome = nome;
		this.CPF = CPF;
		this.idade = idade;
	}
	
	//Sobreescrevendo o metodo toString
	
	public String toString(){
		return "Nome: " + this.nome + "\n" + "CPF: " + this.CPF + "\n" + "Idade: " + this.idade + "\n";
	}

	
	
	//Metodos get e set
	public String getNome(){
		return nome;
	}
	
	public String getCPF(){
		return CPF;
	}
	
	public int getIdade(){
		return idade;
	}
	
	
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public void setCPF(String CPF){
		this.CPF = CPF;
	}
	
	public void setIdade(int idade){
		this.idade = idade;
	}
	
	
	
	
	
	
	

}
