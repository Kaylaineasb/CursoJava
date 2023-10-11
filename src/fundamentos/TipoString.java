package fundamentos;

public class TipoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Olá pessoal".charAt(2));
		
		String s = "Boa tarde";
		s = s.toUpperCase();
		System.out.println(s.concat("!!!"));
		System.out.println(s+"!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toUpperCase().endsWith("TARDE"));
		System.out.println(s.length());
		System.out.println(s.equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		System.out.println("Frase qualquer".contains("qual"));
		System.out.println("Frase qualquer".indexOf("qual"));
		
		System.out.println("Frase qualquer".substring(6,10));
		
	}

}
