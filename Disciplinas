
package TPC02;


public class Disciplinas {
    
  private Alunos inicio;
  private Alunos fim;
   private final String titulo = null;
   private final String nomeDocente = null;

   

    public Alunos getInicio() {
        return inicio;
    }

    public void setInicio(Alunos inicio) {
        this.inicio = inicio;
    }

    public Alunos getFim() {
        return fim;
    }

    public void setFim(Alunos fim) {
        this.fim = fim;
    }

    @Override
    public String toString() {
        return "Disciplinas{" + "titulo=" + titulo + ", nomeDocente=" + nomeDocente + '}';
    }

   
    public Disciplinas() {
       
    }
    private boolean isVazia(){
        return(this.inicio==null||this.fim==null);
    }
  
    
   public void insirirAluno(Alunos info) {
         No novo=new No(info);
          if (isVazia()) {
           this.inicio=novo;
           this.fim=fim;
        } else {
           novo.setProx(inicio););
           this.inicio=novo;
        }
    }
   public void listar(){
       if (isVazia()){
           System.out.println("Lista vazia");
           return;
       }
       No atual=this.inicio;
        while (atual != null) {
            System.out.println(atual.getInfo());
            atual = atual.getProx();
        }
    }
    public static void main(String[] args) {
        Disciplinas d=new Disciplinas();
        //d.insirirAluno();
        d.isVazia();
        d.listar();
        
    }
}
