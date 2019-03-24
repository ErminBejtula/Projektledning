package model;

import java.util.ArrayList;

public class AgentRegister {
	public ArrayList<Agent> getAgentReg() {
		return agentReg;
	}

	public void setAgentReg(ArrayList<Agent> agentReg) {
		this.agentReg = agentReg;
	}

	private ArrayList<Agent> agentReg = new ArrayList<Agent>();

	public void addAgent(Agent s) {
		agentReg.add(s);
	}
}
