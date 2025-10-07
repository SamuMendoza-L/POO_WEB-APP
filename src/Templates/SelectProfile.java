
package Templates;

public class SelectProfile extends javax.swing.JFrame {

    public SelectProfile() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelRound1 = new RoundersComponents.PanelRound();
        panelRound8 = new RoundersComponents.PanelRound();
        buttonRound1 = new RoundersComponents.ButtonRound();
        jLabel3 = new javax.swing.JLabel();
        panelRound10 = new RoundersComponents.PanelRound();
        jLabel2 = new javax.swing.JLabel();
        buttonRound2 = new RoundersComponents.ButtonRound();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(18, 65, 112));
        jPanel1.setPreferredSize(new java.awt.Dimension(1920, 1080));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound1.setBackground(new java.awt.Color(221, 244, 231));
        panelRound1.setRoundBottomLeft(50);
        panelRound1.setRoundBottomRight(50);
        panelRound1.setRoundTopLeft(50);
        panelRound1.setRoundTopRight(50);
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound8.setBackground(new java.awt.Color(103, 192, 144));
        panelRound8.setRoundBottomLeft(50);
        panelRound8.setRoundBottomRight(50);
        panelRound8.setRoundTopLeft(50);
        panelRound8.setRoundTopRight(50);
        panelRound8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonRound1.setText("DUEÑO DE NEGOCIO");
        buttonRound1.setRoundBottomLeft(30);
        buttonRound1.setRoundBottomRight(30);
        buttonRound1.setRoundTopLeft(30);
        buttonRound1.setRoundTopRight(30);
        buttonRound1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRound1ActionPerformed(evt);
            }
        });
        panelRound8.add(buttonRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 230, 45));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poo_wep_app/images/EmprededorProfile.png"))); // NOI18N
        panelRound8.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        panelRound1.add(panelRound8, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 90, 260, 350));

        panelRound10.setBackground(new java.awt.Color(103, 192, 144));
        panelRound10.setRoundBottomLeft(50);
        panelRound10.setRoundBottomRight(50);
        panelRound10.setRoundTopLeft(50);
        panelRound10.setRoundTopRight(50);
        panelRound10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poo_wep_app/images/ClienteProfile.png"))); // NOI18N
        panelRound10.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        buttonRound2.setText("CLIENTE");
        buttonRound2.setRoundBottomLeft(30);
        buttonRound2.setRoundBottomRight(30);
        buttonRound2.setRoundTopLeft(30);
        buttonRound2.setRoundTopRight(30);
        buttonRound2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRound2ActionPerformed(evt);
            }
        });
        panelRound10.add(buttonRound2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 230, 45));

        panelRound1.add(panelRound10, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 260, 350));

        jPanel1.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 270, 880, 540));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Noto Sans Kannada", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SELECCIONA UN PERFIL PARA EL REGISTRO");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 180, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonRound2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRound2ActionPerformed
        // TODO add your handling code here:
        new RegisterClient().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonRound2ActionPerformed

    private void buttonRound1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRound1ActionPerformed
        // TODO add your handling code here:
        new RegistroEmprendedor().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonRound1ActionPerformed

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RoundersComponents.ButtonRound buttonRound1;
    private RoundersComponents.ButtonRound buttonRound2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private RoundersComponents.PanelRound panelRound1;
    private RoundersComponents.PanelRound panelRound10;
    private RoundersComponents.PanelRound panelRound8;
    // End of variables declaration//GEN-END:variables
}
