
package star.rating;

import java.awt.Color;
import java.awt.Component;


public class StarRating extends javax.swing.JPanel {
    



    public StarRating() {
        initComponents();
        init();
    }
    private void init(){
        setOpaque(false);
        setBackground(new Color(204,204,204));
        setForeground(new Color(238,236,0));
    }
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setLayout(new java.awt.GridLayout(1, 5));
    }// </editor-fold>//GEN-END:initComponents

    private void star1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_star1ActionPerformed
        // TODO add your handling code here:
        star1.setSelected(true);
        star2.setSelected(false);
        star3.setSelected(false);
        star4.setSelected(false);
        star5.setSelected(false);
    }//GEN-LAST:event_star1ActionPerformed

    private void star2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_star2ActionPerformed
        // TODO add your handling code here:
        star1.setSelected(true);
        star2.setSelected(true);
        star3.setSelected(false);
        star4.setSelected(false);
        star5.setSelected(false);
    }//GEN-LAST:event_star2ActionPerformed

    private void star3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_star3ActionPerformed
        // TODO add your handling code here:
        star1.setSelected(true);
        star2.setSelected(true);
        star3.setSelected(true);
        star4.setSelected(false);
        star5.setSelected(false);
    }//GEN-LAST:event_star3ActionPerformed

    private void star4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_star4ActionPerformed
        // TODO add your handling code here:
        star1.setSelected(true);
        star2.setSelected(true);
        star3.setSelected(true);
        star4.setSelected(true);
        star5.setSelected(false);
    }//GEN-LAST:event_star4ActionPerformed

    private void star5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_star5ActionPerformed
        // TODO add your handling code here:
        star1.setSelected(true);
        star2.setSelected(true);
        star3.setSelected(true);
        star4.setSelected(true);
        star5.setSelected(true);
    }//GEN-LAST:event_star5ActionPerformed


    @Override
    public void setBackground(Color color){
        super.setBackground(color);
        for(Component com : getComponents()){
            com.setBackground(color);
            
        }     
    }
    
    @Override
    public void setForeground(Color color){
        super.setForeground(color);
        for(Component com : getComponents()){
             com.setForeground(color);
        }
        
        
        
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
