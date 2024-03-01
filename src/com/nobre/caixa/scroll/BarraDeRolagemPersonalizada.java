package com.nobre.caixa.scroll;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JScrollBar;

public class BarraDeRolagemPersonalizada extends JScrollBar {

    public BarraDeRolagemPersonalizada() {
        setUI(new RolagemModerna());
        setPreferredSize(new Dimension(10,10));
        setForeground(new Color(63, 109, 217, 100));
        setOpaque(false);
    }

}
