package CUI;


import java.awt.BorderLayout;
import java.awt.GridLayout;


public class HISTORIAL extends javax.swing.JPanel {

    
    public HISTORIAL() {
        initComponents();
        configurarLayout();
    }

  private void configurarLayout() {
       
    this.setLayout(new BorderLayout()); // expansión completa

    jPanel1.setLayout(new GridLayout(2, 5, 10, 10)); // distribución 

    add(jPanel1, BorderLayout.CENTER); //jPanel1 en el centro de HISTORIAL

    // Agregar botones a jPanel1
    jPanel1.add(btnCancion1);
    jPanel1.add(btnCancion2);
    jPanel1.add(btnCancion3);
    jPanel1.add(btnCancion4);
    jPanel1.add(btnCancion5);
    jPanel1.add(btnPodcast1);
    jPanel1.add(btnPodcast2);
    jPanel1.add(btnPodcast3);
    jPanel1.add(btnPodcast4);
    jPanel1.add(btnPodcast5);

    revalidate(); // Asegura  cambios 
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnCancion2 = new javax.swing.JButton();
        btnCancion3 = new javax.swing.JButton();
        btnCancion4 = new javax.swing.JButton();
        btnCancion1 = new javax.swing.JButton();
        btnPodcast1 = new javax.swing.JButton();
        btnPodcast2 = new javax.swing.JButton();
        btnPodcast3 = new javax.swing.JButton();
        btnPodcast4 = new javax.swing.JButton();
        btnPodcast5 = new javax.swing.JButton();
        btnCancion5 = new javax.swing.JButton();

        btnCancion3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancion3ActionPerformed(evt);
            }
        });

        btnCancion4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancion4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnCancion1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btnCancion2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(btnCancion4, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(btnCancion3, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(94, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnCancion1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCancion2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCancion4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnCancion3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        btnPodcast2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPodcast2ActionPerformed(evt);
            }
        });

        btnPodcast3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPodcast3ActionPerformed(evt);
            }
        });

        btnCancion5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancion5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnPodcast1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(btnPodcast2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(btnPodcast3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(btnPodcast4, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCancion5, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                    .addComponent(btnPodcast5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(btnCancion5, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnPodcast4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                        .addComponent(btnPodcast1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPodcast3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPodcast2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnPodcast5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnPodcast3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPodcast3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPodcast3ActionPerformed

    private void btnCancion5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancion5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancion5ActionPerformed

    private void btnCancion3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancion3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancion3ActionPerformed

    private void btnCancion4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancion4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancion4ActionPerformed

    private void btnPodcast2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPodcast2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPodcast2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancion1;
    private javax.swing.JButton btnCancion2;
    private javax.swing.JButton btnCancion3;
    private javax.swing.JButton btnCancion4;
    private javax.swing.JButton btnCancion5;
    private javax.swing.JButton btnPodcast1;
    private javax.swing.JButton btnPodcast2;
    private javax.swing.JButton btnPodcast3;
    private javax.swing.JButton btnPodcast4;
    private javax.swing.JButton btnPodcast5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
