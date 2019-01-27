/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DiseaseAndTherapy;

/**
 *
 * @author chenxinyun
 */
public class Medicine {
    private String name;
    private String description;
    private String dosageAndAdministration;
    private String adverseReaction;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDosageAndAdministration() {
        return dosageAndAdministration;
    }

    public void setDosageAndAdministration(String dosageAndAdministration) {
        this.dosageAndAdministration = dosageAndAdministration;
    }

    public String getAdverseReaction() {
        return adverseReaction;
    }

    public void setAdverseReaction(String adverseReaction) {
        this.adverseReaction = adverseReaction;
    }
    
    @Override
    public String toString(){
        return name;
    }  
}
