import com.lftechnology.vtn.api.BalanceApi;
import com.lftechnology.vtn.dto.request.Credential;
import com.lftechnology.vtn.dto.response.BalanceResponse;
import org.junit.Test;

public class BalanceApiTest {

    @Test
    public void balanceTest() {

        Credential c = new Credential("LKNgtr4Of7VmHrr7Q8JJcgbt543sFB4", "MNV73Bc6655dJ8UdkG4IKNGyk82nONK4");
        BalanceApi balanceApi = new BalanceApi(c);
        BalanceResponse balanceQueryDTO = balanceApi.getBalance();
        System.out.println(balanceQueryDTO.toString());
    }
}
