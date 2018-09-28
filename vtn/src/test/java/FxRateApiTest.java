import com.lftechnology.vtn.api.FxRateApi;
import com.lftechnology.vtn.dto.request.Credential;
import com.lftechnology.vtn.dto.response.FxRateResponse;
import org.junit.Test;

public class FxRateApiTest {

    @Test
    public void fxRateApiTest() {

        Credential c = new Credential("LKNgtr4Of7VmHrr7Q8JJcgbt543sFB4", "MNV73Bc6655dJ8UdkG4IKNGyk82nONK4");
        FxRateApi fxRateApi = new FxRateApi(c);
        FxRateResponse fxRateResponse = fxRateApi.getRate("USD");
        System.out.println(fxRateResponse.toString());

    }


}
