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
public class BodyPart {
    private String bodyPartName;
    private ArrayList<BodyApparatus> bodyApparatusList;

    public BodyPart() {
        bodyApparatusList = new ArrayList<>();
    }

    public String getBodyPartName() {
        return bodyPartName;
    }

    public void setBodyPartName(String bodyPartName) {
        this.bodyPartName = bodyPartName;
    }

    
    public ArrayList<BodyApparatus> getBodyapparatus() {
        if(bodyApparatusList == null){
            bodyApparatusList = new ArrayList<>();
        }  
        return bodyApparatusList;
    }

    public void setBodyapparatus(ArrayList<BodyApparatus> bodyapparatus) {
        this.bodyApparatusList = bodyapparatus;
    }
    
    public BodyApparatus addApparatuses(String name){
        BodyApparatus ba = new BodyApparatus();
        ba.setBodyApparatusName(name);
        if(bodyApparatusList == null){
            bodyApparatusList = new ArrayList<>();
        } 
        bodyApparatusList.add(ba);
        return ba;
    }
    
    @Override
    public String toString(){
        return bodyPartName;
    }
}
