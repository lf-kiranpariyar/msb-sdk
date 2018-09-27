import com.lftechnology.vtn.sdk.api.AccountApi;
import com.lftechnology.vtn.sdk.dto.Request.AccountStatusRequestDTO;
import com.lftechnology.vtn.sdk.dto.Request.Credentials;
import com.lftechnology.vtn.sdk.dto.Response.AccountStatusResponseDTO;
import com.lftechnology.vtn.sdk.exception.ApiException;
import com.lftechnology.vtn.sdk.exception.VtnException;
import org.junit.Test;

public class AccountApiTest {

    @Test
    public void accountTest(){

        try{
            Credentials c =new Credentials("LKNgtr4Of7VmHrr7Q8JJcgbt543sFB4","MNV73Bc6655dJ8UdkG4IKNGyk82nONK4");
            AccountStatusRequestDTO b = new AccountStatusRequestDTO();
            b.setEmail("peter@peterojo.com");
            AccountApi accountApi = new AccountApi();
            AccountStatusResponseDTO accountStatusResponseDTO = accountApi.getAccount(b,c);
            System.out.println(accountStatusResponseDTO.toString());
            System.out.println(accountStatusResponseDTO.getMessage());

        } catch (VtnException e){
            System.out.println(e.getCode());
            throw e;
        }
        catch (ApiException e){
            System.out.println(e.getMessage());
        }

    }

    @Test
    public void exceptionTest(){
        try{
            new AccountApiTest().accountTest();

        }catch (VtnException e){
            System.out.println(e.getMessage());
        }
    }
}
