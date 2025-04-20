package biblioteca;

public class Livro {
    private String titulo;
    private String autor;
    private String isbn;
    private boolean disponivel;

    public Livro(String titulo, String autor, String isbn){
       this.titulo=titulo;
       this.autor=autor;
       this.isbn=isbn;
       this.disponivel=true;
    }
    public boolean estaDisponivel(){
        return disponivel;
    }
    public void setDisponivel(boolean disponivel){
        this.disponivel=disponivel;
    }
    public String getTitulo(){
        return titulo;
    }
    public String getAutor(){
        return autor;
    }
    public String getIsbn() {
        return isbn;
    }
    public String toString(){
        String status= disponivel? "disponível": "Emprestado";
        return "===== LIVRO =====\n"+"Título: "+titulo + "\nAutor: "+ autor+"\nISBN: "+ isbn+"\nStatus: "+status+"\n";
    }
}



