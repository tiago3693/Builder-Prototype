package bolo;

public class Choconinho extends Bolo{
	
	public Choconinho(String nome, String tipo, Float preco) {
		setNome(nome);
		setPreco(preco);
		setTipo(tipo);
	}
	
	@Override
	public void receita() {
		System.out.println("b " + getNome() + " " + getTipo());
	}
}
