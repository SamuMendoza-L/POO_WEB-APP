
package Templates;

import java.awt.Color;
import javax.swing.JFrame;
import models.Usuario;
import models.Main;

public class Login extends javax.swing.JFrame {
    
    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelRound1 = new RoundersComponents.PanelRound();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnRegistro = new RoundersComponents.ButtonRound();
        btnIngresar = new RoundersComponents.ButtonRound();
        jSeparator2 = new javax.swing.JSeparator();
        jtfCorreo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnMostrarPss = new javax.swing.JCheckBox();
        jtfContraseña = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(18, 65, 112));

        jPanel1.setBackground(new java.awt.Color(18, 65, 112));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound1.setBackground(new java.awt.Color(221, 244, 231));
        panelRound1.setRoundBottomLeft(50);
        panelRound1.setRoundBottomRight(50);
        panelRound1.setRoundTopLeft(50);
        panelRound1.setRoundTopRight(50);
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Noto Sans Kannada", 1, 36)); // NOI18N
        jLabel1.setText("¡BIENVENIDO!");
        panelRound1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 260, 50));

        jLabel2.setFont(new java.awt.Font("Noto Sans Myanmar", 0, 14)); // NOI18N
        jLabel2.setText("Porfavor ingrese sus datos");
        panelRound1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, -1, -1));

        jSeparator1.setAlignmentX(1.0F);
        jSeparator1.setAlignmentY(1.0F);
        panelRound1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, 290, 20));

        btnRegistro.setBackground(new java.awt.Color(38, 102, 127));
        btnRegistro.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistro.setText("Registrarme");
        btnRegistro.setFont(new java.awt.Font("Noto Sans NKo", 0, 14)); // NOI18N
        btnRegistro.setRoundBottomLeft(50);
        btnRegistro.setRoundBottomRight(50);
        btnRegistro.setRoundTopLeft(50);
        btnRegistro.setRoundTopRight(50);
        btnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroActionPerformed(evt);
            }
        });
        panelRound1.add(btnRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 450, 230, 50));

        btnIngresar.setBackground(new java.awt.Color(38, 102, 127));
        btnIngresar.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresar.setText("Ingresar");
        btnIngresar.setFont(new java.awt.Font("Noto Sans NKo", 0, 14)); // NOI18N
        btnIngresar.setRoundBottomLeft(50);
        btnIngresar.setRoundBottomRight(50);
        btnIngresar.setRoundTopLeft(50);
        btnIngresar.setRoundTopRight(50);
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        panelRound1.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, 230, 50));

        jSeparator2.setAlignmentX(1.0F);
        jSeparator2.setAlignmentY(1.0F);
        panelRound1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 290, 20));

        jtfCorreo.setForeground(new java.awt.Color(204, 204, 204));
        jtfCorreo.setText("Correo");
        jtfCorreo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtfCorreoMouseClicked(evt);
            }
        });
        jtfCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfCorreoActionPerformed(evt);
            }
        });
        panelRound1.add(jtfCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 230, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poo_wep_app/images/FrameLogin1.png"))); // NOI18N
        panelRound1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, -1, -1));

        btnMostrarPss.setText("Mostrar");
        btnMostrarPss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarPssActionPerformed(evt);
            }
        });
        panelRound1.add(btnMostrarPss, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, -1, -1));

        jtfContraseña.setForeground(new java.awt.Color(204, 204, 204));
        jtfContraseña.setText("Contraseña");
        jtfContraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtfContraseñaMouseClicked(evt);
            }
        });
        jtfContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfContraseñaActionPerformed(evt);
            }
        });
        panelRound1.add(jtfContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 230, 50));

        jPanel1.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(595, 260, 760, 540));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1920, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1080, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        String email = jtfCorreo.getText();
        String Pass = jtfContraseña.getText();
        
        boolean encontrado = false;
        
        Main.GetListaUsuarios().BuscarUsuario(email, Pass);
        
        
        
        
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void jtfCorreoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtfCorreoMouseClicked
        // TODO add your handling code here:
        jtfCorreo.setText("");
        jtfCorreo.setForeground(Color.black);
    }//GEN-LAST:event_jtfCorreoMouseClicked

    private void jtfCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfCorreoActionPerformed

    private void btnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroActionPerformed
        // TODO add your handling code here:
        new SelectProfile().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegistroActionPerformed

    private void btnMostrarPssActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarPssActionPerformed
        // TODO add your handling code here:
        if (btnMostrarPss.isSelected()) {
        // Mostrar contraseña en texto plano
            jtfContraseña.setEchoChar((char) 0);
        } else {
            // Ocultar contraseña con *
            jtfContraseña.setEchoChar('*');
        }
    }//GEN-LAST:event_btnMostrarPssActionPerformed

    private void jtfContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfContraseñaActionPerformed

    private void jtfContraseñaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtfContraseñaMouseClicked
        // TODO add your handling code here:
        jtfContraseña.setText("");
        jtfContraseña.setForeground(Color.black);
    }//GEN-LAST:event_jtfContraseñaMouseClicked

//    public void fullscreen(){
//        super.dispose();
//        super.setExtendedState(JFrame.MAXIMIZED_BOTH);
//        super.setUndecorated(!super.isUndecorated());
//        super.setVisible(true);
//    }
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RoundersComponents.ButtonRound btnIngresar;
    private javax.swing.JCheckBox btnMostrarPss;
    private RoundersComponents.ButtonRound btnRegistro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPasswordField jtfContraseña;
    private javax.swing.JTextField jtfCorreo;
    private RoundersComponents.PanelRound panelRound1;
    // End of variables declaration//GEN-END:variables
}
