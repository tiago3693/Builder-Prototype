package bolo;

public class BoloMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BoloFactory bolof = new BoloFactory();
		
		Bolo bolo1 = bolof.getBolo(BoloFactory.Sabor.ABACAXI);
		bolo1.receita();
		bolo1.sobreoBolo();
		
		Bolo bolo2 = bolof.getBolo(BoloFactory.Sabor.CHOCONINHO);
		bolo2.receita();
		bolo2.sobreoBolo();
		
		Bolo bolo3 = bolof.getBolo(BoloFactory.Sabor.FLORESTA);
		bolo3.receita();
		bolo3.sobreoBolo();
		
		Bolo bolo4 = bolof.getBolo(BoloFactory.Sabor.PRESTIGIO);
		bolo4.receita();
		bolo4.sobreoBolo();
	}
}
