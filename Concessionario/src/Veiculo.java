
public class Veiculo {
	//Atributos
	
	private double preço;
	private String ano;
	private String modelo;
	private String fabricante;
	private String  potencia;
	private double consumo;
	
	//Metodos construtor
	
	public Veiculo(double preço, String ano, String modelo, String fabricante, String potencia, double consumo) {
		this.preço = preço;
		this.ano = ano;
		this.modelo = modelo;
		this.fabricante = fabricante;
		this.potencia = potencia;
		this.consumo = consumo;
	}
	
	


	//Metodos toString
	
	@Override
	public String toString() {
		return "Veiculo" + "\n" + "preço: " + getPreçoComoString() + "\n" + "ano: " + ano + "\n" + "modelo: " + modelo + "\n" + "fabricante: " + fabricante
				+ "\n" + "potencia: " + potencia + "\n" + "consumo: " + consumo + "\n";
	}



	//metodos get e set
	
	public String getPreçoComoString(){
		return "R$ " + preço;
	}
	
	

	public double getPreço() {
		return  preço;
	}


	public void setPreço(double preço) {
		this.preço = preço;
	}


	public String getAno() {
		return ano;
	}


	public void setAno(String ano) {
		this.ano = ano;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public String getFabricante() {
		return fabricante;
	}


	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}


	public String getPotencia() {
		return potencia;
	}


	public void setPotencia(String potencia) {
		this.potencia = potencia;
	}


	public double getConsumo() {
		return consumo;
	}


	public void setConsumo(double consumo) {
		this.consumo = consumo;
	}


	
	
	
	
	
	
	
	
	
	
	
	

}
