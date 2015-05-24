
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RAJAN
 */


import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;

public class JLabelDemo {
    public static void main(String[] args) {
        
        JLabel label1=new JLabel("Top Label");
        
        ImageIcon labelIcon=new ImageIcon("SSGP2697.jpg");
        JLabel label2=new JLabel(labelIcon);
        
        JLabel label3=new JLabel();
        label3.setText("Label 3 Bottom");
        
        JFrame application=new JFrame();
        application.setVisible(true);
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.setSize(300,300);
        
        application.add(label1,BorderLayout.PAGE_START);
        application.add(label2,BorderLayout.LINE_START);
        application.add(label3,BorderLayout.LINE_END);
    }
    
}
