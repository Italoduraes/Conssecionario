
public class Vendendor {
	//Atributos
	
	private String nomeV;
	private String matricula;
	private double salarioBase;
	
	// Metodo construtor 
	
	public Vendendor (String nomeV , String matricula , double salario){
		this.nomeV = nomeV;
		this.matricula = matricula;
		this.salarioBase = salario;
		
	}
	
	//Sobreescrevendo o metodo toString
	
	public String toString(){
		return "Nome do vendendor: " + this.nomeV + "\n" + "Matricula: " + this.matricula + "\n" + "Salario: " + this.salarioBase + "\n"  ;
	}
	
	
	 
	
	
	//Metodos get e set
	
	public String getNomeV(){
		return nomeV;
	}
	
	public String getMatricula(){
		return matricula;
	}
	
	public double getSalario(){
		return salarioBase;
	}
	
	public void setNomeV(String nomeV){
		 this.nomeV = nomeV;
	}
	
	
	public void setMatricula(String matricula){
		this.matricula = matricula;
	}
	
	public void setSalarioBase(double salario){
		this.salarioBase = salario;
	}
	
	
	// calcular salario do mes 
	
	public String calcularSalarioMes(double percentual , int qtdevendas){
      /*
       * o salario do mes é calculado usando o salario base 
       * mais um percentual do salario base multiplicado pela 
       * quantidade de vendas 
       */
		
		
		/*
		double salarioPercentual = salarioBase * (percentual/100);
		double salarioVariavel = salarioPercentual * qtdevendas;
		double salarioDoMes = salarioBase + salarioVariavel;
		*/
		

		return "R$ " + (salarioBase + ((salarioBase * (percentual/100)) * qtdevendas));

	
	}
	
	
	
	
	
	
	
	
	
	
	

}
