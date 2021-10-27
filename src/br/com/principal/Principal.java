package br.com.principal;

import java.util.Scanner;

import br.com.jogo.Jogo;

/** 
A l�gica do programa se baseia em percorrer cada letra que o usu�rio digitou, comparando-as com cada letra de cada palavra previamente armazenada em um array.
Quando a letra do usu�rio � igual � da palavra percorrida, ambas as letras s�o trocadas por valores que n�o se encontram no banco de palavras, para que a compara��o n�o se repita.
As palavras que forem completadas (onde todas as letras esteja nas letras digitadas pelo usu�rio), s�o armazenadas em um array e ap�s isso, � feita a contagem de pontos.
Foi armazenada previamente, todas as letras que s�o utilizadas nas palavras do banco, cada uma em um vetor de acordo com sua pontua��o (1, 2, 3, 4, 8 e 10 pontos). 
A palavra escolhida (de maior ponto e menor tamanho) � comparada novamente com as letras recebidas, onde as letras n�o utilizadas s�o armazenadas em um array e exibidas ao usu�rio, junto com a palavra formada e a pontua��o obtida.

*/

public class Principal {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		Jogo game = new Jogo();
		
				System.out.println("Digite as Letras Disponiveis para esta jogada:\n");
				game.recebeLetras(in.next());
				game.verificaLetras();
				game.mostraResultado();

	}

}
