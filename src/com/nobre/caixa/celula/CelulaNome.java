package com.nobre.caixa.celula;

import com.nobre.caixa.model.ModelEquipe;
import com.nobre.caixa.model.ModelPessoa;
import com.raven.table.TableCustom;
import com.raven.table.cell.TableCustomCell;
import com.raven.table.model.TableRowData;
import java.awt.Component;

public class CelulaNome extends TableCustomCell {

    private String caminhoImagem;

    public CelulaNome() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextPrimeiroNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextSegundoNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        imagem = new com.nobre.caixa.swing.ImageAvatar();
        jButtonSalvar = new javax.swing.JButton();

        jLabel1.setText("Primeiro Nome");

        jTextPrimeiroNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextPrimeiroNomeActionPerformed(evt);
            }
        });

        jLabel2.setText("Segundo Nome");

        jTextSegundoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextSegundoNomeActionPerformed(evt);
            }
        });

        jLabel3.setText("Perfil:");

        imagem.setBorderSize(2);
        imagem.setBorderSpace(1);

        jButtonSalvar.setText("Salvar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextSegundoNome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                            .addComponent(jTextPrimeiroNome, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(imagem, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonSalvar)))
                .addGap(0, 15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextPrimeiroNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextSegundoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(imagem, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addComponent(jButtonSalvar))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextPrimeiroNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextPrimeiroNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextPrimeiroNomeActionPerformed

    private void jTextSegundoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextSegundoNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextSegundoNomeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.nobre.caixa.swing.ImageAvatar imagem;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextPrimeiroNome;
    private javax.swing.JTextField jTextSegundoNome;
    // End of variables declaration//GEN-END:variables

    @Override
    public void setData(Object o) {
        if (o != null) {
            ModelPessoa pessoa = (ModelPessoa) o;
            jTextPrimeiroNome.setText(pessoa.getPrimeiroNome());
            jTextSegundoNome.setText(pessoa.getSegundoNome());
            imagem.setImage(pessoa.getImagem());
            caminhoImagem = pessoa.getCaminho();
        }
    }

    @Override
    public Object getData() {
        String primeirNome = jTextPrimeiroNome.getText().trim();
        String segundoNome = jTextSegundoNome.getText().trim();

        return new ModelPessoa(primeirNome, segundoNome, imagem.getImage(), caminhoImagem);
    }

    @Override
    public TableCustomCell createComponentCellEditor(TableCustom tc, TableRowData trd, Object o, int i, int i1) {
        CelulaNome cell = new CelulaNome();
        cell.setData(o);
        return cell;
    }

    @Override
    public Component createComponentCellRender(TableCustom table, TableRowData data, int row, int column) {
        ModelEquipe equipe = (ModelEquipe) data;
        return new CelulaRenderizaNome(equipe.getNome());
    }

}
