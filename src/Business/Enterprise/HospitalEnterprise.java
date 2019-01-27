/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;
import java.util.TreeMap;

/**
 *
 * @author xingyaowu
 */
public class HospitalEnterprise extends Enterprise {
    private TreeMap<String,WorkQueue> history;
    public HospitalEnterprise(String name) {
        super(name, EnterpriseType.Hospital);
        history = new TreeMap<>();
    }

    public TreeMap<String, WorkQueue> getHistory() {
        return history;
    }

    public void setHistory(TreeMap<String, WorkQueue> history) {
        this.history = history;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
