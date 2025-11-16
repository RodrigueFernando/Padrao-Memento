public class Figura { // Classe Originator

    private  String cor;
    private  int posicaoX;
    private  int posicaoY;

    public Figura(String cor, int posicaoX, int posicaoY) {
        this.cor = cor;
        this.posicaoX = posicaoX;
        this.posicaoY = posicaoY;
    }

    public void mover(int novaPosicaoX, int novaPosicaoY) {
        this.posicaoX = novaPosicaoX;
        this.posicaoY = novaPosicaoY;
    }
    public void mudarCor(String novaCor) {
        this.cor = novaCor;
    }
    public Memento criarMemento() {
        return new Memento(cor, posicaoX, posicaoY);
    }
    public void restaurar(Memento memento) {
        this.cor = memento.getCor();
        this.posicaoX = memento.getPosicaoX();
        this.posicaoY = memento.getPosicaoY();
    }



}