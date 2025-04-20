package biblioteca;
import java.time.LocalDate;
public class Emprestimo {
    private Livro livro;
    private Usuario usuario;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;

    public Emprestimo(Livro livro, Usuario usuario){
        this.livro=livro;
        this.usuario=usuario;
        this.dataEmprestimo=LocalDate.now();
        this.dataDevolucao=dataEmprestimo.plusDays(7);

        livro.setDisponivel(false);
    }
    public Livro getLivro(){
        return livro;
    }
    public Usuario getUsuario(){
        return usuario;
    }
    public LocalDate getDataEmprestimo(){
        return dataEmprestimo;
    }
    public LocalDate getDataDevolucao(){
        return dataDevolucao;
    }
   public boolean estaAtrasado(){
        return LocalDate.now().isAfter(dataDevolucao);
   }
   public void devolver(){
        livro.setDisponivel(true);
   }
   @Override
    public String toString(){
        String status= estaAtrasado()? "atrasado": "Dentro do prazo";
        return "==== EMPRÉSTIMO ====\n"+usuario.getNome()+" pegou o livro - "+livro.getTitulo()+"\n"+"Empréstimo:"+getDataEmprestimo()+"\n" +
                "Devolução: "+ dataDevolucao+"\nStatus: "+status;
   }
}
