/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.BodyAndSymptom;

import java.util.ArrayList;

/**
 *
 * @author chenxinyun
 */
public class BodyApparatus {
    private String bodyApparatusName;
    private ArrayList<Symptom> symptomList;

    public BodyApparatus() {
        symptomList = new ArrayList<>();
    }

    public String getBodyApparatusName() {
        return bodyApparatusName;
    }

    public void setBodyApparatusName(String bodyApparatusName) {
        this.bodyApparatusName = bodyApparatusName;
    }

    public ArrayList<Symptom> getSymptomList() {
        return symptomList;
    }

    public void setSymptomList(ArrayList<Symptom> symptomList) {
        this.symptomList = symptomList;
    }
    
    public Symptom addSymptom(String name){ 
        Symptom symptom = new Symptom();
        symptom.setSymptomName(name);
        if(symptomList == null){
            symptomList = new ArrayList<>();
        } 
        symptomList.add(symptom);
        return symptom;
    }
    
    @Override
    public String toString(){
        return bodyApparatusName;
    }
}
