/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.BodyAndSymptom.BodyPart;
import Business.DiseaseAndTherapy.Disease;
import Business.DiseaseAndTherapy.DiseaseCatalog;
import Business.DiseaseAndTherapy.MedicineCatalog;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.AdminRole;
import Business.PersonDirectory.PersonDirectory;
import Business.DiseaseAndTherapy.TherapyCatalog;
import Business.Enterprise.Enterprise;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author chenxinyun
 */
public class EcoSystem extends Organization {

    private static EcoSystem ecosystem;
    private ArrayList<Network> networkList;
    private PersonDirectory personDirectory;
    private TherapyCatalog therapyCatalog;
    private DiseaseCatalog diseaseCatalog;
    private MedicineCatalog medicineCatalog;
    private ArrayList<BodyPart> bodyPartList;

    public EcoSystem(String name) {
        super(name);
        bodyPartList = new ArrayList<>();
    }

    public enum Appointment {
        EMS("EMS"),
        Personal("Personal");
        private String value;

        private Appointment(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public ArrayList<Network> getNetworkList() {
        if (networkList == null) {
            networkList = new ArrayList<>();
        }
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }

    public PersonDirectory getPersonDirectory() {
        if (personDirectory == null) {
            personDirectory = new PersonDirectory();
        }
        return personDirectory;
    }

    public void setPersonCatalog(PersonDirectory personDirectory) {
        this.personDirectory = personDirectory;
    }

    public TherapyCatalog getTherapyCatalog() {
        if (therapyCatalog == null) {
            therapyCatalog = new TherapyCatalog();
        }
        return therapyCatalog;
    }

    public void setTherapyCatalog(TherapyCatalog therapyCatalog) {
        this.therapyCatalog = therapyCatalog;
    }

    public DiseaseCatalog getDiseaseCatalog() {
        if (diseaseCatalog == null) {
            diseaseCatalog = new DiseaseCatalog();
        }
        return diseaseCatalog;
    }

    public void setDiseaseCatalog(DiseaseCatalog diseaseCatalog) {
        this.diseaseCatalog = diseaseCatalog;
    }

    public MedicineCatalog getMedicineCatalog() {
        if (medicineCatalog == null) {
            medicineCatalog = new MedicineCatalog();
        }
        return medicineCatalog;
    }

    public void setMedicineCatalog(MedicineCatalog medicineCatalog) {
        this.medicineCatalog = medicineCatalog;
    }

    public ArrayList<BodyPart> getBodyPartList() {
        if (bodyPartList == null) {
            bodyPartList = new ArrayList<>();
        }
        return bodyPartList;
    }

    public void setBodyPartList(ArrayList<BodyPart> bodyPartList) {
        this.bodyPartList = bodyPartList;
    }

    public BodyPart addBodyPart(String name) {
        BodyPart bp = new BodyPart();
        bp.setBodyPartName(name);
        if (bodyPartList == null) {
            bodyPartList = new ArrayList<>();
        }
        bodyPartList.add(bp);
        return bp;
    }

    public static EcoSystem getInstance() {
        if (ecosystem == null) {
            ecosystem = new EcoSystem();
        }
        return ecosystem;
    }

    private EcoSystem() {
        super(null);
    }

    public Network createAndAddNetwork() {
        Network network = new Network();
        networkList.add(network);
        return network;
    }

    public boolean checkIfUserNameIsUnique(String userName) {
        if (!this.getUserAccountDirectory().checkIfUsernameIsUnique(userName)) {
            return false;
        }
        for (Network network : networkList) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                for (UserAccount userAccount : enterprise.getUserAccountDirectory().getUserAccountList()) {
                    if (userName.equals(userAccount.getUsername())) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList();
        roleList.add(new AdminRole());
        return roleList;
    }

}
