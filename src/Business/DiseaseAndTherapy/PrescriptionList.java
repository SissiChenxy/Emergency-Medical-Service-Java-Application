/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DiseaseAndTherapy;

import java.util.ArrayList;

/**
 *
 * @author zhang
 */
public class PrescriptionList {
    private ArrayList<Prescription> prescriptions;

    public PrescriptionList() {
        prescriptions = new ArrayList<>();
    }

    public ArrayList<Prescription> getPrescriptions() {
        return prescriptions;
    }

    public void setPrescriptions(ArrayList<Prescription> prescriptions) {
        this.prescriptions = prescriptions;
    }
    
    
}
