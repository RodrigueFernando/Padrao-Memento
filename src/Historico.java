import java.util.Stack;

public class Historico {
//Caretaker
    private final Stack<Memento> estados = new Stack<>();

    public void salvar(Memento memento) {
        estados.push(memento);
    }

    public Memento desfazer() {
        return estados.isEmpty() ? null : estados.pop();
    }
}
