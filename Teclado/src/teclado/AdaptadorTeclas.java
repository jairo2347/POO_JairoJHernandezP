/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teclado;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;

/**
 *
 * @author CRUZLEIJA
 */
public class  AdaptadorTeclas implements KeyListener{

    @Override
    public void keyTyped(KeyEvent e) {
        JButton aux = (JButton)e.getSource();
         String a = e.getKeyChar()+"";
         if(a.equals("q")){
            aux.setBackground(Color.red);
         }
        
       // System.out.println("KeyTyped "+e.getKeyChar());
    }

    @Override
    public void keyPressed(KeyEvent e) {
       JButton aux = (JButton)e.getSource();
         String a = e.getKeyChar()+"";
         if(a.equals("g")){
         aux.setBackground(Color.red);
         }
        //System.out.println("KeyPressed "+e.getKeyChar());
    }

    @Override
    public void keyReleased(KeyEvent e) {
        JButton aux = (JButton)e.getSource();
         String a = e.getKeyChar()+"";
         if(a.equals("g")){
         aux.setBackground(Color.white);
         }
        //System.out.println("KeyReleased "+e.getKeyChar());
    }
}
 
