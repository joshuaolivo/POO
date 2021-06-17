/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import clases.Deposito;
import clases.Retiro;
import clases.SolicitudSaldo;
import clases.Transaccion;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author elagu
 */
public class FrmMenuMain extends javax.swing.JFrame {

    Transaccion transaccionActual = null;
    
    private boolean primerEjecucion = true;
    private String input = "";
    public static int numeroCuentaActual;

    // constantes correspondientes a las opciones del men� principal
    private static final int SOLICITUD_SALDO = 1;
    private static final int RETIRO = 2;
    private static final int DEPOSITO = 3;
    private static final int SALIR = 4;
    
    Icon imgIni = new ImageIcon(getClass().getResource("/imagenes/ranura.png"));
    /**
     * Creates new form frmMenuPrincipal
     */
    public FrmMenuMain() {
        initComponents();
        setLocationRelativeTo(null);
        //Carga imágenes
        lblImgRetirar.setIcon(imgIni);
        lblImagenDepositar.setIcon(imgIni);
        FrmAtm atm = new FrmAtm();
        numeroCuentaActual = atm.numeroCuentaActual;
        btnAccion();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtPantalla = new javax.swing.JTextArea();
        pnlBotones = new javax.swing.JPanel();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btnEnter = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblImgRetirar = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblImagenDepositar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(491, 393));
        setResizable(false);

        txtPantalla.setColumns(20);
        txtPantalla.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        txtPantalla.setRows(5);
        txtPantalla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPantallaKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(txtPantalla);

        btn3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn4.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn5.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn6.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn7.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn8.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn9.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btn0.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btn0.setText("0");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });

        btn1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btnEnter.setBackground(new java.awt.Color(0, 204, 51));
        btnEnter.setFont(new java.awt.Font("Century Gothic", 3, 18)); // NOI18N
        btnEnter.setText("Enter");
        btnEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnterActionPerformed(evt);
            }
        });

        btn2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBotonesLayout = new javax.swing.GroupLayout(pnlBotones);
        pnlBotones.setLayout(pnlBotonesLayout);
        pnlBotonesLayout.setHorizontalGroup(
            pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlBotonesLayout.createSequentialGroup()
                        .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlBotonesLayout.createSequentialGroup()
                        .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlBotonesLayout.createSequentialGroup()
                        .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlBotonesLayout.createSequentialGroup()
                        .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlBotonesLayout.setVerticalGroup(
            pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBotonesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tome aquí el efectivo");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        lblImgRetirar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImgRetirar.setToolTipText("");
        lblImgRetirar.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblImgRetirar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblImgRetirarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblImgRetirarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblImgRetirarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblImgRetirarMouseReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Inserte aquí el efectivo");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        lblImagenDepositar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImagenDepositar.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblImagenDepositar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblImagenDepositarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblImagenDepositarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblImagenDepositarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblImagenDepositarMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblImagenDepositar, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblImgRetirar, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblImgRetirar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblImagenDepositar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    // <editor-fold defaultstate="collapsed" desc="TECLADO">      
    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        // TODO add your handling code here:
        input = input + "3";
        try {
            Robot robot = new Robot();
            txtPantalla.requestFocus();
            robot.keyPress(KeyEvent.VK_3); // Simula presionar la tecla
            robot.keyRelease(KeyEvent.VK_3); // Simula soltar la tecla
        } catch (AWTException e) {System.out.print(e);}
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        // TODO add your handling code here:
        input = input + "4";
        try {
            Robot robot = new Robot();
            txtPantalla.requestFocus();
            robot.keyPress(KeyEvent.VK_4); // Simula presionar la tecla
            robot.keyRelease(KeyEvent.VK_4); // Simula soltar la tecla
        } catch (AWTException e) {System.out.print(e);}
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        // TODO add your handling code here:
        input = input + "5";
        try {
            Robot robot = new Robot();
            txtPantalla.requestFocus();
            robot.keyPress(KeyEvent.VK_5); // Simula presionar la tecla
            robot.keyRelease(KeyEvent.VK_5); // Simula soltar la tecla
        } catch (AWTException e) {System.out.print(e);}
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        // TODO add your handling code here:
        input = input + "6";
        try {
            Robot robot = new Robot();
            txtPantalla.requestFocus();
            robot.keyPress(KeyEvent.VK_6); // Simula presionar la tecla
            robot.keyRelease(KeyEvent.VK_6); // Simula soltar la tecla
        } catch (AWTException e) {System.out.print(e);}
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        // TODO add your handling code here:
        input = input + "7";
        try {
            Robot robot = new Robot();
            txtPantalla.requestFocus();
            robot.keyPress(KeyEvent.VK_7); // Simula presionar la tecla
            robot.keyRelease(KeyEvent.VK_7); // Simula soltar la tecla
        } catch (AWTException e) {System.out.print(e);}
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        // TODO add your handling code here:
        input = input + "8";
        try {
            Robot robot = new Robot();
            txtPantalla.requestFocus();
            robot.keyPress(KeyEvent.VK_8); // Simula presionar la tecla
            robot.keyRelease(KeyEvent.VK_8); // Simula soltar la tecla
        } catch (AWTException e) {System.out.print(e);}
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        // TODO add your handling code here:
        input = input + "9";
        try {
            Robot robot = new Robot();
            txtPantalla.requestFocus();
            robot.keyPress(KeyEvent.VK_9); // Simula presionar la tecla
            robot.keyRelease(KeyEvent.VK_9); // Simula soltar la tecla
        } catch (AWTException e) {System.out.print(e);}
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        // TODO add your handling code here:
        input = input + "0";
        try {
            Robot robot = new Robot();
            txtPantalla.requestFocus();
            robot.keyPress(KeyEvent.VK_0); // Simula presionar la tecla
            robot.keyRelease(KeyEvent.VK_0); // Simula soltar la tecla
        } catch (AWTException e) {System.out.print(e);}
    }//GEN-LAST:event_btn0ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
        input = input + "1";
        try {
            Robot robot = new Robot();
            txtPantalla.requestFocus();
            robot.keyPress(KeyEvent.VK_1); // Simula presionar la tecla
            robot.keyRelease(KeyEvent.VK_1); // Simula soltar la tecla
        } catch (AWTException e) {System.out.print(e);}
    }//GEN-LAST:event_btn1ActionPerformed

    private void btnEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnterActionPerformed
        // TODO add your handling code here:
        btnAccion();
    }//GEN-LAST:event_btnEnterActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // TODO add your handling code here:
        input = input + "2";
        try {
            Robot robot = new Robot();
            txtPantalla.requestFocus();
            robot.keyPress(KeyEvent.VK_2); // Simula presionar la tecla
            robot.keyRelease(KeyEvent.VK_2); // Simula soltar la tecla
        } catch (AWTException e) {System.out.print(e);}
    }//GEN-LAST:event_btn2ActionPerformed

    // </editor-fold> 
    
    
    // <editor-fold defaultstate="collapsed" desc="IMAGENES RETIRO">      
    private void lblImgRetirarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImgRetirarMouseEntered
        // TODO add your handling code here:
        /*Icon imgMouseIn = new ImageIcon(getClass().getResource("/imagenes/ranuraCDinero.png"));
        lblImgRetirar.setIcon(imgMouseIn);*/
    }//GEN-LAST:event_lblImgRetirarMouseEntered

    private void lblImgRetirarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImgRetirarMouseExited
        // TODO add your handling code here:
        /*Icon imgMouseOut = new ImageIcon(getClass().getResource("/imagenes/ranura.png"));
        lblImgRetirar.setIcon(imgMouseOut);*/
    }//GEN-LAST:event_lblImgRetirarMouseExited

    private void lblImgRetirarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImgRetirarMousePressed
        // TODO add your handling code here:
        /*Icon imgMouseClick = new ImageIcon(getClass().getResource("/imagenes/ranuraCDineroOut.png"));
        lblImgRetirar.setIcon(imgMouseClick);*/
    }//GEN-LAST:event_lblImgRetirarMousePressed

    private void lblImgRetirarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImgRetirarMouseReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_lblImgRetirarMouseReleased
    // </editor-fold> 
    
    
    // <editor-fold defaultstate="collapsed" desc="IMAGENES DEPOSITO">   
    private void lblImagenDepositarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImagenDepositarMouseEntered
        // TODO add your handling code here:
        /*Icon imgMouseOut = new ImageIcon(getClass().getResource("/imagenes/ranuraCDinero.png"));
        lblImagenDepositar.setIcon(imgMouseOut);*/
    }//GEN-LAST:event_lblImagenDepositarMouseEntered

    private void lblImagenDepositarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImagenDepositarMouseExited
        // TODO add your handling code here:
        /*Icon imgMouseOut = new ImageIcon(getClass().getResource("/imagenes/ranura.png"));
        lblImagenDepositar.setIcon(imgMouseOut);*/
    }//GEN-LAST:event_lblImagenDepositarMouseExited

    private void lblImagenDepositarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImagenDepositarMousePressed
        // TODO add your handling code here:
        /*Icon imgMouseClick = new ImageIcon(getClass().getResource("/imagenes/ranuraCDineroIn.png"));
        lblImagenDepositar.setIcon(imgMouseClick);*/
    }//GEN-LAST:event_lblImagenDepositarMousePressed

    private void lblImagenDepositarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImagenDepositarMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_lblImagenDepositarMouseReleased

    private void txtPantallaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPantallaKeyTyped
        // TODO add your handling code here:
        char valid = evt.getKeyChar();
        if (Character.isLetter(valid))
        {
            evt.consume();
        }
    }//GEN-LAST:event_txtPantallaKeyTyped
                      
    // </editor-fold> 
    
    
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
            java.util.logging.Logger.getLogger(FrmMenuMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenuMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenuMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenuMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenuMain().setVisible(true);
            }
        });
    }

    ///////////////////////////////////////////////////
    
    public void btnAccion()
    {
        if (primerEjecucion)
        {
            txtPantalla.setText("Menu Principal\n-----------\n1.- Ver saldo\n2.- Depositar\n3.- Retirar\n4.- Salir\nSeleccione una opción: ");
            primerEjecucion = false;
        }
        else
        {
            int seleccionMenuPrincipal = Integer.parseInt(input);
            input = "";
            switch(seleccionMenuPrincipal)
            {
                case SOLICITUD_SALDO:
                    /*transaccionActual = crearTransaccion();*/
                    String result = realizarDeposito();
                    String parts[] = result.split("-");
                    txtPantalla.setText("\nInformacion de saldo:" + "\n - Saldo disponible: " + parts[0] + "\n - Saldo total:          " +
                            parts[1] + "\nPresiona una tecla para continuar.");
                    primerEjecucion = true;
                    break;
                case RETIRO:
                    FrmMenDeposito dep = new FrmMenDeposito();
                    dep.setVisible(true);
                    this.setVisible(false);
                    break;
                case DEPOSITO:
                    FrmMenRetiro ret = new FrmMenRetiro();
                    ret.setVisible(true);
                    this.setVisible(false);
                    break;
                case SALIR:
                    FrmAtm at = new FrmAtm();
                    at.setVisible(true);
                    this.setVisible(false);
                    break;
                default:
                    primerEjecucion = true;
                    btnAccion();
                    break;
            }
        }
    }
    
    private Transaccion crearTransaccion()
    {
        Transaccion temp = null; // variable temporal Transaccion
        temp = new SolicitudSaldo(numeroCuentaActual);
        return temp; // devuelve el obejto recién creado
    } // fin del m�todo crearTransaccion
    
    public String realizarDeposito()
    {
        input = "";
        Transaccion temp = null;
        temp = new SolicitudSaldo(numeroCuentaActual);
        String result_saldo = temp.ejecutar();
        return result_saldo;
    }
    
    ///////////////////////////////////////////////////
    

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnEnter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblImagenDepositar;
    private javax.swing.JLabel lblImgRetirar;
    private javax.swing.JPanel pnlBotones;
    public javax.swing.JTextArea txtPantalla;
    // End of variables declaration//GEN-END:variables
}
