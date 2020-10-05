package frmForms;

import java.awt.Color;
import java.io.IOException;
import java.util.Random;
import javax.imageio.ImageIO;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.DefaultTableModel;

public class FrmMainFrame extends javax.swing.JFrame {
    private DefaultTableModel m;
    private DefaultTableModel mm;
    Random rand = new Random();
    public FrmMainFrame() {
        initComponents();
        setLocationRelativeTo(null);
        setIcon("/gfx/ap_icon_long.png");
        settxtBak();
        
        m =(DefaultTableModel)tblContenido.getModel();
        mm =(DefaultTableModel)tblContenidoTranspuesta.getModel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgRellenadoOT = new javax.swing.ButtonGroup();
        txtCol = new javax.swing.JTextField();
        txtRen = new javax.swing.JTextField();
        tblK1 = new javax.swing.JScrollPane();
        tblContenidoTranspuesta = new javax.swing.JTable();
        tblK = new javax.swing.JScrollPane();
        tblContenido = new javax.swing.JTable();
        rbOrdenados = new javax.swing.JRadioButton();
        rbOtro = new javax.swing.JRadioButton();
        rbAleatorio = new javax.swing.JRadioButton();
        txtLlenar = new javax.swing.JButton();
        btnTransponer = new javax.swing.JButton();
        lblBackground = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtFilaColumna = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Matrices");
        setName("MainFrame"); // NOI18N

        txtCol.setFont(new java.awt.Font("ADAM.CG PRO", 0, 18)); // NOI18N
        txtCol.setForeground(new java.awt.Color(105, 105, 105));
        txtCol.setText("5");
        txtCol.setBorder(null);
        txtCol.setOpaque(false);

        txtRen.setFont(new java.awt.Font("ADAM.CG PRO", 0, 18)); // NOI18N
        txtRen.setForeground(new java.awt.Color(105, 105, 105));
        txtRen.setText("5");
        txtRen.setBorder(null);
        txtRen.setOpaque(false);

        tblContenidoTranspuesta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblK1.setViewportView(tblContenidoTranspuesta);

        tblContenido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblK.setViewportView(tblContenido);

        bgRellenadoOT.add(rbOrdenados);
        rbOrdenados.setText("Ordenados");

        bgRellenadoOT.add(rbOtro);
        rbOtro.setText("Otro");

        bgRellenadoOT.add(rbAleatorio);
        rbAleatorio.setSelected(true);
        rbAleatorio.setText("Aleatorio");

        txtLlenar.setText("Llenar");
        txtLlenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLlenarActionPerformed(evt);
            }
        });

        btnTransponer.setText("Transponer");
        btnTransponer.setEnabled(false);
        btnTransponer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransponerActionPerformed(evt);
            }
        });

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gfx/bk #19637.png"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Objetivo");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 130, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Este programa llena una tabla y ofrece la opción de transponer dicha tabla en la segunda, como se llena se basa en las opciones \"Aleatorio\", \"Ordenado\", \"Otro\".\n\n\n\n");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 1040, 20));

        txtFilaColumna.setText("Filas              Columnas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnTransponer))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(tblK, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(370, 370, 370)
                        .addComponent(tblK1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbOtro)
                    .addComponent(rbOrdenados)
                    .addComponent(rbAleatorio)
                    .addComponent(txtFilaColumna)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtRen, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCol, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtLlenar)))
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 948, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(lblBackground, javax.swing.GroupLayout.PREFERRED_SIZE, 948, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(tblK, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtFilaColumna)
                                        .addGap(4, 4, 4)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtRen, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtCol, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(119, 119, 119)
                                                .addComponent(rbOtro))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(89, 89, 89)
                                                .addComponent(rbOrdenados))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(59, 59, 59)
                                                .addComponent(rbAleatorio)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtLlenar))
                                    .addComponent(tblK1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addComponent(btnTransponer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 11, Short.MAX_VALUE)
                    .addComponent(lblBackground, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTransponerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransponerActionPerformed
        transponerTabla();
    }//GEN-LAST:event_btnTransponerActionPerformed

    private void txtLlenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLlenarActionPerformed
        crearTabla();
        btnTransponer.setEnabled(true);
    }//GEN-LAST:event_txtLlenarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMainFrame().setVisible(true);
            }
        });
    }
    
////////////////////////////////////////////////////////////////////////////////
//////////////////Funciones operativas//////////////////////////////////////////
        private void crearTabla(){
            int r = Integer.parseInt(txtRen.getText()), c = Integer.parseInt(txtCol.getText()), n = 1;
            m =(DefaultTableModel)tblContenido.getModel();

            if((txtRen.getText().equals(""))&&(txtRen.getText().equals(""))){
                showMessageDialog(this, "Error: No deje espacios en blanco...");
            }else{
                m.setColumnCount(r); m.setRowCount(c);
                if(rbAleatorio.isSelected()){
                    for(int x = 0; x < c; x++){
                        for(int y = 0; y < r; y++){
                            m.setValueAt(numRandom(), x, y);
                    }
                }//Crea una tabla de numeros aleatorios

                }else if(rbOrdenados.isSelected()){
                    for(int x = 0; x < c; x++){
                        if(x%2==0){
                            for(int y = 0; y < r; y++){
                            m.setValueAt(n++, x, y);
                            }
                        }else{
                            for(int y = c-1; y >= 0; y--){
                            m.setValueAt(n++, x, y);
                            }
                        }
                    }//Crea una tabla de numeros ordenados del 1 hasta el infinito
                    
                }else{
                    int ctl = 0;
                    for(int x = 0; x < c; x++){
                        ctl = ctl-x;
                        for(int y = 0; y < r; y++){
                            m.setValueAt(Math.abs(ctl++), x, y); 
                        }
                        ctl = 0;

                    }//Crea una tabla con un orden especifico
            }
        }
    }
    
    private void transponerTabla(){
        int r = Integer.parseInt(txtRen.getText()), c = Integer.parseInt(txtCol.getText());
        mm.setColumnCount(c);
        mm.setRowCount(r);
        
        for(int x = 0; x < c; x++){
            for(int y = 0; y < r; y++){
                mm.setValueAt(m.getValueAt(y, x), x, y);
            }
        }
    }
    
    private int numRandom(){
        int n = rand.nextInt(100);
        return n+11;
    }
////////////////////////////////////////////////////////////////////////////////
/////////////////Funciones comesticas///////////////////////////////////////////
        private void setIcon(String Icon){
        try {
            setIconImage(ImageIO.read(getClass().getResource(Icon)));
        }
        catch (IOException exc) {
            exc.printStackTrace();
        }
    }
    
    private void settxtBak(){
        txtCol.setBackground(new Color(0,0,0,0));
        txtRen.setBackground(new Color(0,0,0,0));
    }
////////////////////////////////////////////////////////////////////////////////

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgRellenadoOT;
    private javax.swing.JButton btnTransponer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JRadioButton rbAleatorio;
    private javax.swing.JRadioButton rbOrdenados;
    private javax.swing.JRadioButton rbOtro;
    private javax.swing.JTable tblContenido;
    private javax.swing.JTable tblContenidoTranspuesta;
    private javax.swing.JScrollPane tblK;
    private javax.swing.JScrollPane tblK1;
    private javax.swing.JTextField txtCol;
    private javax.swing.JLabel txtFilaColumna;
    private javax.swing.JButton txtLlenar;
    private javax.swing.JTextField txtRen;
    // End of variables declaration//GEN-END:variables
}
