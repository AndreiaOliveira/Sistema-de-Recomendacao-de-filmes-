package TelaInicial;

import Filmes.Movie;
import Usuario.Usuario;
import Usuario.UsuarioTela;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class App extends javax.swing.JFrame implements Interface {

    public static void main(String args[]) {

        
        if (new File("Usuario.data").canRead() == true) {
            try {
                FileInputStream arquivoLeitura = new FileInputStream("Usuario.data");
                ObjectInputStream objLeitura = new ObjectInputStream(arquivoLeitura);

                ArrayList<Usuario> cadastrados = (ArrayList<Usuario>) objLeitura.readObject();
                controleListaUsuario.settUsuariosCadastrados(cadastrados);

            } catch (FileNotFoundException ex) {
                Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "File not found");
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Class not found");

            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Erro de entrada ou saida de dados.");
            }
        }

        if (new File("Filme.data").canRead() == true) {
            try {
                FileInputStream arquivoLeitura = new FileInputStream("Filme.data");
                ObjectInputStream objLeitura = new ObjectInputStream(arquivoLeitura);

                ArrayList<Movie> filme = (ArrayList<Movie>) objLeitura.readObject();
                controleListaFilme.setFilmes(filme);

            } catch (FileNotFoundException ex) {
                Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "File not found");
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Classe not found");

            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Erro de entrada ou saida de dados.");
            }
        }
        InicialTela inicialTela = new InicialTela();

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UsuarioTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                inicialTela.setVisible(true);

            }
        });
    }

}
