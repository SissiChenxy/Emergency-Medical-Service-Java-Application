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
public class Disease {
    private String name;
    private String type;   
    private String symptom;
    private ArrayList<Medicine> medicineList;
    private Therapy therapy;

    public Disease() {
        medicineList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSymptom() {
        return symptom;
    }

    public void setSymptom(String symptom) {
        this.symptom = symptom;
    }

    public ArrayList<Medicine> getMedicineList() {
        if(medicineList == null ){
            medicineList = new ArrayList<>();
        }
        return medicineList;
    }

    public void setMedicineList(ArrayList<Medicine> medicineList) {
        this.medicineList = medicineList;
    }

    public Therapy getTherapy() {
        return therapy;
    }

    public void setTherapy(Therapy therapy) {
        this.therapy = therapy;
    }
    
    public void addMedicine(Medicine medicine) {
        for(Medicine m : medicineList){
            if(m.getName().equals(medicine.getName())){
                return ;
            }
        }
        medicineList.add(medicine);
    }
    
    @Override
    public String toString(){
        return name;
    }
}
