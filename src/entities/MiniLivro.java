package entities;

public class MiniLivro extends Livro{
    // Contrutor
    public MiniLivro(Autor autor) {
        super(autor);
    }

    // Metodo
    public boolean aplicaDescontoDe(double porcentagem){
        return false;
    }
}
