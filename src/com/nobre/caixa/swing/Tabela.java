package com.nobre.caixa.swing;

import com.nobre.caixa.scroll.BarraDeRolagemPersonalizada;
import com.raven.table.TableCustom;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author User
 */
public class Tabela extends TableCustom {

    public void addEstilo(JScrollPane rolagem) {
        rolagem.getViewport().setOpaque(false);
        rolagem.setViewportBorder(null);
        setBorder(null);
        rolagem.setBorder(null);
        rolagem.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        rolagem.setVerticalScrollBar(new BarraDeRolagemPersonalizada());
        JPanel painel = new JPanel();
        painel.setBackground(new Color(60, 60, 60));
        setForeground(new Color(214, 214, 214));
        setSelectionForeground(new Color(214, 214, 214));
        setSelectionBackground(new Color(50, 50, 50));
        getTableHeader().setDefaultRenderer(new CabecalhoPersonalizado());
        setRowHeight(47);
        setShowHorizontalLines(true);
        setGridColor(new Color(50, 50, 50));

        rolagem.setCorner(JScrollPane.UPPER_RIGHT_CORNER, painel);

    }

    @Override
    public Component prepareRenderer(TableCellRenderer renderer, int row, int column) {
        Component com = super.prepareRenderer(renderer, row, column);
        if (!isCellSelected(row, column)) {
            if (row % 2 == 0) {
                com.setBackground(new Color(60,60,60));
            }else {
                com.setBackground(new Color(136,136,136));
            }
        }
        return com;
    }

}
