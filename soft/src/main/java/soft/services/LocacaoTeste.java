package soft.services;

public class LocacaoTeste {

	public static boolean NomeValido(String nome) {
	
		if(nome.contains("1")||nome.contains("2")||nome.contains("3")||nome.contains("4")||nome.contains("5")||nome.contains("6")||nome.contains("7")||nome.contains("8")||nome.contains("9")||nome.contains("0")) {
			return false;
		}
		else {
			return true;
		
	}
		
	}

	public static boolean ModeloDisponivel(String modelo) {
		
		if(modelo.equals("Tesla Model X")||modelo.equals("Tesla Model S")||modelo.equals("Tesla Model Plaid")||modelo.equals("Audi")||modelo.equals("Civic")){
			return true;
		}
		else {
			return false;
		}
		
	}
	
	
}
