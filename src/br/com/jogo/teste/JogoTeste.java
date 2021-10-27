package br.com.jogo.teste;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import br.com.jogo.Jogo;



class JogoTeste {
	
		
	@Test
	void testRecebeLetras() {
		Jogo j = new Jogo();
		
		assertEquals("ABC", j.recebeLetras("ábc"));
		
		
	}
	@Test
	void testCalculaPontos() {
		Jogo j = new Jogo();
		assertEquals(9, j.calculaPontos("JA"));
		
	}
	@Test
	void testRetornaSobra() {
			   
		Jogo j = new Jogo();
			        j.recebeLetras("DJA");
			        assertEquals("[D]", j.retornaSobra("JA"));
			   
			
		
	}

}
