/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Ambulance;

import Business.Ambulance.Ambulance;
import Business.DiseaseAndTherapy.Therapy;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author xingyaowu
 */
public class AmbulanceService {
    private Ambulance ambulance;
    private ArrayList<UserAccount> listOfAiders;
    private Date startoffDate;
    private Date pickUpPatientDate;
    private Therapy therapy;
    private String currentAddress;
    
    public AmbulanceService(Ambulance ambulance) {
        this.ambulance = ambulance;
        listOfAiders = new ArrayList<>();
        startoffDate = new Date();
        pickUpPatientDate = new Date();
    }

    public String getCurrentAddress() {
        return currentAddress;
    }

    public void setCurrentAddress(String currentAddress) {
        this.currentAddress = currentAddress;
    }

    public Ambulance getAmbulance() {
        return ambulance;
    }

    public void setAmbulance(Ambulance ambulance) {
        this.ambulance = ambulance;
    }

    public ArrayList<UserAccount> getListOfAiders() {
        if(listOfAiders == null){
            listOfAiders = new ArrayList<>();
        }
        return listOfAiders;
    }

    public void setListOfAiders(ArrayList<UserAccount> listOfAiders) {
        this.listOfAiders = listOfAiders;
    }

    public Date getStartoffDate() {
        return startoffDate;
    }

    public void setStartoffDate(Date startoffDate) {
        this.startoffDate = startoffDate;
    }

    public Date getPickUpPatientDate() {
        return pickUpPatientDate;
    }

    public void setPickUpPatientDate(Date pickUpPatientDate) {
        this.pickUpPatientDate = pickUpPatientDate;
    }

    public Therapy getTherapy() {
        return therapy;
    }

    public void setTherapy(Therapy therapy) {
        this.therapy = therapy;
    }
    
    
    @Override
    public String toString() {
        return this.ambulance.getName();
    }
    
}
