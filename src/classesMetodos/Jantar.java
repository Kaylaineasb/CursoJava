package classesMetodos;

public class Jantar {
    public static void main(String[] args) {
        Comida comida = new Comida("Pizza", 0.560);
        Pessoa pessoa = new Pessoa("Kaylaine",65.5);
        pessoa.comer(comida);
        System.out.println(pessoa.peso);
    }
}
