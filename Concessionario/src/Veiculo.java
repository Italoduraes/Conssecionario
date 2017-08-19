
public class Veiculo {
	//Atributos
	
	private double pre�o;
	private String ano;
	private String modelo;
	private String fabricante;
	private String  potencia;
	private double consumo;
	
	//Metodos construtor
	
	public Veiculo(double pre�o, String ano, String modelo, String fabricante, String potencia, double consumo) {
		this.pre�o = pre�o;
		this.ano = ano;
		this.modelo = modelo;
		this.fabricante = fabricante;
		this.potencia = potencia;
		this.consumo = consumo;
	}
	
	


	//Metodos toString
	
	@Override
	public String toString() {
		return "Veiculo" + "\n" + "pre�o: " + getPre�oComoString() + "\n" + "ano: " + ano + "\n" + "modelo: " + modelo + "\n" + "fabricante: " + fabricante
				+ "\n" + "potencia: " + potencia + "\n" + "consumo: " + consumo + "\n";
	}



	//metodos get e set
	
	public String getPre�oComoString(){
		return "R$ " + pre�o;
	}
	
	

	public double getPre�o() {
		return  pre�o;
	}


	public void setPre�o(double pre�o) {
		this.pre�o = pre�o;
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
