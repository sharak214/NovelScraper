/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Display;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import main.Handler;

/**
 *
 * @author super
 */
public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    private Handler handler;
    
    private Image img =(new ImageIcon(getClass().getResource("/rsc/icon.png"))).getImage();
    public GUI(Handler handler) {
        this.handler = handler;
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
        titleLabel = new javax.swing.JLabel();
        contentPanel = new javax.swing.JPanel();
        homePanel = new javax.swing.JPanel();
        wuxiaWorldPanel = new javax.swing.JPanel();
        wuxiaWorldRunButton = new javax.swing.JButton();
        urlLabel = new javax.swing.JLabel();
        urlTextField = new javax.swing.JTextField();
        coverLabel = new javax.swing.JLabel();
        coverTextField = new javax.swing.JTextField();
        wuxiaWorldRunButton1 = new javax.swing.JButton();

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
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                wuxiaWorldIconLabelMouseClicked(evt);
            }
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

        titleLabel.setFont(new java.awt.Font("Agency FB", 1, 60)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel.setText("NovelScraper");

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel)
                .addContainerGap(406, Short.MAX_VALUE))
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanelLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(titleLabel)
                .addContainerGap())
        );

        contentPanel.setBackground(new java.awt.Color(255, 255, 255));

        homePanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout homePanelLayout = new javax.swing.GroupLayout(homePanel);
        homePanel.setLayout(homePanelLayout);
        homePanelLayout.setHorizontalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 668, Short.MAX_VALUE)
        );
        homePanelLayout.setVerticalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 512, Short.MAX_VALUE)
        );

        wuxiaWorldPanel.setBackground(new java.awt.Color(255, 255, 255));

        wuxiaWorldRunButton.setBackground(new java.awt.Color(2, 39, 87));
        wuxiaWorldRunButton.setForeground(new java.awt.Color(255, 255, 255));
        wuxiaWorldRunButton.setText("Run");
        wuxiaWorldRunButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                wuxiaWorldRunButtonMouseClicked(evt);
            }
        });
        wuxiaWorldRunButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wuxiaWorldRunButtonActionPerformed(evt);
            }
        });

        urlLabel.setBackground(new java.awt.Color(2, 39, 87));
        urlLabel.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        urlLabel.setForeground(new java.awt.Color(2, 39, 87));
        urlLabel.setText("URL :");

        urlTextField.setBackground(new java.awt.Color(255, 255, 255));
        urlTextField.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        urlTextField.setForeground(new java.awt.Color(2, 39, 87));
        urlTextField.setToolTipText("");
        urlTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                urlTextFieldActionPerformed(evt);
            }
        });

        coverLabel.setBackground(new java.awt.Color(2, 39, 87));
        coverLabel.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        coverLabel.setForeground(new java.awt.Color(2, 39, 87));
        coverLabel.setText("Cover :");

        coverTextField.setBackground(new java.awt.Color(255, 255, 255));
        coverTextField.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        coverTextField.setForeground(new java.awt.Color(2, 39, 87));
        coverTextField.setText("rsc/cover.png");
        coverTextField.setToolTipText("");
        coverTextField.setEnabled(false);
        coverTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coverTextFieldActionPerformed(evt);
            }
        });

        wuxiaWorldRunButton1.setBackground(new java.awt.Color(2, 39, 87));
        wuxiaWorldRunButton1.setForeground(new java.awt.Color(255, 255, 255));
        wuxiaWorldRunButton1.setText("Browse");

        javax.swing.GroupLayout wuxiaWorldPanelLayout = new javax.swing.GroupLayout(wuxiaWorldPanel);
        wuxiaWorldPanel.setLayout(wuxiaWorldPanelLayout);
        wuxiaWorldPanelLayout.setHorizontalGroup(
            wuxiaWorldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, wuxiaWorldPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(wuxiaWorldRunButton)
                .addGap(293, 293, 293))
            .addGroup(wuxiaWorldPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(wuxiaWorldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(wuxiaWorldPanelLayout.createSequentialGroup()
                        .addComponent(coverLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(coverTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(wuxiaWorldRunButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(wuxiaWorldPanelLayout.createSequentialGroup()
                        .addComponent(urlLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(urlTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        wuxiaWorldPanelLayout.setVerticalGroup(
            wuxiaWorldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, wuxiaWorldPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(wuxiaWorldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(urlLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(urlTextField))
                .addGap(18, 18, 18)
                .addGroup(wuxiaWorldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(coverLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(wuxiaWorldRunButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(coverTextField))
                .addGap(164, 164, 164)
                .addComponent(wuxiaWorldRunButton)
                .addGap(208, 208, 208))
        );

        javax.swing.GroupLayout contentPanelLayout = new javax.swing.GroupLayout(contentPanel);
        contentPanel.setLayout(contentPanelLayout);
        contentPanelLayout.setHorizontalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 692, Short.MAX_VALUE)
            .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(contentPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(wuxiaWorldPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(contentPanelLayout.createSequentialGroup()
                    .addGap(12, 12, 12)
                    .addComponent(homePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(12, 12, 12)))
        );
        contentPanelLayout.setVerticalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 536, Short.MAX_VALUE)
            .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(contentPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(wuxiaWorldPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(contentPanelLayout.createSequentialGroup()
                    .addGap(12, 12, 12)
                    .addComponent(homePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(12, Short.MAX_VALUE)))
        );

        wuxiaWorldPanel.setVisible(false);

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

    private void wuxiaWorldIconLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wuxiaWorldIconLabelMouseClicked

        this.homePanel.setVisible(false);
        this.wuxiaWorldPanel.setVisible(true);
    }//GEN-LAST:event_wuxiaWorldIconLabelMouseClicked

    private void wuxiaWorldRunButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wuxiaWorldRunButtonMouseClicked

    }//GEN-LAST:event_wuxiaWorldRunButtonMouseClicked

    private void wuxiaWorldRunButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wuxiaWorldRunButtonActionPerformed
        handler.setWuxiaWorld("https://www.wuxiaworld.com/novel/overgeared", "cover.png", 1, handler);
        this.wuxiaWorldRunButton.setEnabled(false);
    }//GEN-LAST:event_wuxiaWorldRunButtonActionPerformed

    private void urlTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_urlTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_urlTextFieldActionPerformed

    private void coverTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coverTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_coverTextFieldActionPerformed

    public JButton getWuxiaWorldRunButton() {
        return wuxiaWorldRunButton;
    }

    
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
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contentPanel;
    private javax.swing.JLabel coverLabel;
    private javax.swing.JTextField coverTextField;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel homeIconLabel;
    private javax.swing.JPanel homePanel;
    private javax.swing.JLabel novelPlanetIconLabel;
    private javax.swing.JPanel sourceSelectionPanel;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JLabel urlLabel;
    private javax.swing.JTextField urlTextField;
    private javax.swing.JLabel wuxiaCoWorldIconLabel;
    private javax.swing.JLabel wuxiaWorldIconLabel;
    private javax.swing.JPanel wuxiaWorldPanel;
    private javax.swing.JButton wuxiaWorldRunButton;
    private javax.swing.JButton wuxiaWorldRunButton1;
    // End of variables declaration//GEN-END:variables
}