package com.nobre.caixa.swing;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JLabel;

public class LabelSeparador extends JLabel {

    private boolean gradiente;

    @Override
    public void paint(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.3f));
        if (gradiente) {
            g2.setPaint(new GradientPaint(0, 0, new Color(115, 115, 115), getWidth(), 0, new Color(115, 115, 115)));
        } else {
            g2.setColor(new Color(115, 115, 115));
        }
        g2.drawLine(0, getHeight() / 2, getWidth(), getHeight() / 2);
        g2.dispose();
        super.paint(grphcs);
    }

    public boolean isGradiente() {
        return gradiente;
    }

    public void setGradiente(boolean gradiente) {
        this.gradiente = gradiente;
    }

}
