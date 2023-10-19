package igu;

import entidades.Usuario;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import persistencia.ControlAcceso;

public class MenuLogin extends javax.swing.JInternalFrame {

    private ControlAcceso controlacceso;

    private int intentos = 0;

    public MenuLogin(ControlAcceso controlAcceso) {
        this.controlacceso = controlAcceso;
        initComponents();
        QuitarLaBarraTitulo();

    }
    //defino dos métodosdentro del JInternalFrame y lo instanciamos de la siguiente manera.
    private JComponent Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).getNorthPane();
    private Dimension DimensionBarra = null;
//A continuación creamos una función dentro del mismo JInternalFrame como el ejemplo siguiente:

    public void QuitarLaBarraTitulo() {
        Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).getNorthPane();
        DimensionBarra = Barra.getPreferredSize();
        Barra.setSize(0, 0);
        Barra.setPreferredSize(new Dimension(0, 0));
        repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        logo2 = new javax.swing.JLabel();
        jTmail = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jTpwd = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        loginBtn = new javax.swing.JPanel();
        loginBtnTxt = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setBorder(null);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);

        bg.setBackground(new java.awt.Color(51, 51, 51));
        bg.setEnabled(false);
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoceleste.png"))); // NOI18N
        bg.add(logo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 200, 220));

        jTmail.setBackground(new java.awt.Color(51, 51, 51));
        jTmail.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jTmail.setForeground(new java.awt.Color(255, 255, 255));
        jTmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTmail.setText("sgfesta@gmail.com");
        jTmail.setBorder(null);
        jTmail.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jTmail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTmailMousePressed(evt);
            }
        });
        bg.add(jTmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, 290, 30));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        bg.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 400, 290, 20));

        jTpwd.setBackground(new java.awt.Color(51, 51, 51));
        jTpwd.setForeground(new java.awt.Color(255, 255, 255));
        jTpwd.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTpwd.setText("loquito");
        jTpwd.setBorder(null);
        jTpwd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTpwdMousePressed(evt);
            }
        });
        bg.add(jTpwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 430, 290, 30));

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        bg.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 460, 290, 20));

        loginBtn.setBackground(new java.awt.Color(51, 51, 51));
        loginBtn.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), null));
        loginBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginBtnMouseClicked(evt);
            }
        });

        loginBtnTxt.setBackground(new java.awt.Color(255, 255, 255));
        loginBtnTxt.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        loginBtnTxt.setForeground(new java.awt.Color(255, 255, 255));
        loginBtnTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginBtnTxt.setText("INGRESAR");
        loginBtnTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginBtnTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginBtnTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginBtnTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginBtnTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout loginBtnLayout = new javax.swing.GroupLayout(loginBtn);
        loginBtn.setLayout(loginBtnLayout);
        loginBtnLayout.setHorizontalGroup(
            loginBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginBtnLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(loginBtnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        loginBtnLayout.setVerticalGroup(
            loginBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginBtnLayout.createSequentialGroup()
                .addComponent(loginBtnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        bg.add(loginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 500, 130, 40));

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("GRUPO 13");
        bg.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, 90, -1));

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("INMOBILIARIA");
        bg.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, 130, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 777, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 638, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginBtnTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnTxtMouseExited
        loginBtn.setBackground(new Color(51, 51, 51));
    }//GEN-LAST:event_loginBtnTxtMouseExited

    private void loginBtnTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnTxtMouseEntered
        loginBtn.setBackground(new Color(102, 102, 102));
    }//GEN-LAST:event_loginBtnTxtMouseEntered

    private void loginBtnTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnTxtMouseClicked
        loguear();
        //javax.swing.JOptionPane.showMessageDialog(this, "Intento de login con los datos:\nUsuario: " + jTmail.getText() + "\nContraseña: " + String.valueOf(jTpwd.getPassword()), "LOGIN", javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_loginBtnTxtMouseClicked

    private void jTpwdMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTpwdMousePressed
        if (String.valueOf(jTpwd.getPassword()).equals("********")) {
            jTpwd.setText("");
            jTpwd.setForeground(Color.white);
        }
        if (jTmail.getText().isEmpty()) {
            jTmail.setText("Ingrese nombre de usuaio");
            jTmail.setForeground(Color.white);
        }
    }//GEN-LAST:event_jTpwdMousePressed

    private void jTmailMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTmailMousePressed
        if (jTmail.getText().equals("Ingrese nombre de usuario")) {
            jTmail.setText("");
            jTmail.setForeground(Color.white);
        }
        if (String.valueOf(jTpwd.getPassword()).isEmpty()) {
            jTpwd.setText("********");

            jTpwd.setForeground(Color.white);
        }
       

    }//GEN-LAST:event_jTmailMousePressed

    private void loginBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnMouseClicked
        loguear();
    }//GEN-LAST:event_loginBtnMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTmail;
    private javax.swing.JPasswordField jTpwd;
    private javax.swing.JPanel loginBtn;
    private javax.swing.JLabel loginBtnTxt;
    private javax.swing.JLabel logo2;
    // End of variables declaration//GEN-END:variables

  private void loguear(){
  if (intentos < 3) { // Comprobar si se han realizado menos de 3 intentos
            String email = jTmail.getText();
            String pwd = jTpwd.getText();
            Usuario usuarioActual = controlacceso.iniciarSesion(email, pwd);

            if (usuarioActual != null) {
                JOptionPane.showMessageDialog(null, "Bienvenido al Sistema " + usuarioActual.getNombre() + " !!");

                // Establecer el usuario actual en el EstadoSesion
                //  EstadoSesion.setUsuarioActual(usuarioActual);
                controlacceso.notificarObservadora();

                //Cierro panel de logueo
                dispose();

            } else {
                controlacceso.notificarObservadora();
                intentos++;
                JOptionPane.showMessageDialog(null, "Vuelva a INTENTAR!, intentos permitidos" + (3 - intentos));
                // Incrementar el contador de intentos
                if (intentos == 3) {
                    // Si se han realizado 3 intentos fallidos
                    loginBtn.setEnabled(false);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Se han alcanzado los 3 intentos. Bloqueando el acceso.");

        }
  
  
  
  }


}
