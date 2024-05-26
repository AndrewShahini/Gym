/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gym;

import static gym.Gym.members;
import java.io.*;
import java.util.ArrayList;
import java.util.stream.Collectors;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author shahi
 */
public class frmUpgradeMember extends javax.swing.JFrame {

    /**
     * Creates new form frmUpgradeMember
     */
    public frmUpgradeMember() {
        initComponents();
        members = loadMembers();
        updateMemberList(members);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        list1 = new java.awt.List();
        txtPhoneNumber = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        lblPhoneNumber = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        lblID = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        lblUgradeMember = new javax.swing.JLabel();
        btnUpgrade = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listMembers = new javax.swing.JList<>();
        btnRefresh = new javax.swing.JButton();
        lblMemID = new javax.swing.JLabel();
        txtMemID = new javax.swing.JTextField();
        lblMemName = new javax.swing.JLabel();
        txtMemName = new javax.swing.JTextField();

        list1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                list1ActionPerformed(evt);
            }
        });

        txtPhoneNumber.setText("xxx-xxx-xxxx");
        txtPhoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneNumberActionPerformed(evt);
            }
        });

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        lblPhoneNumber.setText("Phone Number");

        lblName.setText("Name");

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        jLabel4.setText("Email");

        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });

        lblID.setText("ID");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblUgradeMember.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        lblUgradeMember.setText("UPGRADE MEMBER");

        btnUpgrade.setText("Upgrade");
        btnUpgrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpgradeActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(listMembers);

        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        lblMemID.setText("ID");

        txtMemID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMemIDActionPerformed(evt);
            }
        });

        lblMemName.setText("Name");

        txtMemName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMemNameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(lblUgradeMember)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMemID, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMemID, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMemName, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMemName, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(btnRefresh))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(btnBack)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(btnUpgrade)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lblUgradeMember)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblMemID)
                        .addGap(18, 18, 18)
                        .addComponent(txtMemID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblMemName)
                        .addGap(18, 18, 18)
                        .addComponent(txtMemName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnRefresh)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpgrade)
                    .addComponent(btnBack))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        dispose();
        new frmMemberMenu().setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnUpgradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpgradeActionPerformed

     String selectedMember = listMembers.getSelectedValue();
        if (selectedMember != null) {
            for (Member member : members) {
                if (member.getName().equals(selectedMember)) {
                    member.upgradeToPremium();
                    saveMembers();
                    updateMemberList(members);
                    JOptionPane.showMessageDialog(this, "Member upgraded to premium!");
                    break;
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "No member selected.");
        }       
    
    }//GEN-LAST:event_btnUpgradeActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void txtPhoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneNumberActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void list1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_list1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_list1ActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        String id = txtID.getText().trim();
        String name = txtName.getText().trim();

        ArrayList<Member> filteredMembers = new ArrayList<>();

        for (Member member : members) {
            boolean matches = true;

        if (member.membership.equalsIgnoreCase("regular")) {
            matches = true;
        }
        if (!id.isEmpty() && !member.getMemberId().contains(id)) {
            matches = false;
        }
        if (!name.isEmpty() && !member.getName().contains(name)) {
            matches = false;
        }
        if (matches) {
            filteredMembers.add(member);
        }
    }

    updateMemberList(filteredMembers);

    }//GEN-LAST:event_btnRefreshActionPerformed

    private void txtMemIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMemIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMemIDActionPerformed

    private void txtMemNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMemNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMemNameActionPerformed

    private ArrayList<Member> loadMembers() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("members.ser"))) {
            return (ArrayList<Member>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            return new ArrayList<>();
        }
    }
    
    public void saveMembers() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("members.ser"))) {
            oos.writeObject(members);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
        private void updateMemberList(ArrayList<Member> members) {
        DefaultListModel<String> listModel = new DefaultListModel<>();
        for (Member member : members) {
            if (member.membership.equalsIgnoreCase("Regular")) {
                listModel.addElement(member.getName());
            }
        }
        listMembers.setModel(listModel);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnUpgrade;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblMemID;
    private javax.swing.JLabel lblMemName;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPhoneNumber;
    private javax.swing.JLabel lblUgradeMember;
    private java.awt.List list1;
    private javax.swing.JList<String> listMembers;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtMemID;
    private javax.swing.JTextField txtMemName;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhoneNumber;
    // End of variables declaration//GEN-END:variables
}
