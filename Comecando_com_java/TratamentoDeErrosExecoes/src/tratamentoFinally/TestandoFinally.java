package tratamentoFinally;

public class TestandoFinally {

	public static void main(String[] args) {

		int[] numero = { 4, 8, 16, 32, 64, 128 };
		int[] denominado = { 2, 0, 4, 8, 0 };

		for (int i = 0; i < numero.length; i++) {
			try {
				System.out.println(numero[i] + "/" + denominado[i] + " = " + (numero[i] / denominado[i]));
			} catch (ArithmeticException e1) {
				System.out.println("Erro ao dividir por zero.");
			} catch (Throwable e2) {
				System.out.println("Erro: não pode acessar o indice na posição " + (i + 1));
			} finally {
				System.out.println("Essa linha é impressa após o try ou catch!");
			}

		}

	}

}
