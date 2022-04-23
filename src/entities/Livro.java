package entities;

public abstract class Livro implements Produto{
    private String nome;
    private String descricao;
    private Double valor;
    private String isbn;
    private Autor autor;
    private boolean impresso;

    // Construtor
    public Livro(Autor autor){
        this.autor = autor;
        this.isbn = "000-00-00000-00-0";
        this.impresso = true;
    }

    // Getters ee setters
    public double getValor() {
        return valor;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public Autor getAutor() {
        return autor;
    }
    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    // Metodo
    public Boolean temAutor() {
        return this.autor != null;
    }

    public void mostrarDetalhes() {
        String mensagem = "Mostrando detalhes do livro:";
        System.out.println(mensagem);
        System.out.println("Nome: " + nome);
        System.out.println("Descricao: " + descricao);
        System.out.println("Valor: RS" + getValor());
        System.out.println("ISBN: " + isbn);
        if (temAutor()) {
            autor.mostrarDetalhes();
        }
        else {
            System.out.println("Este livro não tem autor adastrado");
        }
        System.out.println(" _ _ _ ");
    }
}
