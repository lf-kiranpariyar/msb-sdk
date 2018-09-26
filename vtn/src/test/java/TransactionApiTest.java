

import com.lftechnology.vtn.sdk.api.TransactionApi;
import com.lftechnology.vtn.sdk.dto.Request.Credentials;

import com.lftechnology.vtn.sdk.dto.Request.TransactionRequestDTO;
import com.lftechnology.vtn.sdk.dto.Response.TransactionResponseDTO;
import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class TransactionApiTest {

    @Test
    public void checkTransaction(){
        Credentials credentials =new Credentials("LKNgtr4Of7VmHrr7Q8JJcgbt543sFB4","MNV73Bc6655dJ8UdkG4IKNGyk82nONK4");
        TransactionRequestDTO transactionRequestDTO;
        transactionRequestDTO = new TransactionRequestDTO("a6c3055c-bbed-11e8-a355-529269fb1459", LocalDateTime.now(),2,"peter@peterojo.com",
                " ","Peter","Ojo","USA","raskin@gmail.com", "","Raskin","Maharjan",
                "Nigeria","USD",1,362.50,1,110,"2173986879","PETER   OJO","000015");

        TransactionApi transactionApi = new TransactionApi();
        TransactionResponseDTO transactionResponseDTO = transactionApi.crateTransaction(credentials,transactionRequestDTO);
        System.out.println(transactionResponseDTO.toString());
    }
}
