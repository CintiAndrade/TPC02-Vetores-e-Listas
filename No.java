
package TPC02;

public class No {
    private No prox;
    private Alunos info;


    public No(Alunos info) {
        this.prox = null;
        this.info = info;
    }

    public No getProx() {
        return prox;
    }

    public void setProx(No prox) {
        this.prox = prox;
    }


    public Alunos getInfo() {
        return info;
    }

    public void setInfo(Alunos info) {
        this.info = info;
    }
    
    
}
