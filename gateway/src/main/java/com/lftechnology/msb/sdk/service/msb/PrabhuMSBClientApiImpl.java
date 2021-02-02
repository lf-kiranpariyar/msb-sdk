package com.lftechnology.msb.sdk.service.msb;

import com.lftechnology.msb.prabhu.dto.Agent;
import com.lftechnology.msb.prabhu.dto.BankInfo;
import com.lftechnology.msb.prabhu.dto.CancelResponse;
import com.lftechnology.msb.prabhu.dto.CancelTransactionDetail;
import com.lftechnology.msb.prabhu.dto.Credential;
import com.lftechnology.msb.prabhu.dto.TransactionDetail;
import com.lftechnology.msb.prabhu.service.PrabhuClientApi;
import com.lftechnology.msb.sdk.annotation.TransactionOriginator;
import com.lftechnology.msb.sdk.dto.Country;
import com.lftechnology.msb.sdk.dto.ExchangeRateRequest;
import com.lftechnology.msb.sdk.dto.State;
import com.lftechnology.msb.sdk.dto.SyncBankRequest;
import com.lftechnology.msb.sdk.dto.SyncBankResponse;
import com.lftechnology.msb.sdk.dto.Transaction;
import com.lftechnology.msb.sdk.dto.TransactionResponse;
import com.lftechnology.msb.sdk.dto.TransactionStatusChangeRequest;
import com.lftechnology.msb.sdk.enums.MSBTransactionStatus;
import com.lftechnology.msb.sdk.enums.TransactionPaymentType;
import com.lftechnology.msb.sdk.exception.UnsupportedException;
import com.lftechnology.msb.sdk.mapper.PrabhuObjectMapper;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.math.BigDecimal;
import java.util.List;

/**
 * Implementation details for holding Prabhu MSB's functionality.
 */
@TransactionOriginator("PMT")
@Stateless
public class PrabhuMSBClientApiImpl implements MsbClientService {

    @Inject
    private PrabhuClientApi prabhuClientApi;

    @Override
    public TransactionResponse create(Transaction transaction, String credentials) {
        Credential credential = PrabhuObjectMapper.toCredential(credentials);
        credential =generateCredentials(credential, transaction);
        TransactionDetail transactionDetail = PrabhuObjectMapper.toTransactionDetail(transaction);

        SyncBankRequest syncBankRequest = new SyncBankRequest();
        Country country = new Country();
        country.setName("United States");
        country.setThreeCharISOCode("USA");
        country.setTwoCharISOCode("US");
        syncBankRequest.setCountry(country);
        syncBankRequest.setType(TransactionPaymentType.PARTNER_BANK_ACCOUNT);

        List<SyncBankResponse> syncBankRequests = fetchBank(syncBankRequest, credentials);
        syncBankRequests.forEach(it->{
            if(it.getBranchResponseList().get(0).getName().equalsIgnoreCase(String.valueOf(transaction.getBank().getName()))){
                transactionDetail.setBankId(String.valueOf(it.getBranchResponseList().get(0).getMetadata().get("bankId")));
                transactionDetail.setBankLocationId(String.valueOf(it.getBranchResponseList().get(0).getMetadata().get("locationId")));
            }
        });

        return PrabhuObjectMapper.toTransactionResponse(prabhuClientApi.createTransaction(credential, transactionDetail));

    }

    @Override
    public TransactionResponse fetch(String referenceId, String credentials) {
        return null;
    }

    @Override
    public Boolean changeTransactionStatus(TransactionStatusChangeRequest changeRequest, String credentials) {
        Credential prabhuCredential = PrabhuObjectMapper.getCredential(credentials);

        CancelTransactionDetail cancelTransactionDetail = PrabhuObjectMapper.toCancelTransactionDetail(changeRequest);

        CancelResponse cancelResponse = prabhuClientApi.cancelTransaction(prabhuCredential, cancelTransactionDetail);
        if (cancelResponse.getCode().equals("200"))
            return Boolean.TRUE;
        else
            return Boolean.FALSE;

    }

    @Override
    public Boolean acknowledgeTransaction(String referenceId, String credential) {
        return null;
    }

    @Override
    public MSBTransactionStatus getStatus(String referenceId, String credentials) {
        return null;
    }

    @Override
    public List<SyncBankResponse> fetchBank(SyncBankRequest request, String credentials) {
        Credential credential = PrabhuObjectMapper.getCredential(credentials);
        BankInfo bankInfo = new BankInfo();
        bankInfo.setPayoutCountry(request.getCountry().getName());
        bankInfo.setPaymentType(TransactionPaymentType.getPrabhuPaymentMode(request.getType()).getValue());
        List<Agent> agents = prabhuClientApi.getAgents(credential, bankInfo);
        return PrabhuObjectMapper.toSyncBankResponse(agents);
    }

    @Override
    public BigDecimal rate(ExchangeRateRequest request, String credentials) {
        Credential prabhuCredential = PrabhuObjectMapper.getCredential(credentials);
        return prabhuClientApi.getExchangeRate(prabhuCredential, request.getDestination().getName());
    }

    @Override
    public void updateExchangeRate(ExchangeRateRequest request, String credentails) {

    }

    @Override
    public BigDecimal fetchPurchaseRate(ExchangeRateRequest request, String credentials) {
        throw new UnsupportedException("Purchase Rate Query Not Supported by Prabhu MSB");
    }

    @Override
    public List<State> getStates(Country country, String credentials) {
        throw new UnsupportedException("Fetch State Not Supported by Prabhu MSB");
    }

    @Override
    public List<com.lftechnology.msb.sdk.dto.City> getCities(Country country, String credentials) {
        throw new UnsupportedException("Purchase State Not Supported by Prabhu MSB");
    }

    @Override
    public TransactionResponse getTxnDetails(Transaction transaction, String credentials) {
        Credential prabhuCredential = PrabhuObjectMapper.getCredential(credentials);
        TransactionDetail transactionDetail = PrabhuObjectMapper.toTransactionDetail(transaction);
        com.lftechnology.msb.prabhu.dto.TransactionResponse prabhuTransactionResponse = prabhuClientApi.getDetails(prabhuCredential, transactionDetail);
        return PrabhuObjectMapper.toTransactionResponse(prabhuTransactionResponse);
    }

    @Override
    public Boolean payTransaction(String referenceNumber, String credentials) {
        throw new UnsupportedException();
    }

    private Credential generateCredentials(Credential credential, Transaction transaction){
        if(transaction.getReferenceNumber().startsWith("PMT-11")){
            switch (transaction.getSender().getAddress().getState().getTwoCharISOCode()){
                case "CA":
                    credential.setAgentUserId("CALKORA");
                    credential.setAgentPassword("CALKORA@567");
                    credential.setAgentLocationId("96860880");
                    credential.setAgentCode("PNCAKT");
                    credential.setAgentName("");
                    break;
                case "CT" :
                    credential.setAgentUserId("CONKORA");
                    credential.setAgentPassword("CALKORA@567");
                    credential.setAgentLocationId("96860880");
                    credential.setAgentCode("PNCAKT");
                    break;
                case "FL" :
                    credential.setAgentUserId("CALKORA");
                    credential.setAgentPassword("CONKORA@567");
                    credential.setAgentLocationId("96860880");
                    credential.setAgentCode("POCTKT");
                    break;
                case "GA":
                    credential.setAgentUserId("FLOKORA");
                    credential.setAgentPassword("FLOKORA@567");
                    credential.setAgentLocationId("96860880");
                    credential.setAgentCode("POFAKT");
                    break;
                case "IL":
                    credential.setAgentUserId("ILLKORA");
                    credential.setAgentPassword("ILLKORA@567");
                    credential.setAgentLocationId("96860880");
                    credential.setAgentCode("POISKT");
                    break;
                case "MA":
                    credential.setAgentUserId("MASKORA");
                    credential.setAgentPassword("MASKORA@567");
                    credential.setAgentLocationId("96860880");
                    credential.setAgentCode("POMSKT");
                    break;
                case "MI":
                    credential.setAgentUserId("MICKORA");
                    credential.setAgentPassword("MICKORA@567");
                    credential.setAgentLocationId("96860880");
                    credential.setAgentCode("POMNKT");
                    break;
                case "NY":
                    credential.setAgentUserId("NEWJKORA");
                    credential.setAgentPassword("NEWJKORA@567");
                    credential.setAgentLocationId("96860880");
                    credential.setAgentCode("PONYKT");
                    break;
                case "PA":
                    credential.setAgentUserId("PENKORA");
                    credential.setAgentPassword("PENKORA@567");
                    credential.setAgentLocationId("96860880");
                    credential.setAgentCode("POPAKT");
                    break;
                case "TX":
                    credential.setAgentUserId("TEXKORA");
                    credential.setAgentPassword("TEXKORA@567");
                    credential.setAgentLocationId("96860880");
                    credential.setAgentCode("POTSKT");
                    break;
            }
        }else{
            switch (transaction.getSender().getAddress().getState().getTwoCharISOCode()){
                case "CA":
                    credential.setAgentUserId("CALREBTEL");
                    credential.setAgentPassword("POCARN@123!");
                    credential.setAgentLocationId("96860774");
                    credential.setAgentCode("POCARN");
                    break;
                case "CT" :
                    credential.setAgentUserId("CONREBTEL");
                    credential.setAgentPassword("CONREBTEL@567");
                    credential.setAgentLocationId("96860774");
                    credential.setAgentCode("POCTRN");
                    break;
                case "FL" :
                    credential.setAgentUserId("FLOREBTEL");
                    credential.setAgentPassword("FLOREBTEL@567");
                    credential.setAgentLocationId("96860774");
                    credential.setAgentCode("POFARN");
                    break;
                case "GA":
                    credential.setAgentUserId("GEOREBTEL");
                    credential.setAgentPassword("GEOREBTEL@567");
                    credential.setAgentLocationId("96860774");
                    credential.setAgentCode("POGARN");
                    break;
                case "IL":
                    credential.setAgentUserId("ILLREBTEL");
                    credential.setAgentPassword("ILLREBTEL@567");
                    credential.setAgentLocationId("96860774");
                    credential.setAgentCode("POISRN");
                    break;
                case "MA":
                    credential.setAgentUserId("MASREBTEL");
                    credential.setAgentPassword("MASREBTEL@567");
                    credential.setAgentLocationId("96860774");
                    credential.setAgentCode("POMSRN");
                    break;
                case "MI":
                    credential.setAgentUserId("MICREBTEL");
                    credential.setAgentPassword("MICREBTEL@567");
                    credential.setAgentLocationId("96860774");
                    credential.setAgentCode("POMNRN");
                    break;
                case "NY":
                    credential.setAgentUserId("NEWJREBTEL");
                    credential.setAgentPassword("NEWJREBTEL@567");
                    credential.setAgentLocationId("96860774");
                    credential.setAgentCode("PONYRN");
                    break;
                case "PA":
                    credential.setAgentUserId("PENREBTEL");
                    credential.setAgentPassword("PENREBTEL@567");
                    credential.setAgentLocationId("96860774");
                    credential.setAgentCode("POPARN");
                    break;
                case "TX":
                    credential.setAgentUserId("TEXREBTEL");
                    credential.setAgentPassword("TEXREBTEL@567");
                    credential.setAgentLocationId("96860774");
                    credential.setAgentCode("POTSRN");
                    break;
            }
        }
        return credential;
    }

}