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
public class MedicineCatalog {
    private ArrayList<Medicine> medicineCatalog;

    public ArrayList<Medicine> getMedicineList() {
        if(medicineCatalog == null){
            medicineCatalog = new ArrayList<>();
        }
        return medicineCatalog;
    }

    public void setMedicineList(ArrayList<Medicine> medicineList) {
        this.medicineCatalog = medicineList;
    }
    
    public Medicine addMedicine(String name){
        Medicine medicine = new Medicine();
        medicine.setName(name);
        if(medicineCatalog == null){
            medicineCatalog = new ArrayList<>();
        }
        medicineCatalog.add(medicine);
        return medicine;
    }
    
    public void deleteMedicine(Medicine medicine){
        medicineCatalog.remove(medicine);
    }
    
    public Medicine getMedicineByIndex(int index) {
         return medicineCatalog.get(index);
     }
}
