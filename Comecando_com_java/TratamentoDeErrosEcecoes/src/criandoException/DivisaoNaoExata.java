package criandoException;

public class DivisaoNaoExata extends Exception {
	
	private int num;
	private int denominado;
	
	public DivisaoNaoExata(int num, int denominado) {
		super();
		this.num = num;
		this.denominado = denominado;
	}

	@Override
	public String toString() {
		return "Resultado de " + num + "/" + denominado + " não é um inteiro!";
	}
	
}
