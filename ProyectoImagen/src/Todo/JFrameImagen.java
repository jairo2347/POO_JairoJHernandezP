/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Todo;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
/**
 *
 * @author chapi
 */
public class JFrameImagen extends JFrame {
    
    public JFrameImagen(Image imagen){
        JLabel etiqueta = new JLabel();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        etiqueta.setIcon(new ImageIcon(imagen));
        setSize(imagen.getWidth(this),imagen.getHeight(this));
        add(etiqueta);
        setVisible(true);
        
    }
    
}
