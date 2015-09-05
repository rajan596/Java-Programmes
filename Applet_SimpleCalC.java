/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package applet_simplecalc;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author RAJAN
 */
public class Applet_SimpleCalC extends Applet implements ActionListener{
    
    Label l1, l2,result;
    TextField tf1,tf2;
    Button bSum,bMul;
    
    
    @Override
    public void init() {
        l1=new Label("No 1 ");
        l2=new Label("No 2 ");
        result=new Label("Simple Calculator");
        
        tf1=new TextField(5);
        tf2=new TextField(5);
        
        bSum=new Button("SUM");
        bMul=new Button("MUL");
        bSum.addActionListener(this);
        bMul.addActionListener(this);
        
        add(l1);
        add(tf1);
        add(l2);
        add(tf2);
        add(bSum);
        add(bMul);
        add(result);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int no1=Integer.parseInt(tf1.getText());
        int no2=Integer.parseInt(tf2.getText());
        
        if(e.getSource().equals(bSum)) {
            int ans=no1+no2;
            result.setText("SUM : " + no1 + " + " + no2 +" : " + ans );
        } else {
            int ans=no1*no2;
            result.setText("MUL : " + no1 + " * " + no2 +" : " + ans );
        }
    }
    
}
