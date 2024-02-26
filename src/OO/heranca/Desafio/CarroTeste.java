package OO.heranca.Desafio;

public class CarroTeste {
    public static void main(String[] args) {
        Carro c = new Ferrari(300);
        c.acelerar();
        c.acelerar();
        c.acelerar();
        c.frear();
        System.out.println(c);
        Carro c2  = new Civic();
        c2.acelerar();
        System.out.println(c2);
    }
}
