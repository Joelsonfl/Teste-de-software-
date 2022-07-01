package soft;

import soft.services.*;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;

public class TesteLocadoraVeiculos {

	
	@Test
	public void TextNomeValido() {
		
		Cliente cliente = new Cliente("Joelson");
		boolean b = LocacaoTeste.NomeValido(cliente.getNome());
		assertTrue("Nome Inválido",b);
		
	}
	
	@Test
	public void TextModeloDisponivel() {
		
		boolean m = LocacaoTeste.ModeloDisponivel("");
		
	}
	

}
