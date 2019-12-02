/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teclado;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author chapi
 */

public class JFrameTeclado extends JFrame{
    public JFrameTeclado (){
    
    JButton btnq = new JButton("Q");
    JButton btnw = new JButton("W");
    JButton btne = new JButton("E");
    JButton btnr = new JButton("R");
    JButton btnt = new JButton("T");
    JButton btny = new JButton("Y");
    JButton btnu = new JButton("U");
    JButton btni = new JButton("I");
    JButton btno = new JButton("O");
    JButton btnp = new JButton("P");
    JButton btna = new JButton("A");
    JButton btns = new JButton("S");
    JButton btnd = new JButton("D");
    JButton btnf = new JButton("F");
    JButton btng = new JButton("G");
    JButton btnh = new JButton("H");
    JButton btnj = new JButton("J");
    JButton btnk = new JButton("K");
    JButton btnl = new JButton("L");
    JButton btnñ = new JButton("Ñ");
    JButton btnz = new JButton("Z");
    JButton btnx = new JButton("X");
    JButton btnc = new JButton("C");
    JButton btnv = new JButton("V");
    JButton btnb = new JButton("B");
    JButton btnn = new JButton("N");
    JButton btnm = new JButton("M");
    JButton btn1 = new JButton("1");
    JButton btn2 = new JButton("2");
    JButton btn3 = new JButton("3");
    JButton btn4 = new JButton("4");
    JButton btn5 = new JButton("5");
    JButton btn6 = new JButton("6");
    JButton btn7 = new JButton("7");
    JButton btn8 = new JButton("8");
    JButton btn9 = new JButton("9");
    JButton btn0 = new JButton("0");
    JButton btnARRIBA = new JButton("⬆");
    JButton btnABAJO = new JButton("⬇");
    JButton btnDERECHA = new JButton("→");
    JButton btnIZQUIERDA = new JButton("←");
    
    JPanel panelteclas = new JPanel(new GridLayout(3,5));
    JPanel panelnumeros = new JPanel(new GridLayout(2,4));
    JPanel panelflechas = new JPanel(new GridLayout(2,4));
    
    panelteclas.add(btnq);
    panelteclas.add(btnw);
    panelteclas.add(btne);
    panelteclas.add(btnr);
    panelteclas.add(btnt);
    panelteclas.add(btny);
    panelteclas.add(btnu);
    panelteclas.add(btni);
    panelteclas.add(btno);
    panelteclas.add(btnp);
    panelteclas.add(btna);
    panelteclas.add(btns);
    panelteclas.add(btnd);
    panelteclas.add(btnf);
    panelteclas.add(btng);
    panelteclas.add(btnh);
    panelteclas.add(btnj);
    panelteclas.add(btnk);
    panelteclas.add(btnl);
    panelteclas.add(btnñ);
    panelteclas.add(btnz);
    panelteclas.add(btnx);
    panelteclas.add(btnc);
    panelteclas.add(btnv);
    panelteclas.add(btnb);
    panelteclas.add(btnn);
    panelteclas.add(btnm);
    panelteclas.add(btn1);
    panelteclas.add(btn2);
    panelteclas.add(btn3);
    panelteclas.add(btn4);
    panelteclas.add(btn5);
    panelteclas.add(btn6);
    panelteclas.add(btn7);
    panelteclas.add(btn8);
    panelteclas.add(btn9);
    panelteclas.add(btn0);
    panelteclas.add(btnARRIBA);
    panelteclas.add(btnABAJO);
    panelteclas.add(btnDERECHA);
    panelteclas.add(btnIZQUIERDA);
    
    
        setLayout(new BorderLayout());
        add(panelteclas,BorderLayout.CENTER);
        add(panelnumeros,BorderLayout.NORTH);
        add(panelflechas,BorderLayout.EAST);  
}
    
}
