import com.lftechnology.vtn.sdk.api.TransactionApi;
import com.lftechnology.vtn.sdk.api.TransactionListApi;
import com.lftechnology.vtn.sdk.dto.Request.Credentials;
import com.lftechnology.vtn.sdk.dto.Request.TransactionListRequestDTO;
import com.lftechnology.vtn.sdk.dto.Request.TransactionRequestDTO;
import com.lftechnology.vtn.sdk.dto.Response.TransactionListResponseDTO;
import org.junit.Test;

public class TransactionListApiTest {

    @Test
    public void checkTransaction(){
        Credentials credentials =new Credentials("LKNgtr4Of7VmHrr7Q8JJcgbt543sFB4","MNV73Bc6655dJ8UdkG4IKNGyk82nONK4");
        TransactionListApi transactionListApi = new TransactionListApi();
        TransactionListResponseDTO transactionListResponseDTO = transactionListApi.retrieveTransaction(credentials,"a6c3055c-bbed-11e8-a355-529269fb1455");
        System.out.println(transactionListResponseDTO.toString());
    }
}
