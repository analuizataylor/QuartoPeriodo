package trabalhoc1;

import java.util.LinkedList;

public class PilhaPaginas {
    private LinkedList<Pagina> paginas;

    public PilhaPaginas() {
        this.paginas = new LinkedList<>();
    }

    public void push(Pagina p) {
        paginas.push(p);
    }

    public Pagina pop() {
        return paginas.poll();
    }

    public Pagina peek() {
        return paginas.peek();
    }

    public boolean isEmpty() {
        return paginas.isEmpty();
    }
}
