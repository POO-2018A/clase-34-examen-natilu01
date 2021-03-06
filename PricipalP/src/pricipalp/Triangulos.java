/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pricipalp;
import java.awt.BorderLayout;
import java.awt.LayoutManager;
import javax.swing.JOptionPane;
/**
 *
 * @author ESFOT
 */
public class Triangulos extends javax.swing.JFrame {

    /**
     * Creates new form Triangulos
     */
    public Triangulos() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle ("Calcular: Area,Perímetro y Altura de Triangulos");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtFiguraSeleccionada = new javax.swing.JTextField();
        btnSeleccionar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtLado1 = new javax.swing.JTextField();
        txtLado2 = new javax.swing.JTextField();
        txtLado3 = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtArea = new javax.swing.JTextField();
        txtPerimetro = new javax.swing.JTextField();
        txtAltura = new javax.swing.JTextField();
        cmbListaTriangulos = new javax.swing.JComboBox<>();
        btnNuevo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        jLabel1.setText("TRIANGULOS!!!");

        jLabel2.setText("Seleccione una triangulo:");

        jLabel3.setText("Figura Seleccionada:");

        btnSeleccionar.setText("Seleccionar");
        btnSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarActionPerformed(evt);
            }
        });

        jLabel4.setText("Lado 1:");

        jLabel5.setText("Lado 2:");

        jLabel6.setText("Lado 3:");

        txtLado2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLado2ActionPerformed(evt);
            }
        });

        txtLado3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLado3ActionPerformed(evt);
            }
        });

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        jLabel9.setText("Area:");

        jLabel10.setText("Perimetro:");

        jLabel11.setText("Altura:");

        cmbListaTriangulos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rectangulo", "Isosceles", "Escaleno ", "Equilatero" }));

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnCalcular)
                .addGap(76, 76, 76))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnNuevo)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(208, 208, 208)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(40, 40, 40)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addGap(18, 18, 18)
                                            .addComponent(cmbListaTriangulos, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtLado1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(18, 18, 18)
                                    .addComponent(btnSeleccionar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtFiguraSeleccionada, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(9, 9, 9)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel10)
                                                .addComponent(jLabel9)
                                                .addComponent(jLabel11))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtArea)
                                                .addComponent(txtPerimetro)
                                                .addComponent(txtAltura, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtLado3))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtLado2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGap(0, 0, Short.MAX_VALUE))))))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(btnSeleccionar)
                            .addComponent(cmbListaTriangulos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtFiguraSeleccionada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtLado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addGap(6, 6, 6))
                    .addComponent(txtLado2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtLado3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCalcular)
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtPerimetro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11))
                    .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(btnNuevo)
                .addGap(102, 102, 102))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtLado2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLado2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLado2ActionPerformed

    private void txtLado3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLado3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLado3ActionPerformed

    private void btnSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarActionPerformed
        btnSeleccionar.setEnabled(false);
        cmbListaTriangulos.setEnabled(false);
        btnCalcular.setEnabled(true);
        btnNuevo.setEnabled(true);
        txtFiguraSeleccionada.setEnabled(true);
        txtLado1.setEnabled(true);
        txtLado2.setEnabled(true);
        txtLado3.setEnabled(true);
        txtAltura.setEnabled(true);
        txtPerimetro.setEnabled(true);
        txtArea.setEnabled(true);
        
        if (cmbListaTriangulos.getSelectedIndex()==0){
            txtLado3.setEnabled(false);
            txtFiguraSeleccionada.setText(cmbListaTriangulos.getSelectedItem().toString());
            txtFiguraSeleccionada.setEnabled(false);
        }
       else if (cmbListaTriangulos.getSelectedIndex()==1){
           txtLado3.setEnabled(false);
           txtFiguraSeleccionada.setText(cmbListaTriangulos.getSelectedItem().toString());
           txtFiguraSeleccionada.setEnabled(false);
       }
       else if(cmbListaTriangulos.getSelectedIndex()==2){
           txtFiguraSeleccionada.setText(cmbListaTriangulos.getSelectedItem().toString());
           txtFiguraSeleccionada.setEnabled(false);
       }
       else if(cmbListaTriangulos.getSelectedIndex()==3){
           txtLado2.setEnabled(false);
           txtLado3.setEnabled(false);
           txtFiguraSeleccionada.setText(cmbListaTriangulos.getSelectedItem().toString());
           txtFiguraSeleccionada.setEnabled(false);
       }
    }//GEN-LAST:event_btnSeleccionarActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        double perimetro;
        double area;
        double altura;
        
        if (cmbListaTriangulos.getSelectedIndex() == 0){
            String ladoTri1=txtLado1.getText();
            String ladoTri2=txtLado2.getText();
            if (!ladoTri1.equals("")&&ladoTri2.equals("")){
                double ladoTria1=Double.parseDouble(ladoTri1);
                double ladoTria2=Double.parseDouble(ladoTri2);
                Rectangulo rec1=new Rectangulo(txtFiguraSeleccionada.getText(),ladoTria1,ladoTria2);
                perimetro = rec1.obtenerPerimetro();
                String periRect = String.valueOf(perimetro);
                txtPerimetro.setText(periRect);
                area = rec1.obtenerArea();
                String areaTriangulo = String.valueOf(area);
                txtArea.setText(areaTriangulo);
            }
            else {
                JOptionPane.showMessageDialog(rootPane,"Debe ingresar todos los campos");
            }
        }
        else if(cmbListaTriangulos.getSelectedIndex() == 1){
            String ladoTri1=txtLado1.getText();
            String ladoTri2=txtLado2.getText();
             if (!ladoTri1.equals("")&&ladoTri2.equals("")){
                double ladoTria1=Double.parseDouble(ladoTri1);
                double ladoTria2=Double.parseDouble(ladoTri2);
                Isoceles is1=new Isoceles(txtFiguraSeleccionada.getText(),ladoTria1,ladoTria2);
                perimetro = is1.obtenerPerimetro();
                String periIs = String.valueOf(perimetro);
                txtPerimetro.setText(periIs);
                area = is1.obtenerArea();
                String areaIs = String.valueOf(area);
                txtArea.setText(areaIs);
             }
             else {
                 JOptionPane.showMessageDialog(rootPane,"Debe ingresar todos los campos");
             }
        }
        else if (cmbListaTriangulos.getSelectedIndex() == 2){
            String ladoTri1=txtLado1.getText();
            String ladoTri2=txtLado2.getText();
            String ladoTri3=txtLado3.getText();
            if (!ladoTri1.equals("")&&ladoTri2.equals("")&&!ladoTri3.equals("")){
                double lado1 = Double.parseDouble(ladoTri1);
                double lado2 = Double.parseDouble(ladoTri2);
                double lado3 = Double.parseDouble(ladoTri3);
                Escaleno esc1=new Escaleno(txtFiguraSeleccionada.getText(),lado1,lado2,lado3);
                perimetro =esc1.obtenerPerimetro();
                String periEscaleno = String.valueOf(perimetro);
                txtPerimetro.setText(periEscaleno);
                area = esc1.obtenerArea();
                String areaEscaleno = String.valueOf(area);
                txtArea.setText(areaEscaleno);
            }
            else {
                JOptionPane.showMessageDialog(rootPane,"Debe ingresar todos los campos");
            }
        }
        else if (cmbListaTriangulos.getSelectedIndex() == 3){
            String lado1=txtLado1.getText();
            if (!lado1.equals("")){
                double ladoE=Double.parseDouble(lado1);
                Equilatero eq1=new Equilatero (txtFiguraSeleccionada.getText(),ladoE);
                perimetro =eq1.obtenerPerimetro();
                String periEquilatero = String.valueOf(perimetro);
                txtPerimetro.setText(periEquilatero);
                area = eq1.obtenerArea();
                String areaEquilatero = String.valueOf(area);
                txtArea.setText(areaEquilatero);
            }
            else {
                JOptionPane.showMessageDialog(rootPane,"Debe ingresar todos los campos");
            }
        }
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        btnSeleccionar.setEnabled(true);
        btnCalcular.setEnabled(false);
        cmbListaTriangulos.setEnabled(true);
        txtLado1.setEnabled(false);
        txtLado1.setText("");
        txtLado2.setEnabled(false);
        txtLado2.setText("");
        txtLado3.setEnabled(false);
        txtLado3.setText("");
        txtAltura.setEnabled(false);
        txtAltura.setText("");
        txtFiguraSeleccionada.setEnabled(false);
        txtFiguraSeleccionada.setText("");
        txtPerimetro.setEnabled(false);
        txtPerimetro.setText("");
        txtArea.setEnabled(false);
        txtArea.setText("");
        btnNuevo.setEnabled(false);
    }//GEN-LAST:event_btnNuevoActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Triangulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Triangulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Triangulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Triangulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Triangulos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSeleccionar;
    private javax.swing.JComboBox<String> cmbListaTriangulos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtAltura;
    private javax.swing.JTextField txtArea;
    private javax.swing.JTextField txtFiguraSeleccionada;
    private javax.swing.JTextField txtLado1;
    private javax.swing.JTextField txtLado2;
    private javax.swing.JTextField txtLado3;
    private javax.swing.JTextField txtPerimetro;
    // End of variables declaration//GEN-END:variables
}
