package ex2a;

public class RodaGigante {
	
	private double diametro;
	private int rotacoes;
	private String cor;
	
	
	public RodaGigante(double diametro) {
		this.diametro = diametro;
		this.cor = "azul";
		this.rotacoes = 5;
	}
	
	public double getDiametro() {
		return diametro;
	}
	public void setDiametro(double diametro) {
		this.diametro = diametro;
	}
	public int getRotacoes() {
		return rotacoes;
	}
	public void setRotacoes(int rotacoes) {
		this.rotacoes = rotacoes;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	
	public String gira(RodaGigante rodaGigante) {
		
				return "esta roda gigante " + rodaGigante.getCor() + " tem " + rodaGigante.getDiametro() + 
						" metros de diametro e gira a " + rodaGigante.getRotacoes() + " rotações por hora.";
	}
	
	
}
