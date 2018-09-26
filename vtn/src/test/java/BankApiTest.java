import com.lftechnology.vtn.sdk.api.BankApi;
import com.lftechnology.vtn.sdk.dto.Request.BankRequestDTO;
import com.lftechnology.vtn.sdk.dto.Response.BankResponseDTO;
import org.junit.Test;

public class BankApiTest {

    @Test
    public void testBankApi(){

        BankRequestDTO b = new BankRequestDTO("2173986879","PETER   OJO","000015","LKNgtr4Of7VmHrr7Q8JJcgbt543sFB4","MNV73Bc6655dJ8UdkG4IKNGyk82nONK4");
        BankApi bankApi = new BankApi();
        BankResponseDTO bankResponseDTO = bankApi.verifyBank(b);
       System.out.println(bankResponseDTO.toString());


    }


}
