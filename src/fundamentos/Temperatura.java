package fundamentos;

public class Temperatura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int Ajuste=32;
		final double Fator = 5/9.0;
		double tempF=30;
		
		double tempC = (tempF-Ajuste)*Fator;
		System.out.println(tempC);
	}

}
