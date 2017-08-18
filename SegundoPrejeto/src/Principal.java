
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("óla mundo!");
		System.out.println("óla universo");
       
		//verificar se x é maoir ou menor que 10 
		
		//criar a variavel x 
		int x=0;
		
		verificarMaiorQue10(x);
		x=20;
		verificarMaiorQue10(x);
		x=10;
		verificarMaiorQue10(x);
	  
		//verificar se um numero é par 
		
		if (verificarSePar(10)){
			System.out.println(x + " é par!");
		}else{
			System.out.println(x + " é impar!");
		}
		
	}
	
	public static boolean verificarSePar(int x){
		if (x % 2 == 0){
			return true;
		} else {
			return false;
		}
	}
	
	public static void verificarMaiorQue10(int x){
		//teste de x maior ou menor que 10
		 
				if (x>10) {
					System.out.println(x + " é maior que 10!");
				}
				else 
					
					if( x == 10){
						System.out.println(x + " é igual a 10!");
					}
					else{
						
						System.out.println(x + " é menor que 10!");
					}
				
	}
}
  

