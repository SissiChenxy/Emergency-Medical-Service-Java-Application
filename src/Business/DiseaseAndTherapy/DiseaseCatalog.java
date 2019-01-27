/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DiseaseAndTherapy;

import java.util.ArrayList;

/**
 *
 * @author chenxinyun
 */
public class DiseaseCatalog {
    private ArrayList<Disease> diseaseCatalog;

    public ArrayList<Disease> getDiseaseCatalog() {
        if(diseaseCatalog==null)
            diseaseCatalog= new ArrayList<>();
        return diseaseCatalog;
    }

    public void setDiseaseCatalog(ArrayList<Disease> diseaseCatalog) {
        this.diseaseCatalog = diseaseCatalog;
    }
    
    public void deleteDisease(Disease disease){
        diseaseCatalog.remove(disease);    
     }
    
    public Disease addDisease(Disease disease){
        diseaseCatalog.add(disease);
        return disease;
    }
    
    public Disease getDiseaseByIndex(int index) {
         return diseaseCatalog.get(index);
     }
}
