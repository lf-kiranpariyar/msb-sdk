package com.lftechnology.vtn.sdk.dto.Response;

import com.lftechnology.vtn.sdk.dto.Response.ResponseDTO;
import lombok.Data;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.math.BigDecimal;

@XmlRootElement(name="RemittanceBalanceResponse")
@Data
public class BalanceQueryDTO extends ResponseDTO {
    @XmlElement(name ="AccountBalance")
    private BigDecimal balance;
}
