package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
    public static void main(String[] args) {
        Deque<String> livros = new ArrayDeque<>();
        livros.add("O pequeno principe");
        livros.push("Don Quixote");
        livros.push("O hobbit");

        System.out.println(livros.peek());
        System.out.println(livros.element());

        for (String livro:livros) {
            System.out.println(livro);
        }

        System.out.println(livros.poll());
        System.out.println(livros.remove());
        livros.pop();
        livros.size();
        livros.clear();
        livros.contains("O hobbit");
        livros.isEmpty();
    }
}
