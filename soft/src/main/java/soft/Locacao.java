package soft;

public class Locacao {
	
	private Cliente cliente;
	private Carro carro;
	private Double valor;
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Carro getCarro() {
		return carro;
	}
	public void setCarro(Carro carro) {
		this.carro = carro;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	@Override
	public String toString() {
		return "Locacao [cliente=" + cliente + ", carro=" + carro + ", valor=" + valor + "]";
	}
	
	

}
