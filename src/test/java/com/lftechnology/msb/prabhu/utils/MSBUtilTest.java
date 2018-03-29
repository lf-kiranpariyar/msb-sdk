package com.lftechnology.msb.prabhu.utils;

import com.lftechnology.msb.prabhu.dto.Agent;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import com.lftechnology.msb.prabhu.webservices.ReturnAGENTLIST;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Kiran Pariyar <kiranpariyar@lftechnology.com>
 */
@RunWith(JUnit4.class) public class MSBUtilTest {

    @Test
    public void shouldMapToAgentBranch(){
        List<ReturnAGENTLIST> returnAGENTLISTS = buildReturnAgentList();
        List<Agent> agents = MSBUtil.mapToListOfAgent(returnAGENTLISTS);
        Assert.assertEquals(2,agents.size());
    }

    private List<ReturnAGENTLIST> buildReturnAgentList(){
        List<ReturnAGENTLIST> returnAGENTLISTS = new ArrayList<>();
        ReturnAGENTLIST returnAGENTLIST1 = new ReturnAGENTLIST();
        returnAGENTLIST1.setAGENT("global bankA");
        returnAGENTLIST1.setADDRESS("koteshwor");
        returnAGENTLIST1.setBANKBRANCHID("global1");
        returnAGENTLIST1.setCITY("city");
        returnAGENTLIST1.setCODE("code");
        returnAGENTLIST1.setAGENTCODE("agentcode");

        ReturnAGENTLIST returnAGENTLIST2 = new ReturnAGENTLIST();
        returnAGENTLIST2.setAGENT("global bankA");
        returnAGENTLIST2.setADDRESS("koteshwor");
        returnAGENTLIST2.setBANKBRANCHID("global1");
        returnAGENTLIST2.setCITY("city");
        returnAGENTLIST2.setCODE("code");
        returnAGENTLIST2.setAGENTCODE("agentcode");

        ReturnAGENTLIST returnAGENTLIST3 = new ReturnAGENTLIST();
        returnAGENTLIST3.setAGENT("global bankB");
        returnAGENTLIST3.setADDRESS("koteshwor");
        returnAGENTLIST3.setBANKBRANCHID("global1");
        returnAGENTLIST3.setCITY("city");
        returnAGENTLIST3.setCODE("code");
        returnAGENTLIST3.setAGENTCODE("agentcode");

        ReturnAGENTLIST returnAGENTLIST4 = new ReturnAGENTLIST();
        returnAGENTLIST4.setAGENT("global bankB");
        returnAGENTLIST4.setADDRESS("koteshwor");
        returnAGENTLIST4.setBANKBRANCHID("global1");
        returnAGENTLIST4.setCITY("city");
        returnAGENTLIST4.setCODE("code");
        returnAGENTLIST4.setAGENTCODE("agentcode");

        returnAGENTLISTS.add(returnAGENTLIST1);
        returnAGENTLISTS.add(returnAGENTLIST2);
        returnAGENTLISTS.add(returnAGENTLIST3);
        returnAGENTLISTS.add(returnAGENTLIST4);
        return returnAGENTLISTS;
    }
}
