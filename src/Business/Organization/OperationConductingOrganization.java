/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.OperationSchedularRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author xingyaowu
 */
public class OperationConductingOrganization extends Organization {
    public OperationConductingOrganization() {
        super(Organization.Type.OperationConducting.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new OperationSchedularRole());
        return roles;
    }
}
