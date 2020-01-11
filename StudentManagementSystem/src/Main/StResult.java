
package Main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class StResult extends javax.swing.JFrame {

     Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    public StResult() {
        initComponents();
        conn = Connect.Studentdb();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        result = new javax.swing.JPanel();
        jLabel128 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel129 = new javax.swing.JLabel();
        jLabel142 = new javax.swing.JLabel();
        semisr = new javax.swing.JComboBox<>();
        jSeparator46 = new javax.swing.JSeparator();
        jPanel21 = new javax.swing.JPanel();
        jLabel144 = new javax.swing.JLabel();
        jLabel145 = new javax.swing.JLabel();
        name4 = new javax.swing.JLabel();
        id4 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        gpa = new javax.swing.JTable();
        label13 = new java.awt.Label();
        jButton7 = new javax.swing.JButton();
        id5 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        result.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 0), 2, true));
        result.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel128.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel128.setForeground(new java.awt.Color(0, 102, 102));
        jLabel128.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel128.setText("Result");
        result.add(jLabel128, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 50, 1216, 50));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Backgrounds/BG5.jpg"))); // NOI18N
        result.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 50, 1216, 50));

        jLabel129.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel129.setText("Student ID");
        result.add(jLabel129, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, -1, -1));

        jLabel142.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel142.setText("Select Semister");
        result.add(jLabel142, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 150, -1, -1));

        semisr.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-----Select-----", "Spring 2018", "Summer2018", "Fall 2018" }));
        result.add(semisr, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 180, 220, 30));

        jSeparator46.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator46.setForeground(new java.awt.Color(0, 0, 0));
        result.add(jSeparator46, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 220, -1));

        jPanel21.setBackground(new java.awt.Color(204, 204, 204));
        jPanel21.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel144.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel144.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel144.setText("Name");
        jPanel21.add(jLabel144, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel145.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel145.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel145.setText("ID");
        jPanel21.add(jLabel145, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        name4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        name4.setText("jLabel149");
        jPanel21.add(name4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 180, 20));

        id4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        id4.setText("jLabel150");
        jPanel21.add(id4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 180, 20));

        result.add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 360, 110));

        jPanel22.setBackground(new java.awt.Color(204, 204, 204));
        jPanel22.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        gpa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(gpa);

        jPanel22.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 270));

        result.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 260, 750, 270));

        label13.setAlignment(java.awt.Label.CENTER);
        label13.setBackground(new java.awt.Color(0, 0, 0));
        label13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        label13.setForeground(new java.awt.Color(255, 255, 255));
        label13.setText("All Rights Reserved @ Khalid, Koushik & Rakib");
        label13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label13MouseClicked(evt);
            }
        });
        result.add(label13, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 608, 1216, 40));

        jButton7.setText("Show");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        result.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 180, -1, -1));

        id5.setText("Enter Student ID");
        result.add(id5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 220, 30));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/close-icon (1).png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        result.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 0, 40, 40));

        getContentPane().add(result, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1220, 650));

        setBounds(70, 100, 1220, 650);
    }// </editor-fold>//GEN-END:initComponents

    private void label13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label13MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_label13MouseClicked

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        String semis2 = semisr.getSelectedItem().toString();

        try {
            String sql51="select Course_code,Course_name,Course_credit,Grade_Point from registered_courses where ID ='" + id5.getText() + "' and Semister='" + semis2 + "'";
            String sql52 = "select ID,Name from stinfo where ID ='" + id5.getText() + "' ";
            PreparedStatement pst51 = conn.prepareStatement(sql51);
            PreparedStatement pst52 = conn.prepareStatement(sql52);

            ResultSet rs51 = pst51.executeQuery();
            ResultSet rs52 = pst52.executeQuery();
            gpa.setModel(DbUtils.resultSetToTableModel(rs51));
            if(rs52.next())
            {
                String a = rs52.getString("ID");
                id4.setText(a);
                String b  = rs52.getString("Name");
                name4.setText(b);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(StResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StResult().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable gpa;
    private javax.swing.JLabel id4;
    private javax.swing.JTextField id5;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel142;
    private javax.swing.JLabel jLabel144;
    private javax.swing.JLabel jLabel145;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator46;
    private java.awt.Label label13;
    private javax.swing.JLabel name4;
    private javax.swing.JPanel result;
    private javax.swing.JComboBox<String> semisr;
    // End of variables declaration//GEN-END:variables

}
