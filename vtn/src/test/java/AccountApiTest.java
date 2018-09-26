import com.lftechnology.vtn.sdk.api.AccountApi;
import com.lftechnology.vtn.sdk.api.BankApi;
import com.lftechnology.vtn.sdk.dto.Request.AccountStatusDTO;
import com.lftechnology.vtn.sdk.dto.Request.BankNameRequestDTO;
import com.lftechnology.vtn.sdk.dto.Request.Credentials;
import com.lftechnology.vtn.sdk.dto.Response.AccountStatusResponseDTO;
import com.lftechnology.vtn.sdk.dto.Response.BankNameQueryDTO;
import org.junit.Test;

public class AccountApiTest {

    @Test
    public void accountTest(){

        Credentials c =new Credentials("LKNgtr4Of7VmHrr7Q8JJcgbt543sFB4","MNV73Bc6655dJ8UdkG4IKNGyk82nONK4");
        AccountStatusDTO b = new AccountStatusDTO();
        b.setEmail("peter@peterojo.com");
        AccountApi accountApi = new AccountApi();
        AccountStatusResponseDTO accountStatusResponseDTO = accountApi.getAccount(b,c);
        System.out.println(accountStatusResponseDTO.toString());

    }
}
