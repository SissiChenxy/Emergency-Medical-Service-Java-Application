/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Interface.EMSWorkArea.EMSJPanel;
import Interface.EMSWorkArea.EMSConductingAmbJPanel;
import javax.swing.JPanel;

/**
 *
 * @author xingyaowu
 */
public class EMSConductorRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, EcoSystem business,Enterprise enterprise) {
        return new EMSJPanel(userProcessContainer, account, organization, business, enterprise);
    }
    
}
