/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Usuario;

import TelaInicial.Interface;
import java.util.ArrayList;

/**
 *
 * @author Andreia
 */
public interface ControleUsuario extends Interface {

    ArrayList<Usuario> getUsuariosCadastrados();

    void salvarLista();

    void settUsuariosCadastrados(ArrayList<Usuario> usuario);

    Usuario usuarioLogado();
    
}
