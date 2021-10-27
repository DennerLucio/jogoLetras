package br.com.principal;

import java.util.Scanner;

import br.com.jogo.Jogo;

/** 
A lógica do programa se baseia em percorrer cada letra que o usuário digitou, comparando-as com cada letra de cada palavra previamente armazenada em um array.
Quando a letra do usuário é igual à da palavra percorrida, ambas as letras são trocadas por valores que não se encontram no banco de palavras, para que a comparação não se repita.
As palavras que forem completadas (onde todas as letras esteja nas letras digitadas pelo usuário), são armazenadas em um array e após isso, é feita a contagem de pontos.
Foi armazenada previamente, todas as letras que são utilizadas nas palavras do banco, cada uma em um vetor de acordo com sua pontuação (1, 2, 3, 4, 8 e 10 pontos). 
A palavra escolhida (de maior ponto e menor tamanho) é comparada novamente com as letras recebidas, onde as letras não utilizadas são armazenadas em um array e exibidas ao usuário, junto com a palavra formada e a pontuação obtida.

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
