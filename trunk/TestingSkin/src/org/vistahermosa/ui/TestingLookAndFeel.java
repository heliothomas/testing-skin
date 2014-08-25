
package org.vistahermosa.ui;

import com.seaglasslookandfeel.SeaGlassLookAndFeel;
import de.javasoft.plaf.synthetica.SyntheticaAluOxideLookAndFeel;
import de.javasoft.plaf.synthetica.SyntheticaBlackEyeLookAndFeel;
import de.javasoft.plaf.synthetica.SyntheticaBlackMoonLookAndFeel;
import de.javasoft.plaf.synthetica.SyntheticaBlackStarLookAndFeel;
import de.javasoft.plaf.synthetica.SyntheticaBlueIceLookAndFeel;
import de.javasoft.plaf.synthetica.SyntheticaBlueLightLookAndFeel;
import de.javasoft.plaf.synthetica.SyntheticaBlueMoonLookAndFeel;
import de.javasoft.plaf.synthetica.SyntheticaBlueSteelLookAndFeel;
import de.javasoft.plaf.synthetica.SyntheticaClassyLookAndFeel;
import de.javasoft.plaf.synthetica.SyntheticaGreenDreamLookAndFeel;
import de.javasoft.plaf.synthetica.SyntheticaMauveMetallicLookAndFeel;
import de.javasoft.plaf.synthetica.SyntheticaOrangeMetallicLookAndFeel;
import de.javasoft.plaf.synthetica.SyntheticaSilverMoonLookAndFeel;
import de.javasoft.plaf.synthetica.SyntheticaSimple2DLookAndFeel;
import de.javasoft.plaf.synthetica.SyntheticaSkyMetallicLookAndFeel;
import de.javasoft.plaf.synthetica.SyntheticaStandardLookAndFeel;
import de.javasoft.plaf.synthetica.SyntheticaWhiteVisionLookAndFeel;
import java.text.ParseException;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author thomas
 */
public class TestingLookAndFeel extends javax.swing.JFrame {

    /**
     * Creates new form SyntheticaFrame
     */
    public TestingLookAndFeel() {
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

        jLabel1 = new javax.swing.JLabel();
        tfUsername = new javax.swing.JTextField();
        tfPassword = new javax.swing.JTextField();
        btSave = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        miOpen = new javax.swing.JMenuItem();
        miSave = new javax.swing.JMenuItem();
        miExit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        miForm = new javax.swing.JMenuItem();
        menuSkin = new javax.swing.JMenu();
        miSeaGlass = new javax.swing.JMenuItem();
        miSynthStandard = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        miBlueIce = new javax.swing.JMenuItem();
        miBlueMoon = new javax.swing.JMenuItem();
        miBlueSteel = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        miBlueLight = new javax.swing.JMenuItem();
        miBlackEye = new javax.swing.JMenuItem();
        miWhiteVision = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        miAluOxide = new javax.swing.JMenuItem();
        miClassy = new javax.swing.JMenuItem();
        miSimple2D = new javax.swing.JMenuItem();
        miSkyMetallic = new javax.swing.JMenuItem();
        miMauveMetallic = new javax.swing.JMenuItem();
        miOrangeMetallic = new javax.swing.JMenuItem();
        miBlackMoon = new javax.swing.JMenuItem();
        miSilverMoon = new javax.swing.JMenuItem();
        miGreenDream = new javax.swing.JMenuItem();
        miBlackStar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Test Example of Synthetica Skin ");

        jLabel1.setText("Username");

        btSave.setText("guardar");
        btSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSaveActionPerformed(evt);
            }
        });

        jLabel2.setText("Password");

        jMenu1.setText("File");

        miOpen.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        miOpen.setText("Open");
        miOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miOpenActionPerformed(evt);
            }
        });
        jMenu1.add(miOpen);

        miSave.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        miSave.setText("Save");
        miSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSaveActionPerformed(evt);
            }
        });
        jMenu1.add(miSave);

        miExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        miExit.setText("Exit");
        miExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miExitActionPerformed(evt);
            }
        });
        jMenu1.add(miExit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        miForm.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        miForm.setText("Formulario");
        miForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miFormActionPerformed(evt);
            }
        });
        jMenu2.add(miForm);

        menuSkin.setText("Skin");

        miSeaGlass.setText("Sea Glass");
        miSeaGlass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSeaGlassActionPerformed(evt);
            }
        });
        menuSkin.add(miSeaGlass);

        miSynthStandard.setText("Synthetica Standard");
        miSynthStandard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSynthStandardActionPerformed(evt);
            }
        });
        menuSkin.add(miSynthStandard);
        menuSkin.add(jSeparator2);

        miBlueIce.setText("Blue Ice");
        miBlueIce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miBlueIceActionPerformed(evt);
            }
        });
        menuSkin.add(miBlueIce);

        miBlueMoon.setText("Blue Moon");
        miBlueMoon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miBlueMoonActionPerformed(evt);
            }
        });
        menuSkin.add(miBlueMoon);

        miBlueSteel.setText("Blue Steel");
        miBlueSteel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miBlueSteelActionPerformed(evt);
            }
        });
        menuSkin.add(miBlueSteel);
        menuSkin.add(jSeparator1);

        miBlueLight.setText("Blue Light");
        miBlueLight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miBlueLightActionPerformed(evt);
            }
        });
        menuSkin.add(miBlueLight);

        miBlackEye.setText("Black Eye");
        miBlackEye.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miBlackEyeActionPerformed(evt);
            }
        });
        menuSkin.add(miBlackEye);

        miWhiteVision.setText("White Vision");
        miWhiteVision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miWhiteVisionActionPerformed(evt);
            }
        });
        menuSkin.add(miWhiteVision);
        menuSkin.add(jSeparator3);

        miAluOxide.setText("Alu Oxide");
        miAluOxide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAluOxideActionPerformed(evt);
            }
        });
        menuSkin.add(miAluOxide);

        miClassy.setText("Classy");
        miClassy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miClassyActionPerformed(evt);
            }
        });
        menuSkin.add(miClassy);

        miSimple2D.setText("Simple 2D");
        miSimple2D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSimple2DActionPerformed(evt);
            }
        });
        menuSkin.add(miSimple2D);

        miSkyMetallic.setText("Sky Metallic");
        miSkyMetallic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSkyMetallicActionPerformed(evt);
            }
        });
        menuSkin.add(miSkyMetallic);

        miMauveMetallic.setText("Mauve Metallic");
        miMauveMetallic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miMauveMetallicActionPerformed(evt);
            }
        });
        menuSkin.add(miMauveMetallic);

        miOrangeMetallic.setText("Orange Metallic");
        miOrangeMetallic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miOrangeMetallicActionPerformed(evt);
            }
        });
        menuSkin.add(miOrangeMetallic);

        miBlackMoon.setText("Black Moon");
        miBlackMoon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miBlackMoonActionPerformed(evt);
            }
        });
        menuSkin.add(miBlackMoon);

        miSilverMoon.setText("Silver Moon");
        miSilverMoon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSilverMoonActionPerformed(evt);
            }
        });
        menuSkin.add(miSilverMoon);

        miGreenDream.setText("Green Dream");
        miGreenDream.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miGreenDreamActionPerformed(evt);
            }
        });
        menuSkin.add(miGreenDream);

        miBlackStar.setText("Black Star");
        miBlackStar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miBlackStarActionPerformed(evt);
            }
        });
        menuSkin.add(miBlackStar);

        jMenu2.add(menuSkin);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btSave)
                    .addComponent(tfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(289, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {tfPassword, tfUsername});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(btSave)
                .addContainerGap(133, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaveActionPerformed
        JOptionPane.showMessageDialog(null, "Saved successfully", "Information", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btSaveActionPerformed

    private void miExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_miExitActionPerformed

    private void miFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miFormActionPerformed
        JOptionPane.showMessageDialog(this, "Open any form", "Información", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_miFormActionPerformed

    private void miOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miOpenActionPerformed
        JOptionPane.showMessageDialog(this, "Open any file", "Información", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_miOpenActionPerformed

    private void miSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSaveActionPerformed
        JOptionPane.showMessageDialog(this, "Save this document", "Información", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_miSaveActionPerformed

    private void miSeaGlassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSeaGlassActionPerformed
        setSkin("seaGlass");
    }//GEN-LAST:event_miSeaGlassActionPerformed

    private void miSynthStandardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSynthStandardActionPerformed
        setSkin("synthStandard");
    }//GEN-LAST:event_miSynthStandardActionPerformed

    private void miBlueMoonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miBlueMoonActionPerformed
        setSkin("syntheticaBlueMoon");
    }//GEN-LAST:event_miBlueMoonActionPerformed

    private void miBlueLightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miBlueLightActionPerformed
        setSkin("syntheticaBlueLight");
    }//GEN-LAST:event_miBlueLightActionPerformed

    private void miBlackEyeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miBlackEyeActionPerformed
        setSkin("syntheticaBlackEye");
    }//GEN-LAST:event_miBlackEyeActionPerformed

    private void miWhiteVisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miWhiteVisionActionPerformed
        setSkin("syntheticaWhiteVision");
    }//GEN-LAST:event_miWhiteVisionActionPerformed

    private void miBlueIceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miBlueIceActionPerformed
        setSkin("syntheticaBlueIce");
    }//GEN-LAST:event_miBlueIceActionPerformed

    private void miBlueSteelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miBlueSteelActionPerformed
        setSkin("syntheticaBlueSteel");
    }//GEN-LAST:event_miBlueSteelActionPerformed

    private void miAluOxideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAluOxideActionPerformed
        setSkin("syntheticaAluOxide");
    }//GEN-LAST:event_miAluOxideActionPerformed

    private void miClassyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miClassyActionPerformed
        setSkin("syntheticaClassy");
    }//GEN-LAST:event_miClassyActionPerformed

    private void miSimple2DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSimple2DActionPerformed
        setSkin("syntheticaSimple2D");
    }//GEN-LAST:event_miSimple2DActionPerformed

    private void miSkyMetallicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSkyMetallicActionPerformed
        setSkin("syntheticaSkyMetallic");
    }//GEN-LAST:event_miSkyMetallicActionPerformed

    private void miMauveMetallicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miMauveMetallicActionPerformed
        setSkin("syntheticaMauveMetallic");
    }//GEN-LAST:event_miMauveMetallicActionPerformed

    private void miOrangeMetallicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miOrangeMetallicActionPerformed
        setSkin("syntheticaOrangeMetallic");
    }//GEN-LAST:event_miOrangeMetallicActionPerformed

    private void miBlackMoonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miBlackMoonActionPerformed
        setSkin("syntheticaBlackMoon");
    }//GEN-LAST:event_miBlackMoonActionPerformed

    private void miSilverMoonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSilverMoonActionPerformed
        setSkin("syntheticaSilverMoon");
    }//GEN-LAST:event_miSilverMoonActionPerformed

    private void miGreenDreamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miGreenDreamActionPerformed
        setSkin("syntheticaGreenDream");
    }//GEN-LAST:event_miGreenDreamActionPerformed

    private void miBlackStarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miBlackStarActionPerformed
        setSkin("syntheticaBlackStar");
    }//GEN-LAST:event_miBlackStarActionPerformed

    private void setSkin(final String skinName) {
        try {
            switch (skinName) {
                case "seaGlass":
                    UIManager.setLookAndFeel(new SeaGlassLookAndFeel());
                    break;
                case "synthStandard":
                    UIManager.setLookAndFeel(new SyntheticaStandardLookAndFeel());
                    break;
                case "syntheticaBlueIce":
                    UIManager.setLookAndFeel(new SyntheticaBlueIceLookAndFeel());
                    break;
                case "syntheticaBlueMoon":
                    UIManager.setLookAndFeel(new SyntheticaBlueMoonLookAndFeel());
                    break;
                case "syntheticaBlueSteel":
                    UIManager.setLookAndFeel(new SyntheticaBlueSteelLookAndFeel());
                    break;
                case "syntheticaBlueLight":
                    UIManager.setLookAndFeel(new SyntheticaBlueLightLookAndFeel());
                    break;
                case "syntheticaBlackEye":
                    UIManager.setLookAndFeel(new SyntheticaBlackEyeLookAndFeel());
                    break;
                case "syntheticaWhiteVision":
                    UIManager.setLookAndFeel(new SyntheticaWhiteVisionLookAndFeel());
                    break;
                case "syntheticaAluOxide":
                    UIManager.setLookAndFeel(new SyntheticaAluOxideLookAndFeel());
                    break;
                case "syntheticaClassy":
                    UIManager.setLookAndFeel(new SyntheticaClassyLookAndFeel());
                    break;
                case "syntheticaSimple2D":
                    UIManager.setLookAndFeel(new SyntheticaSimple2DLookAndFeel());
                    break;
                case "syntheticaSkyMetallic":
                    UIManager.setLookAndFeel(new SyntheticaSkyMetallicLookAndFeel());
                    break;
                case "syntheticaMauveMetallic":
                    UIManager.setLookAndFeel(new SyntheticaMauveMetallicLookAndFeel());
                    break;
                case "syntheticaOrangeMetallic":
                    UIManager.setLookAndFeel(new SyntheticaOrangeMetallicLookAndFeel());
                    break;
                case "syntheticaBlackMoon":
                    UIManager.setLookAndFeel(new SyntheticaBlackMoonLookAndFeel());
                    break;
                case "syntheticaSilverMoon":
                    UIManager.setLookAndFeel(new SyntheticaSilverMoonLookAndFeel());
                    break;
                case "syntheticaGreenDream":
                    UIManager.setLookAndFeel(new SyntheticaGreenDreamLookAndFeel());
                    break;
                case "syntheticaBlackStar":
                    UIManager.setLookAndFeel(new SyntheticaBlackStarLookAndFeel());
                    break;
            }
            SwingUtilities.updateComponentTreeUI(this);
            this.pack();
        } catch (UnsupportedLookAndFeelException | ParseException e) {
            JOptionPane.showMessageDialog(null, "Error with look and feel: " + e.getMessage());
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(new SyntheticaStandardLookAndFeel());
        } catch (ParseException | UnsupportedLookAndFeelException e) {
            System.out.println("Error with look and feel: " + e.getMessage());
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TestingLookAndFeel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JMenu menuSkin;
    private javax.swing.JMenuItem miAluOxide;
    private javax.swing.JMenuItem miBlackEye;
    private javax.swing.JMenuItem miBlackMoon;
    private javax.swing.JMenuItem miBlackStar;
    private javax.swing.JMenuItem miBlueIce;
    private javax.swing.JMenuItem miBlueLight;
    private javax.swing.JMenuItem miBlueMoon;
    private javax.swing.JMenuItem miBlueSteel;
    private javax.swing.JMenuItem miClassy;
    private javax.swing.JMenuItem miExit;
    private javax.swing.JMenuItem miForm;
    private javax.swing.JMenuItem miGreenDream;
    private javax.swing.JMenuItem miMauveMetallic;
    private javax.swing.JMenuItem miOpen;
    private javax.swing.JMenuItem miOrangeMetallic;
    private javax.swing.JMenuItem miSave;
    private javax.swing.JMenuItem miSeaGlass;
    private javax.swing.JMenuItem miSilverMoon;
    private javax.swing.JMenuItem miSimple2D;
    private javax.swing.JMenuItem miSkyMetallic;
    private javax.swing.JMenuItem miSynthStandard;
    private javax.swing.JMenuItem miWhiteVision;
    private javax.swing.JTextField tfPassword;
    private javax.swing.JTextField tfUsername;
    // End of variables declaration//GEN-END:variables
}
