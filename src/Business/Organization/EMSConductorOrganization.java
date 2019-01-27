/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Employee.Employee;
import Business.Role.EMSConductorRole;
import Business.Role.FirstAiderRole;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author xingyaowu
 */
public class EMSConductorOrganization extends Organization {
    public EMSConductorOrganization() {
        super(Organization.Type.EMSConducting.getValue());
        // Just For Demo
        ArrayList<UserAccount> accounts = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            UserAccount account = new UserAccount();
            Employee employee = new Employee();
            employee.setName("Employee " + i);
            account.setRole(new FirstAiderRole());
            account.setEmployee(employee);
            account.setPassword("123");
            account.setUsername("First Aider " + i);
            accounts.add(account);
        }
        super.getUserAccountDirectory().setUserAccountList(accounts);
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new EMSConductorRole());
        return roles;
    }
}
