package Usuario;

import Filmes.Movie;
import static TelaInicial.Interface.controleListaUsuario;
import static TelaInicial.Interface.usuariologado;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Usuario implements Serializable,ControleUsuario  {

    private String nome;
    private int idade;
    private Genero genero;
    private String ocupacao;
    private String CEP;
    public ArrayList<Movie> filmesVotados = new ArrayList();
    private boolean javoto = false;

    public Usuario() {
        
    }
    
    public ArrayList<Movie> getFilmesVotados() {
        return filmesVotados;
    }

    public void setFilmesVotados(Movie filme) {
        this.filmesVotados.add(filme);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public String getOcupacao() {
        return ocupacao;
    }

    public void setOcupacao(String ocupacao) {
        this.ocupacao = ocupacao;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String cEP) {
        CEP = cEP;
    }

    public boolean isJavoto() {
        return javoto;
    }

    public void setJavoto(boolean javoto) {
        this.javoto = javoto;
    }

     ArrayList<Usuario> usuariosCadastrados  = new ArrayList<>(); ;

    @Override
    public ArrayList<Usuario> getUsuariosCadastrados() {
        return usuariosCadastrados;
    }

    @Override
    public void settUsuariosCadastrados(ArrayList<Usuario> usuario) {
        usuariosCadastrados = usuario;
    }
    @Override
    public Usuario usuarioLogado(){

    for (Usuario usuario : usuariosCadastrados) {
        if(usuario.getNome().equals(usuariologado.getLogin())){
        return usuario;
        }
    }
return null;
}

    @Override
    public void salvarLista() {
       //Não há implementação
    }
   
}
