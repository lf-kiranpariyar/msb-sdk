import com.lftechnology.vtn.api.TransactionApi;
import com.lftechnology.vtn.dto.request.Credential;
import com.lftechnology.vtn.dto.request.TransactionRequest;
import com.lftechnology.vtn.dto.response.TransactionResponse;
import org.junit.Test;

public class TransactionApiTest {

    @Test
    public void checkTransaction() {
        Credential credential = new Credential("LKNgtr4Of7VmHrr7Q8JJcgbt543sFB4", "MNV73Bc6655dJ8UdkG4IKNGyk82nONK4");
        TransactionRequest transactionRequest;
        transactionRequest = new TransactionRequest();

//
//                "a6c3055c-bbed-11e8-a355-529269fb1459", null,2,"peter@peterojo.com",
//                " ","Peter","Ojo","USA","raskin@gmail.com", "","Raskin","Maharjan",
//                "Nigeria","USD",new BigDecimal(1),new BigDecimal(101.95),new BigDecimal(0.28),new BigDecimal(101.1),"2173986879","PETER   OJO","000015");


        TransactionApi transactionApi = new TransactionApi(credential);
        TransactionResponse transactionResponseDTO = transactionApi.createTransaction(transactionRequest);
        System.out.println(transactionResponseDTO.toString());
    }
}
