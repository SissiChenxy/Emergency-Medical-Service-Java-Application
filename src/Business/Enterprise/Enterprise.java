/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Organization.PatientOrganization;

/**
 *
 * @author chenxinyun
 */
public abstract class Enterprise extends Organization{
     
    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;
    
    public OrganizationDirectory getOrganizationDirectory() {
        if(organizationDirectory==null)
            organizationDirectory = new OrganizationDirectory();
        return organizationDirectory;
    }

    public void setOrganizationDirectory(OrganizationDirectory organizationDirectory) {
        this.organizationDirectory = organizationDirectory;
    }
    
    public enum EnterpriseType{
        Hospital("Hospital Enterprise"),
        EMS("EMS Enterprise");
        
        private String value;

        private EnterpriseType(String valString) {
            this.value=valString;
        }
        public String getValue() {
            return value;
        }
        public void setValue(String value) {
            this.value = value;
        }
        @Override
        public String toString(){
            return value;
        }
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }
    public Enterprise(String name,EnterpriseType type) {
        super(name);
        this.enterpriseType=type;
        this.organizationDirectory = new OrganizationDirectory();
    }
    public Organization findPatientOrganization(){
        for(Organization organization:organizationDirectory.getOrganizationList()){
            if(organization instanceof PatientOrganization){
                return organization;
            }
        }
        Organization patientOrganization = new PatientOrganization();
        organizationDirectory.getOrganizationList().add(patientOrganization);
        return patientOrganization;
    }
    @Override
    public String toString() {
        return super.getName();
    }
}
