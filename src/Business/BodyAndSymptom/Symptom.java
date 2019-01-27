/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.BodyAndSymptom;

import Business.DiseaseAndTherapy.Therapy;

/**
 *
 * @author chenxinyun
 */
public class Symptom {
    private String symptomName;
    private Therapy therapy;

    public Symptom() {
        this.therapy = new Therapy();
    }
    
    

    public String getSymptomName() {
        return symptomName;
    }

    public void setSymptomName(String symptomName) {
        this.symptomName = symptomName;
    }

    public Therapy getTherapy() {
        return therapy;
    }

    public void setTherapy(Therapy therapy) {
        this.therapy = therapy;
    }

    @Override
    public String toString() {
        return symptomName; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
