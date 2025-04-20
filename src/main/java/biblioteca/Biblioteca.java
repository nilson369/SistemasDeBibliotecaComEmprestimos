package biblioteca;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Biblioteca {
    public static void main(String[] args) {
        Usuario usuario=new Usuario(122224,"Nilson");
        Livro livro=new Livro("Pequeno Principe","XXXXXXx","677889");
        System.out.println(usuario);
        System.out.println(livro);
        Emprestimo emprestimo=new Emprestimo(livro,usuario);
        System.out.println(emprestimo);
        }
    }

