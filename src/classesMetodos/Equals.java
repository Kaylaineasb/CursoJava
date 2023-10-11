package classesMetodos;

public class Equals {
    public static void main(String[] args) {
        Usuario u1 = new Usuario();
        u1.nome = "Pedro Silva";
        u1.email="pedro.silava@ezemail.com.br";

        Usuario u2 = new Usuario();
        u2.nome = "Pedro Silva";
        u2.email="pedro.silava@ezemail.com.br";

        System.out.println(u1.equals(u2));
    }
}
