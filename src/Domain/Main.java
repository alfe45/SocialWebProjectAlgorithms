package Domain;

import GUI.JFWindow;
import GUI.JPLogin;
import javax.swing.JFrame;

/*
    PROYECT NAME: 
    C22910 ALEXANDER FERNANDEZ D.
    C25736 KENNETH OSHIMA RODRIGUEZ
    ID NAME

 */
public class Main {

    public static void main(String[] args) {
        JFWindow jFWindow = new JFWindow();

        JFrame ventana = new JFrame();
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setBounds(450, 100, 800, 600);
        ventana.add(new JPLogin());
        ventana.pack();
        ventana.setVisible(true);

    }//main

}//class
