/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unir.AdvPro.NicolasZ.main;

/**
 *
 * @author NICOLÁS ZAPATA ÁLZATE
 */
public class Main extends javax.swing.JFrame {

	/**
	 * Creates new form Main
	 */
	public Main() {
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jTextFieldID = new javax.swing.JTextField();
    jTextFieldName = new javax.swing.JTextField();
    jLabelID = new javax.swing.JLabel();
    jLabelName = new javax.swing.JLabel();
    jLabelTotal = new javax.swing.JLabel();
    jTextFieldTotal = new javax.swing.JTextField();
    jLabelCumulative = new javax.swing.JLabel();
    jTextFieldCumulative = new javax.swing.JTextField();
    jTextFieldDate = new javax.swing.JTextField();
    jTextFieldNote = new javax.swing.JTextField();
    jLabelDate = new javax.swing.JLabel();
    jLabelNote = new javax.swing.JLabel();
    jTextFieldValue = new javax.swing.JTextField();
    jTextFieldPercentage = new javax.swing.JTextField();
    jLabelValue = new javax.swing.JLabel();
    jLabelPercentage = new javax.swing.JLabel();
    jButtonAddNote = new javax.swing.JButton();
    jButtonExit = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jLabelID.setText("ID");

    jLabelName.setText("Name");

    jLabelTotal.setText("Total");

    jLabelCumulative.setText("Cumulative");

    jLabelDate.setText("Date");

    jLabelNote.setText("N°  Note");

    jTextFieldValue.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jTextFieldValueActionPerformed(evt);
      }
    });

    jLabelValue.setText("Value");

    jLabelPercentage.setText("Percentage");

    jButtonAddNote.setText("Add Note");
    jButtonAddNote.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButtonAddNoteActionPerformed(evt);
      }
    });

    jButtonExit.setText("Exit");
    jButtonExit.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButtonExitActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGap(165, 165, 165)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabelID)
                .addGap(169, 169, 169)
                .addComponent(jLabelName))
              .addGroup(layout.createSequentialGroup()
                .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125)
                .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))))
          .addGroup(layout.createSequentialGroup()
            .addGap(110, 110, 110)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                      .addComponent(jTextFieldDate, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                      .addGap(33, 33, 33))
                    .addGroup(layout.createSequentialGroup()
                      .addGap(28, 28, 28)
                      .addComponent(jLabelDate)
                      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                      .addGap(11, 11, 11)
                      .addComponent(jLabelNote))
                    .addComponent(jTextFieldNote, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addGap(28, 28, 28)
                  .addComponent(jTextFieldValue, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGap(18, 18, 18)
                  .addComponent(jTextFieldPercentage, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jLabelTotal)
                .addGroup(layout.createSequentialGroup()
                  .addGap(53, 53, 53)
                  .addComponent(jButtonAddNote)
                  .addGap(127, 127, 127)
                  .addComponent(jButtonExit)))
              .addGroup(layout.createSequentialGroup()
                .addComponent(jTextFieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelCumulative)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldCumulative, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGroup(layout.createSequentialGroup()
                .addComponent(jLabelValue)
                .addGap(47, 47, 47)
                .addComponent(jLabelPercentage)))))
        .addContainerGap(139, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(35, 35, 35)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabelID)
          .addComponent(jLabelName, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(32, 32, 32)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabelTotal)
          .addComponent(jTextFieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabelCumulative)
          .addComponent(jTextFieldCumulative, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(31, 31, 31)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabelDate)
          .addComponent(jLabelNote)
          .addComponent(jLabelValue)
          .addComponent(jLabelPercentage))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jTextFieldDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jTextFieldNote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jTextFieldValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jTextFieldPercentage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(37, 37, 37)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jButtonAddNote)
          .addComponent(jButtonExit))
        .addContainerGap(69, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void jTextFieldValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldValueActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_jTextFieldValueActionPerformed

  private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
    this.dispose();
  }//GEN-LAST:event_jButtonExitActionPerformed

  private void jButtonAddNoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddNoteActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_jButtonAddNoteActionPerformed

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
			java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Main().setVisible(true);
			}
		});
	}

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton jButtonAddNote;
  private javax.swing.JButton jButtonExit;
  private javax.swing.JLabel jLabelCumulative;
  private javax.swing.JLabel jLabelDate;
  private javax.swing.JLabel jLabelID;
  private javax.swing.JLabel jLabelName;
  private javax.swing.JLabel jLabelNote;
  private javax.swing.JLabel jLabelPercentage;
  private javax.swing.JLabel jLabelTotal;
  private javax.swing.JLabel jLabelValue;
  private javax.swing.JTextField jTextFieldCumulative;
  private javax.swing.JTextField jTextFieldDate;
  private javax.swing.JTextField jTextFieldID;
  private javax.swing.JTextField jTextFieldName;
  private javax.swing.JTextField jTextFieldNote;
  private javax.swing.JTextField jTextFieldPercentage;
  private javax.swing.JTextField jTextFieldTotal;
  private javax.swing.JTextField jTextFieldValue;
  // End of variables declaration//GEN-END:variables
}
