
package emart.gui;

import emart.dao.OrdersDAO;
import emart.dao.ProductsDAO;
import emart.pojo.ProductsPojo;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class BillingFrame extends javax.swing.JFrame {

    ArrayList <ProductsPojo> al=new ArrayList<>();
    DefaultTableModel tm;
    double grandtotal=0.0;
    public BillingFrame() {
        initComponents();
        this.setLocationRelativeTo(this);
        tm=(DefaultTableModel)jtProducts.getModel();
        txtProductID.requestFocus();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtProductID = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtProducts = new javax.swing.JTable();
        btnGenerateBill = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 0, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Billing Options", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Product ID");

        txtProductID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductIDActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnLogout.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        jtProducts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Product Name", "Product Price", "Our Price", "Product Compny", "Quantity", "Tax", "Total"
            }
        ));
        jScrollPane1.setViewportView(jtProducts);

        btnGenerateBill.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnGenerateBill.setText("Generate Bill");
        btnGenerateBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerateBillActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setText("Product ID");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Payable Amount");

        txtTotal.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 647, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(43, 43, 43)
                        .addComponent(txtProductID, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBack)
                        .addGap(48, 48, 48)
                        .addComponent(btnLogout)
                        .addGap(31, 31, 31))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel3)
                .addGap(28, 28, 28)
                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGenerateBill)
                .addGap(57, 57, 57)
                .addComponent(jLabel2)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtProductID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBack)
                            .addComponent(btnLogout))))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnGenerateBill)
                        .addComponent(jLabel3))
                    .addComponent(jLabel2)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtProductIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductIDActionPerformed
    if(txtProductID.getText().trim().isEmpty())
    {
        JOptionPane.showMessageDialog(null,"Please enter product ID","Error",JOptionPane.ERROR_MESSAGE);
        return;
    }
    loadItemList(txtProductID.getText().trim());
    }//GEN-LAST:event_txtProductIDActionPerformed

    private void btnGenerateBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerateBillActionPerformed
        try
        {
            String ordId=OrdersDAO.getNextOrderId();
            if(OrdersDAO.addOrder(al,ordId)&& ProductsDAO.updateStocks(al))
            {
              JOptionPane.showMessageDialog(null,"Order of Rs "+grandtotal+"/- created successfully");
              ViewOrdersFrame vs= new ViewOrdersFrame();
              vs.setVisible(true);
              this.dispose();
            }
            else
            {
                 JOptionPane.showMessageDialog(null,"Order not Created!");
            }
        }
        catch(SQLException sql)
        {
           JOptionPane.showMessageDialog(null,"DB Error!","Error!",JOptionPane.ERROR_MESSAGE);
           sql.printStackTrace(); 
        }
         
    }//GEN-LAST:event_btnGenerateBillActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        ReceptionistOptionFrame rof = new ReceptionistOptionFrame();
        rof.setVisible(true);
        this.dispose();
        
        
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        LoginFrame login =new LoginFrame();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    
    public static void main(String args[]) {
       
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BillingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BillingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BillingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BillingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BillingFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnGenerateBill;
    private javax.swing.JButton btnLogout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtProducts;
    private javax.swing.JTextField txtProductID;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables

    private void loadItemList(String pid)
    {
          try {
            ProductsPojo p = ProductsDAO.getProductDetails(pid);
            if (p == null) {
                JOptionPane.showMessageDialog(null, "No Product Found!", "Alert", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            tm = (DefaultTableModel) jtProducts.getModel();

            int newQuantity, index = -1;
            float newTotal;
            if (al.contains(p)) {
                index = al.indexOf(p);

                ProductsPojo prevProd = al.get(index);
                int prevQuantity = prevProd.getQuantity();
                newQuantity = prevQuantity + 1;
                double total = p.getOurPrice() + p.getTax() * p.getOurPrice() / 100.0;
                newTotal = (float) (prevProd.getTotal() + total);
                grandtotal += total;

                p.setQuantity(newQuantity);
                p.setTotal(newTotal);
                al.set(index, p);
            } else {
                newQuantity = 1;
                newTotal = (float) (p.getOurPrice() + p.getTax() * p.getOurPrice() / 100.0);
                grandtotal += newTotal;

                p.setQuantity(newQuantity);
                p.setTotal(newTotal);
                al.add(p);
            }

            if (index != -1) {
                tm.setValueAt(newQuantity, index, 5);
                tm.setValueAt(newTotal, index, 7);
            } else {
                Object[] rows = new Object[8];

                rows[0] = p.getProductId();
                rows[1] = p.getProductName();
                rows[2] = p.getProductCompany();
                rows[3] = p.getProductPrice();
                rows[4] = p.getOurPrice();
                rows[5] = newQuantity;
                rows[6] = p.getTax() + "%";
                rows[7] = newTotal;

                tm.addRow(rows);
            }
            String ruppeSymbol = String.valueOf('\u20B9');
            txtTotal.setText(ruppeSymbol + " " + grandtotal);
        } 
          catch (SQLException ex) 
          {
              Logger.getLogger(BillingFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
