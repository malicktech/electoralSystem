/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elections.ui.service;

/**
 *
 * @author usrlocal
 */
public abstract class AbstractElectionsSwing extends javax.swing.JFrame {

  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
   * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The
   * content of this method is always regenerated by the Form Editor.
   */
  
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jLabel1 = new javax.swing.JLabel();
    jLabelSAP = new javax.swing.JLabel();
    jLabelSE = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    jLabel5 = new javax.swing.JLabel();
    jTextFieldVoixListe = new javax.swing.JTextField();
    jComboBoxNomsListes = new javax.swing.JComboBox<>();
    jScrollPane1 = new javax.swing.JScrollPane();
    jListNomsVoix = new javax.swing.JList<>();
    jLabelAjouter = new javax.swing.JLabel();
    jLabelCalculer = new javax.swing.JLabel();
    jLabelEffacer = new javax.swing.JLabel();
    jLabelEnregistrer = new javax.swing.JLabel();
    jScrollPane2 = new javax.swing.JScrollPane();
    jListResultats = new javax.swing.JList<>();
    jScrollPane3 = new javax.swing.JScrollPane();
    jTextPaneMessages = new javax.swing.JTextPane();
    jLabelSupprimer = new javax.swing.JLabel();
    jMenuBar1 = new javax.swing.JMenuBar();
    jMenuElections = new javax.swing.JMenu();
    jMenuItemQuitter = new javax.swing.JMenuItem();
    jMenuListes = new javax.swing.JMenu();
    jMenuItemAjouter = new javax.swing.JMenuItem();
    jMenuItemSupprimer = new javax.swing.JMenuItem();
    jMenuResultats = new javax.swing.JMenu();
    jMenuItemCalculer = new javax.swing.JMenuItem();
    jMenuItemEffacer = new javax.swing.JMenuItem();
    jMenuItemEnregistrer = new javax.swing.JMenuItem();
    jMenuAPropos = new javax.swing.JMenu();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel1.setText("ELECTIONS");

    jLabelSAP.setText("Nombre de sièges à pourvoir : ");

    jLabelSE.setText("Seuil électoral : ");

    jLabel4.setText("Liste");

    jLabel5.setText("Voix");

    jTextFieldVoixListe.addCaretListener(new javax.swing.event.CaretListener() {
      public void caretUpdate(javax.swing.event.CaretEvent evt) {
        jTextFieldVoixListeCaretUpdate(evt);
      }
    });

    jListNomsVoix.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        jListNomsVoixMouseClicked(evt);
      }
    });
    jScrollPane1.setViewportView(jListNomsVoix);

    jLabelAjouter.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
    jLabelAjouter.setForeground(new java.awt.Color(0, 0, 204));
    jLabelAjouter.setText("Ajouter -->");
    jLabelAjouter.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        jLabelAjouterMouseClicked(evt);
      }
    });

    jLabelCalculer.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
    jLabelCalculer.setForeground(new java.awt.Color(0, 0, 204));
    jLabelCalculer.setText("Calculer");
    jLabelCalculer.setPreferredSize(new java.awt.Dimension(50, 14));
    jLabelCalculer.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        jLabelCalculerMouseClicked(evt);
      }
    });

    jLabelEffacer.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
    jLabelEffacer.setForeground(new java.awt.Color(0, 0, 204));
    jLabelEffacer.setText("Effacer");
    jLabelEffacer.setPreferredSize(new java.awt.Dimension(45, 14));
    jLabelEffacer.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        jLabelEffacerMouseClicked(evt);
      }
    });

    jLabelEnregistrer.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
    jLabelEnregistrer.setForeground(new java.awt.Color(0, 0, 204));
    jLabelEnregistrer.setText("Enregistrer");
    jLabelEnregistrer.setPreferredSize(new java.awt.Dimension(70, 14));
    jLabelEnregistrer.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        jLabelEnregistrerMouseClicked(evt);
      }
    });

    jListResultats.setEnabled(false);
    jScrollPane2.setViewportView(jListResultats);

    jTextPaneMessages.setEditable(false);
    jScrollPane3.setViewportView(jTextPaneMessages);

    jLabelSupprimer.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
    jLabelSupprimer.setForeground(new java.awt.Color(0, 0, 204));
    jLabelSupprimer.setText("Supprimer");
    jLabelSupprimer.setMaximumSize(new java.awt.Dimension(65, 14));
    jLabelSupprimer.setPreferredSize(new java.awt.Dimension(65, 14));
    jLabelSupprimer.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        jLabelSupprimerMouseClicked(evt);
      }
    });

    jMenuElections.setText("Elections");

    jMenuItemQuitter.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.ALT_MASK));
    jMenuItemQuitter.setText("Quitter");
    jMenuItemQuitter.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jMenuItemQuitterActionPerformed(evt);
      }
    });
    jMenuElections.add(jMenuItemQuitter);

    jMenuBar1.add(jMenuElections);

    jMenuListes.setText("Listes");

    jMenuItemAjouter.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK));
    jMenuItemAjouter.setText("Ajouter");
    jMenuItemAjouter.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jMenuItemAjouterActionPerformed(evt);
      }
    });
    jMenuListes.add(jMenuItemAjouter);

    jMenuItemSupprimer.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK));
    jMenuItemSupprimer.setText("Supprimer");
    jMenuItemSupprimer.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jMenuItemSupprimerActionPerformed(evt);
      }
    });
    jMenuListes.add(jMenuItemSupprimer);

    jMenuBar1.add(jMenuListes);

    jMenuResultats.setText("Resultats");

    jMenuItemCalculer.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
    jMenuItemCalculer.setText("Calculer");
    jMenuItemCalculer.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jMenuItemCalculerActionPerformed(evt);
      }
    });
    jMenuResultats.add(jMenuItemCalculer);

    jMenuItemEffacer.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK));
    jMenuItemEffacer.setText("Effacer");
    jMenuItemEffacer.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jMenuItemEffacerActionPerformed(evt);
      }
    });
    jMenuResultats.add(jMenuItemEffacer);

    jMenuItemEnregistrer.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_MASK));
    jMenuItemEnregistrer.setText("Enregistrer");
    jMenuItemEnregistrer.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jMenuItemEnregistrerActionPerformed(evt);
      }
    });
    jMenuResultats.add(jMenuItemEnregistrer);

    jMenuBar1.add(jMenuResultats);

    jMenuAPropos.setText("A propos");
    jMenuBar1.add(jMenuAPropos);

    setJMenuBar(jMenuBar1);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(153, 153, 153)
        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(143, Short.MAX_VALUE))
      .addGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
              .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                  .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                      .addComponent(jLabel5)
                      .addComponent(jLabel4))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                      .addComponent(jComboBoxNomsListes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                      .addComponent(jTextFieldVoixListe, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                  .addComponent(jLabelEnregistrer, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(jLabelEffacer, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(jLabelSE, javax.swing.GroupLayout.Alignment.LEADING))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(layout.createSequentialGroup()
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane2))
                  .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                      .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabelAjouter)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                      .addGroup(layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(jLabelSupprimer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 0, Short.MAX_VALUE))))
              .addComponent(jLabelCalculer, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jLabelSAP, javax.swing.GroupLayout.Alignment.LEADING)))
          .addGroup(layout.createSequentialGroup()
            .addGap(18, 18, 18)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)))
        .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(24, 24, 24)
        .addComponent(jLabel1)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGap(26, 26, 26)
            .addComponent(jLabelSAP)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jLabelSE)
            .addGap(31, 31, 31)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jLabel4)
              .addComponent(jComboBoxNomsListes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jLabelAjouter))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jLabel5)
              .addComponent(jTextFieldVoixListe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
          .addGroup(layout.createSequentialGroup()
            .addGap(62, 62, 62)
            .addComponent(jLabelSupprimer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addComponent(jLabelCalculer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(11, 11, 11)
            .addComponent(jLabelEffacer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jLabelEnregistrer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void jMenuItemQuitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemQuitterActionPerformed
    doQuitter();
  }//GEN-LAST:event_jMenuItemQuitterActionPerformed

  private void jMenuItemAjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAjouterActionPerformed
    doAjouter();
  }//GEN-LAST:event_jMenuItemAjouterActionPerformed

  private void jMenuItemSupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSupprimerActionPerformed
    doSupprimer();
  }//GEN-LAST:event_jMenuItemSupprimerActionPerformed

  private void jMenuItemCalculerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCalculerActionPerformed
    doCalculer();
  }//GEN-LAST:event_jMenuItemCalculerActionPerformed

  private void jMenuItemEffacerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEffacerActionPerformed
    doEffacer();
  }//GEN-LAST:event_jMenuItemEffacerActionPerformed

  private void jMenuItemEnregistrerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEnregistrerActionPerformed
    doEnregistrer();
  }//GEN-LAST:event_jMenuItemEnregistrerActionPerformed

  private void jTextFieldVoixListeCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextFieldVoixListeCaretUpdate
    doMajLabelAjouter();
  }//GEN-LAST:event_jTextFieldVoixListeCaretUpdate

  private void jListNomsVoixMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListNomsVoixMouseClicked
    doMajLabelSupprimer();
  }//GEN-LAST:event_jListNomsVoixMouseClicked

  private void jLabelAjouterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAjouterMouseClicked
    doAjouter();
  }//GEN-LAST:event_jLabelAjouterMouseClicked

  private void jLabelCalculerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCalculerMouseClicked
    doCalculer();
  }//GEN-LAST:event_jLabelCalculerMouseClicked

  private void jLabelEffacerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelEffacerMouseClicked
    doEffacer();
  }//GEN-LAST:event_jLabelEffacerMouseClicked

  private void jLabelEnregistrerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelEnregistrerMouseClicked
    doEnregistrer();
  }//GEN-LAST:event_jLabelEnregistrerMouseClicked

  private void jLabelSupprimerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSupprimerMouseClicked
    doSupprimer();
  }//GEN-LAST:event_jLabelSupprimerMouseClicked

  protected void init(){
    initComponents();
  }
  
  // gestionnaires d'événements
  abstract protected void doSupprimer();

  abstract protected void doCalculer();

  abstract protected void doQuitter();

  abstract protected void doEffacer();

  abstract protected void doEnregistrer();

  abstract protected void doAjouter();

  abstract protected void doInformer();

  abstract protected void doMajLabelAjouter();

  abstract protected void doMajLabelSupprimer();

  // Variables declaration - do not modify//GEN-BEGIN:variables
  protected javax.swing.JComboBox<String> jComboBoxNomsListes;
  protected javax.swing.JLabel jLabel1;
  protected javax.swing.JLabel jLabel4;
  protected javax.swing.JLabel jLabel5;
  protected javax.swing.JLabel jLabelAjouter;
  protected javax.swing.JLabel jLabelCalculer;
  protected javax.swing.JLabel jLabelEffacer;
  protected javax.swing.JLabel jLabelEnregistrer;
  protected javax.swing.JLabel jLabelSAP;
  protected javax.swing.JLabel jLabelSE;
  protected javax.swing.JLabel jLabelSupprimer;
  protected javax.swing.JList<String> jListNomsVoix;
  protected javax.swing.JList<String> jListResultats;
  protected javax.swing.JMenu jMenuAPropos;
  protected javax.swing.JMenuBar jMenuBar1;
  protected javax.swing.JMenu jMenuElections;
  protected javax.swing.JMenuItem jMenuItemAjouter;
  protected javax.swing.JMenuItem jMenuItemCalculer;
  protected javax.swing.JMenuItem jMenuItemEffacer;
  protected javax.swing.JMenuItem jMenuItemEnregistrer;
  protected javax.swing.JMenuItem jMenuItemQuitter;
  protected javax.swing.JMenuItem jMenuItemSupprimer;
  protected javax.swing.JMenu jMenuListes;
  protected javax.swing.JMenu jMenuResultats;
  protected javax.swing.JScrollPane jScrollPane1;
  protected javax.swing.JScrollPane jScrollPane2;
  protected javax.swing.JScrollPane jScrollPane3;
  protected javax.swing.JTextField jTextFieldVoixListe;
  protected javax.swing.JTextPane jTextPaneMessages;
  // End of variables declaration//GEN-END:variables
}