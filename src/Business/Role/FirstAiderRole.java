/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Interface.FirstAiderWorkArea.FirstAiderWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author xingyaowu
 */
public class FirstAiderRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, EcoSystem business,Enterprise enterprise) {
        return new FirstAiderWorkAreaJPanel(userProcessContainer, account, business);
    }
    
}
