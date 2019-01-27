/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DiseaseAndTherapy;

import javax.swing.Action;

/**
 *
 * @author zhang
 */
public class Prescription {
    private Medicine medicine;
    private double num;
    private String attention;

    public Prescription() {
        medicine = new Medicine();
    }

    
    public Medicine getMedicine() {
        return medicine;
    }

    public void setMedicine(Medicine medicine) {
        this.medicine = medicine;
    }

    public double getNum() {
        return num;
    }

    public void setNum(double num) {
        this.num = num;
    }

    public String getAttention() {
        return attention;
    }

    public void setAttention(String attention) {
        this.attention = attention;
    }
    @Override
    public String toString(){
        return medicine.getName();
    }
    
}
