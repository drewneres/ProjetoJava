/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import controler.ControllerBebida;
import controler.ControllerCompras;
import controler.ControllerCliente;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.Bebida;
import model.Compras;
import java.time.LocalDate;
/**
 *
 * @author computador
 */
public class FrmTabelaBebidas extends javax.swing.JFrame {
    public boolean Visivel = true;
    FrmLogin userLogin;
    ControllerBebida control = new ControllerBebida();
    ControllerCompras controlCompras = new ControllerCompras();
    ControllerCliente controlCliente = new ControllerCliente();
    String selecc;
    /**
     * Creates new form TabelaBebidas
     */
    public FrmTabelaBebidas() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        String nome = pegaluser();
        lblOla.setText("Olá " + nome);
    }
    
    public String pegaluser(){
        String user;
        user = userLogin.pegaUser();
        System.out.println("" + user);
        return user;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblGin = new javax.swing.JLabel();
        lblVinho = new javax.swing.JLabel();
        lblCerveja = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        lblVodka = new javax.swing.JLabel();
        lblWhisky = new javax.swing.JLabel();
        lblOla = new javax.swing.JLabel();
        btnHist = new javax.swing.JButton();
        lblVoltarLogin = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBebDisponivel = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtQtde = new javax.swing.JTextField();
        btnFinalizarCompra = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        lblGin.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblGin.setForeground(new java.awt.Color(255, 255, 255));
        lblGin.setText("GIN");
        lblGin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblGinMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblGinMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblGinMouseExited(evt);
            }
        });

        lblVinho.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblVinho.setForeground(new java.awt.Color(255, 255, 255));
        lblVinho.setText("VINHOS");
        lblVinho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblVinhoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblVinhoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblVinhoMouseExited(evt);
            }
        });

        lblCerveja.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblCerveja.setForeground(new java.awt.Color(255, 255, 255));
        lblCerveja.setText("CERVEJAS");
        lblCerveja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCervejaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCervejaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCervejaMouseExited(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("   BEBA COM MODERAÇÃO!!");

        jLabel21.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("FALE CONOSCO: (61) 9 99999-9999");

        jLabel22.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Não compartilhe com menores de 18 anos  ");

        lblVodka.setBackground(new java.awt.Color(0, 0, 0));
        lblVodka.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblVodka.setForeground(new java.awt.Color(255, 255, 255));
        lblVodka.setText("VODKA");
        lblVodka.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblVodkaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblVodkaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblVodkaMouseExited(evt);
            }
        });

        lblWhisky.setBackground(new java.awt.Color(0, 0, 0));
        lblWhisky.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblWhisky.setForeground(new java.awt.Color(255, 255, 255));
        lblWhisky.setText("WHISKY");
        lblWhisky.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblWhiskyMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblWhiskyMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblWhiskyMouseExited(evt);
            }
        });

        lblOla.setBackground(new java.awt.Color(0, 0, 0));
        lblOla.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblOla.setForeground(new java.awt.Color(255, 255, 255));
        lblOla.setText(".");
        lblOla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblOlaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblOlaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblOlaMouseExited(evt);
            }
        });

        btnHist.setText("Verificar Historico de compras");
        btnHist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistActionPerformed(evt);
            }
        });

        lblVoltarLogin.setBackground(new java.awt.Color(0, 0, 0));
        lblVoltarLogin.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblVoltarLogin.setForeground(new java.awt.Color(255, 255, 255));
        lblVoltarLogin.setText("FINALIZAR CESSÃO");
        lblVoltarLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblVoltarLoginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblVoltarLoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblVoltarLoginMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblGin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblVinho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblCerveja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblWhisky, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblVodka, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblOla, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnHist))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblVoltarLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(lblOla, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(lblWhisky, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblGin, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCerveja, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblVinho, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblVodka, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(btnHist)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
                .addComponent(lblVoltarLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 720));

        jPanel2.setBackground(new java.awt.Color(102, 153, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(null));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/UPA2.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("DEPÓSITO DE BEBIDAS");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/HOMER SIMPSON.png"))); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bandeiras_de_cartoes.png"))); // NOI18N

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("(61) 9 99999-9999");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/aca94d8d072082682dec2a1584533dda.png"))); // NOI18N

        jLabel11.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("FAZEMOS ENTREGA!!");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 0, 1140, 160));

        jPanel3.setBackground(new java.awt.Color(1, 4, 67));
        jPanel3.setLayout(new javax.swing.BoxLayout(jPanel3, javax.swing.BoxLayout.LINE_AXIS));
        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(639, 106, -1, 119));

        tblBebDisponivel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome da bebida", "Preço", "Disponivel"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblBebDisponivel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBebDisponivelMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblBebDisponivel);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 300, -1, 270));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Tabela de bedidas disponiveis");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 240, 270, 50));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel2.setText("quantidade");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 300, 80, 30));
        getContentPane().add(txtQtde, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 330, 70, 40));

        btnFinalizarCompra.setText("Finalizar compra");
        btnFinalizarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarCompraActionPerformed(evt);
            }
        });
        getContentPane().add(btnFinalizarCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 580, 130, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblVodkaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVodkaMouseClicked
        // TODO add your handling code here:
        AtualizarLista("Vodka");
        selecc = "Vodka";
    }//GEN-LAST:event_lblVodkaMouseClicked

    private void lblVodkaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVodkaMouseEntered

    lblVodka.setForeground(Color.blue);
    }//GEN-LAST:event_lblVodkaMouseEntered

    private void lblWhiskyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblWhiskyMouseClicked
        // TODO add your handling code here:
        AtualizarLista("Whisky");
        selecc = "Whisky";
    }//GEN-LAST:event_lblWhiskyMouseClicked

    private void lblWhiskyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblWhiskyMouseEntered
        // TODO add your handling code here:
        lblWhisky.setForeground(Color.blue);
    }//GEN-LAST:event_lblWhiskyMouseEntered

    private void lblVodkaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVodkaMouseExited
        // TODO add your handling code here:
        lblVodka.setForeground(Color.white);
    }//GEN-LAST:event_lblVodkaMouseExited

    private void lblVinhoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVinhoMouseEntered
        // TODO add your handling code here:
        lblVinho.setForeground(Color.blue);
    }//GEN-LAST:event_lblVinhoMouseEntered

    private void lblVinhoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVinhoMouseExited
        // TODO add your handling code here:
        lblVinho.setForeground(Color.white);
    }//GEN-LAST:event_lblVinhoMouseExited

    private void lblCervejaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCervejaMouseEntered
        // TODO add your handling code here:
        lblCerveja.setForeground(Color.blue);
    }//GEN-LAST:event_lblCervejaMouseEntered

    private void lblCervejaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCervejaMouseExited
        // TODO add your handling code here:
        lblCerveja.setForeground(Color.white);
    }//GEN-LAST:event_lblCervejaMouseExited

    private void lblGinMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGinMouseEntered
        // TODO add your handling code here:
        lblGin.setForeground(Color.blue);
    }//GEN-LAST:event_lblGinMouseEntered

    private void lblGinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGinMouseExited
        // TODO add your handling code here:
        lblGin.setForeground(Color.white);
    }//GEN-LAST:event_lblGinMouseExited

    private void lblWhiskyMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblWhiskyMouseExited
        // TODO add your handling code here:
        lblWhisky.setForeground(Color.white);
    }//GEN-LAST:event_lblWhiskyMouseExited

    private void lblGinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGinMouseClicked
        // TODO add your handling code here:
        AtualizarLista("Gin");
        selecc = "Gin";
    }//GEN-LAST:event_lblGinMouseClicked

    private void lblCervejaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCervejaMouseClicked
        // TODO add your handling code here:
        AtualizarLista("Cerveja");
        selecc = "Cerveja";
    }//GEN-LAST:event_lblCervejaMouseClicked

    private void lblVinhoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVinhoMouseClicked
        // TODO add your handling code here:
        AtualizarLista("Vinho");
        selecc = "Vinho";
    }//GEN-LAST:event_lblVinhoMouseClicked

    private void lblOlaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOlaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblOlaMouseClicked

    private void lblOlaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOlaMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lblOlaMouseEntered

    private void lblOlaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOlaMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_lblOlaMouseExited

    private void btnHistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistActionPerformed
        // TODO add your handling code here:
        new FrmHistoricoCompras().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnHistActionPerformed

    private void tblBebDisponivelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBebDisponivelMouseClicked
        // TODO add your handling code here:
        int linhaSelecionada = tblBebDisponivel.getSelectedRow();
        if(linhaSelecionada != -1){
            Object nomeBebida = tblBebDisponivel.getValueAt(linhaSelecionada, 0);
            Object precoBebida = tblBebDisponivel.getValueAt(linhaSelecionada, 1);
            Object estoque = tblBebDisponivel.getValueAt(linhaSelecionada, 2);
        }
    }//GEN-LAST:event_tblBebDisponivelMouseClicked

    private void btnFinalizarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarCompraActionPerformed
        // TODO add your handling code here:
        Compras co = new Compras();
        int linhaSelecionada = tblBebDisponivel.getSelectedRow();
        LocalDate dataAtual = LocalDate.now();

        Object nomeBebida = tblBebDisponivel.getValueAt(linhaSelecionada, 0);
        Object precoBebida = tblBebDisponivel.getValueAt(linhaSelecionada, 1);
        Object estoque = tblBebDisponivel.getValueAt(linhaSelecionada, 2);
        int qtdeEstoque = Integer.parseInt(estoque.toString());
        
        co.precoBebida = Double.parseDouble(precoBebida.toString());
        co.quantidade = Integer.parseInt(txtQtde.getText());
        co.codBebida = control.pegarCodBebida(nomeBebida.toString(), Double.parseDouble(precoBebida.toString()));
        co.idCliente = controlCliente.pegaIdCliente(pegaluser());
        co.quantidade = Integer.parseInt(txtQtde.getText());
        co.diaCompra = dataAtual.toString();
        co.total = (co.quantidade * co.precoBebida);
        
        if(qtdeEstoque != 0){
            int newqtde = qtdeEstoque - co.quantidade;
            if(newqtde >= 0){
                controlCompras.adcionarCompra(co);
                control.atualizarQuantidadeBebida(control.pegarCodBebida(nomeBebida.toString(), Double.parseDouble(precoBebida.toString())), newqtde);
                DefaultTableModel tbDisponivel = (DefaultTableModel) tblBebDisponivel.getModel();
                AtualizarLista(selecc);
                txtQtde.setText("");
                new FrmQrCode().setVisible(true);
            }      
        }
        
    }//GEN-LAST:event_btnFinalizarCompraActionPerformed

    private void lblVoltarLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVoltarLoginMouseClicked
        // TODO add your handling code here:
        this.dispose();
        new FrmMain().setVisible(true);
    }//GEN-LAST:event_lblVoltarLoginMouseClicked

    private void lblVoltarLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVoltarLoginMouseEntered
        // TODO add your handling code here:
        lblVoltarLogin.setForeground(Color.blue);
    }//GEN-LAST:event_lblVoltarLoginMouseEntered

    private void lblVoltarLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVoltarLoginMouseExited
        // TODO add your handling code here:
        lblVoltarLogin.setForeground(Color.white);
    }//GEN-LAST:event_lblVoltarLoginMouseExited
    
    
    public void AtualizarLista(String selected){
        List<Bebida> lista = new ArrayList();
        DefaultTableModel tbDisponivel = (DefaultTableModel) tblBebDisponivel.getModel();
        lista = control.pegaViaTipo(selected);
        tbDisponivel.setRowCount(0);
        for (Bebida bebida : lista) {
            Object[] dadosBebida = new Object[]{
                bebida.nomeBebida, 
                bebida.precoBebida, 
                bebida.qtdeEstoque
            };
            tbDisponivel.addRow(dadosBebida);
        }
        tbDisponivel.fireTableDataChanged();
    }
    
        public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmTabelaBebidas().setVisible(true);
                
            }
        });
    }
       

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFinalizarCompra;
    private javax.swing.JButton btnHist;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCerveja;
    private javax.swing.JLabel lblGin;
    private javax.swing.JLabel lblOla;
    private javax.swing.JLabel lblVinho;
    private javax.swing.JLabel lblVodka;
    private javax.swing.JLabel lblVoltarLogin;
    private javax.swing.JLabel lblWhisky;
    private javax.swing.JTable tblBebDisponivel;
    private javax.swing.JTextField txtQtde;
    // End of variables declaration//GEN-END:variables
}
