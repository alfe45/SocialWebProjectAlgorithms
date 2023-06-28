package GUI;

import Domain.SocialWebCore;
import java.io.IOException;

import org.jdom.JDOMException;

public class JFWindow extends javax.swing.JFrame {
    
    public static SocialWebCore socialWebCore;
    
    public JFWindow() throws JDOMException, IOException, CloneNotSupportedException {
        initComponents();
        this.socialWebCore = new SocialWebCore();
        this.setSize(800,600);
        this.add(new JPLogin(this)); //se añade el login
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}