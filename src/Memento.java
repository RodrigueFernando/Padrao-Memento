public class Memento {

    private final String cor;
    private final int posicaoX;
    private final int posicaoY;

    public Memento(String cor, int posicaoX, int posicaoY) {
        this.cor = cor;
        this.posicaoX = posicaoX;
        this.posicaoY = posicaoY;
    }

    public String getCor() { return cor; }
    public int getPosicaoX() { return posicaoX; }
    public int getPosicaoY() { return posicaoY; }
}
