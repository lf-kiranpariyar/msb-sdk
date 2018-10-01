import com.lftechnology.vtn.api.ManualUpdateApi;
import com.lftechnology.vtn.dto.request.Credential;
import com.lftechnology.vtn.dto.response.ManualTransactionResponse;
import org.junit.Test;

public class ManualUpdateApiTest {


    @Test
    public void manualUpdateTest() {

        Credential credential = new Credential("LKNgtr4Of7VmHrr7Q8JJcgbt543sFB4", "MNV73Bc6655dJ8UdkG4IKNGyk82nONK4");
        ManualUpdateApi manualUpdateApi = new ManualUpdateApi(credential);
        ManualTransactionResponse manualTransactionResponse = manualUpdateApi.getUpdateStatus("c6c3055c-bbed-11e8-a355-529269fb1456");
        System.out.println(manualTransactionResponse.toString());

    }
}
