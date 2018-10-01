import com.lftechnology.vtn.api.TransactionListApi;
import com.lftechnology.vtn.dto.request.Credential;
import com.lftechnology.vtn.dto.response.TransactionListResponse;
import org.junit.Test;

public class TransactionListApiTest {

    @Test

    public void checkTransaction() {
        Credential credential = new Credential("LKNgtr4Of7VmHrr7Q8JJcgbt543sFB4", "MNV73Bc6655dJ8UdkG4IKNGyk82nONK4");
        TransactionListApi transactionListApi = new TransactionListApi(credential);
        TransactionListResponse transactionListResponseDTO = transactionListApi.retrieveTransaction("a6c3055c-bbed-11e8-a355-529269fb1455");
        System.out.println(transactionListResponseDTO.toString());
    }
}
