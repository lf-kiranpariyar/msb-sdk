import com.lftechnology.vtn.sdk.api.AccountApi;
import com.lftechnology.vtn.sdk.api.BalanceApi;
import com.lftechnology.vtn.sdk.dto.Request.AccountStatusDTO;
import com.lftechnology.vtn.sdk.dto.Request.Credentials;
import com.lftechnology.vtn.sdk.dto.Response.AccountStatusResponseDTO;
import com.lftechnology.vtn.sdk.dto.Response.BalanceQueryDTO;
import org.junit.Test;

public class BalanceApiTest {

    @Test
    public  void balanceTest(){


        Credentials c =new Credentials("LKNgtr4Of7VmHrr7Q8JJcgbt543sFB4","MNV73Bc6655dJ8UdkG4IKNGyk82nONK4");
       BalanceApi balanceApi = new BalanceApi();
        BalanceQueryDTO balanceQueryDTO = balanceApi.getBalance(c);
        System.out.println(balanceQueryDTO.toString());
    }
}
