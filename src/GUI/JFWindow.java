
package GUI;

import Business.UserBusiness;
import Domain.UserSesion;
import java.io.IOException;

import org.jdom.JDOMException;

public class JFWindow extends javax.swing.JFrame {

    public static UserBusiness userBusiness;
    protected static UserSesion userSesion;

    public JFWindow() throws JDOMException, IOException, CloneNotSupportedException {
        initComponents();
        JFWindow.userBusiness = new UserBusiness();
        JFWindow.userSesion = new UserSesion();
        this.setSize(800,600);
        this.add(new JPLogin(this));
        
//        this.pack();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
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
