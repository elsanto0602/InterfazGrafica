/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazgrafica;
import java.awt.*;
import java.util.HashSet;
import javax.swing.*;
import javax.tools.Tool;

/**
 *
 * @author Juan
 */
//para heredar la clase JFrame utilizar extends
public class InterfazGrafica extends JFrame {

 
    public static void main(String[] args) {
        /*al crear objeto de la clase jframe recibe en su constructor
          como parametro un String para el titulo de la ventana
        */
        
        JFrame miVentana = new JFrame("Título Ventana");
        miVentana.setVisible(true);


        /*
           importar java.awt.Toolkit para conocer el tamaño de la pantalla
         */
        int pantallaAlto = Toolkit.getDefaultToolkit().getScreenSize().height;
        int pantallaAncho = Toolkit.getDefaultToolkit().getScreenSize().width;

        int anchoVentana = pantallaAncho/3;
        int altoVentana = pantallaAlto/3;


        //establecer el tamaño
        miVentana.setSize(anchoVentana,altoVentana);

       //miVentana.setLocation(anchoVentana, altoVentana);

        //Envia la ventana al centro de la pantalla si el componente es null
        miVentana.setLocationRelativeTo(null);

        /*numero (EXIT_ON_CLOSE) le dice al metodo como comportarse cuando se produzca
          esa accion 
          el metodo habilita la equis superior para cerrar ventana
        */
        miVentana.setDefaultCloseOperation(EXIT_ON_CLOSE);

        //Lugar donde se va a ubicar la ventana
        //miVentana.setLocation(500,100);
        
        //(LocalizacionX, LocalizacionY, tamañoventanaX, tamañoventanaY)
       // miVentana.setBounds(500, 100, 500, 500);
        
        //Para que las personas no cambien tamaño ventana (false)
        miVentana.setResizable(true);
        
        //Minimo tamaño posible
        //miVentana.setMinimumSize(new Dimension(200, 200));
        
        //Llamar
        miVentana.getContentPane().setBackground(Color.blue);

        //
        Dimension tamano = miVentana.getSize();
        //JOptionPane.showMessageDialog(null, "h " + alto + "w " + ancho);

        //Crear un panel
        JPanel panel = new JPanel();

        panel.setLocation(100, 100);
        panel.setBackground(Color.black);

        //agrega el panel a al ventana
        miVentana.add(panel);

        //Crear etiqueta
        JLabel etiqueta1 = new JLabel();
        JLabel etiqueta2 = new JLabel("Hola 2");
        etiqueta1.setText("Otra forma de pasar\n el texto sin el constructor");
        panel.add(etiqueta1);
        panel.add(etiqueta2);

        etiqueta1.setBackground(Color.cyan);
        etiqueta2.setBackground(Color.green);

        etiqueta1.setForeground(Color.white);

        //cambiar la fuente
        etiqueta1.setFont(new Font("arial", Font.PLAIN, 30));
        etiqueta2.setFont(new Font("Georgia", Font.BOLD, 10));




        //Modificar la opacidad de la etiqueta
        etiqueta1.setOpaque(true);
        etiqueta2.setOpaque(true);

        etiqueta1.setBounds(20, 20, 100, 100);
        etiqueta2.setBounds(20, 20, 100, 100);

        //Añadir una imagen a la etiqueta
        JLabel etiqueta3 = new JLabel(new ImageIcon("images/perro.jpg"));
        //JLabel etiqueta3 = new JLabel();
        //ImageIcon imagen = new ImageIcon();
        //etiqueta3.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(50,50,Image.SCALE_SMOOTH)));
        panel.add(etiqueta3);
        etiqueta3.setBounds(100,100,175,175);



        //añadir etiquetas al panel




    }

}
