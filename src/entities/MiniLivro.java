package entities;

public class MiniLivro extends Livro{
    // Contrutor
    public MiniLivro(Autor autor) {
        super(autor);
    }

    // Metodo
    @Override
    public boolean aplicaDescontoDe(Double porcentagem){
        return false;
    }
}
