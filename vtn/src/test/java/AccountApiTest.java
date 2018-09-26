import com.lftechnology.vtn.sdk.api.AccountApi;
import com.lftechnology.vtn.sdk.dto.Request.AccountStatusRequestDTO;
import com.lftechnology.vtn.sdk.dto.Request.Credentials;
import com.lftechnology.vtn.sdk.dto.Response.AccountStatusResponseDTO;
import org.junit.Test;

public class AccountApiTest {

    @Test
    public void accountTest(){

        Credentials c =new Credentials("LKNgtr4Of7VmHrr7Q8JJcgbt543sFB4","MNV73Bc6655dJ8UdkG4IKNGyk82nONK4");
        AccountStatusRequestDTO b = new AccountStatusRequestDTO();
        b.setEmail("peter@peterojo.com");
        AccountApi accountApi = new AccountApi();
        AccountStatusResponseDTO accountStatusResponseDTO = accountApi.getAccount(b,c);
        System.out.println(accountStatusResponseDTO.toString());

    }
}
