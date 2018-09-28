import com.lftechnology.vtn.api.BankApi;
import com.lftechnology.vtn.dto.request.BankRequest;
import com.lftechnology.vtn.dto.request.Credential;
import com.lftechnology.vtn.dto.response.BankResponse;
import org.junit.Test;

public class BankApiTest {

    @Test
    public void testBankApi() {

        Credential credential = new Credential("LKNgtr4Of7VmHrr7Q8JJcgbt543sFB4", "MNV73Bc6655dJ8UdkG4IKNGyk82nONK4");
        BankRequest bankRequest = new BankRequest();
        bankRequest.setBankAccountName("PETER   OJO");
        bankRequest.setBankAccountNumber("2173986879");
        bankRequest.setBankName("000015");

        BankApi bankApi = new BankApi(credential);
        BankResponse bankResponse = bankApi.verifyBank(bankRequest);
        System.out.println(bankResponse.toString());


    }


}
