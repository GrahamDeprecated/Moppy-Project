/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package electronicsclub.moppyproject.testing;

/**
 * 
 * @author Graham Campbell
 * @author Michael Marley
 * @author SammyIAm
 * 
 */
public class FloppyDisplay extends javax.swing.JPanel {

    /**
     * Creates new form FloppyDisplay
     */
    public FloppyDisplay(int driveNumber, int pinNumber) {
        initComponents();
        jLabel1.setText(String.valueOf(driveNumber));
        jLabel1.setToolTipText("Drive " + driveNumber + ", connected to pin #"
                + pinNumber);
    }

    public void setNote(String note) {
        noteDisplay.setText(note);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed"
    // desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        noteDisplay = new javax.swing.JTextField();

        setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("driveNumber");

        noteDisplay.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(layout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(
                        layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1,
                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                        18,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(
                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(noteDisplay,
                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                        58, Short.MAX_VALUE).addContainerGap()));
        layout.setVerticalGroup(layout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(
                        layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(
                                        layout.createParallelGroup(
                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel1)
                                                .addComponent(
                                                        noteDisplay,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(
                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                        Short.MAX_VALUE)));
    }// </editor-fold>//GEN-END:initComponents
     // Variables declaration - do not modify//GEN-BEGIN:variables

    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField noteDisplay;
    // End of variables declaration//GEN-END:variables
}