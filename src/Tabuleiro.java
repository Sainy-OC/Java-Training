public class Tabuleiro {
	private String[][] tabuleiro;
	private Jogador vencedor;
	private boolean haVencedor;
	private boolean fimDeJogo;
	
	Tabuleiro(){
		this.tabuleiro = new String[3][3];
		this.vencedor = null;
		this.haVencedor=false;
		this.fimDeJogo=false;
		this.inicializarTabuleiro();
	}

	boolean getFimDeJogo() {
		return this.fimDeJogo;
	}
	
	private void setFimDeJogo() {
		this.fimDeJogo=true;
	}
	
	boolean getHaVencedor() {
		return this.haVencedor;
	}
	
	private void setHaVencedor() {
		this.haVencedor=true;
	}
	
	Jogador getVencedor() {
		return this.vencedor;
	}
	
	private void setVencedor(Jogador vencedor) {
		this.vencedor=vencedor;
	}
	
	String[][] getTabuleiro() {
		return this.tabuleiro;
	}
	
	void setTabuleiro(int linha, int coluna, Jogador jogador) {
		this.tabuleiro[linha][coluna]=jogador.getMarcador();
		this.verificarTabuleiro(jogador);
	}
	
	void imprimirTabuleiro() {
		
		for(int i = 0; i<3; i++) {
			for(int j = 0; j<3; j++) {
				System.out.print(" "+this.tabuleiro[i][j]);
			}			
			System.out.println();
		}
		
		System.out.println();
	}
	
	private void inicializarTabuleiro() {
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				this.tabuleiro[i][j]="_";
			}
		}
	}
	
	private void verificarTabuleiro(Jogador jogador) {
		this.verificarLinha(jogador);
		this.verificarColuna(jogador);
		this.verificarDiagonais(jogador);
		this.verificarEmpate();
	}
	
	private void verificarLinha(Jogador jogador) {
		for(int i=0; i<3; i++) {
			if((this.tabuleiro[i][0].equals(this.tabuleiro[i][1]))&&(this.tabuleiro[i][1].equals(this.tabuleiro[i][2])&&(!this.tabuleiro[i][0].equals("_")))) {
				this.setVencedor(jogador);
				this.setHaVencedor();
			}
		}
	}
	
	private void verificarColuna(Jogador jogador) {
		for(int i=0; i<3; i++) {
			if((this.tabuleiro[0][i].equals(this.tabuleiro[1][i]))&&(this.tabuleiro[1][i].equals(this.tabuleiro[2][i])&&(!this.tabuleiro[0][i].equals("_")))) {
				this.setVencedor(jogador);
				this.setHaVencedor();
			}			
		}
	}
	
	private void verificarDiagonais(Jogador jogador) {
		if((this.tabuleiro[0][0].equals(this.tabuleiro[1][1]))&&(this.tabuleiro[1][1].equals(this.tabuleiro[2][2])&&(!this.tabuleiro[0][0].equals("_")))) {
			this.setVencedor(jogador);
			this.setHaVencedor();
		}else {
			if((this.tabuleiro[0][2].equals(this.tabuleiro[1][1]))&&(this.tabuleiro[1][1].equals(this.tabuleiro[2][0])&&(!this.tabuleiro[0][2].equals("_")))) {
				this.setVencedor(jogador);
				this.setHaVencedor();
			}
		}
	}
	
	private void verificarEmpate() {
		int vazio = 0;
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(this.tabuleiro[i][j].equals("_")) {
					vazio++;
				}				
			}
		}
		if(vazio==0) {
			this.setFimDeJogo();
		}
	}

}
