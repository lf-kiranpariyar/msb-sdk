import com.lftechnology.vtn.api.AccountApi;
import com.lftechnology.vtn.dto.request.AccountStatusRequest;
import com.lftechnology.vtn.dto.request.Credential;
import com.lftechnology.vtn.dto.response.AccountStatusResponse;
import com.lftechnology.vtn.exception.ApiException;
import com.lftechnology.vtn.exception.VtnException;
import org.junit.Test;

public class AccountApiTest {

    @Test
    public void shouldCreateTransactionOnVTN() {
        try {
            Credential credential = new Credential("LKNgtr4Of7VmHrr7Q8JJcgbt543sFB4","MNV73Bc6655dJ8UdkG4IKNGyk82nONK4");
            AccountStatusRequest b = new AccountStatusRequest();
            b.setEmail("peter@peterojo.com");
            AccountApi accountApi = new AccountApi(credential);
            AccountStatusResponse accountStatusResponse = accountApi.getAccount(b);
            System.out.println(accountStatusResponse.toString());
            System.out.println(accountStatusResponse.getMessage());

        } catch (VtnException e) {
            System.out.println(e.getCode());
            throw e;
        } catch (ApiException e) {
            System.out.println(e.getMessage());
        }

    }

    @Test(expected = VtnException.class)
    public void shouldThrowExceptionOnInvalidAccessToken() {
        Credential credential = new Credential("invalid", "invalid");
        AccountStatusRequest b = new AccountStatusRequest();
        b.setEmail("peter@peterojo.com");
        AccountApi accountApi = new AccountApi(credential);
        AccountStatusResponse accountStatusResponse = accountApi.getAccount(b);
    }
}
