/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slider;
import javax.swing.event.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JSlider;
import javax.swing.JFrame;
/**
 *
 * @author chapi
 */
public class JSlider {

public static void main(String[] args) {
//código
JFrame ventana = new JFrame("siiii");
ventana.setSize(400, 400);
JPanel panel = new JPanel();

//Crearemos nuestro JSlider a continuación, cada línea con una breve descripción, luego se explicara con más //detalles
slider = new JSlider(JSlider.VERTICAL, 0, 100, 25); /*(posición vertical, comienza, termina, donde comienza al iniciar programa)*/
slider.setInverted(false); //se invierte el relleno del JSlider (desde donde comienza)
slider.setPaintTicks(true); //las rayitas que marcan los números
slider.setMajorTickSpacing(25); // de cuanto en cuanto los números en el slider
slider.setMinorTickSpacing(5); //las rayitas de cuanto en cuanto
slider.setPaintLabels(true); //si se ve los números del slider
slider.addChangeListener(new MiAccion()); //Agrega un escuchador al slider creado, lo cual se usara luego 

/*Ahora, aunque no pertenece a la clase JSlider, crearemos un JLabel en el cuál se mostrara el numero en el cual se encuentre el slider en ese momento*/

label = new JLabel("LEts Go!!°"); /*Crea un JLabel el cual muestra el numero en el que esta el JSlider y de inicia con la frase LEts Go!!° */
}

}