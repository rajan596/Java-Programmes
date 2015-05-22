/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RAJAN
 */

import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawPanel extends JPanel{
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        int width=getWidth();
        int height=getHeight();
        
        g.drawOval(0, 0, width, height);
        g.fillOval(0,0,50,50);
        
        
    }
}
