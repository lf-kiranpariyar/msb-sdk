package com.lftechnology.msb.prabhu.dto;

import java.util.List;

/**
 * @author Kiran Pariyar <kiranpariyar@lftechnology.com>
 */
public class Agent {
    private String agent;
    private List<AgentBranch> agentBranchList;

    public String getAgent() {
        return agent;
    }

    public void setAgent(String agent) {
        this.agent = agent;
    }

    public List<AgentBranch> getAgentBranchList() {
        return agentBranchList;
    }

    public void setAgentBranchList(List<AgentBranch> agentBranchList) {
        this.agentBranchList = agentBranchList;
    }
}
