package soft;

public class Carro {
		
			private int id;
			private String modelo;
			
			private String[] modeloDisponivel = {"Tesla Model X, Tesla Model S, Audi, Mercedes, Civic"};
			
			
			public Carro(int id, String modelo) {
				super();
				this.id = id;
				this.modelo = modelo;
				
				
			}
			public int getId() {
				return id;
			}
			public void setId(int id) {
				this.id = id;
			}
			public String getModelo() {
				return modelo;
			}
			public void setModelo(String modelo) {
				this.modelo = modelo;
			}
			public String[] getModeloDisponivel() {
				return modeloDisponivel;
			}
			public void setModeloDisponivel(String[] modeloDisponivel) {
				this.modeloDisponivel = modeloDisponivel;
			}
			
			@Override
			public String toString() {
				return "Carro [id=" + id + ", modelo=" + modelo + "]";
			}
			
			
			
			
 

}
