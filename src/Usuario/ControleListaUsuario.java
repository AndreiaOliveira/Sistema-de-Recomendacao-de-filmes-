package Usuario;

import TelaInicial.Interface;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ControleListaUsuario implements ControleUsuario {


    @Override
    public void salvarLista() {

        try {
            FileOutputStream fos = new FileOutputStream("Usuario.data");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(controleListaUsuario.getUsuariosCadastrados());
            oos.close();

        }  catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Erro de entrada e saida de dados");
        }

    }

    @Override
    public ArrayList<Usuario> getUsuariosCadastrados() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void settUsuariosCadastrados(ArrayList<Usuario> usuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Usuario usuarioLogado() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
