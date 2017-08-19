
import java.util.Calendar;

public class Venda {
	// Atributos 
	
	private Comprador comprador;
	private Vendendor vendendor;
	private Veiculo veiculo;
	private double preco;
	private String formaPagamento;
	private Calendar data;
	
	//Metodo construtor 
	
	@Override
	public String toString() {
		return "Venda" + "\n" + "comprador " + comprador + "vendendor " + vendendor  + veiculo + "preco "
				+ preco + "\n" + "formaPagamento= " + formaPagamento + "\n" + "data= " + getDataComoString() + "\n";
	}


	public Venda(Comprador comprador, Vendendor vendendor, Veiculo veiculo, double preco, String formaPagamento,
			Calendar data) {
		this.comprador = comprador;
		this.vendendor = vendendor;
		this.veiculo = veiculo;
		this.preco = preco;
		this.formaPagamento = formaPagamento;
		this.data = data;
	}
	
	
	//metodos set e get
	
	public Comprador getComprador() {
		return comprador;
	}
	public void setComprador(Comprador comprador) {
		this.comprador = comprador;
	}
	public Vendendor getVendendor() {
		return vendendor;
	}
	public void setVendendor(Vendendor vendendor) {
		this.vendendor = vendendor;
	}
	public Veiculo getVeiculo() {
		return veiculo;
	}
	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getFormaPagamento() {
		return formaPagamento;
	}
	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}
	public Calendar getData() {
		return data;
	}
	public void setData(Calendar data) {
		this.data = data;
	}
	// 
	public String getDataComoString(){
		return this.data.get(Calendar.DAY_OF_MONTH ) + "/" +
	           this.data.get(Calendar.MONTH) + "/" +
				this.data.get(Calendar.YEAR);
	}
	
	
	
	//Metodo para "imprimir" nota fiscal
	
	public String gerarNotaFiscal(){
		return   "\n" +
				"----------- Nota fiscal da venda ----------- \n" +
                   "Data da venda: " +	getDataComoString() + "\n" +
				"Valor da venda: R$ " + this.preco + "\n" +
				"\n" +
                   "-----------  Dados do Veiculo ----------- \n" +
				"Modelo: " + this.veiculo.getModelo() + "\n" +
                "Fabricante: " + this.veiculo.getFabricante() + "\n" +
				"Ano: " + this.veiculo.getAno() + "\n" +
                "\n" + 
				"----------- Dados do Comprador ----------- \n" +
                "Nome: " + this.comprador.getNome() + "\n" +
				"CPF: " + this.comprador.getCPF() + "\n" + 
                "\n" +
				"----------- Dados do Vendendor ----------- \n" + 
                "Nome: " + this.vendendor.getNomeV() + "\n" +
				"Matricula: " + this.vendendor.getMatricula() + "\n" ;
				
	
	}
	
	
	
	
	
	

}
