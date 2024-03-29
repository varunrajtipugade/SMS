/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermarket;

import java.awt.Toolkit;
import java.io.InputStream;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Varunraj
 */
public class menu2 extends javax.swing.JFrame {

    /**
     * Creates new form menu2
     */
    public menu2() {
        initComponents();
        URL logourl=getClass().getResource("2.png");
        Icon logoicon=new ImageIcon(logourl);
        logo.setIcon(logoicon);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("fav.png")));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        home = new javax.swing.JMenu();
        productmaster = new javax.swing.JMenu();
        promanager = new javax.swing.JMenuItem();
        catmanager = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        expmanager = new javax.swing.JMenuItem();
        preport = new javax.swing.JMenuItem();
        billmaster = new javax.swing.JMenu();
        biller = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        billhistory = new javax.swing.JMenuItem();
        empmaster = new javax.swing.JMenu();
        empmanager = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        empreport = new javax.swing.JMenuItem();
        vendormaster = new javax.swing.JMenu();
        vmanager = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        vreport = new javax.swing.JMenuItem();
        stockorder = new javax.swing.JMenu();
        order = new javax.swing.JMenuItem();
        orderhistory = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        orderreport = new javax.swing.JMenuItem();
        profitloss = new javax.swing.JMenu();
        daily = new javax.swing.JMenuItem();
        monthly = new javax.swing.JMenuItem();
        yearly = new javax.swing.JMenuItem();
        reportmaster = new javax.swing.JMenu();
        emprep = new javax.swing.JMenuItem();
        venrep = new javax.swing.JMenuItem();
        prorep = new javax.swing.JMenuItem();
        orderrep = new javax.swing.JMenuItem();
        admin = new javax.swing.JMenu();
        logot = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        changepass = new javax.swing.JMenuItem();
        about = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(240, 233, 212));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(131, Short.MAX_VALUE)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 791, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        home.setText("Home");
        home.setMaximumSize(new java.awt.Dimension(50, 32767));
        home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeMouseClicked(evt);
            }
        });
        jMenuBar1.add(home);

        productmaster.setText("Product Master");
        productmaster.setMaximumSize(new java.awt.Dimension(98, 32767));

        promanager.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.SHIFT_MASK));
        promanager.setText("Product Manager");
        promanager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                promanagerActionPerformed(evt);
            }
        });
        productmaster.add(promanager);

        catmanager.setText("Catagory Manager");
        catmanager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                catmanagerActionPerformed(evt);
            }
        });
        productmaster.add(catmanager);
        productmaster.add(jSeparator1);

        expmanager.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.SHIFT_MASK));
        expmanager.setText("Expiary Date Checker");
        expmanager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                expmanagerActionPerformed(evt);
            }
        });
        productmaster.add(expmanager);

        preport.setText("Product Report");
        preport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                preportActionPerformed(evt);
            }
        });
        productmaster.add(preport);

        jMenuBar1.add(productmaster);

        billmaster.setText("Bill Master");
        billmaster.setMaximumSize(new java.awt.Dimension(72, 32767));

        biller.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        biller.setText("Bill Generator");
        biller.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billerActionPerformed(evt);
            }
        });
        billmaster.add(biller);
        billmaster.add(jSeparator2);

        billhistory.setText("Billing History");
        billhistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billhistoryActionPerformed(evt);
            }
        });
        billmaster.add(billhistory);

        jMenuBar1.add(billmaster);

        empmaster.setText("Employee Master");
        empmaster.setMaximumSize(new java.awt.Dimension(108, 32767));

        empmanager.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.SHIFT_MASK));
        empmanager.setText("Employee Manager");
        empmanager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empmanagerActionPerformed(evt);
            }
        });
        empmaster.add(empmanager);
        empmaster.add(jSeparator3);

        empreport.setText("Employee Report");
        empreport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empreportActionPerformed(evt);
            }
        });
        empmaster.add(empreport);

        jMenuBar1.add(empmaster);

        vendormaster.setText("Vendor Master");
        vendormaster.setMaximumSize(new java.awt.Dimension(94, 32767));

        vmanager.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.SHIFT_MASK));
        vmanager.setText("Vendor Manager");
        vmanager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vmanagerActionPerformed(evt);
            }
        });
        vendormaster.add(vmanager);
        vendormaster.add(jSeparator4);

        vreport.setText("Vendor Report");
        vreport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vreportActionPerformed(evt);
            }
        });
        vendormaster.add(vreport);

        jMenuBar1.add(vendormaster);

        stockorder.setText("Stock Order");
        stockorder.setMaximumSize(new java.awt.Dimension(80, 32767));

        order.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK));
        order.setText("Stock Order Generator");
        order.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderActionPerformed(evt);
            }
        });
        stockorder.add(order);

        orderhistory.setText("Stock Order History");
        orderhistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderhistoryActionPerformed(evt);
            }
        });
        stockorder.add(orderhistory);
        stockorder.add(jSeparator5);

        orderreport.setText("Stock Order Report");
        orderreport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderreportActionPerformed(evt);
            }
        });
        stockorder.add(orderreport);

        jMenuBar1.add(stockorder);

        profitloss.setText("Profit/Loss");
        profitloss.setMaximumSize(new java.awt.Dimension(74, 32767));

        daily.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.SHIFT_MASK));
        daily.setText("Daily Profit/Loss");
        daily.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dailyActionPerformed(evt);
            }
        });
        profitloss.add(daily);

        monthly.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.SHIFT_MASK));
        monthly.setText("Monthly Profit/Loss");
        monthly.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthlyActionPerformed(evt);
            }
        });
        profitloss.add(monthly);

        yearly.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Y, java.awt.event.InputEvent.SHIFT_MASK));
        yearly.setText("Yearly Profit/Loss");
        yearly.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearlyActionPerformed(evt);
            }
        });
        profitloss.add(yearly);

        jMenuBar1.add(profitloss);

        reportmaster.setText("Report Master");
        reportmaster.setMaximumSize(new java.awt.Dimension(92, 32767));

        emprep.setText("Employee Report");
        emprep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emprepActionPerformed(evt);
            }
        });
        reportmaster.add(emprep);

        venrep.setText("Vendor Report");
        venrep.setToolTipText("");
        venrep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                venrepActionPerformed(evt);
            }
        });
        reportmaster.add(venrep);

        prorep.setText("Product Report");
        prorep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prorepActionPerformed(evt);
            }
        });
        reportmaster.add(prorep);

        orderrep.setText("Stock Order Report");
        orderrep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderrepActionPerformed(evt);
            }
        });
        reportmaster.add(orderrep);

        jMenuBar1.add(reportmaster);

        admin.setText("Admin");
        admin.setMaximumSize(new java.awt.Dimension(54, 32767));

        logot.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        logot.setText("Log out");
        logot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logotActionPerformed(evt);
            }
        });
        admin.add(logot);
        admin.add(jSeparator6);

        changepass.setText("Change Password");
        changepass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changepassActionPerformed(evt);
            }
        });
        admin.add(changepass);

        jMenuBar1.add(admin);

        about.setText("About");
        about.setMaximumSize(new java.awt.Dimension(50, 32767));
        about.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aboutMouseClicked(evt);
            }
        });
        jMenuBar1.add(about);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void promanagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_promanagerActionPerformed
        // TODO add your handling code here:
        new product().setVisible(true);      
    }//GEN-LAST:event_promanagerActionPerformed

    private void expmanagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_expmanagerActionPerformed
        // TODO add your handling code here:
        new expairycheck().setVisible(true); 
    }//GEN-LAST:event_expmanagerActionPerformed

    private void preportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_preportActionPerformed
        // TODO add your handling code here:
        Connection conn= DBConnection.connect();
        if (conn!=null) {
           try
           {
                InputStream stream=this.getClass().getResourceAsStream("productreport.jrxml");
                JasperDesign jd=JRXmlLoader.load(stream);
                String sql="select * from product";
                PreparedStatement stat;
                stat = conn.prepareStatement(sql);
                ResultSet rs=stat.executeQuery();
                
                if (rs.next()) 
                {
                    JRDesignQuery newQuery=new JRDesignQuery();
                    newQuery.setText(sql);
                    jd.setQuery(newQuery);
                    JasperReport jr=JasperCompileManager.compileReport(jd);
                    JasperPrint jp=JasperFillManager.fillReport(jr,null,conn);
                    JasperViewer.viewReport(jp, false);   
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "not found");
                }
           }
           catch(Exception ex)
           {
             ex.printStackTrace();
           }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Error");
        }
    }//GEN-LAST:event_preportActionPerformed

    private void billerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billerActionPerformed
        // TODO add your handling code here:
        new billing().setVisible(true); 
    }//GEN-LAST:event_billerActionPerformed

    private void billhistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billhistoryActionPerformed
        // TODO add your handling code here:
        new billhistory().setVisible(true); 
    }//GEN-LAST:event_billhistoryActionPerformed

    private void orderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderActionPerformed
        // TODO add your handling code here:
        new vorder().setVisible(true); 
    }//GEN-LAST:event_orderActionPerformed

    private void venrepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_venrepActionPerformed
        // TODO add your handling code here:
        Connection conn= DBConnection.connect();
        if (conn!=null) {
           try
           {
                InputStream stream=this.getClass().getResourceAsStream("vendor.jrxml");
                JasperDesign jd=JRXmlLoader.load(stream);
                String sql="select * from vendor";
                PreparedStatement stat;
                stat = conn.prepareStatement(sql);
                ResultSet rs=stat.executeQuery();
                
                if (rs.next()) 
                {
                    JRDesignQuery newQuery=new JRDesignQuery();
                    newQuery.setText(sql);
                    jd.setQuery(newQuery);
                    JasperReport jr=JasperCompileManager.compileReport(jd);
                    JasperPrint jp=JasperFillManager.fillReport(jr,null,conn);
                    JasperViewer.viewReport(jp, false);   
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "not found");
                }
           }
           catch(Exception ex)
           {
             ex.printStackTrace();
           }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Error");
        }
    }//GEN-LAST:event_venrepActionPerformed

    private void emprepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emprepActionPerformed
        // TODO add your handling code here:
        Connection conn= DBConnection.connect();
        if (conn!=null) {
           try
           {
                InputStream stream=this.getClass().getResourceAsStream("emp.jrxml");
                JasperDesign jd=JRXmlLoader.load(stream);
                String sql="select * from employee";
                PreparedStatement stat;
                stat = conn.prepareStatement(sql);
                ResultSet rs=stat.executeQuery();
                
                if (rs.next()) 
                {
                    JRDesignQuery newQuery=new JRDesignQuery();
                    newQuery.setText(sql);
                    jd.setQuery(newQuery);
                    JasperReport jr=JasperCompileManager.compileReport(jd);
                    JasperPrint jp=JasperFillManager.fillReport(jr,null,conn);
                    JasperViewer.viewReport(jp, false);   
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "not found");
                }
           }
           catch(Exception ex)
           {
             ex.printStackTrace();
           }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Error");
        }
    }//GEN-LAST:event_emprepActionPerformed

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
        // TODO add your handling code here:
        new menu2().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_homeMouseClicked

    private void aboutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutMouseClicked
        // TODO add your handling code here:
        new about().setVisible(true);
    }//GEN-LAST:event_aboutMouseClicked

    private void changepassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changepassActionPerformed
        // TODO add your handling code here:
        new changepassword().setVisible(true);
    }//GEN-LAST:event_changepassActionPerformed

    private void logotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logotActionPerformed
        // TODO add your handling code here:
        new login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logotActionPerformed

    private void catmanagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_catmanagerActionPerformed
        // TODO add your handling code here:
        new procat().setVisible(true); 
    }//GEN-LAST:event_catmanagerActionPerformed

    private void empmanagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empmanagerActionPerformed
        // TODO add your handling code here:
        new emp().setVisible(true); 
    }//GEN-LAST:event_empmanagerActionPerformed

    private void vmanagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vmanagerActionPerformed
        // TODO add your handling code here:
        new vendor().setVisible(true); 
    }//GEN-LAST:event_vmanagerActionPerformed

    private void orderhistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderhistoryActionPerformed
        // TODO add your handling code here:
        new vorderhistory().setVisible(true); 
    }//GEN-LAST:event_orderhistoryActionPerformed

    private void dailyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dailyActionPerformed
        // TODO add your handling code here:
        new daily().setVisible(true); 
    }//GEN-LAST:event_dailyActionPerformed

    private void monthlyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthlyActionPerformed
        // TODO add your handling code here:
        new monthly().setVisible(true); 
    }//GEN-LAST:event_monthlyActionPerformed

    private void yearlyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearlyActionPerformed
        // TODO add your handling code here:
        new yearly().setVisible(true); 
    }//GEN-LAST:event_yearlyActionPerformed

    private void prorepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prorepActionPerformed
        // TODO add your handling code here:
        Connection conn= DBConnection.connect();
        if (conn!=null) {
           try
           {
                InputStream stream=this.getClass().getResourceAsStream("productreport.jrxml");
                JasperDesign jd=JRXmlLoader.load(stream);
                String sql="select * from product";
                PreparedStatement stat;
                stat = conn.prepareStatement(sql);
                ResultSet rs=stat.executeQuery();
                
                if (rs.next()) 
                {
                    JRDesignQuery newQuery=new JRDesignQuery();
                    newQuery.setText(sql);
                    jd.setQuery(newQuery);
                    JasperReport jr=JasperCompileManager.compileReport(jd);
                    JasperPrint jp=JasperFillManager.fillReport(jr,null,conn);
                    JasperViewer.viewReport(jp, false);   
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "not found");
                }
           }
           catch(Exception ex)
           {
             ex.printStackTrace();
           }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Error");
        }
    }//GEN-LAST:event_prorepActionPerformed

    private void orderrepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderrepActionPerformed
        // TODO add your handling code here:
         Connection conn= DBConnection.connect();
        if (conn!=null) {
           try
           {
                InputStream stream=this.getClass().getResourceAsStream("vorder.jrxml");
                JasperDesign jd=JRXmlLoader.load(stream);
                String sql="select * from vendororder";
                PreparedStatement stat;
                stat = conn.prepareStatement(sql);
                ResultSet rs=stat.executeQuery();
                
                if (rs.next()) 
                {
                    JRDesignQuery newQuery=new JRDesignQuery();
                    newQuery.setText(sql);
                    jd.setQuery(newQuery);
                    JasperReport jr=JasperCompileManager.compileReport(jd);
                    JasperPrint jp=JasperFillManager.fillReport(jr,null,conn);
                    JasperViewer.viewReport(jp, false);   
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "not found");
                }
           }
           catch(Exception ex)
           {
             ex.printStackTrace();
           }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Error");
        }
    }//GEN-LAST:event_orderrepActionPerformed

    private void vreportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vreportActionPerformed
        // TODO add your handling code here:
        Connection conn= DBConnection.connect();
        if (conn!=null) {
           try
           {
                InputStream stream=this.getClass().getResourceAsStream("vendor.jrxml");
                JasperDesign jd=JRXmlLoader.load(stream);
                String sql="select * from vendor";
                PreparedStatement stat;
                stat = conn.prepareStatement(sql);
                ResultSet rs=stat.executeQuery();
                
                if (rs.next()) 
                {
                    JRDesignQuery newQuery=new JRDesignQuery();
                    newQuery.setText(sql);
                    jd.setQuery(newQuery);
                    JasperReport jr=JasperCompileManager.compileReport(jd);
                    JasperPrint jp=JasperFillManager.fillReport(jr,null,conn);
                    JasperViewer.viewReport(jp, false);   
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "not found");
                }
           }
           catch(Exception ex)
           {
             ex.printStackTrace();
           }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Error");
        }
    }//GEN-LAST:event_vreportActionPerformed

    private void empreportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empreportActionPerformed
        // TODO add your handling code here:
        Connection conn= DBConnection.connect();
        if (conn!=null) {
           try
           {
                InputStream stream=this.getClass().getResourceAsStream("emp.jrxml");
                JasperDesign jd=JRXmlLoader.load(stream);
                String sql="select * from employee";
                PreparedStatement stat;
                stat = conn.prepareStatement(sql);
                ResultSet rs=stat.executeQuery();
                
                if (rs.next()) 
                {
                    JRDesignQuery newQuery=new JRDesignQuery();
                    newQuery.setText(sql);
                    jd.setQuery(newQuery);
                    JasperReport jr=JasperCompileManager.compileReport(jd);
                    JasperPrint jp=JasperFillManager.fillReport(jr,null,conn);
                    JasperViewer.viewReport(jp, false);   
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "not found");
                }
           }
           catch(Exception ex)
           {
             ex.printStackTrace();
           }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Error");
        }
    }//GEN-LAST:event_empreportActionPerformed

    private void orderreportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderreportActionPerformed
        // TODO add your handling code here:
         Connection conn= DBConnection.connect();
        if (conn!=null) {
           try
           {
                InputStream stream=this.getClass().getResourceAsStream("vorder.jrxml");
                JasperDesign jd=JRXmlLoader.load(stream);
                String sql="select * from vendororder";
                PreparedStatement stat;
                stat = conn.prepareStatement(sql);
                ResultSet rs=stat.executeQuery();
                
                if (rs.next()) 
                {
                    JRDesignQuery newQuery=new JRDesignQuery();
                    newQuery.setText(sql);
                    jd.setQuery(newQuery);
                    JasperReport jr=JasperCompileManager.compileReport(jd);
                    JasperPrint jp=JasperFillManager.fillReport(jr,null,conn);
                    JasperViewer.viewReport(jp, false);   
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "not found");
                }
           }
           catch(Exception ex)
           {
             ex.printStackTrace();
           }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Error");
        }
    }//GEN-LAST:event_orderreportActionPerformed

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
            java.util.logging.Logger.getLogger(menu2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu about;
    private javax.swing.JMenu admin;
    private javax.swing.JMenuItem biller;
    private javax.swing.JMenuItem billhistory;
    private javax.swing.JMenu billmaster;
    private javax.swing.JMenuItem catmanager;
    private javax.swing.JMenuItem changepass;
    private javax.swing.JMenuItem daily;
    private javax.swing.JMenuItem empmanager;
    private javax.swing.JMenu empmaster;
    private javax.swing.JMenuItem emprep;
    private javax.swing.JMenuItem empreport;
    private javax.swing.JMenuItem expmanager;
    private javax.swing.JMenu home;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JLabel logo;
    private javax.swing.JMenuItem logot;
    private javax.swing.JMenuItem monthly;
    private javax.swing.JMenuItem order;
    private javax.swing.JMenuItem orderhistory;
    private javax.swing.JMenuItem orderrep;
    private javax.swing.JMenuItem orderreport;
    private javax.swing.JMenuItem preport;
    private javax.swing.JMenu productmaster;
    private javax.swing.JMenu profitloss;
    private javax.swing.JMenuItem promanager;
    private javax.swing.JMenuItem prorep;
    private javax.swing.JMenu reportmaster;
    private javax.swing.JMenu stockorder;
    private javax.swing.JMenu vendormaster;
    private javax.swing.JMenuItem venrep;
    private javax.swing.JMenuItem vmanager;
    private javax.swing.JMenuItem vreport;
    private javax.swing.JMenuItem yearly;
    // End of variables declaration//GEN-END:variables
}
