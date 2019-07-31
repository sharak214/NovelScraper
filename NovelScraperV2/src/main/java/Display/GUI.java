/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Display;

import NovelScraperV2.Handler;
import NovelScraperV2.Novel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author super
 */
public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    private Handler handler;
    private String currentPage;
    private MouseListener homeButtonMouseAdapter;
    private MouseListener sourcesButtonMouseAdapter;
    
    public GUI() {
        
        initComponents();
        
        this.currentPage = "home";
        loadPage(this.currentPage);  
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainMenuPanel = new javax.swing.JPanel();
        mainHomeButton = new javax.swing.JButton();
        mainSourcesButton = new javax.swing.JButton();
        mainLibraryButton = new javax.swing.JButton();
        mainSettingsButton = new javax.swing.JButton();
        mainTitlePanel = new javax.swing.JPanel();
        mainTitle = new javax.swing.JLabel();
        mainContentPanel = new javax.swing.JLayeredPane();
        settingsPanel = new javax.swing.JPanel();
        homePanel = new javax.swing.JPanel();
        wuxiaWorldPanel = new javax.swing.JPanel();
        wuxiaWorldContentPanel = new javax.swing.JPanel();
        wuxiaWorldLoadingGif = new javax.swing.JLabel();
        wuxiaWorldURLBar = new javax.swing.JTextField();
        wuxiaWorldSearchURLButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        novelPanel = new javax.swing.JPanel();
        novelCoverHolder = new javax.swing.JLabel();
        libraryPanel = new javax.swing.JPanel();
        sourcesPanel = new javax.swing.JPanel();
        sourcesWuxiaWorldButton = new javax.swing.JButton();
        sourcesWuxiaWorldLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainMenuPanel.setBackground(new java.awt.Color(2, 39, 87));

        mainHomeButton.setBackground(new java.awt.Color(240, 255, 255));
        mainHomeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rsc/home-hover.png"))); // NOI18N
        mainHomeButton.setBorderPainted(false);
        mainHomeButton.setContentAreaFilled(false);
        mainHomeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mainHomeButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mainHomeButtonMouseExited(evt);
            }
        });
        mainHomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainHomeButtonActionPerformed(evt);
            }
        });

        mainSourcesButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rsc/sources.png"))); // NOI18N
        mainSourcesButton.setBorderPainted(false);
        mainSourcesButton.setContentAreaFilled(false);
        mainSourcesButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mainSourcesButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mainSourcesButtonMouseExited(evt);
            }
        });
        mainSourcesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainSourcesButtonActionPerformed(evt);
            }
        });

        mainLibraryButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rsc/library.png"))); // NOI18N
        mainLibraryButton.setBorderPainted(false);
        mainLibraryButton.setContentAreaFilled(false);
        mainLibraryButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mainLibraryButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mainLibraryButtonMouseExited(evt);
            }
        });
        mainLibraryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainLibraryButtonActionPerformed(evt);
            }
        });

        mainSettingsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rsc/settings.png"))); // NOI18N
        mainSettingsButton.setBorderPainted(false);
        mainSettingsButton.setContentAreaFilled(false);
        mainSettingsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mainSettingsButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mainSettingsButtonMouseExited(evt);
            }
        });
        mainSettingsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainSettingsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainMenuPanelLayout = new javax.swing.GroupLayout(mainMenuPanel);
        mainMenuPanel.setLayout(mainMenuPanelLayout);
        mainMenuPanelLayout.setHorizontalGroup(
            mainMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(mainHomeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(mainSourcesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(mainLibraryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(mainSettingsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        mainMenuPanelLayout.setVerticalGroup(
            mainMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainMenuPanelLayout.createSequentialGroup()
                .addComponent(mainHomeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(mainSourcesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(mainLibraryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(mainSettingsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        mainTitlePanel.setBackground(new java.awt.Color(14, 50, 150));

        mainTitle.setFont(new java.awt.Font("Agency FB", 1, 60)); // NOI18N
        mainTitle.setForeground(new java.awt.Color(255, 255, 255));
        mainTitle.setText("Home");

        javax.swing.GroupLayout mainTitlePanelLayout = new javax.swing.GroupLayout(mainTitlePanel);
        mainTitlePanel.setLayout(mainTitlePanelLayout);
        mainTitlePanelLayout.setHorizontalGroup(
            mainTitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainTitlePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mainTitlePanelLayout.setVerticalGroup(
            mainTitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainTitlePanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(mainTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        settingsPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout settingsPanelLayout = new javax.swing.GroupLayout(settingsPanel);
        settingsPanel.setLayout(settingsPanelLayout);
        settingsPanelLayout.setHorizontalGroup(
            settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 688, Short.MAX_VALUE)
        );
        settingsPanelLayout.setVerticalGroup(
            settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 518, Short.MAX_VALUE)
        );

        homePanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout homePanelLayout = new javax.swing.GroupLayout(homePanel);
        homePanel.setLayout(homePanelLayout);
        homePanelLayout.setHorizontalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 790, Short.MAX_VALUE)
        );
        homePanelLayout.setVerticalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 596, Short.MAX_VALUE)
        );

        wuxiaWorldPanel.setBackground(new java.awt.Color(255, 255, 255));

        wuxiaWorldContentPanel.setBackground(new java.awt.Color(2, 39, 87));

        wuxiaWorldLoadingGif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rsc/ajax-loader.gif"))); // NOI18N

        javax.swing.GroupLayout wuxiaWorldContentPanelLayout = new javax.swing.GroupLayout(wuxiaWorldContentPanel);
        wuxiaWorldContentPanel.setLayout(wuxiaWorldContentPanelLayout);
        wuxiaWorldContentPanelLayout.setHorizontalGroup(
            wuxiaWorldContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(wuxiaWorldContentPanelLayout.createSequentialGroup()
                .addGap(373, 373, 373)
                .addComponent(wuxiaWorldLoadingGif)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        wuxiaWorldContentPanelLayout.setVerticalGroup(
            wuxiaWorldContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(wuxiaWorldContentPanelLayout.createSequentialGroup()
                .addGap(208, 208, 208)
                .addComponent(wuxiaWorldLoadingGif)
                .addContainerGap(228, Short.MAX_VALUE))
        );

        wuxiaWorldURLBar.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        wuxiaWorldURLBar.setForeground(new java.awt.Color(100, 100, 100));
        wuxiaWorldURLBar.setText("URL");

        wuxiaWorldSearchURLButton.setBackground(new java.awt.Color(2, 39, 87));
        wuxiaWorldSearchURLButton.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        wuxiaWorldSearchURLButton.setForeground(new java.awt.Color(255, 255, 255));
        wuxiaWorldSearchURLButton.setText("Find");
        wuxiaWorldSearchURLButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wuxiaWorldSearchURLButtonActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(2, 39, 87));
        jButton1.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("NEW");
        jButton1.setBorderPainted(false);

        javax.swing.GroupLayout wuxiaWorldPanelLayout = new javax.swing.GroupLayout(wuxiaWorldPanel);
        wuxiaWorldPanel.setLayout(wuxiaWorldPanelLayout);
        wuxiaWorldPanelLayout.setHorizontalGroup(
            wuxiaWorldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(wuxiaWorldContentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(wuxiaWorldPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(wuxiaWorldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(wuxiaWorldPanelLayout.createSequentialGroup()
                        .addComponent(wuxiaWorldURLBar, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(wuxiaWorldSearchURLButton, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE))
                    .addGroup(wuxiaWorldPanelLayout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        wuxiaWorldPanelLayout.setVerticalGroup(
            wuxiaWorldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, wuxiaWorldPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(wuxiaWorldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(wuxiaWorldURLBar)
                    .addComponent(wuxiaWorldSearchURLButton, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(wuxiaWorldContentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        novelPanel.setBackground(new java.awt.Color(255, 255, 255));

        novelCoverHolder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rsc/loading-images.gif"))); // NOI18N

        javax.swing.GroupLayout novelPanelLayout = new javax.swing.GroupLayout(novelPanel);
        novelPanel.setLayout(novelPanelLayout);
        novelPanelLayout.setHorizontalGroup(
            novelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(novelPanelLayout.createSequentialGroup()
                .addComponent(novelCoverHolder)
                .addGap(0, 610, Short.MAX_VALUE))
        );
        novelPanelLayout.setVerticalGroup(
            novelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(novelPanelLayout.createSequentialGroup()
                .addComponent(novelCoverHolder)
                .addGap(0, 416, Short.MAX_VALUE))
        );

        libraryPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout libraryPanelLayout = new javax.swing.GroupLayout(libraryPanel);
        libraryPanel.setLayout(libraryPanelLayout);
        libraryPanelLayout.setHorizontalGroup(
            libraryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 790, Short.MAX_VALUE)
        );
        libraryPanelLayout.setVerticalGroup(
            libraryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 596, Short.MAX_VALUE)
        );

        sourcesPanel.setBackground(new java.awt.Color(255, 255, 255));

        sourcesWuxiaWorldButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rsc/WuxiaWorld Logo.png"))); // NOI18N
        sourcesWuxiaWorldButton.setBorderPainted(false);
        sourcesWuxiaWorldButton.setContentAreaFilled(false);
        sourcesWuxiaWorldButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sourcesWuxiaWorldButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sourcesWuxiaWorldButtonMouseExited(evt);
            }
        });
        sourcesWuxiaWorldButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sourcesWuxiaWorldButtonActionPerformed(evt);
            }
        });

        sourcesWuxiaWorldLabel.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        sourcesWuxiaWorldLabel.setText("WuxiaWorld");

        javax.swing.GroupLayout sourcesPanelLayout = new javax.swing.GroupLayout(sourcesPanel);
        sourcesPanel.setLayout(sourcesPanelLayout);
        sourcesPanelLayout.setHorizontalGroup(
            sourcesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sourcesPanelLayout.createSequentialGroup()
                .addGroup(sourcesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sourcesPanelLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(sourcesWuxiaWorldButton))
                    .addGroup(sourcesPanelLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(sourcesWuxiaWorldLabel)))
                .addContainerGap(612, Short.MAX_VALUE))
        );
        sourcesPanelLayout.setVerticalGroup(
            sourcesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sourcesPanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(sourcesWuxiaWorldButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sourcesWuxiaWorldLabel)
                .addContainerGap(409, Short.MAX_VALUE))
        );

        mainContentPanel.setLayer(settingsPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        mainContentPanel.setLayer(homePanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        mainContentPanel.setLayer(wuxiaWorldPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        mainContentPanel.setLayer(novelPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        mainContentPanel.setLayer(libraryPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        mainContentPanel.setLayer(sourcesPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout mainContentPanelLayout = new javax.swing.GroupLayout(mainContentPanel);
        mainContentPanel.setLayout(mainContentPanelLayout);
        mainContentPanelLayout.setHorizontalGroup(
            mainContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(mainContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mainContentPanelLayout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(sourcesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
            .addGroup(mainContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mainContentPanelLayout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(libraryPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
            .addGroup(mainContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mainContentPanelLayout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(novelPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
            .addGroup(mainContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mainContentPanelLayout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(wuxiaWorldPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(mainContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(homePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(mainContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(settingsPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mainContentPanelLayout.setVerticalGroup(
            mainContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 596, Short.MAX_VALUE)
            .addGroup(mainContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mainContentPanelLayout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(sourcesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
            .addGroup(mainContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mainContentPanelLayout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(libraryPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
            .addGroup(mainContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mainContentPanelLayout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(novelPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
            .addGroup(mainContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mainContentPanelLayout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(wuxiaWorldPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(mainContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(homePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(mainContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(settingsPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainMenuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(mainTitlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mainContentPanel))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainTitlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(mainContentPanel))
            .addComponent(mainMenuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Action-Performed
    private void mainHomeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainHomeButtonActionPerformed
        this.loadPage("home");
    }//GEN-LAST:event_mainHomeButtonActionPerformed

    private void mainSourcesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainSourcesButtonActionPerformed
        this.loadPage("sources");
    }//GEN-LAST:event_mainSourcesButtonActionPerformed

    //Mouse-Listeners
    private void mainHomeButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainHomeButtonMouseEntered
        this.mainHomeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rsc/home-hover.png")));
    }//GEN-LAST:event_mainHomeButtonMouseEntered

    private void mainHomeButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainHomeButtonMouseExited
        if(!this.currentPage.equals("home"))
        {
            this.mainHomeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rsc/home.png")));
        }
    }//GEN-LAST:event_mainHomeButtonMouseExited

    private void mainSourcesButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainSourcesButtonMouseEntered
        this.mainSourcesButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rsc/sources-hover.png")));
    }//GEN-LAST:event_mainSourcesButtonMouseEntered

    private void mainSourcesButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainSourcesButtonMouseExited
        if(!this.currentPage.equals("sources"))
        {
            this.mainSourcesButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rsc/sources.png")));
        }
    }//GEN-LAST:event_mainSourcesButtonMouseExited

    private void sourcesWuxiaWorldButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sourcesWuxiaWorldButtonMouseEntered
        this.sourcesWuxiaWorldButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rsc/WuxiaWorld Logo-hover.png")));
    }//GEN-LAST:event_sourcesWuxiaWorldButtonMouseEntered

    private void sourcesWuxiaWorldButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sourcesWuxiaWorldButtonMouseExited
        this.sourcesWuxiaWorldButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rsc/WuxiaWorld Logo.png")));
    }//GEN-LAST:event_sourcesWuxiaWorldButtonMouseExited

    private void mainLibraryButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainLibraryButtonMouseEntered
        this.mainLibraryButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rsc/library-hover.png")));
    }//GEN-LAST:event_mainLibraryButtonMouseEntered

    private void mainLibraryButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainLibraryButtonMouseExited
        if(!this.currentPage.equals("library"))
        {
            this.mainLibraryButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rsc/library.png")));
        }
    }//GEN-LAST:event_mainLibraryButtonMouseExited

    private void mainLibraryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainLibraryButtonActionPerformed
        this.loadPage("library");
    }//GEN-LAST:event_mainLibraryButtonActionPerformed

    private void mainSettingsButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainSettingsButtonMouseEntered
        this.mainSettingsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rsc/settings-hover.png")));
    }//GEN-LAST:event_mainSettingsButtonMouseEntered

    private void mainSettingsButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainSettingsButtonMouseExited
        if(!this.currentPage.equals("settings"))
        {
            this.mainSettingsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rsc/settings.png")));
        }
    }//GEN-LAST:event_mainSettingsButtonMouseExited

    private void mainSettingsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainSettingsButtonActionPerformed
        this.loadPage("settings");
    }//GEN-LAST:event_mainSettingsButtonActionPerformed

    private void sourcesWuxiaWorldButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sourcesWuxiaWorldButtonActionPerformed
        this.handler.setWuxiaWorldLoader();
        this.loadPage("wuxiaworld");
    }//GEN-LAST:event_sourcesWuxiaWorldButtonActionPerformed

    private void wuxiaWorldSearchURLButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wuxiaWorldSearchURLButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_wuxiaWorldSearchURLButtonActionPerformed

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
    
    //Page Loader
    public void loadPage(String page)
    {
        this.loadPage(page, null);
    }
    
    public void loadPage(String page, Novel novel)
    {
        this.currentPage = page;
        
        //Reset Button Images
        this.mainHomeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rsc/home.png")));
        this.mainSourcesButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rsc/sources.png")));
        this.mainLibraryButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rsc/library.png")));
        this.mainSettingsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rsc/settings.png")));
        
        switch(page)
        {
            case "home":
                //Change visiblility of the panels
                this.switchPages();
                
                //Change the current active Button
                this.mainHomeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rsc/home-hover.png")));
                
                //Change title text
                this.mainTitle.setText("Home");
                
                break;
            
            case "sources":
                //Change visiblility of the panels
                this.switchPages();
                
                //Change the current active Button
                this.mainSourcesButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rsc/sources-hover.png")));
                
                //Change title text
                this.mainTitle.setText("Sources");
                
                break;
                
            case "library":
                //Change visiblility of the panels
                this.switchPages();
                
                //Change the current active Button
                this.mainLibraryButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rsc/library-hover.png")));
                
                //Change title text
                this.mainTitle.setText("Library");
                
                break;
                
            case "settings":
                //Change visiblility of the panels
                this.switchPages();
                
                //Change the current active Button
                this.mainSettingsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rsc/settings-hover.png")));
                
                //Change title text
                this.mainTitle.setText("Settings");
                
                break;
                
            case "novel":
                //Change visiblility of the panels
                this.switchPages();
                
                this.novelCoverHolder.setIcon(new ImageIcon(novel.getNovelCover()));
                
                //Change title text
                this.mainTitle.setText(novel.getNovelName());
                
                break;
                
            case "wuxiaworld":
                //Change visiblility of the panels
                this.switchPages();
                
                //Change title text
                this.mainTitle.setText("WuxiaWorld");
                
                break;
                
            default:
                break;
        }
    }
    
    public void switchPages()
    {
        this.checkPage("home", this.homePanel);
        this.checkPage("sources", this.sourcesPanel);
        this.checkPage("library", this.libraryPanel);
        this.checkPage("settings", this.settingsPanel);
        this.checkPage("novel", this.novelPanel);
        this.checkPage("wuxiaworld", this.wuxiaWorldPanel);
    }
    
    public void checkPage(String page, JPanel panel)
    {
        if(this.currentPage.equals(page))
        {
            panel.setVisible(true);
        } else {
            panel.setVisible(false);
        }
    }
    
    //Getters & Setters
    
    public void setHandler(Handler handler)
    {
        this.handler = handler;
    }
    
    public JPanel getWuxiaWorldContentPanel()
    {
        return this.wuxiaWorldContentPanel;
    }
    
    public JLabel getWuxiaWorldLoadingGif()
    {
        return this.wuxiaWorldLoadingGif;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel homePanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel libraryPanel;
    private javax.swing.JLayeredPane mainContentPanel;
    private javax.swing.JButton mainHomeButton;
    private javax.swing.JButton mainLibraryButton;
    private javax.swing.JPanel mainMenuPanel;
    private javax.swing.JButton mainSettingsButton;
    private javax.swing.JButton mainSourcesButton;
    private javax.swing.JLabel mainTitle;
    private javax.swing.JPanel mainTitlePanel;
    private javax.swing.JLabel novelCoverHolder;
    private javax.swing.JPanel novelPanel;
    private javax.swing.JPanel settingsPanel;
    private javax.swing.JPanel sourcesPanel;
    private javax.swing.JButton sourcesWuxiaWorldButton;
    private javax.swing.JLabel sourcesWuxiaWorldLabel;
    private javax.swing.JPanel wuxiaWorldContentPanel;
    private javax.swing.JLabel wuxiaWorldLoadingGif;
    private javax.swing.JPanel wuxiaWorldPanel;
    private javax.swing.JButton wuxiaWorldSearchURLButton;
    private javax.swing.JTextField wuxiaWorldURLBar;
    // End of variables declaration//GEN-END:variables
}