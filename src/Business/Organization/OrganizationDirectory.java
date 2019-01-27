/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class OrganizationDirectory {

    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    public Organization createOrganization(Type type) {
        Organization organization = null;
        if (type == Type.EMSConducting) {
            organization = new EMSConductorOrganization();
        } else if (type == Type.AmbulanceService) {
            organization = new AmbulanceServiceOrganization();
        } else if (type == Type.Doctor) {
            organization = new DoctorOrganization();
        } else if (type == Type.OperationConducting) {
            organization = new OperationConductingOrganization();
        }
        organizationList.add(organization);
        return organization;
    }
}
