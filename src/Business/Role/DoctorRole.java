/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.AppointmentRequest;
import Business.WorkQueue.WorkQueue;
import Business.WorkQueue.WorkRequest;
import Interface.DoctorWorkArea.DoctorWorkAreaJpanel;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import javax.swing.JPanel;

/**
 *
 * @author xingyaowu
 */
public class DoctorRole extends Role {
    private ArrayList<AppointmentRequest> workQueue;
    private String profession;

    public DoctorRole() {
        workQueue = new ArrayList<>();
        profession = "Waiting to be assigned...";
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }
    
    public ArrayList getWorkQueue() {
        if(workQueue==null)
            workQueue = new ArrayList<>();
        
        if(workQueue.size()>=2)
          Collections.sort(workQueue,new Comparator<AppointmentRequest>(){
                public int compare(AppointmentRequest o1,AppointmentRequest o2){

                return o2.getFromDate().compareTo(o1.getFromDate());
                }
            });
        return workQueue;
    }
    public ArrayList getQueuebyDay(Date date){
        ArrayList<AppointmentRequest>  todayQueue = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("MM-dd");
        String dayString = sdf.format(date);
        if(workQueue!=null){
        for(AppointmentRequest appointmentRequest:workQueue){
            if(dayString.equals(sdf.format(appointmentRequest.getFromDate()))){

            todayQueue.add(appointmentRequest);
            
            }
        }
           Collections.sort(todayQueue,new Comparator<AppointmentRequest>(){
                public int compare(AppointmentRequest o1,AppointmentRequest o2){

                return o1.getFromDate().compareTo(o2.getFromDate());
                }
            });  }
        else
            workQueue = new ArrayList<>();
            return  todayQueue;
    }
    public ArrayList getTodayQueue(){
         
        ArrayList<AppointmentRequest>  todayQueue = new ArrayList<>();
        Date today = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("MM-dd");
        String day = sdf.format(today);
        if(workQueue!=null){
      for (AppointmentRequest workRequest :workQueue ){
            
            if(day.equals(sdf.format(workRequest.getFromDate()))){

            workQueue.add(workRequest);
            
            }
           
    } 
                Collections.sort(todayQueue,new Comparator<AppointmentRequest>(){
                public int compare(AppointmentRequest o1,AppointmentRequest o2){

                return o1.getFromDate().compareTo(o2.getFromDate());
                }
            });}else
                     workQueue = new ArrayList<>();

      return  todayQueue;
    }

    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, EcoSystem business,Enterprise enterprise) {
        return new DoctorWorkAreaJpanel(userProcessContainer, account, organization, business, enterprise);
    }
    
}
