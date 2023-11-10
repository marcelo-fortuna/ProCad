/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package procad;

/**
 *
 * @author Marcelo
 */
public class ProCad extends javax.swing.JFrame {
    
    /**
     * Creates new form ProCad
     */
    public ProCad() {
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

        lblTitle = new javax.swing.JLabel();
        pnlInput = new javax.swing.JPanel();
        lblCod = new javax.swing.JLabel();
        txtCod = new javax.swing.JTextField();
        lblStatus = new javax.swing.JLabel();
        cmbStatus = new javax.swing.JComboBox<>();
        lblRegisterDate = new javax.swing.JLabel();
        fmtRegisterDate = new javax.swing.JFormattedTextField();
        lblProductName = new javax.swing.JLabel();
        txtProductName = new javax.swing.JTextField();
        lblStockQuantity = new javax.swing.JLabel();
        txtStockQuantity = new javax.swing.JTextField();
        lblDescription = new javax.swing.JLabel();
        txaDescription = new javax.swing.JTextArea();
        lblMinStock = new javax.swing.JLabel();
        spiMinStock = new javax.swing.JSpinner();
        lblMaxStock = new javax.swing.JLabel();
        spiMaxStock = new javax.swing.JSpinner();
        lblBuyPrice = new javax.swing.JLabel();
        fmtBuyPrice = new javax.swing.JFormattedTextField();
        lblSellPrice = new javax.swing.JLabel();
        fmtSellPrice = new javax.swing.JFormattedTextField();
        lblProfitFactor = new javax.swing.JLabel();
        txtProfitFactor = new javax.swing.JFormattedTextField();
        lblNCM = new javax.swing.JLabel();
        fmtNCM = new javax.swing.JFormattedTextField();
        lblBarCode = new javax.swing.JLabel();
        fmtBarCode = new javax.swing.JFormattedTextField();
        pnlButton = new javax.swing.JPanel();
        btnNew = new javax.swing.JButton();
        btnChange = new javax.swing.JButton();
        bntExit = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnShow = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ProCad | Cadastro de Produtos");
        setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        setMaximumSize(new java.awt.Dimension(720, 720));
        setMinimumSize(new java.awt.Dimension(720, 720));
        setName("frmProCad"); // NOI18N
        setPreferredSize(new java.awt.Dimension(720, 720));
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));

        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("ProCad | Cadastro de Produtos");
        lblTitle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        pnlInput.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        pnlInput.setPreferredSize(new java.awt.Dimension(492, 302));

        lblCod.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblCod.setText("Código");

        txtCod.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtCod.setToolTipText("Informe o código do produto.");
        txtCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodActionPerformed(evt);
            }
        });

        lblStatus.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblStatus.setText("Status");

        cmbStatus.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cmbStatus.setMaximumRowCount(2);
        cmbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "I - Inativo", "A - Ativo" }));
        cmbStatus.setToolTipText("Selecione o status do produto.");
        cmbStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbStatusActionPerformed(evt);
            }
        });

        lblRegisterDate.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblRegisterDate.setText("Data de cadastro");

        fmtRegisterDate.setText("00/00/0000");
        fmtRegisterDate.setToolTipText("Data em que o produto foi cadastrado.");
        fmtRegisterDate.setActionCommand("<Not Set>");
        fmtRegisterDate.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        lblProductName.setText("Nome");

        txtProductName.setToolTipText("Informe o nome do produto.");

        lblStockQuantity.setText("Quantidade em estoque");

        txtStockQuantity.setToolTipText("Informe a quantidade disponível no estoque do produto cadastrado.");
        txtStockQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStockQuantityActionPerformed(evt);
            }
        });

        lblDescription.setText("Descrição");

        txaDescription.setColumns(20);
        txaDescription.setLineWrap(true);
        txaDescription.setRows(900);
        txaDescription.setTabSize(900);
        txaDescription.setToolTipText("Uma breve descrição do produto");
        txaDescription.setMaximumSize(new java.awt.Dimension(220, 80));
        txaDescription.setMinimumSize(new java.awt.Dimension(220, 80));

        lblMinStock.setText("Estoque minímo");

        lblMaxStock.setText("Estoque máximo");

        lblBuyPrice.setText("Preço de compra");

        fmtBuyPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fmtBuyPriceActionPerformed(evt);
            }
        });

        lblSellPrice.setText("Preço de venda");

        lblProfitFactor.setText("Fator lucro");

        txtProfitFactor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProfitFactorActionPerformed(evt);
            }
        });

        lblNCM.setText("NCM");

        lblBarCode.setText("Código de Barras GTIN / EAN");

        fmtBarCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fmtBarCodeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlInputLayout = new javax.swing.GroupLayout(pnlInput);
        pnlInput.setLayout(pnlInputLayout);
        pnlInputLayout.setHorizontalGroup(
            pnlInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInputLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlInputLayout.createSequentialGroup()
                        .addGroup(pnlInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txaDescription, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblDescription, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(pnlInputLayout.createSequentialGroup()
                                    .addGroup(pnlInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(pnlInputLayout.createSequentialGroup()
                                            .addGroup(pnlInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtCod)
                                                .addComponent(lblCod, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(pnlInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(lblStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(cmbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(pnlInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(fmtRegisterDate)
                                                .addComponent(lblRegisterDate, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(pnlInputLayout.createSequentialGroup()
                                            .addGroup(pnlInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lblProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(pnlInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(lblStockQuantity)
                                                .addComponent(txtStockQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(pnlInputLayout.createSequentialGroup()
                                            .addComponent(lblMinStock, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lblMaxStock, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(pnlInputLayout.createSequentialGroup()
                                            .addComponent(spiMinStock, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(spiMaxStock, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(0, 0, Short.MAX_VALUE)))
                            .addGroup(pnlInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(pnlInputLayout.createSequentialGroup()
                                    .addComponent(fmtBuyPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(fmtSellPrice))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlInputLayout.createSequentialGroup()
                                    .addComponent(lblBuyPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblSellPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(71, 71, 71))
                    .addGroup(pnlInputLayout.createSequentialGroup()
                        .addGroup(pnlInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblBarCode, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                            .addComponent(fmtBarCode)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlInputLayout.createSequentialGroup()
                                .addGroup(pnlInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtProfitFactor, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblProfitFactor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblNCM, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                                    .addComponent(fmtNCM))))
                        .addContainerGap())))
        );
        pnlInputLayout.setVerticalGroup(
            pnlInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInputLayout.createSequentialGroup()
                .addGroup(pnlInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCod)
                    .addComponent(lblStatus)
                    .addComponent(lblRegisterDate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fmtRegisterDate, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProductName)
                    .addComponent(lblStockQuantity))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProductName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtStockQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblDescription)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txaDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaxStock)
                    .addComponent(lblMinStock))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spiMinStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spiMaxStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBuyPrice)
                    .addComponent(lblSellPrice))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fmtBuyPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fmtSellPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProfitFactor)
                    .addComponent(lblNCM))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProfitFactor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fmtNCM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblBarCode)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fmtBarCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        btnNew.setText("Novo");

        btnChange.setText("Alterar");

        bntExit.setText("Sair");
        bntExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntExitActionPerformed(evt);
            }
        });

        btnClear.setText("Limpar");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnShow.setText("Imprimir");

        btnDelete.setText("Apagar");

        javax.swing.GroupLayout pnlButtonLayout = new javax.swing.GroupLayout(pnlButton);
        pnlButton.setLayout(pnlButtonLayout);
        pnlButtonLayout.setHorizontalGroup(
            pnlButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntExit, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnChange, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnShow, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pnlButtonLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {bntExit, btnChange, btnClear, btnDelete, btnNew, btnShow});

        pnlButtonLayout.setVerticalGroup(
            pnlButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlButtonLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnChange, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnShow, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bntExit, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        pnlButtonLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {bntExit, btnChange, btnClear, btnDelete, btnNew, btnShow});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlInput, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlInput, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(pnlButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(194, 194, 194))
        );

        getAccessibleContext().setAccessibleName("frmProCad");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtStockQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStockQuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStockQuantityActionPerformed

    private void cmbStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbStatusActionPerformed

    private void txtCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodActionPerformed

    private void fmtBuyPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fmtBuyPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fmtBuyPriceActionPerformed

    private void txtProfitFactorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProfitFactorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProfitFactorActionPerformed

    private void fmtBarCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fmtBarCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fmtBarCodeActionPerformed

    private void bntExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntExitActionPerformed
        this.dispose();
    }//GEN-LAST:event_bntExitActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        
    }//GEN-LAST:event_btnClearActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        ProCadController pccontroller = new ProCadController();
        
        pccontroller.clear();
        
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProCad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProCad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntExit;
    private javax.swing.JButton btnChange;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnShow;
    private javax.swing.JComboBox<String> cmbStatus;
    private javax.swing.JFormattedTextField fmtBarCode;
    private javax.swing.JFormattedTextField fmtBuyPrice;
    private javax.swing.JFormattedTextField fmtNCM;
    private javax.swing.JFormattedTextField fmtRegisterDate;
    private javax.swing.JFormattedTextField fmtSellPrice;
    private javax.swing.JLabel lblBarCode;
    private javax.swing.JLabel lblBuyPrice;
    private javax.swing.JLabel lblCod;
    private javax.swing.JLabel lblDescription;
    private javax.swing.JLabel lblMaxStock;
    private javax.swing.JLabel lblMinStock;
    private javax.swing.JLabel lblNCM;
    private javax.swing.JLabel lblProductName;
    private javax.swing.JLabel lblProfitFactor;
    private javax.swing.JLabel lblRegisterDate;
    private javax.swing.JLabel lblSellPrice;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblStockQuantity;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel pnlButton;
    private javax.swing.JPanel pnlInput;
    private javax.swing.JSpinner spiMaxStock;
    private javax.swing.JSpinner spiMinStock;
    private javax.swing.JTextArea txaDescription;
    private javax.swing.JTextField txtCod;
    private javax.swing.JTextField txtProductName;
    private javax.swing.JFormattedTextField txtProfitFactor;
    private javax.swing.JTextField txtStockQuantity;
    // End of variables declaration//GEN-END:variables
}
