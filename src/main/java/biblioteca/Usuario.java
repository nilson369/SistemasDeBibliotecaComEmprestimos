package biblioteca;

public class Usuario {
   private int id;
   private String nome;

   public Usuario(int id, String nome){
       this.id=id;
       this.nome=nome;
   }
   public int getIid (){
       return id;
   }
   public String getNome(){
       return nome;
   }
   @Override
    public String toString(){
       return "==== USUÁRIO ====\n"+"Nome: "+nome +"\n"+"ID: "+id+"\n";
   }
}
