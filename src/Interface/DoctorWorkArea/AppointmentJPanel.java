/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.DoctorWorkArea;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Role.DoctorRole;
import Business.Role.PatientRole;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.AppointmentRequest;
import Business.WorkQueue.WorkQueue;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;
import javax.swing.text.DocumentFilter.FilterBypass;
import javax.swing.text.InternationalFormatter;

/**
 *
 * @author zhang
 */
public class AppointmentJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AppointmentJPanel
     */

    private JPanel userProcessContainer;
    private EcoSystem ecoSystem;
    private UserAccount account;
    private DoctorRole doctorRole;
    private Enterprise enterprise;
    AppointmentJPanel(JPanel userProcessContainer, EcoSystem ecoSystem, UserAccount account,Enterprise enterprise) {
        initComponents();
        this.enterprise = enterprise;
        this.userProcessContainer = userProcessContainer;
        this.ecoSystem = ecoSystem;
        this.account = account;
        doctorRole =(DoctorRole) account.getRole();
        ArrayList<AppointmentRequest> workRequestList = new ArrayList<>();
        workRequestList = doctorRole.getTodayQueue();
        populateTable(workRequestList);
        jSpinner1.addKeyListener(new KeyListener() {  
    @Override  
    public void keyTyped(KeyEvent e) {  
        // 只能输入数字  
        char keyCh = e.getKeyChar();  
        if ((keyCh < '0') || (keyCh > '9')) {  
                e.setKeyChar('\0');  
        }  
    }  
  
    @Override  
    public void keyReleased(KeyEvent e) {  
    }  
  
    @Override  
    public void keyPressed(KeyEvent e) {  
    }  
});
        jSpinner2.addKeyListener(new KeyListener() {  
    @Override  
    public void keyTyped(KeyEvent e) {  
        // 只能输入数字  
        char keyCh = e.getKeyChar();  
        if ((keyCh < '0') || (keyCh > '9')) {  
                e.setKeyChar('\0');  
        }  
    }  
  
    @Override  
    public void keyReleased(KeyEvent e) {  
    }  
  
    @Override  
    public void keyPressed(KeyEvent e) {  
    }  
});
        jSpinner3.addKeyListener(new KeyListener() {  
    @Override  
    public void keyTyped(KeyEvent e) {  
        // 只能输入数字  
        char keyCh = e.getKeyChar();  
        if ((keyCh < '0') || (keyCh > '9')) {  
                e.setKeyChar('\0');  
        }  
    }  
  
    @Override  
    public void keyReleased(KeyEvent e) {  
    }  
  
    @Override  
    public void keyPressed(KeyEvent e) {  
    }  
});
        jSpinner4.addKeyListener(new KeyListener() {  
    @Override  
    public void keyTyped(KeyEvent e) {  
        // 只能输入数字  
        char keyCh = e.getKeyChar();  
        if ((keyCh < '0') || (keyCh > '9')) {  
                e.setKeyChar('\0');  
        }  
    }  
  
    @Override  
    public void keyReleased(KeyEvent e) {  
    }  
  
    @Override  
    public void keyPressed(KeyEvent e) {  
    }  
});
    }

    public void populateTable(ArrayList<AppointmentRequest> workRequestList){
        DefaultTableModel model = (DefaultTableModel) AppointmentTable.getModel();
        
        model.setRowCount(0);
        int i =0 ;
        for (AppointmentRequest AppointmentRequest : workRequestList){
            
           
            Object[] row = new Object[6];
            row[0] = i;
            row[1] = AppointmentRequest;
            row[2] = AppointmentRequest.getSender();
            row[3] = AppointmentRequest.getFromDateString();
            row[4] = AppointmentRequest.getToDateString();
            row[5] = AppointmentRequest.getStatus();
            model.addRow(row);

            i++;
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        AppointmentTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Date = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        useJbox = new javax.swing.JCheckBox();
        jButton4 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        name1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jSpinner4 = new javax.swing.JTextField();
        jSpinner1 = new javax.swing.JTextField();
        jSpinner2 = new javax.swing.JTextField();
        jSpinner3 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setPreferredSize(new java.awt.Dimension(900, 600));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AppointmentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "Type", "Patient", "From", "To", "State"
            }
        ));
        jScrollPane1.setViewportView(AppointmentTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 542, 377));

        jButton1.setText("View");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 310, -1, -1));

        jButton2.setText("Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 260, -1, -1));

        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 310, -1, -1));

        jLabel3.setText("Patient Name:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 140, 113, 30));

        jLabel4.setText("       To:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 210, 73, 32));

        jLabel5.setText("       From:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 170, 91, 32));

        Date.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                DateFocusLost(evt);
            }
        });
        add(Date, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 70, 115, -1));

        jLabel1.setText("Type:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 110, 47, 20));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("EMS");
        jRadioButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 110, -1, -1));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Personal");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 110, -1, -1));

        jLabel2.setText(":");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 170, -1, -1));

        jLabel6.setText(":");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 210, -1, -1));

        useJbox.setText("Use");
        add(useJbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 170, -1, -1));

        jButton4.setText("Reflash");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 260, -1, -1));

        jLabel7.setText("Date:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 70, 47, 20));
        add(name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 140, 115, -1));

        jLabel8.setText("(Mon-Day)");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 70, 77, 20));

        jSpinner4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jSpinner4FocusLost(evt);
            }
        });
        add(jSpinner4, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 210, 50, -1));

        jSpinner1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jSpinner1FocusLost(evt);
            }
        });
        add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 170, 50, -1));

        jSpinner2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jSpinner2FocusLost(evt);
            }
        });
        add(jSpinner2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 170, 50, -1));

        jSpinner3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jSpinner3FocusLost(evt);
            }
        });
        add(jSpinner3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 210, 50, -1));

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel9.setText("Doctor Assignment System");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1000, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        DoctorWorkAreaJpanel dwjp = (DoctorWorkAreaJpanel) component;
        
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.show(userProcessContainer,"doctorWorkAreaJpanel");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int select = AppointmentTable.getSelectedRow();
        if(select >=0){
        AppointmentRequest appointmentRequest =(AppointmentRequest) AppointmentTable.getValueAt(select, 1);
        ViewAppiontmentJPanel viewAppiontmentJPanel = new ViewAppiontmentJPanel(userProcessContainer,ecoSystem,account,appointmentRequest,enterprise);
        userProcessContainer.add("viewAppiontmentJPanel", viewAppiontmentJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        }else
            JOptionPane.showMessageDialog(null,"please select a row");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String date = Date.getText();
               
        if(date!=null){
            SimpleDateFormat sdf1 = new SimpleDateFormat("MM-dd");
            try {
                Date datetime= sdf1.parse(date);
                ArrayList<AppointmentRequest> workRequestList = doctorRole.getQueuebyDay(datetime);
                
        ArrayList<AppointmentRequest> midList = new ArrayList<>();
        ArrayList<AppointmentRequest> finalList = new ArrayList<>();
        String Type= "";
        String patientName = name1.getText();
        String fromTime = date+" "+jSpinner1.getText()+":"+jSpinner2.getText();
        String toTime = date+" "+jSpinner3.getText()+":"+jSpinner4.getText();
        SimpleDateFormat sdf = new SimpleDateFormat("MM-dd HH:mm");
        Date fromTimeDate;
        Date toTimeDate;

        if(jRadioButton1.isSelected()){
            Type = EcoSystem.Appointment.EMS.getValue();
        }else if(jRadioButton2.isSelected()){
            Type = EcoSystem.Appointment.Personal.getValue();
        }
        if(!Type.isEmpty()){
            for(AppointmentRequest appointmentRequest:workRequestList){
                
                if(Type.equals(appointmentRequest.getType())){
                    midList.add(appointmentRequest);
                }
            }
            workRequestList = midList;
            midList = finalList;
        }
        if(!patientName.isEmpty()){
            for(AppointmentRequest appointmentRequest:workRequestList){
                
                UserAccount userAccount = appointmentRequest.getSender();
                if(patientName.equals(userAccount.getName())){
                    midList.add(appointmentRequest);
                }
            }
            workRequestList = midList;
            midList = finalList;
        }
        if(useJbox.isSelected()&&!jSpinner1.getText().isEmpty()&&!jSpinner2.getText().isEmpty()&&!jSpinner3.getText().isEmpty()&&!jSpinner4.getText().isEmpty()){
            for(AppointmentRequest appointmentRequest:workRequestList){
                
                Date reqFrom;
                Date reqTo;
                try {
                     reqFrom = appointmentRequest.getFromDate();
                     reqTo = appointmentRequest.getToDate();
                     fromTimeDate = sdf.parse(fromTime);
                     toTimeDate = sdf.parse(toTime);
                     if(reqFrom.after(fromTimeDate)&&reqFrom.before(toTimeDate)&&reqTo.after(reqFrom)&&reqTo.before(toTimeDate)){
                         midList.add(appointmentRequest);
                     }
                } catch (ParseException ex) {
                    Logger.getLogger(AppointmentJPanel.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                
            }
            workRequestList = midList;
            midList = finalList;
        }
        populateTable(workRequestList);
        return;
            } catch (ParseException ex) {
                Logger.getLogger(AppointmentJPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        ArrayList<AppointmentRequest> workRequestList = doctorRole.getTodayQueue();
                
        ArrayList<AppointmentRequest> midList = new ArrayList<>();
        ArrayList<AppointmentRequest> finalList = new ArrayList<>();
        String Type= "";
        String patientName = name1.getText();
        String fromTime = jSpinner1.getText()+":"+jSpinner2.getText();
        String toTime = jSpinner3.getText()+":"+jSpinner4.getText();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        Date fromTimeDate;
        Date toTimeDate;

        if(jRadioButton1.isSelected()){
            Type = EcoSystem.Appointment.EMS.getValue();
        }else if(jRadioButton2.isSelected()){
            Type = EcoSystem.Appointment.Personal.getValue();
        }
        if(!Type.isEmpty()){
            for(AppointmentRequest appointmentRequest:workRequestList){
                
                if(Type.equals(appointmentRequest.getType())){
                    midList.add(appointmentRequest);
                }
            }
            workRequestList = midList;
            midList = finalList;
        }
        if(!patientName.isEmpty()){
            for(AppointmentRequest appointmentRequest:workRequestList){
                
                UserAccount userAccount = appointmentRequest.getSender();
                if(patientName.equals(userAccount.getName())){
                    midList.add(appointmentRequest);
                }
            }
            workRequestList = midList;
            midList = finalList;
        }
        if(useJbox.isSelected()){
            for(AppointmentRequest appointmentRequest:workRequestList){
                
                Date reqFrom;
                Date reqTo;
                try {
                     reqFrom = sdf.parse(appointmentRequest.getFromDateString());
                     reqTo = sdf.parse(appointmentRequest.getToDateString());
                     fromTimeDate = sdf.parse(fromTime);
                     toTimeDate = sdf.parse(toTime);
                     if(reqFrom.after(fromTimeDate)&&reqFrom.before(toTimeDate)&&reqTo.after(reqFrom)&&reqTo.before(toTimeDate)){
                         midList.add(appointmentRequest);
                     }
                } catch (ParseException ex) {
                    Logger.getLogger(AppointmentJPanel.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                
            }
            workRequestList = midList;
            midList = finalList;
        }
        populateTable(workRequestList);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
        if(jRadioButton1.isSelected()){
            jRadioButton1.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
        if(jRadioButton2.isSelected()){
            jRadioButton2.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        jRadioButton1.setSelected(false);
        jRadioButton2.setSelected(false);
        useJbox.setSelected(false);
        name1.setText("");
        jSpinner1.setText("");
        jSpinner2.setText("");
        jSpinner3.setText("");
        jSpinner4.setText("");
        String date = Date.getText();
        if(date!=null){
            SimpleDateFormat sdf = new SimpleDateFormat("MM-dd");
            try {
                Date datetime= sdf.parse(date);
                ArrayList<AppointmentRequest> datequeue = doctorRole.getQueuebyDay(datetime);
                populateTable(datequeue);
            } catch (ParseException ex) {
                Logger.getLogger(AppointmentJPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void DateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_DateFocusLost
        // TODO add your handling code here:
        String date = Date.getText();
        if(date.matches("(((0[13578]|1[02])-(0[1-9]|[12][0-9]|3[01]))|((0[469]|11)-(0[1-9]|[12][0-9]|30))|(02-(0[1-9]|[1][0-9]|2[0-8])))")){
        if(date!=null){
            SimpleDateFormat sdf = new SimpleDateFormat("MM-dd");
            try {
                Date datetime= sdf.parse(date);
                ArrayList<AppointmentRequest> datequeue = doctorRole.getQueuebyDay(datetime);
                populateTable(datequeue);
            } catch (ParseException ex) {
                Logger.getLogger(AppointmentJPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            ArrayList<AppointmentRequest> datequeue = doctorRole.getTodayQueue();
                populateTable(datequeue);
        }
        }else{
            JOptionPane.showMessageDialog(null, "Please input right date");
            Date.setText("");
        }
    }//GEN-LAST:event_DateFocusLost

    private void jSpinner1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jSpinner1FocusLost
        // TODO add your handling code here:
                String j = jSpinner1.getText();
        if(!j.isEmpty()){
        int num = Integer.parseInt(jSpinner1.getText());
        if(num>23||num<0){
            jSpinner1.setText("");
        }}
    }//GEN-LAST:event_jSpinner1FocusLost

    private void jSpinner2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jSpinner2FocusLost
        // TODO add your handling code here:
        String j = jSpinner2.getText();
        if(!j.isEmpty()){
        int num = Integer.parseInt(jSpinner2.getText());
        if(num>59||num<0){
            jSpinner2.setText("");
        }}
    }//GEN-LAST:event_jSpinner2FocusLost

    private void jSpinner3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jSpinner3FocusLost
        // TODO add your handling code here
                String j1 = jSpinner1.getText();
                String j2 = jSpinner3.getText();
        if(!j1.isEmpty()&&!j2.isEmpty()){
          int num1 = Integer.parseInt(jSpinner1.getText());
          int num2 = Integer.parseInt(jSpinner3.getText());
        if(num1<num2||num2>23||num2<0){
            jSpinner3.setText("");
        }}
    }//GEN-LAST:event_jSpinner3FocusLost

    private void jSpinner4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jSpinner4FocusLost
        // TODO add your handling code here:
                String j1 = jSpinner1.getText();
                String j2 = jSpinner2.getText();
                String j3 = jSpinner3.getText();
                String j4 = jSpinner4.getText();
        if(!j1.isEmpty()&&!j2.isEmpty()&&!j3.isEmpty()&&!j4.isEmpty()){
          int num1 = Integer.parseInt(jSpinner1.getText());
          int num2 = Integer.parseInt(jSpinner2.getText());
          int num3 = Integer.parseInt(jSpinner3.getText());
          int num4 = Integer.parseInt(jSpinner4.getText());
        if(num3==num1){
            if(num4<=num3)
            jSpinner4.setText("");
        }
        }
    }//GEN-LAST:event_jSpinner4FocusLost
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable AppointmentTable;
    private javax.swing.JTextField Date;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jSpinner1;
    private javax.swing.JTextField jSpinner2;
    private javax.swing.JTextField jSpinner3;
    private javax.swing.JTextField jSpinner4;
    private javax.swing.JTextField name1;
    private javax.swing.JCheckBox useJbox;
    // End of variables declaration//GEN-END:variables
}