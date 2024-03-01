
package com.nobre.caixa.celula;

import com.nobre.caixa.model.ModelPessoa;
import com.raven.table.cell.Cell;

public class CelulaRenderizaNome extends Cell {


    public CelulaRenderizaNome(ModelPessoa nome) {
        initComponents();
        jLnome.setText(nome.toString());
        imagem.setImage(nome.getImagem());
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imagem = new com.nobre.caixa.swing.ImageAvatar();
        jLnome = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(150, 47));

        imagem.setBorderSize(2);
        imagem.setBorderSpace(1);

        jLnome.setForeground(new java.awt.Color(200, 200, 200));
        jLnome.setText("Nome");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(imagem, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jLnome, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLnome, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(imagem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.nobre.caixa.swing.ImageAvatar imagem;
    private javax.swing.JLabel jLnome;
    // End of variables declaration//GEN-END:variables
}
