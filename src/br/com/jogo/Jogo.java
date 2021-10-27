package br.com.jogo;

import java.util.ArrayList;
import java.util.List;

public class Jogo {
	
	String letra;
	int[] pontosPalavras;
	int chave = 0;
	ArrayList<String> resultado = new ArrayList();

	String[] palavras = {"Abacaxi", "Manada", "mandar", "porta", "mesa", "Dado", "Mangas", "Já", "coisas",
			"radiografia", "matemática", "Drogas", "prédios", "implementação", "computador", "balão", "Xícara", "Tédio",
			"faixa", "Livro", "deixar", "superior", "Profissão", "Reunião", "Prédios", "Montanha", "Botânica",
			"Banheiro", "Caixas", "Xingamento", "Infestação", "Cupim", "Premiada", "empanada", "Ratos", "Ruído",
			"Antecedente", "Empresa", "Emissário", "Folga", "Fratura", "Goiaba", "Gratuito", "Hídrico", "Homem",
			"Jantar", "Jogos", "Montagem", "Manual", "Nuvem", "Neve", "Operação", "Ontem", "Pato", "Pé", "viagem",
			"Queijo", "Quarto", "Quintal", "Solto", "rota", "Selva", "Tatuagem", "Tigre", "Uva", "Último", "Vitupério",
			"Voltagem", "Zangado", "Zombaria", "Dor"};

	public String recebeLetras(String letras) {

		letras = letras.toUpperCase();
		letras = letras.replaceAll("[ÀÁÂÄÃ]", "A");
		letras = letras.replaceAll("[ÉÈÊË]", "E");
		letras = letras.replaceAll("[ÍÌÏÎ]", "I");
		letras = letras.replaceAll("[ÓÒÔÖÕ]", "O");
		letras = letras.replaceAll("[ÚÙÜÛ]", "U");

		return letra = letras;
	}

	public void verificaLetras() {

		for (int p = 0; p < palavras.length; p++) {

			char[] arrayLetra = letra.toCharArray();

			chave = 0;

			palavras[p] = palavras[p].toUpperCase();

			palavras[p] = palavras[p].replaceAll("[ÀÁÂÄÃ]", "A");
			palavras[p] = palavras[p].replaceAll("[ÉÈÊË]", "E");
			palavras[p] = palavras[p].replaceAll("[ÍÌÏÎ]", "I");
			palavras[p] = palavras[p].replaceAll("[ÓÒÔÖÕ]", "O");
			palavras[p] = palavras[p].replaceAll("[ÚÙÜÛ]", "U");

			char[] arrayPalavra = palavras[p].toCharArray();

			for (int le = 0; le < arrayLetra.length; le++) {

				for (int lp = 0; lp < arrayPalavra.length; lp++) {
					
					if (arrayPalavra[lp] == arrayLetra[le]) {
						
						chave++;

						arrayLetra[le] = 0;
						arrayPalavra[lp] = 1;

						if (chave == palavras[p].length()) {
							
							resultado.add(palavras[p]);
							
						}
					}
				}
				
				pontosPalavras = new int[resultado.size()];				
				int index = 0;				
				for (String palavra : resultado) {
					
					pontosPalavras[index] = calculaPontos(palavra);
					index++;
					
				}
			}
		}
	}

	public int calculaPontos(String palavra) {

		char[] vetPalavraChar = palavra.toCharArray();
		String[] vetPalavraString = new String[vetPalavraChar.length];
		
		for (int i = 0; i < vetPalavraChar.length; i++) {
			
			vetPalavraString[i] = Character.toString(vetPalavraChar[i]);
		}

		List[] vetPontos = new List[6];

		List<String> ponto1 = new ArrayList<String>();
		List<String> ponto2 = new ArrayList<String>();
		List<String> ponto3 = new ArrayList<String>();
		List<String> ponto4 = new ArrayList<String>();
		List<String> ponto8 = new ArrayList<String>();
		List<String> ponto10 = new ArrayList<String>();

		vetPontos[0] = ponto1;
		vetPontos[1] = ponto2;
		vetPontos[2] = ponto3;
		vetPontos[3] = ponto4;
		vetPontos[4] = ponto8;
		vetPontos[5] = ponto10;

		ponto1.add("E");
		ponto1.add("A");
		ponto1.add("I");
		ponto1.add("O");
		ponto1.add("N");
		ponto1.add("R");
		ponto1.add("T");
		ponto1.add("L");
		ponto1.add("S");
		ponto1.add("U");

		ponto2.add("W");
		ponto2.add("D");
		ponto2.add("G");

		ponto3.add("B");
		ponto3.add("C");
		ponto3.add("M");
		ponto3.add("P");

		ponto4.add("F");
		ponto4.add("H");
		ponto4.add("V");

		ponto8.add("J");
		ponto8.add("X");

		ponto10.add("Q");
		ponto10.add("Z");

		int pontos = 0;
		for (int i = 0; i < vetPalavraString.length; i++) {
			
			for (int j = 0; j < vetPontos.length; j++) {
				
				if (vetPontos[j].contains(vetPalavraString[i])) {
					
					if (j == 0) {
						
						pontos += 1;
						
					} else if (j == 1) {
						
						pontos += 2;
						
					}else if (j == 2) {
						
						pontos += 3;
						
					}else if (j == 3) {
						
						pontos += 4;
						
					}else if (j == 4) {
						
						pontos += 8;
						
					}					
					else {
						
						pontos += + 10;
						
					}
				}
			}
		}
		return pontos;
	}

	public void mostraResultado() {

		int index = 0;
		String menorPalavra = "00000000000000000";
		int maiorPalavraIndex = 0;
		int maiorPontuacao = 0;

		for (String palavra : resultado) {

			if (pontosPalavras[index] >= maiorPontuacao) {
				
				maiorPontuacao = pontosPalavras[index];
				maiorPalavraIndex = index;
				menorPalavra = palavra;
			}
			if (pontosPalavras[index] >= maiorPontuacao) {

				if (palavra.length() <= menorPalavra.length()) {
					menorPalavra = palavra;
					maiorPalavraIndex = index;
				}

			}
			index++;
		}
		if (pontosPalavras == null || menorPalavra == "00000000000000000") {
			
			System.out.println("Letras Insuficientes para Formar alguma Palavra");
			
		} else {
			
			System.out.println("A menor Palavra é: \n" + menorPalavra);
			System.out.println("Pontos : \n" + pontosPalavras[maiorPalavraIndex]);
			System.out.println("Sobraram essas Letras : \n" + retornaSobra(menorPalavra));
			
		}
	}

	public String retornaSobra(String valor) {
		
		String apaga = valor;

		List<Character> listaSobra = new ArrayList();

		char[] arrayRecebido = letra.toCharArray();

		for (int i = 0; i < arrayRecebido.length; i++) {

			String x = String.valueOf(arrayRecebido[i]);

			if (apaga.contains(x)) {

				apaga = apaga.replaceFirst(x, "");

			} else {
				
				listaSobra.add(arrayRecebido[i]);
			
			}
			x = "";
		}

		return listaSobra.toString();
	}
	
	
	
	
	
	
	
}
