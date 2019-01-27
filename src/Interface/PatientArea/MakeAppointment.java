/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.PatientArea;

import Business.DiseaseAndTherapy.Medicine;
import Business.EcoSystem;
import Business.Enterprise.HospitalEnterprise;
import Business.Organization.DoctorOrganization;
import Business.Organization.Organization;
import Business.Role.DoctorRole;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.AppointmentRequest;
import Business.WorkQueue.WorkQueue;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Image;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author zhang
 */
public class MakeAppointment extends javax.swing.JPanel {

    /**
     * Creates new form MakeAppointment
     */
    private JPanel userProcessContainer;
    private EcoSystem ecoSystem;
   
    private UserAccount patient;
    private HospitalEnterprise hospitalEnterprise;
    private WorkQueue workQueue;

    MakeAppointment(JPanel userProcessContainer, EcoSystem ecoSystem, UserAccount patient, HospitalEnterprise hospitalEnterprise) throws ParseException {
        initComponents();
        this.userProcessContainer= userProcessContainer;
        this.ecoSystem = ecoSystem;
        this.patient = patient;
        this.hospitalEnterprise = hospitalEnterprise;
        jComboBox1.removeAllItems();
        jComboBox2.removeAllItems();
        jComboBox3.removeAllItems();
        populateDoctor();
        populateDay();
        populateTime();
        UserAccount userAccount = (UserAccount)jComboBox1.getSelectedItem();
        if(userAccount!=null){
        ImageIcon image =  new ImageIcon(userAccount.getPhoto());
        image.setImage(image.getImage().getScaledInstance(131,171,Image.SCALE_DEFAULT));
        photo.setIcon(image);
        }
    }
    public void populateDoctor(){
        jComboBox1.removeAllItems();
        for(Organization organization : hospitalEnterprise.getOrganizationDirectory().getOrganizationList()){
            if(organization instanceof DoctorOrganization){

                for(UserAccount userAccount:organization.getUserAccountDirectory().getUserAccountList()){
                    jComboBox1.addItem(userAccount);
                    
                }
            }
        }
        
    }
    public void populateDay(){
        jComboBox2.removeAllItems();
        SimpleDateFormat sdf = new SimpleDateFormat("MM-dd");
        Date today = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(today);
        
        for(int i=1; i<=6;i++){
            c.add(Calendar.DAY_OF_MONTH, 1);
            Date time = c.getTime();
            jComboBox2.addItem(sdf.format(time));
        }
    }
    public void populateTime() throws ParseException{
        jComboBox3.removeAllItems();
        ArrayList<AppointmentRequest> workQueue = new  ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("MM-dd");
        UserAccount userAccount = (UserAccount)jComboBox1.getSelectedItem();
        if(userAccount!=null){
            DoctorRole doctorRole =(DoctorRole) userAccount.getRole();
            String day = (String) jComboBox2.getSelectedItem();
            Date date = sdf.parse(day);
            workQueue = doctorRole.getQueuebyDay(date);
            SimpleDateFormat sdf1 = new SimpleDateFormat("hh:mm");
            String str1 = "09:00";
            String str2 = "10:00";
            String str3 = "11:00";
            String str4 = "14:00";
            String str5 = "15:00";
            String str6 = "16:00";
            Date date1 = sdf1.parse(str1);
            Date date2 = sdf1.parse(str2);
            Date date3 = sdf1.parse(str3);
            Date date4 = sdf1.parse(str4);
            Date date5 = sdf1.parse(str5);
            Date date6 = sdf1.parse(str6);
            List<String> strstring = new ArrayList<>();
            List<String> mid = new ArrayList<>();
            strstring.add(str1);
            strstring.add(str2);
            strstring.add(str3);
            strstring.add(str4);
            strstring.add(str5);
            strstring.add(str6);
            for(AppointmentRequest workRequest:workQueue){
                for(String s: strstring){
                    
                    String fromtime = sdf1.format(workRequest.getFromDate());
                    if(s.equals(fromtime)){
                        mid.add(s);
                    }
                }
            }
            strstring.removeAll(mid);
            for(String s : strstring){
                if(s.equals(str1)){
                   jComboBox3.addItem(str1+"-"+str2); 
                }else  if(s.equals(str2)){
                   jComboBox3.addItem(str2+"-"+str3); 
                }else if(s.equals(str3)){
                   jComboBox3.addItem(str3+"-12:00"); 
                }else if (s.equals(str4)){
                   jComboBox3.addItem(str4+"-15:00");
                }else if(s.equals(str5)){
                   jComboBox3.addItem(str5+"-16:00"); 
                }else if(s.equals(str6)){
                   jComboBox3.addItem(str6+"-17:00"); 
                }
            }
        }

        
        
        
        
        
        
      
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        photo = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Doctor");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Day");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Time");

        jToggleButton1.setText("Assign");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jToggleButton2.setText("Back");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });

        photo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        photo.setText("Photo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(photo, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jToggleButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(385, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(photo, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jToggleButton1)
                            .addComponent(jToggleButton2))))
                .addContainerGap(320, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        UserAccount userAccount = (UserAccount)jComboBox1.getSelectedItem();
        if(userAccount!=null){
        DoctorRole doctorRole =(DoctorRole) userAccount.getRole();
        String day = (String) jComboBox2.getSelectedItem();
        String time = (String) jComboBox3.getSelectedItem();
        String []timearr = time.split("-");
        String from = day+" "+ timearr[0];
        String to = day+" "+timearr[1];
        SimpleDateFormat sdf = new SimpleDateFormat("MM-dd hh:mm");
        
            try {
                Date toDate = sdf.parse(to);
                Date fromDate = sdf.parse(from);
                AppointmentRequest appointmentRequest = new AppointmentRequest();
                appointmentRequest.setSender(patient);
                appointmentRequest.setFromDate(fromDate);
                appointmentRequest.setToDate(toDate);
                appointmentRequest.setStatus("WAIT");
                appointmentRequest.setType("Personal");
                doctorRole.getWorkQueue().add(appointmentRequest);
                        
            } catch (ParseException ex) {
                Logger.getLogger(MakeAppointment.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(null, "Success!");
            try {
                populateTime();
            } catch (ParseException ex) {
                Logger.getLogger(MakeAppointment.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        
        UserAccount userAccount = (UserAccount)jComboBox1.getSelectedItem();
        if(userAccount!=null){
        ImageIcon image =  new ImageIcon(userAccount.getPhoto());
        image.setImage(image.getImage().getScaledInstance(131,171,Image.SCALE_DEFAULT));
        photo.setIcon(image);
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        try {
            // TODO add your handling code here:
            populateTime();
        } catch (ParseException ex) {
            Logger.getLogger(MakeAppointment.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        // TODO add your handling code here:
       userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jToggleButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JLabel photo;
    // End of variables declaration//GEN-END:variables
}
