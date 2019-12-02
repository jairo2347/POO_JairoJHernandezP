/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficas;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;


/**
 *
 * @author chapi
 */
public class Window {
   
public class Grafica extends JFrame {
     
    
    JFreeChart Grafica;
    DefaultCategoryDataset Datos = new DefaultCategoryDataset();
    
    
    //investigar funcionamiento de la el recurso jfreechart    SI
    //tipos de graficas                                        SI
    //como agregar series de graficas                          SI
    //como agregar colecciones de series
    //como crear frame con la grafica incluida 
    //escribir en un documento de texto 
    //como funciona el componente jslide(construye, listener)
    
  public void agregarSerie(){
      Datos.addValue(1, "Negocio 1", "GluGLunes");
      Datos.addValue(2, "Negocio 1", "MaMartes");
      Datos.addValue(3, "Negocio 1", "Miercolitros");
      Datos.addValue(4, "Negocio 1", "Juevebes");
      Datos.addValue(5, "Negocio 1", "BeViernes");
      Datos.addValue(6, "Negocio 1", "Sabadrink");
      Datos.addValue(7, "Negocio 1", "CruDomingo");
      
      
      Grafica = ChartFactory.createBarChart("Visitas diarias", "Días", "Visitas", Datos, PlotOrientation.HORIZONTAL, true, true, false);
        
      
  }
    
    public void crearYmostrarGrafica(){
    
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt){
        
         ChartPanel Panel = new ChartPanel(Grafica);
        JFrame Ventana = new JFrame("JFreeChart");
        Ventana.getContentPane().add(Panel);
        Ventana.pack();
        Ventana.setVisible(true);
        Ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    } 
    
}

}


