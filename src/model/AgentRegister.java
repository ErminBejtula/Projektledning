package model;

import java.util.ArrayList;

public class AgentRegister {
	
	private ArrayList<Agent> agentReg = new ArrayList<Agent>();
	
	public ArrayList<Agent> getAgentReg() {
		return agentReg;
	}

	public void setAgentReg(ArrayList<Agent> agentReg) {
		this.agentReg = agentReg;
	}

	public void addAgent(Agent s) {
		agentReg.add(s);
	}
	public Agent readAgent(String employeeID) {
		for (Agent tmp : agentReg) {
			if (tmp.getEmployeeID().equals(employeeID)) {
				return tmp;
			}
		}
		return null;
	}
}
