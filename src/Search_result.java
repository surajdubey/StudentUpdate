/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Search_result.java
 *
 * Created on Oct 6, 2013, 9:43:25 AM
 */
/**
 *
 * @author suraj
 */

import javax.swing.*;
import java.sql.*;
public class Search_result extends javax.swing.JFrame {

    /** Creates new form Search_result */
    public Search_result() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        l_name = new javax.swing.JLabel();
        l_interest = new javax.swing.JLabel();
        l_contact = new javax.swing.JLabel();
        l_address = new javax.swing.JLabel();
        l_year = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        l_welcome = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        l_pid = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        l_branch = new javax.swing.JLabel();
        l_divison = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        l_name.setText("jLabel1");

        l_interest.setText("jLabel8");

        l_contact.setText("jLabel8");

        l_address.setText("jLabel8");

        l_year.setText("jLabel8");

        jLabel6.setText("Contact No.");

        jLabel5.setText("Interest");

        jLabel4.setText("Address");

        jLabel3.setText("Class");

        jLabel2.setText("Name");

        l_welcome.setText("jLabel1");

        jButton1.setText("Next");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("PID");

        l_pid.setText("jLabel7");

        jButton2.setText("Home");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Previous");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        l_branch.setText("jLabel7");

        l_divison.setText("jLabel8");

        jButton4.setText("Exit Application");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(l_year, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(l_branch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(l_divison)
                        .addGap(59, 59, 59))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 296, Short.MAX_VALUE)
                                .addComponent(l_pid, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton4)))
                        .addGap(19, 19, 19))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(l_welcome, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(jLabel6)
                        .addComponent(jLabel5))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 186, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(l_name)
                        .addComponent(l_address)
                        .addComponent(l_contact)
                        .addComponent(l_interest))
                    .addGap(79, 79, 79)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_divison)
                    .addComponent(l_branch)
                    .addComponent(l_year))
                .addGap(197, 197, 197)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(l_pid))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap(44, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(32, 32, 32)
                    .addComponent(l_welcome)
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(l_name))
                    .addGap(18, 18, 18)
                    .addComponent(jLabel3)
                    .addGap(27, 27, 27)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(l_address))
                    .addGap(30, 30, 30)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(l_contact))
                    .addGap(34, 34, 34)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(l_interest))
                    .addContainerGap(184, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


JFrame frame;
String search;
int i=0;
ResultSet rs;

 
   int res_count=1 , total_count=0;
public void get_result(ResultSet res , String s)
{
    
    search=s;
    
    //display_result();
     try{
        l_welcome.setText("Search Result "+res_count);
        l_name.setText(res.getString("name"));
        l_contact.setText(res.getString("contact"));
        l_interest.setText(res.getString("interest"));
        l_address.setText(res.getString("address"));
        l_year.setText(res.getString("year"));
        l_branch.setText(res.getString("branch"));
        l_divison.setText(res.getString("divison"));
        l_pid.setText(res.getString("pid"));
        
        
        
        
      rs=Data.n_search(search);
      
      while(rs.next())
          total_count++;
      
      rs.first();
      
      
      
        
   }catch(SQLException se){
      
       JOptionPane.showMessageDialog(frame,
    se,
    "Inane error",
    JOptionPane.ERROR_MESSAGE);
      se.printStackTrace();
   }
    
    
    
}

    
    
private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

   try{
      
      if(rs.next())
      {
          res_count++;
        l_welcome.setText("Search Result "+res_count);
        l_name.setText(rs.getString("name"));
        l_contact.setText(rs.getString("contact"));
        l_interest.setText(rs.getString("interest"));
        l_address.setText(rs.getString("address"));
        l_year.setText(rs.getString("year"));
        l_branch.setText(rs.getString("branch"));
        l_divison.setText(rs.getString("divison"));
        l_pid.setText(rs.getString("pid"));
 
      
      }
      
      else
      {
           JOptionPane.showMessageDialog(frame,"No more records found to display!! \n Displaying first record","No Search Result",JOptionPane.ERROR_MESSAGE);
           rs.first();
           
           if(rs.first())
             {
                res_count=1;
                l_welcome.setText("Search Result "+res_count);
                l_name.setText(rs.getString("name"));
                l_contact.setText(rs.getString("contact"));
                l_interest.setText(rs.getString("interest"));
                l_address.setText(rs.getString("address"));
                l_year.setText(rs.getString("year"));
                l_branch.setText(rs.getString("branch"));
                l_divison.setText(rs.getString("divison"));
        
                l_pid.setText(rs.getString("pid"));

       }
      
      }
   }catch(SQLException se){
      //Handle errors for JDBC
       
       JOptionPane.showMessageDialog(frame,
    se,
    "Inane error",
    JOptionPane.ERROR_MESSAGE);
      se.printStackTrace();
   }
    
    
  
    
    // TODO add your handling code here:
}//GEN-LAST:event_jButton1ActionPerformed

private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    dispose();
    Welcome w=new Welcome();
    w.setVisible(true);
    // TODO add your handling code here:
}//GEN-LAST:event_jButton2ActionPerformed

private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

     try{
      
      if(rs.previous())
      {
          res_count--;
        l_welcome.setText("Search Result "+res_count);
        l_name.setText(rs.getString("name"));
        l_contact.setText(rs.getString("contact"));
        l_interest.setText(rs.getString("interest"));
        l_address.setText(rs.getString("address"));
        l_year.setText(rs.getString("year"));
        l_branch.setText(rs.getString("branch"));
        l_divison.setText(rs.getString("divison"));
        
        l_pid.setText(rs.getString("pid"));
 
      
      }
      
      else
      {
           JOptionPane.showMessageDialog(frame,"No more previous records found to display!! \n Displaying last record","No Search Result",JOptionPane.ERROR_MESSAGE);
           
           if(rs.last())
           {
            res_count=total_count;
            l_welcome.setText("Search Result "+res_count);
            l_name.setText(rs.getString("name"));
            l_contact.setText(rs.getString("contact"));
            l_interest.setText(rs.getString("interest"));
            l_address.setText(rs.getString("address"));
            l_year.setText(rs.getString("year"));
        l_branch.setText(rs.getString("branch"));
        l_divison.setText(rs.getString("divison"));
        
            l_pid.setText(rs.getString("pid"));

      
           }
      
        
      
      }
   }catch(SQLException se){
      //Handle errors for JDBC
       
       JOptionPane.showMessageDialog(frame,
    se,
    "Inane error",
    JOptionPane.ERROR_MESSAGE);
      se.printStackTrace();
   }
    
    
}//GEN-LAST:event_jButton3ActionPerformed

private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

    int option=JOptionPane.showConfirmDialog (null, "Are you sure you want to exit this application");
    
    if(option==JOptionPane.YES_OPTION)
    {
        System.exit(0);
    
    }
    
    // TODO add your handling code here:
}//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Search_result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Search_result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Search_result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Search_result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Search_result().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel l_address;
    private javax.swing.JLabel l_branch;
    private javax.swing.JLabel l_contact;
    private javax.swing.JLabel l_divison;
    private javax.swing.JLabel l_interest;
    private javax.swing.JLabel l_name;
    private javax.swing.JLabel l_pid;
    private javax.swing.JLabel l_welcome;
    private javax.swing.JLabel l_year;
    // End of variables declaration//GEN-END:variables
}
