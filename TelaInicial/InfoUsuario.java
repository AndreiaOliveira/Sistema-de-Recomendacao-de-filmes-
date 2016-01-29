
package TelaInicial;

import Usuario.Usuario;

public class InfoUsuario extends javax.swing.JFrame implements Interface {

  
    public InfoUsuario() {
        initComponents();
        infoUsuarioLogado();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelNome = new javax.swing.JLabel();
        labelIdade = new javax.swing.JLabel();
        labelOcupacao = new javax.swing.JLabel();
        labelGenero = new javax.swing.JLabel();
        labelCEP = new javax.swing.JLabel();

        labelNome.setText("Nome");

        labelIdade.setText("Idade");

        labelOcupacao.setText("Ocupação");

        labelGenero.setText("Genero");

        labelCEP.setText("CEP");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelCEP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelOcupacao, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                    .addComponent(labelGenero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelIdade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelNome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(labelNome, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelOcupacao, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    
    public void infoUsuarioLogado(){//pega as informaçoes do usuario logado
    for (Usuario a : controleListaUsuario.getUsuariosCadastrados()) {
        if(a.getNome().equals(usuariologado.getLogin())){
            labelNome.setText("Nome: "+a.getNome());
            labelIdade.setText("Idade: " +Integer.toString(a.getIdade()));
            labelGenero.setText("Genero: "+a.getGenero().toString());
            labelOcupacao.setText("Ocupação: "+a.getOcupacao());
            labelCEP.setText("CEP: "+a.getCEP());
        }
    }
}
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel labelCEP;
    private javax.swing.JLabel labelGenero;
    private javax.swing.JLabel labelIdade;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelOcupacao;
    // End of variables declaration//GEN-END:variables
}
