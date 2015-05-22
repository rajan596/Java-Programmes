/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RAJAN
 */
import javax.swing.JOptionPane;

public class DialogBox {
    public static void main(String[] args) {
        
        String name=JOptionPane.showInputDialog("Enter your name : ");
        String message=String.format("Hello %s",name);  // formating message
        JOptionPane.showMessageDialog(null, message);  // ( position , message )
    }
}
