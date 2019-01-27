/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;


import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Interface.PatientArea.PatientArea;
import Interface.SOSPatientWorkArea.SOSJPanel;
import Interface.SOSPatientWorkArea.SOSProcessViewJPanel;
import javax.swing.JPanel;

/**
 *
 * @author xingyaowu
 */
public class PatientRole extends Role {

    private String streetAddress;
    private String city;
    private int zipcode;
    private int phone;
    
    private String email;

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }



    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, EcoSystem business,Enterprise enterprise) {
        //return new SOSProcessViewJPanel(userProcessContainer, business, account);
        return new PatientArea( userProcessContainer,  business,  account,  (HospitalEnterprise)enterprise);
    }
    
}
