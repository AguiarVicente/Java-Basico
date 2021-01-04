package stackTrace_throws;

public class ExcepitionGenreica {

	public static void main(String[] args) {

		int[] numero = { 4, 8, 16, 32, 64, 128 };
		int[] denominado = { 2, 0, 4, 8, 0 };

		for (int i = 0; i < numero.length; i++) {

			try {
				System.out.println(numero[i] + "/" + denominado[i] + " = " + (numero[i] / denominado[i]));
			} catch (Exception e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}

		}

	}

}
