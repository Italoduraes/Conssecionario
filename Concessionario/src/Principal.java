import java.util.Calendar;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Criar objeto da classe comprador
		
		Comprador c1 = new Comprador("Ítalo Durães" , "06716030190" , 20);

		/*
		 * //Preencher atributos de c1
		
		c1.setNome("Ítalo Durães");
		c1.setCPF("067.160.301-90");
		c1.setIdade(20);  
		*/
		
		//Recuperar os atributos de c1
		
		System.out.println("Cliente \n" + c1);
		
		/*
		System.out.println("Nome: " + c1.getNome());
		System.out.println("CPF: " + c1.getCPF());
		System.out.println("Idade: " + c1.getIdade());
		*/
		
		//tudo dnovo 
		
		Comprador c2 = new Comprador("Maria Joaquina" , "254.665.231-98" , 24);
		
		/*
	    c2.setNome("Maria Joaquina");
		c2.setCPF("254.665.231-98");
		c2.setIdade(24);
		*/
		
		
		//Recuperar os atributos de c2
		
		System.out.println("Cliente \n" + c2);
		
		/*
		 * System.out.println("Nome: " + c2.getNome());
		System.out.println("CPF: " + c2.getCPF());
		System.out.println("Idade: " + c2.getIdade());
		*/
		
		//Atributos do vendendor 
		
		Vendendor v1 = new Vendendor("Mario da silva" , "235465" , 1000);
		
		/*v1.setNomeV("Mario da silva");
		v1.setMatricula("235465");
		v1.setSalario(1800);*/
		
		//Recuperar os atributos do v1 e calcular o salario do mes 
	
		System.out.println( v1 + v1.calcularSalarioMes(10, 5) + "\n");
		
		
		
		/*
		System.out.println("Nome do vendendor: " + v1.getNomeV());
		System.out.println("Matricula:" + v1.getMatricula());
		System.out.println("Salario:" + v1.getSalario());
		*/
		
		Vendendor v2 = new Vendendor("Joao Paulo" , "325478" , 2050.58);
		
		/*v2.setNomeV("João Paulo");
		v2.setMatricula("325478");
		v2.setSalario(2050.58);
		*/
		
		System.out.println(v2);
		
		/*
		System.out.println("Nome do vendendor: " + v2.getNomeV());
		System.out.println("Matricula: " + v2.getMatricula());
		System.out.println("Salario: " + v2.getSalario());
		*/
		
		//Recuperar dados do veiculo 
		
		Veiculo veic1 = new Veiculo(1000.00 , "2015" ,"up" , "VW" , "0" , 100);
		System.out.println(veic1);
		
		
		
		//Registra venda
		Calendar data = Calendar.getInstance();
		data.set(Calendar.YEAR, 2017);
		data.set(Calendar.MONTH, Calendar.AUGUST);
		data.set(Calendar.DAY_OF_MONTH, 11 );
		
		
		Venda italo = new Venda(c1, v1, veic1, veic1.getPreço() , "A vista" , data);
		
		System.out.println("Nome do comprador: " + italo.getComprador().getNome());
		System.out.println("Nome do vendendor: " + italo.getVendendor().getNomeV());
		System.out.println("Modelo do carro: " + italo.getVeiculo().getModelo());
		
		System.out.println(italo);
		
		System.out.println(italo.gerarNotaFiscal());
		
		System.out.println(italo.getDataComoString());
		

	}

}
