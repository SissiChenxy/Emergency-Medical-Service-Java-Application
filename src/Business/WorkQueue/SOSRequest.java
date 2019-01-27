/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Ambulance.AmbulanceService;
import Business.DiseaseAndTherapy.Therapy;
import Business.Enterprise.Enterprise;


/**
 *
 * @author chenxinyun
 */
public class SOSRequest extends WorkRequest{
    private String bodyPart;
    private String bodyApparatus;
    private String symptom;
    private String streetAddress;
    private String city;
    private String zipcode;
    private String phone;
    private String name;
    private AmbulanceService ambulanceService;
    private Enterprise hospital;

    public Enterprise getHospital() {
        return hospital;
    }

    public void setHospital(Enterprise hospital) {
        this.hospital = hospital;
    }
    
    public String getBodyPart() {
        return bodyPart;
    }

    public void setBodyPart(String bodyPart) {
        this.bodyPart = bodyPart;
    }

    public String getBodyApparatus() {
        return bodyApparatus;
    }

    public void setBodyApparatus(String bodyApparatus) {
        this.bodyApparatus = bodyApparatus;
    }

    public String getSymptom() {
        return symptom;
    }

    public void setSymptom(String symptom) {
        this.symptom = symptom;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }   

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public AmbulanceService getAmbulanceService() {
        return ambulanceService;
    }

    public void setAmbulanceService(AmbulanceService ambulanceService) {
        this.ambulanceService = ambulanceService;
    }
  
     public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getPhone() {
        return phone;
    }

    public void setphone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return name;
    }
}
