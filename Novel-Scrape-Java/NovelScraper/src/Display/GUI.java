/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Display;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author super
 */
public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    private Image img =(new ImageIcon(getClass().getResource("/rsc/icon.png"))).getImage();
    public GUI() {
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

        sourceSelectionPanel = new javax.swing.JPanel();
        novelPlanetIconLabel = new javax.swing.JLabel();
        wuxiaWorldIconLabel = new javax.swing.JLabel();
        wuxiaCoWorldIconLabel = new javax.swing.JLabel();
        homeIconLabel = new javax.swing.JLabel();
        headerPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        contentPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("dr_nyt's NovelScraper");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImage(img);

        sourceSelectionPanel.setBackground(new java.awt.Color(2, 39, 87));
        sourceSelectionPanel.setForeground(new java.awt.Color(255, 255, 255));

        novelPlanetIconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rsc/NovelPlanet Logo.png"))); // NOI18N
        novelPlanetIconLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                novelPlanetIconLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                novelPlanetIconLabelMouseExited(evt);
            }
        });

        wuxiaWorldIconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rsc/WuxiaWorld Logo.png"))); // NOI18N
        wuxiaWorldIconLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                wuxiaWorldIconLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                wuxiaWorldIconLabelMouseExited(evt);
            }
        });

        wuxiaCoWorldIconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rsc/m.WuxiaWorld Logo.png"))); // NOI18N
        wuxiaCoWorldIconLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                wuxiaCoWorldIconLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                wuxiaCoWorldIconLabelMouseExited(evt);
            }
        });

        homeIconLabel.setBackground(new java.awt.Color(255, 255, 255));
        homeIconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rsc/home.png"))); // NOI18N
        homeIconLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                homeIconLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                homeIconLabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout sourceSelectionPanelLayout = new javax.swing.GroupLayout(sourceSelectionPanel);
        sourceSelectionPanel.setLayout(sourceSelectionPanelLayout);
        sourceSelectionPanelLayout.setHorizontalGroup(
            sourceSelectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sourceSelectionPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(sourceSelectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(wuxiaCoWorldIconLabel)
                    .addComponent(wuxiaWorldIconLabel)
                    .addComponent(novelPlanetIconLabel)
                    .addComponent(homeIconLabel))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        sourceSelectionPanelLayout.setVerticalGroup(
            sourceSelectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sourceSelectionPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(homeIconLabel)
                .addGap(60, 60, 60)
                .addComponent(novelPlanetIconLabel)
                .addGap(60, 60, 60)
                .addComponent(wuxiaWorldIconLabel)
                .addGap(60, 60, 60)
                .addComponent(wuxiaCoWorldIconLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        headerPanel.setBackground(new java.awt.Color(14, 78, 159));
        headerPanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerPanelMouseDragged(evt);
            }
        });
        headerPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerPanelMousePressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Agency FB", 1, 60)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("NovelScraper");

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(406, Short.MAX_VALUE))
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanelLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        contentPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout contentPanelLayout = new javax.swing.GroupLayout(contentPanel);
        contentPanel.setLayout(contentPanelLayout);
        contentPanelLayout.setHorizontalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        contentPanelLayout.setVerticalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(sourceSelectionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(contentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sourceSelectionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(contentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeIconLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeIconLabelMouseEntered
        ImageIcon hoverIcon = new ImageIcon(getClass().getResource("/rsc/home-hover.png"));
        homeIconLabel.setIcon(hoverIcon);
    }//GEN-LAST:event_homeIconLabelMouseEntered

    private void homeIconLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeIconLabelMouseExited
        ImageIcon defaultIcon = new ImageIcon(getClass().getResource("/rsc/home.png"));
        homeIconLabel.setIcon(defaultIcon);
    }//GEN-LAST:event_homeIconLabelMouseExited

    private void novelPlanetIconLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_novelPlanetIconLabelMouseEntered
        ImageIcon hoverIcon = new ImageIcon(getClass().getResource("/rsc/NovelPlanet Logo-hover.png"));
        novelPlanetIconLabel.setIcon(hoverIcon);
    }//GEN-LAST:event_novelPlanetIconLabelMouseEntered

    private void novelPlanetIconLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_novelPlanetIconLabelMouseExited
        ImageIcon defaultIcon = new ImageIcon(getClass().getResource("/rsc/NovelPlanet Logo.png"));
        novelPlanetIconLabel.setIcon(defaultIcon);
    }//GEN-LAST:event_novelPlanetIconLabelMouseExited

    private void wuxiaWorldIconLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wuxiaWorldIconLabelMouseEntered
        ImageIcon hoverIcon = new ImageIcon(getClass().getResource("/rsc/WuxiaWorld Logo-hover.png"));
        wuxiaWorldIconLabel.setIcon(hoverIcon);
    }//GEN-LAST:event_wuxiaWorldIconLabelMouseEntered

    private void wuxiaWorldIconLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wuxiaWorldIconLabelMouseExited
        ImageIcon defaultIcon = new ImageIcon(getClass().getResource("/rsc/WuxiaWorld Logo.png"));
        wuxiaWorldIconLabel.setIcon(defaultIcon);
    }//GEN-LAST:event_wuxiaWorldIconLabelMouseExited

    private void wuxiaCoWorldIconLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wuxiaCoWorldIconLabelMouseEntered
        ImageIcon hoverIcon = new ImageIcon(getClass().getResource("/rsc/m.WuxiaWorld Logo-hover.png"));
        wuxiaCoWorldIconLabel.setIcon(hoverIcon);
    }//GEN-LAST:event_wuxiaCoWorldIconLabelMouseEntered

    private void wuxiaCoWorldIconLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wuxiaCoWorldIconLabelMouseExited
        ImageIcon defaultIcon = new ImageIcon(getClass().getResource("/rsc/m.WuxiaWorld Logo.png"));
        wuxiaCoWorldIconLabel.setIcon(defaultIcon);
    }//GEN-LAST:event_wuxiaCoWorldIconLabelMouseExited

//    Uncomment his section when undecorated frame is used. Ask dr_nyt for more info.
//    int xx = 0;
//    int yy = 0;
    private void headerPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerPanelMousePressed
//        xx=evt.getX();
//        yy=evt.getY();  
    }//GEN-LAST:event_headerPanelMousePressed

    private void headerPanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerPanelMouseDragged
//        int x=evt.getXOnScreen();
//        int y=evt.getYOnScreen();
//        this.setLocation(x-xx, y-yy);
    }//GEN-LAST:event_headerPanelMouseDragged

    
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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contentPanel;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel homeIconLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel novelPlanetIconLabel;
    private javax.swing.JPanel sourceSelectionPanel;
    private javax.swing.JLabel wuxiaCoWorldIconLabel;
    private javax.swing.JLabel wuxiaWorldIconLabel;
    // End of variables declaration//GEN-END:variables
}
