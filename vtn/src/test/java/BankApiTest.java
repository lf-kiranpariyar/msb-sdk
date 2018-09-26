import com.lftechnology.vtn.sdk.api.BankApi;
import com.lftechnology.vtn.sdk.dto.Request.BankNameRequestDTO;
import com.lftechnology.vtn.sdk.dto.Response.BankNameQueryDTO;
import org.junit.Assert.*;
import org.junit.Test;
import retrofit2.Response;

public class BankApiTest {

    @Test
    public void testBankApi(){

        BankNameRequestDTO b = new BankNameRequestDTO("2173986879","PETER   OJO","000015","LKNgtr4Of7VmHrr7Q8JJcgbt543sFB4","MNV73Bc6655dJ8UdkG4IKNGyk82nONK4");
        BankApi bankApi = new BankApi();
        BankNameQueryDTO bankNameQueryDTO = bankApi.verifyBank(b);
       System.out.println(bankNameQueryDTO.toString());


    }


}
