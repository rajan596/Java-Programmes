/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RAJAN
 */

import javax.swing.JFrame;

public class DrawPanelTest {
    
    public static void main(String[] args) {
        
        DrawPanel panel=new DrawPanel();
        
        JFrame application=new JFrame();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // terminate programme when closed
        application.add(panel);                                       // attach panel
        application.setSize(250,250);
        application.setVisible(true);
    }
    
    
}
