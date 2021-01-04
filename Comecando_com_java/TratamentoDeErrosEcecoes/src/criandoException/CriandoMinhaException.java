package criandoException;

public class CriandoMinhaException {

	public static void main(String[] args){

		try {
			teste();
		}catch( DivisaoNaoExata e){
			e.printStackTrace();
		}

	}
	
	public static void teste() throws DivisaoNaoExata {
	
		int[] numero = { 4, 8, 5, 16, 32, 21, 64, 128 };
		int[] denominado = { 2, 0, 4, 8, 0, 2, 4 };

		for (int i = 0; i < numero.length; i++) {
			try {
				if(numero[i] % 2 != 0) {
					// lançar minha exception
					throw new DivisaoNaoExata(numero[i], denominado[i]);
				}
				System.out.println(numero[i] + "/" + denominado[i] + " = " + (numero[i] / denominado[i]));
			} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
				System.out.println("Aconteceu um ERRO.");
				e.printStackTrace();
			}
		}
		
	}

}
