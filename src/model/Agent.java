package model;

import java.util.ArrayList;

public class Agent extends Employee {
	
	private ArrayList<Agent> agentReg = new ArrayList<Agent>();

	public ArrayList<Agent> getAgentReg() {
		return agentReg;
	}

	public void setAgentReg(ArrayList<Agent> agentReg) {
		this.agentReg = agentReg;
	}

}
