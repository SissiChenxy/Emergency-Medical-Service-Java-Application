/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Ambulance.Ambulance;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author xingyaowu
 */
public class EMSEnterprise extends Enterprise {

    private ArrayList<Ambulance> ambulances;

    public EMSEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.EMS);
        ambulances = new ArrayList<>();
        ambulances.add(new Ambulance("Ambulance 1", "77 Massachussatts Ave, Cambridge, MA, 02139"));
        ambulances.add(new Ambulance("Ambulance 2", "100 Memorial Drive, Cambridge, MA, 02142"));
        ambulances.add(new Ambulance("Ambulance 3", "325 Commandants Way, Chelsea, MA, 02150"));
        ambulances.add(new Ambulance("Ambulance 4", "450 Washington St, Boston, MA, 02111"));
        ambulances.add(new Ambulance("Ambulance 5", "206 S Market St, Bostonm, MA, 02109"));
        ambulances.add(new Ambulance("Ambulance 6", "1250 Hancock St, Quincy, MA, 02169"));
        ambulances.add(new Ambulance("Ambulance 7", "1250 Hancock St, Quincy, MA, 02169"));
        ambulances.add(new Ambulance("Ambulance 8", "1250 Hancock St, Quincy, MA, 02169"));
        ambulances.add(new Ambulance("Ambulance 9", "1250 Hancock St, Quincy, MA, 02169"));
        ambulances.add(new Ambulance("Ambulance 10", "1250 Hancock St, Quincy, MA, 02169"));

    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }

    public ArrayList<Ambulance> getAmbulances() {
        return ambulances;
    }

}
