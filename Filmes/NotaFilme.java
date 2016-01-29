
package Filmes;

import TelaInicial.Interface;
import java.io.Serializable;

public class NotaFilme implements Interface, Serializable{
    
     private String usuario;
     private int nota ;

    public NotaFilme(String usuario, int nota) {
        this.usuario = usuario;
        this.nota = nota;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

}
