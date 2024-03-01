package com.nobre.caixa.form;

import com.nobre.caixa.celula.CelulaNome;
import com.nobre.caixa.grafico.GraficoModelo;
import com.nobre.caixa.model.ModelEquipe;
import com.nobre.caixa.model.ModelPessoa;
import java.awt.Color;
import javax.swing.ImageIcon;

public class FormPrincipal extends javax.swing.JPanel {

    public FormPrincipal() {
        initComponents();
        setOpaque(false);
        tabela1.addEstilo(rolagem);
        init();
        initTabela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelRedondo1 = new com.nobre.caixa.swing.PainelRedondo();
        grafico = new com.nobre.caixa.grafico.CurveChart();
        painelRedondo2 = new com.nobre.caixa.swing.PainelRedondo();
        rolagem = new javax.swing.JScrollPane();
        tabela1 = new com.nobre.caixa.swing.Tabela();

        painelRedondo1.setBackground(new java.awt.Color(60, 60, 60));

        javax.swing.GroupLayout painelRedondo1Layout = new javax.swing.GroupLayout(painelRedondo1);
        painelRedondo1.setLayout(painelRedondo1Layout);
        painelRedondo1Layout.setHorizontalGroup(
            painelRedondo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelRedondo1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(grafico, javax.swing.GroupLayout.DEFAULT_SIZE, 1091, Short.MAX_VALUE)
                .addContainerGap())
        );
        painelRedondo1Layout.setVerticalGroup(
            painelRedondo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelRedondo1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(grafico, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                .addContainerGap())
        );

        painelRedondo2.setBackground(new java.awt.Color(60, 60, 60));

        tabela1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Telefone", "Email", "DRT"
            }
        ));
        tabela1.setToolTipText("");
        tabela1.getTableHeader().setReorderingAllowed(false);
        rolagem.setViewportView(tabela1);
        if (tabela1.getColumnModel().getColumnCount() > 0) {
            tabela1.getColumnModel().getColumn(0).setResizable(false);
            tabela1.getColumnModel().getColumn(0).setPreferredWidth(200);
            tabela1.getColumnModel().getColumn(1).setResizable(false);
            tabela1.getColumnModel().getColumn(2).setResizable(false);
            tabela1.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout painelRedondo2Layout = new javax.swing.GroupLayout(painelRedondo2);
        painelRedondo2.setLayout(painelRedondo2Layout);
        painelRedondo2Layout.setHorizontalGroup(
            painelRedondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelRedondo2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rolagem)
                .addContainerGap())
        );
        painelRedondo2Layout.setVerticalGroup(
            painelRedondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelRedondo2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rolagem, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(painelRedondo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelRedondo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painelRedondo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelRedondo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.nobre.caixa.grafico.CurveChart grafico;
    private com.nobre.caixa.swing.PainelRedondo painelRedondo1;
    private com.nobre.caixa.swing.PainelRedondo painelRedondo2;
    private javax.swing.JScrollPane rolagem;
    private com.nobre.caixa.swing.Tabela tabela1;
    // End of variables declaration//GEN-END:variables

    private void init() {
        grafico.addLegend("Renda", new Color(12, 84, 175), new Color(0, 108, 247));
        grafico.addLegend("Despesa", new Color(54, 4, 143), new Color(104, 49, 200));
        grafico.addLegend("Lucro", new Color(5, 125, 0), new Color(95, 209, 69));
        grafico.addLegend("Custo", new Color(186, 37, 37), new Color(241, 100, 120));
        grafico.addData(new GraficoModelo("Jan", new double[]{500, 200, 80, 89}));
        grafico.addData(new GraficoModelo("Fev", new double[]{2000, 750, 90, 150}));
        grafico.addData(new GraficoModelo("Mar", new double[]{200, 350, 460, 900}));
        grafico.addData(new GraficoModelo("Abr", new double[]{480, 150, 750, 700}));
        grafico.addData(new GraficoModelo("Mai", new double[]{350, 540, 300, 150}));
        grafico.addData(new GraficoModelo("Jun", new double[]{190, 280, 81, 200}));
        grafico.start();
    }

    private void initTabela() {
        tabela1.addTableCell(new CelulaNome(), 0);
        ImageIcon img = new ImageIcon(getClass().getResource("/com/nobre/caixa/icon/profile.jpg"));
        ModelPessoa pessoa = new ModelPessoa("Jonh", "Pablo", img, "");
        ModelEquipe equipe = new ModelEquipe(pessoa, "Masculino", 18, "jp@gmail", "99 99999");
        tabela1.addRow(equipe, false);
        tabela1.addRow(equipe, false);
        tabela1.addRow(equipe, false);
        tabela1.addRow(equipe, false);
       // tabela1.editRowAt(3);

    }

}
