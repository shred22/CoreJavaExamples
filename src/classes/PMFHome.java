package classes;

import javax.swing.*;
import javax.swing.border.*;


public class PMFHome extends JFrame {

    
    public PMFHome() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
   
    private void initComponents() {

        jScrollPane1 = new JScrollPane();
        jEditorPane1 = new JEditorPane();
        basePanel = new JPanel();
        welcomeLabelPanel = new JPanel();
        welcomeLabel = new JLabel();
        pmfLocationPanel = new JPanel();
        pmfLocationLabel = new JLabel();
        pmfLocationTextfFeld = new JTextField();
        releaseNumberPanel = new JPanel();
        releaseNumberLabel = new JLabel();
        releaseNumberTextField = new JTextField();
        pmfVersionPanel = new JPanel();
        pmfVersionLabel = new JLabel();
        pmfVersionNumberTextField = new JTextField();
        buttonPanel = new JPanel();
        versioningButton = new JButton();
        footerLabel = new JLabel();

        jScrollPane1.setViewportView(jEditorPane1);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        basePanel.setBorder(new MatteBorder(null));

        welcomeLabel.setFont(new java.awt.Font("Rockwell Condensed", 1, 36)); // NOI18N
        welcomeLabel.setText("Welcome To PMF Version Uplifter Tool");

        GroupLayout welcomeLabelPanelLayout = new GroupLayout(welcomeLabelPanel);
        welcomeLabelPanel.setLayout(welcomeLabelPanelLayout);
        welcomeLabelPanelLayout.setHorizontalGroup(
            welcomeLabelPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(welcomeLabelPanelLayout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(welcomeLabel, GroupLayout.PREFERRED_SIZE, 585, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(118, Short.MAX_VALUE))
        );
        welcomeLabelPanelLayout.setVerticalGroup(
            welcomeLabelPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(welcomeLabelPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(welcomeLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pmfLocationLabel.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        pmfLocationLabel.setText("PMF Location");

        pmfLocationTextfFeld.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        GroupLayout pmfLocationPanelLayout = new GroupLayout(pmfLocationPanel);
        pmfLocationPanel.setLayout(pmfLocationPanelLayout);
        pmfLocationPanelLayout.setHorizontalGroup(
            pmfLocationPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(pmfLocationPanelLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(pmfLocationLabel)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
                .addComponent(pmfLocationTextfFeld, GroupLayout.PREFERRED_SIZE, 555, GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pmfLocationPanelLayout.setVerticalGroup(
            pmfLocationPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, pmfLocationPanelLayout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pmfLocationPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(pmfLocationLabel)
                    .addComponent(pmfLocationTextfFeld, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        releaseNumberLabel.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        releaseNumberLabel.setText("Release Number");

        releaseNumberTextField.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        

        GroupLayout releaseNumberPanelLayout = new GroupLayout(releaseNumberPanel);
        releaseNumberPanel.setLayout(releaseNumberPanelLayout);
        releaseNumberPanelLayout.setHorizontalGroup(
            releaseNumberPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(releaseNumberPanelLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(releaseNumberLabel)
                .addGap(109, 109, 109)
                .addComponent(releaseNumberTextField, GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(415, Short.MAX_VALUE))
        );
        releaseNumberPanelLayout.setVerticalGroup(
            releaseNumberPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(releaseNumberPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(releaseNumberPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(releaseNumberTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(releaseNumberLabel))
                .addGap(0, 16, Short.MAX_VALUE))
        );

        pmfVersionLabel.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        pmfVersionLabel.setText("Current PMF Version ");

        pmfVersionNumberTextField.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        GroupLayout pmfVersionPanelLayout = new GroupLayout(pmfVersionPanel);
        pmfVersionPanel.setLayout(pmfVersionPanelLayout);
        pmfVersionPanelLayout.setHorizontalGroup(
            pmfVersionPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(pmfVersionPanelLayout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(pmfVersionLabel)
                .addGap(57, 57, 57)
                .addComponent(pmfVersionNumberTextField, GroupLayout.PREFERRED_SIZE, 164, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(395, Short.MAX_VALUE))
        );
        pmfVersionPanelLayout.setVerticalGroup(
            pmfVersionPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, pmfVersionPanelLayout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pmfVersionPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(pmfVersionLabel)
                    .addComponent(pmfVersionNumberTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        versioningButton.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        versioningButton.setText("Start Versioning");
        versioningButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                versioningButtonActionPerformed(evt);
            }
        });

        GroupLayout buttonPanelLayout = new GroupLayout(buttonPanel);
        buttonPanel.setLayout(buttonPanelLayout);
        buttonPanelLayout.setHorizontalGroup(
            buttonPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(buttonPanelLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(versioningButton, GroupLayout.PREFERRED_SIZE, 232, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(106, Short.MAX_VALUE))
        );
        buttonPanelLayout.setVerticalGroup(
            buttonPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, buttonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(versioningButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        footerLabel.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        footerLabel.setText("For any queries/issues related to this tool drop a mail to: shreyas.dange@bt.com/shashank.singhal@bt.com");

        GroupLayout basePanelLayout = new GroupLayout(basePanel);
        basePanel.setLayout(basePanelLayout);
        basePanelLayout.setHorizontalGroup(
            basePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(basePanelLayout.createSequentialGroup()
                .addGap(222, 222, 222)
                .addComponent(footerLabel)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(GroupLayout.Alignment.TRAILING, basePanelLayout.createSequentialGroup()
                .addContainerGap(177, Short.MAX_VALUE)
                .addGroup(basePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(GroupLayout.Alignment.TRAILING, basePanelLayout.createSequentialGroup()
                        .addComponent(buttonPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(426, 426, 426))
                    .addGroup(GroupLayout.Alignment.TRAILING, basePanelLayout.createSequentialGroup()
                        .addComponent(pmfLocationPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(123, 123, 123))
                    .addGroup(GroupLayout.Alignment.TRAILING, basePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(pmfVersionPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGroup(basePanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addGroup(basePanelLayout.createSequentialGroup()
                                .addComponent(welcomeLabelPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(171, 171, 171))
                            .addGroup(basePanelLayout.createSequentialGroup()
                                .addComponent(releaseNumberPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(113, 113, 113))))))
        );
        basePanelLayout.setVerticalGroup(
            basePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(basePanelLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(welcomeLabelPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94)
                .addComponent(pmfLocationPanel, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(releaseNumberPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(pmfVersionPanel, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(buttonPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                .addComponent(footerLabel)
                .addContainerGap())
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(basePanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(basePanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }                       

    private void versioningButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                 
       
        String pmfLocation = pmfLocationTextfFeld.getText();
       
        String releaseNumber = releaseNumberTextField.getText();
        
        String pmfVersion = pmfVersionNumberTextField.getText();
        
        JOptionPane.showMessageDialog(rootPane, pmfLocation + " "+releaseNumber+" "+pmfVersion);
    }                                                

    public static void main(String args[]) {
       
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PMFHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PMFHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PMFHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PMFHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        /* Create and display the form */
        new PMFHome().setTitle("PMF Version Uplifter- Developed by Shreyas and Shashank");
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PMFHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private JPanel basePanel;
    private JPanel buttonPanel;
    private JLabel footerLabel;
    private JEditorPane jEditorPane1;
    private JScrollPane jScrollPane1;
    private JLabel pmfLocationLabel;
    private JPanel pmfLocationPanel;
    private JTextField pmfLocationTextfFeld;
    private JLabel pmfVersionLabel;
    private JTextField pmfVersionNumberTextField;
    private JPanel pmfVersionPanel;
    private JLabel releaseNumberLabel;
    private JPanel releaseNumberPanel;
    private JTextField releaseNumberTextField;
    private JButton versioningButton;
    private JLabel welcomeLabel;
    private JPanel welcomeLabelPanel;
    // End of variables declaration                   
}
