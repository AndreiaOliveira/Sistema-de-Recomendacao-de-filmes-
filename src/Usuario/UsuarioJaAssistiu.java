package Usuario;

import Filmes.Movie;
import Filmes.NotaFilme;
import Filmes.InfoFilme;
import TelaInicial.Interface;
import static TelaInicial.Interface.controleListaFilme;
import javax.swing.DefaultListModel;

public class UsuarioJaAssistiu extends javax.swing.JFrame implements Interface {

    private InfoFilme infofilme;

    public UsuarioJaAssistiu(InfoFilme infofilme) {
        this.infofilme = infofilme;
        initComponents();
        crialista();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        listausuario = new javax.swing.JList();

        jScrollPane1.setViewportView(listausuario);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList listausuario;
    // End of variables declaration//GEN-END:variables

    private void crialista() {

        DefaultListModel lista = new DefaultListModel();

        for (Movie filme : controleListaFilme.getFilmes()) {

            if (infofilme.getTitulofilme().equals(filme.getTitulo())) {

                for (NotaFilme notaFilme1 : filme.getNotaFilme()) {

                    lista.addElement(notaFilme1.getUsuario());
                }
            }
        }

        listausuario.setModel(lista);

    }
}
