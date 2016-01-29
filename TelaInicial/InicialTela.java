package TelaInicial;

import Filmes.AddFilmes;
import Filmes.ListaFilmes;
import Filmes.Movie;
import static TelaInicial.Interface.controleListaFilme;
import static TelaInicial.Interface.controleListaUsuario;
import static TelaInicial.Interface.usuariologado;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Collections;
import java.util.Random;
import javax.swing.JOptionPane;

public class InicialTela extends javax.swing.JFrame {

    public String tipoDelist = "T";
    Integer numero = (Integer) controleListaFilme.getFilmes().size();

    public InicialTela() {
        initComponents();
        fechar();
        btnDeslogar.setVisible(false);
        btnFilmesJaVotados.setVisible(false);
        btnDicasDeFilmes.setVisible(false);
        btnInfoUsuario.setVisible(false);
    }

    private void fechar() {

        this.addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent evt) {

                controleListaUsuario.salvarLista();
                controleListaFilme.salvarLista();

            }

        });
    }

    public Integer getNumero() {
        return numero;
    }

    private int sorteio() { //sorteia um numero de acordo com o numero total de filmes

        Random random = new Random();
        int intervalo_randomico = random.nextInt(numero);
        return intervalo_randomico;

    }

    public void ativaDeslogar() {//quando o usuario loga mostra os botoes para ele

        btnDeslogar.setVisible(true);
        btnFilmesJaVotados.setVisible(true);
        btnDicasDeFilmes.setVisible(true);
        btnInfoUsuario.setVisible(true);
    }

    private String addFilme() { 
        String titulo;

        titulo = controleListaFilme.getFilmes().get(sorteio()).getTitulo();
        return titulo;

    }

    public String getTipoDelist() {
        return tipoDelist;
    }

    public void setTipoDelist(String tipoDelist) {
        this.tipoDelist = tipoDelist;
    }


    public void logar() {

        lblLogado.setText("Logado em: " + usuariologado.getLogin());

    }

   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        canvas1 = new java.awt.Canvas();
        jMenu3 = new javax.swing.JMenu();
        btnLogar = new javax.swing.JButton();
        lblLogado = new javax.swing.JLabel();
        btnDeslogar = new javax.swing.JButton();
        btnFilmes = new javax.swing.JButton();
        btnMaisVotados = new javax.swing.JButton();
        btnFilmesJaVotados = new javax.swing.JButton();
        btnAddFilmes = new javax.swing.JButton();
        btnDicasDeFilmes = new javax.swing.JButton();
        btnInfoUsuario = new javax.swing.JButton();

        jMenu3.setText("jMenu3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnLogar.setText("Logar");
        btnLogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogarActionPerformed(evt);
            }
        });

        btnDeslogar.setText("Deslogar");
        btnDeslogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeslogarActionPerformed(evt);
            }
        });

        btnFilmes.setText("Filmes");
        btnFilmes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFilmesActionPerformed(evt);
            }
        });

        btnMaisVotados.setText("Os mais bem votados");
        btnMaisVotados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaisVotadosActionPerformed(evt);
            }
        });

        btnFilmesJaVotados.setText("Filmes Já Votados");
        btnFilmesJaVotados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFilmesJaVotadosActionPerformed(evt);
            }
        });

        btnAddFilmes.setText("Adicionar Filmes");
        btnAddFilmes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddFilmesActionPerformed(evt);
            }
        });

        btnDicasDeFilmes.setText("Dicas De Filmes");
        btnDicasDeFilmes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDicasDeFilmesActionPerformed(evt);
            }
        });

        btnInfoUsuario.setText("Info Usuario");
        btnInfoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(465, 465, 465)
                .addComponent(lblLogado, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnLogar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDeslogar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAddFilmes))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnFilmes, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMaisVotados))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnFilmesJaVotados)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnDicasDeFilmes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnInfoUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLogado, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDeslogar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLogar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAddFilmes, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnMaisVotados, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFilmes, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnFilmesJaVotados, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDicasDeFilmes, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnInfoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogarActionPerformed
        Login login = new Login(this);
        login.setVisible(true);
    }//GEN-LAST:event_btnLogarActionPerformed

    private void btnDeslogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeslogarActionPerformed
        deslogar();
    }//GEN-LAST:event_btnDeslogarActionPerformed

    private void btnFilmesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFilmesActionPerformed
        //mostra a lista de filmes em ordem alfabética
        if (!controleListaFilme.getFilmes().isEmpty()) {
            setTipoDelist("T");
            Collections.sort(controleListaFilme.getFilmes());
            ListaFilmes listafilmes = new ListaFilmes(this);
            listafilmes.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Não ha filmes.Por favor adicione um filme.");
            AddFilmes adicionarfilmes = new AddFilmes(this);
            adicionarfilmes.setVisible(true);
        }
    }//GEN-LAST:event_btnFilmesActionPerformed

    private void btnMaisVotadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaisVotadosActionPerformed
        //arruma a ordem dos filmes pela média
        if (!controleListaFilme.getFilmes().isEmpty()) {
            setTipoDelist("T");
            Collections.sort(controleListaFilme.getFilmes());
            Collections.sort(controleListaFilme.getFilmes(), new Movie());
            ListaFilmes listafilmes = new ListaFilmes(this);
            listafilmes.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Não a filmes.Porfavor adicione um filme.");
            AddFilmes adicionarfilmes = new AddFilmes(this);
            adicionarfilmes.setVisible(true);
        }
    }//GEN-LAST:event_btnMaisVotadosActionPerformed

    private void btnFilmesJaVotadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFilmesJaVotadosActionPerformed
        //mostra os filmes que o usuario ja votou
        if (!controleListaUsuario.usuarioLogado().filmesVotados.isEmpty()) {
            setTipoDelist("U");
            Collections.sort(controleListaUsuario.usuarioLogado().filmesVotados);
            ListaFilmes listafilmes = new ListaFilmes(this);
            listafilmes.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Você não votou em nenhum filme.");
        }
    }//GEN-LAST:event_btnFilmesJaVotadosActionPerformed

    private void btnAddFilmesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddFilmesActionPerformed
        
        AddFilmes adicionarfilmes = new AddFilmes(this);
        adicionarfilmes.setVisible(true);

    }//GEN-LAST:event_btnAddFilmesActionPerformed

    private void btnDicasDeFilmesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDicasDeFilmesActionPerformed
        // sugere filmes baseados na categoria dos filmes que voce já votou
        if (!controleListaUsuario.usuarioLogado().filmesVotados.isEmpty()) {
            setTipoDelist("D");
            Collections.sort(controleListaUsuario.usuarioLogado().filmesVotados);
            ListaFilmes listafilmes = new ListaFilmes(this);
            listafilmes.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Por favor vote em um filmes para podemos dar dicas");
        }
    }//GEN-LAST:event_btnDicasDeFilmesActionPerformed

    private void btnInfoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoUsuarioActionPerformed
        InfoUsuario infousuario = new InfoUsuario();
        infousuario.setVisible(true);
    }//GEN-LAST:event_btnInfoUsuarioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddFilmes;
    private javax.swing.JButton btnDeslogar;
    private javax.swing.JButton btnDicasDeFilmes;
    private javax.swing.JButton btnFilmes;
    private javax.swing.JButton btnFilmesJaVotados;
    private javax.swing.JButton btnInfoUsuario;
    private javax.swing.JButton btnLogar;
    private javax.swing.JButton btnMaisVotados;
    private java.awt.Canvas canvas1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JLabel lblLogado;
    // End of variables declaration//GEN-END:variables

  public  void deslogar() {
      //desativa os buttons que aparecem quando loga.
        lblLogado.setText("");
        usuariologado.setLogin(null);
        btnDeslogar.setVisible(false);
        btnFilmesJaVotados.setVisible(false);
        btnInfoUsuario.setVisible(false);
        btnDicasDeFilmes.setVisible(false);
    }
}
