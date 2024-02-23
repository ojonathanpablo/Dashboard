package com.nobre.caixa.swing;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Area;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class MenuBotao extends JButton {

    private float animacao;
    private int index;

    public MenuBotao(int index) {
        this.index = index;
        setContentAreaFilled(false);
        setForeground(new Color(189, 189, 189));
        setCursor(new Cursor(Cursor.HAND_CURSOR));
        setHorizontalAlignment(SwingConstants.LEFT);
        setBackground(new Color(65, 65, 65));
        setBorder(new EmptyBorder(8, 20, 8, 15));

    }

    @Override
    public void paint(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        double largura = getWidth();
        double altura = getHeight();
        double x = animacao * largura - altura;
        Area area = new Area(new RoundRectangle2D.Double(x, 0, largura, altura, altura, altura));
        area.add(new Area(new Rectangle2D.Double(x, 0, altura, altura)));
        g2.setColor(getBackground());
        g2.fill(area);
        g2.dispose();
        super.paint(grphcs);
    }

    public float getAnimacao() {
        return animacao;
    }

    public void setAnimacao(float animacao) {
        this.animacao = animacao;
        repaint();
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

}
