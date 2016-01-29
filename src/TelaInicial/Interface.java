package TelaInicial;

import Filmes.ControleListaFilme;
import Usuario.ControleListaUsuario;
import Usuario.UsuarioLogado;

public interface Interface {    
    UsuarioLogado usuariologado = new UsuarioLogado();
    ControleListaUsuario controleListaUsuario = new ControleListaUsuario();
    ControleListaFilme controleListaFilme = new ControleListaFilme();
 
    
}
