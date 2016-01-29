package Filmes;

import TelaInicial.Interface;
import TelaInicial.Login;
import Usuario.UsuarioJaAssistiu;
import static TelaInicial.Interface.usuariologado;
import Usuario.Usuario;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;

public class InfoFilme extends javax.swing.JFrame implements Interface {

    public ListaFilmes listadefilmes;
    public String titulofilme;

    public InfoFilme(ListaFilmes listafilmes) {
        initComponents();
        this.listadefilmes = listafilmes;
        fechar();
        lblTitulo.setText("Titulo: " + listadefilmes.getNomeFilmeSelect());
        this.titulofilme = listadefilmes.getNomeFilmeSelect();
        lblGenero.setText("Categoria: " + listadefilmes.getGenero());
        lblAno.setText("Ano: " + listadefilmes.getAnoFilme());
        lblMedia.setText("Media: " + listadefilmes.getMedia());
    }

    public String getTitulofilme() {
        return titulofilme;
    }

    public void setTitulofilme(String titulofilme) {
        this.titulofilme = titulofilme;
    }

    private void fechar() {

        this.addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent evt) {

                listadefilmes.setInfoVisivel(true);
                listadefilmes.setVisible(true);

            }

        });

    }

    private boolean seTemFilme() {

        for (Movie filme : controleListaUsuario.usuarioLogado().filmesVotados) {
            if (filme.getTitulo().toLowerCase().equals(listadefilmes.getNomeFilmeSelect().toLowerCase())) {
                return true;

            }
        }
        return false;
    }

    private void usuarioVoto() {//para settar que o usuario ja votou

        for (Usuario usuario : controleListaUsuario.getUsuariosCadastrados()) {
            if (usuario.getNome().equals(usuariologado.getLogin())) {
                usuario.setJavoto(true);
                break;
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        lblAno = new javax.swing.JLabel();
        lblMedia = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBoxNota = new javax.swing.JComboBox();
        btnOkNota = new javax.swing.JButton();
        lblGenero = new javax.swing.JLabel();
        btnUsuarioJaAssistio = new javax.swing.JButton();

        lblTitulo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblTitulo.setText("Titulo");

        lblAno.setText("Ano: ");

        lblMedia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblMedia.setText("Média:");

        jLabel5.setText("De sua nota:");

        jComboBoxNota.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5" }));

        btnOkNota.setText("OK");
        btnOkNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkNotaActionPerformed(evt);
            }
        });

        lblGenero.setText("Genero: ");

        btnUsuarioJaAssistio.setText("Usuarios qua ja assistiram");
        btnUsuarioJaAssistio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuarioJaAssistioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMedia, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAno, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 117, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnUsuarioJaAssistio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxNota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnOkNota, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(lblGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblAno, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(lblMedia, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBoxNota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnOkNota))
                    .addComponent(btnUsuarioJaAssistio))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnOkNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkNotaActionPerformed
        //ao clicar calcula a media do filme, se o filme nao estiver na lista
        //de filmes que ele ja votou, adiciona.
        if (usuariologado.logado()) {
            for (Movie filme : controleListaFilme.getFilmes()) {

                if (filme.getTitulo().equals(listadefilmes.getNomeFilmeSelect())) {
                    try {
                        if (filme.jaContemNaLista()) {
                            for (NotaFilme notaFilme : filme.getNotaFilme()) {
                                if (notaFilme.getUsuario().equals(usuariologado.getLogin())) {
                                    notaFilme.setNota(parseInt(jComboBoxNota.getSelectedItem().toString()));
                                    filme.fazerMedia();
                                    usuarioVoto();
                                }
                            }
                        } else {
                            NotaFilme nota = new NotaFilme(usuariologado.getLogin(), parseInt(jComboBoxNota.getSelectedItem().toString()));
                            filme.getNotaFilme().add(nota);
                            filme.fazerMedia();
                            usuarioVoto();
                        }

                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Não foi possivel votar no filme.");
                    }
                    this.setVisible(false);
                    break;
                }
            }
            if (!seTemFilme()) {
                for (Movie movie : controleListaFilme.getFilmes()) {
                    if (movie.getTitulo().equals(listadefilmes.getNomeFilmeSelect())) {
                        controleListaUsuario.usuarioLogado().filmesVotados.add(movie);
                        break;
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Precisa estar logado para poder votar em um filme.");
            Login login = new Login(listadefilmes.getInicialtela());
            login.setVisible(true);
        }
    }//GEN-LAST:event_btnOkNotaActionPerformed

    private void btnUsuarioJaAssistioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuarioJaAssistioActionPerformed
        
        for (Movie filme : controleListaFilme.getFilmes()) {

            if (getTitulofilme().equals(filme.getTitulo())) {
                if (filme.getNotaFilme().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Nenhum usuário votou neste filme.\n" + getTitulofilme());
                    break;
                } else {
                    UsuarioJaAssistiu usuarioJaAssistiu = new UsuarioJaAssistiu(this);
                    usuarioJaAssistiu.setVisible(true);
                    break;
                }
            }
        }


    }//GEN-LAST:event_btnUsuarioJaAssistioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOkNota;
    private javax.swing.JButton btnUsuarioJaAssistio;
    private javax.swing.JComboBox jComboBoxNota;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblAno;
    private javax.swing.JLabel lblGenero;
    private javax.swing.JLabel lblMedia;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
