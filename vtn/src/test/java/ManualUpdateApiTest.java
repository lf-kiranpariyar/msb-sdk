import com.lftechnology.vtn.sdk.api.ManualUpdateApi;
import com.lftechnology.vtn.sdk.dto.Request.Credentials;
import com.lftechnology.vtn.sdk.dto.Response.ManualUpdateListResponseDTO;

import org.junit.Test;

public class ManualUpdateApiTest {


    @Test
    public void manualUpdateTest(){

        Credentials c =new Credentials("LKNgtr4Of7VmHrr7Q8JJcgbt543sFB4","MNV73Bc6655dJ8UdkG4IKNGyk82nONK4");
        ManualUpdateApi manualUpdateApi = new ManualUpdateApi();
        ManualUpdateListResponseDTO manualUpdateResponseDTO = manualUpdateApi.getStatus(c,"a6c3055c-bbed-11e8-a355-529269fb1455");

        System.out.println(manualUpdateResponseDTO.getTransaction().toString());

    }
}
