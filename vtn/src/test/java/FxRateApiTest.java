import com.lftechnology.vtn.sdk.api.FxRateApi;
import com.lftechnology.vtn.sdk.dto.Request.Credentials;
import com.lftechnology.vtn.sdk.dto.Response.FxRateResponseDTO;
import org.junit.Test;

public class FxRateApiTest {

    @Test
  public void  fxRateApiTest(){

        Credentials c =new Credentials("LKNgtr4Of7VmHrr7Q8JJcgbt543sFB4","MNV73Bc6655dJ8UdkG4IKNGyk82nONK4");
        FxRateApi fxRateApi  = new FxRateApi();
        FxRateResponseDTO fxRateResponseDTO = fxRateApi.getRate(c,"USD");
        System.out.println(fxRateResponseDTO.toString());

    }



}
