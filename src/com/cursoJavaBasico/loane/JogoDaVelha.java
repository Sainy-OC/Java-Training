package com.cursoJavaBasico.loane;
import java.util.Scanner;

public class JogoDaVelha {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Tabuleiro tabuleiro = new Tabuleiro();
		Jogador jogador1 = new Jogador();
		Jogador jogador2 = new Jogador();
		int linha=0, coluna=0;
		
		System.out.println("Informe o nome e marcador do jogador1: ");
		jogador1.setNome(scan.next());
		jogador1.setMarcador(scan.next());
		
		System.out.println("Informe o nome e marcador do jogador2: ");
		jogador2.setNome(scan.next());
		jogador2.setMarcador(scan.next());
		
		tabuleiro.imprimirTabuleiro();
		
		while(!tabuleiro.isHaVencedor()){
			
			if(tabuleiro.isFimDeJogo()) {
				break;
			}
			
			if(!tabuleiro.isHaVencedor()) {
				do {
					do {
						System.out.println(jogador1.getNome()+", Informe um par válido de coordenadas para o tabuleiro:");
						linha = scan.nextInt();
						coluna = scan.nextInt();						
					}while(((linha<0)||(linha>2))||((coluna<0)||(coluna>2)));
				}while((!tabuleiro.getTabuleiro()[linha][coluna].equals("_")));

				tabuleiro.setTabuleiro(linha, coluna, jogador1);				
				tabuleiro.imprimirTabuleiro();
			}

			if(tabuleiro.isFimDeJogo()) {
				break;
			}
			
			if(!tabuleiro.isHaVencedor()) {
				do {
					do {
						System.out.println(jogador2.getNome()+", Informe um par válido de coordenadas para o tabuleiro:");
						linha = scan.nextInt();
						coluna = scan.nextInt();						
					}while(((linha<0)||(linha>2))||((coluna<0)||(coluna>2)));
				}while(!tabuleiro.getTabuleiro()[linha][coluna].equals("_"));

				tabuleiro.setTabuleiro(linha, coluna, jogador2);
				tabuleiro.imprimirTabuleiro();
			}	
		}
		
		if(tabuleiro.isHaVencedor()) {
			System.out.println(tabuleiro.getVencedor().getNome()+" venceu o jogo.");
		}else {
			if(tabuleiro.isFimDeJogo()) {
				System.out.println("O JOGO TERMINOU EM EMPATE");				
			}
		}
	}

}
