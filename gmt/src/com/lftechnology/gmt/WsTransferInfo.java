
package com.lftechnology.gmt;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for wsTransferInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="wsTransferInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AgenciaCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AgencySpecialDiscounts" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AmountToReceive" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="AttachedFile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BancoCuenta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BancosId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BancosNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BankAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BankCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BeneficiarioCelular" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BeneficiarioCiudad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BeneficiarioDialCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BeneficiarioEnviarSMS" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="BeneficiarioEstado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BeneficiarioIdDescripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BeneficiarioIdTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BeneficiarioMensaje" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BeneficiarioNotas" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BeneficiarioZip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BeneficiaryID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Boleto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CargosAdicionales" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="CiudadBeneficiario" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CiudadNombreBeneficiario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CiudadNombreRemitente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CiudadRemitente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ComisionAgencia" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="ComisionAgenciaFX" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="ComisionCompaniaFX" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="CompanyComision" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="ComplianceBanksName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ComplianceBirthDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ComplianceDireccion2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ComplianceEmployerAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ComplianceEmployersName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ComplianceHomeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ComplianceIdExpirationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ComplianceIdIssuer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ComplianceIdNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ComplianceIdType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ComplianceOccupation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ComplianceOtherSendingReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ComplianceOverLimitMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CompliancePhoneConfirmation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CompliancePhoneType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ComplianceRelationshipWithBeneficiary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ComplianceSSN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ComplianceSendingReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ComplianceSourceOfFunds" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ComplianceSpecial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ComplianceTextType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ComplianceWorkPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CorrespondentCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DestinatarioApellido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DestinatarioNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DestinationCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DireccionBancoTexto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DireccionBeneficiario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DireccionCalleRemitente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DireccionRemitente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EnableSave" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ExchangeRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="ExchangeRateEffective" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExisteTarifa" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Fee" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="FeeDiferencia" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="FeeExchangeRateUp" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="FeeExchangeRateUpCant" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="FeesByExachangeRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="FormaPago" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ForzarNuevoRemitente" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="GiroGratis" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HDFieldBeneficiary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HDFieldExchRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="HDFieldSales" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="HdFieldCompliance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HiloAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="IDNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InformacionAdicionalRemitenteBeneficiario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsBlocked" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsSuspended" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LegalIdBeneficiario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MTSID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MarkUp" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="MovilRemitente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NetAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="OFACBeneficiario" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OFACBeneficiaryBirthDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OFACBeneficiaryPlaceOfBirth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OFACCountryOfNationality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OFACPlaceOfBirth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OFACRemitente" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OFACRemitenteObliga" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OFACSenderBirthDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OfficeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OfficeNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OriginalCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OriginalPaymentMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Others" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="OverLimitMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PEPBeneficiarioMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PEPBeneficiarioScore" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="PEPRemitenteMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PEPRemitenteScore" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="POBofacBen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaisBeneficiario" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PaisBeneficiarioNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Promotion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PuntosRemitenteIdCard" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RealExchangeRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="RelationshipWithSenders" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RemitenteApellido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RemitenteEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RemitenteEstado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RemitenteNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RemitentePais" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RemitentePaisNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RemitenteTelefono" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RemitenteZip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RoutingNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SaveSenderReceiver" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SenderAchAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SenderAchRouting" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SenderAchType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SenderBirthDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="SenderID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ServicioCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ServicioId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SucursalBanco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SuspendMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SuspendUserType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TasaError" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TelefonoBeneficiario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TempCompliance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TempGiroRepetido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ThirdPartyReceipt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TipoCuentaCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TotalAditionalCharges" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="TotalAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="newTransaction_TipoCalculo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsTransferInfo", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", propOrder = {
    "agenciaCodigo",
    "agencySpecialDiscounts",
    "amountToReceive",
    "attachedFile",
    "bancoCuenta",
    "bancosId",
    "bancosNombre",
    "bankAccount",
    "bankCode",
    "beneficiarioCelular",
    "beneficiarioCiudad",
    "beneficiarioDialCode",
    "beneficiarioEnviarSMS",
    "beneficiarioEstado",
    "beneficiarioIdDescripcion",
    "beneficiarioIdTipo",
    "beneficiarioMensaje",
    "beneficiarioNotas",
    "beneficiarioZip",
    "beneficiaryID",
    "boleto",
    "cargosAdicionales",
    "ciudadBeneficiario",
    "ciudadNombreBeneficiario",
    "ciudadNombreRemitente",
    "ciudadRemitente",
    "comisionAgencia",
    "comisionAgenciaFX",
    "comisionCompaniaFX",
    "companyComision",
    "complianceBanksName",
    "complianceBirthDate",
    "complianceDireccion2",
    "complianceEmployerAddress",
    "complianceEmployersName",
    "complianceHomeType",
    "complianceIdExpirationDate",
    "complianceIdIssuer",
    "complianceIdNumber",
    "complianceIdType",
    "complianceOccupation",
    "complianceOtherSendingReason",
    "complianceOverLimitMessage",
    "compliancePhoneConfirmation",
    "compliancePhoneType",
    "complianceRelationshipWithBeneficiary",
    "complianceSSN",
    "complianceSendingReason",
    "complianceSourceOfFunds",
    "complianceSpecial",
    "complianceTextType",
    "complianceWorkPhone",
    "correspondentCode",
    "customerID",
    "destinatarioApellido",
    "destinatarioNombre",
    "destinationCurrency",
    "direccionBancoTexto",
    "direccionBeneficiario",
    "direccionCalleRemitente",
    "direccionRemitente",
    "enableSave",
    "exchangeRate",
    "exchangeRateEffective",
    "existeTarifa",
    "fee",
    "feeDiferencia",
    "feeExchangeRateUp",
    "feeExchangeRateUpCant",
    "feesByExachangeRate",
    "formaPago",
    "forzarNuevoRemitente",
    "giroGratis",
    "hdFieldBeneficiary",
    "hdFieldExchRate",
    "hdFieldSales",
    "hdFieldCompliance",
    "hiloAmount",
    "idNo",
    "informacionAdicionalRemitenteBeneficiario",
    "isBlocked",
    "isSuspended",
    "legalIdBeneficiario",
    "mtsid",
    "markUp",
    "movilRemitente",
    "netAmount",
    "ofacBeneficiario",
    "ofacBeneficiaryBirthDate",
    "ofacBeneficiaryPlaceOfBirth",
    "ofacCountryOfNationality",
    "ofacPlaceOfBirth",
    "ofacRemitente",
    "ofacRemitenteObliga",
    "ofacSenderBirthDate",
    "officeCode",
    "officeNombre",
    "originalCurrency",
    "originalPaymentMethod",
    "others",
    "overLimitMessage",
    "pepBeneficiarioMessage",
    "pepBeneficiarioScore",
    "pepRemitenteMessage",
    "pepRemitenteScore",
    "poBofacBen",
    "paisBeneficiario",
    "paisBeneficiarioNombre",
    "promotion",
    "puntosRemitenteIdCard",
    "realExchangeRate",
    "relationshipWithSenders",
    "remitenteApellido",
    "remitenteEmail",
    "remitenteEstado",
    "remitenteNombre",
    "remitentePais",
    "remitentePaisNombre",
    "remitenteTelefono",
    "remitenteZip",
    "routingNumber",
    "saveSenderReceiver",
    "senderAchAccount",
    "senderAchRouting",
    "senderAchType",
    "senderBirthDate",
    "senderID",
    "servicioCodigo",
    "servicioId",
    "sucursalBanco",
    "suspendMessage",
    "suspendUserType",
    "tasaError",
    "telefonoBeneficiario",
    "tempCompliance",
    "tempGiroRepetido",
    "thirdPartyReceipt",
    "tipoCuentaCodigo",
    "totalAditionalCharges",
    "totalAmount",
    "newTransactionTipoCalculo"
})
public class WsTransferInfo {

    @XmlElementRef(name = "AgenciaCodigo", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> agenciaCodigo;
    @XmlElementRef(name = "AgencySpecialDiscounts", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> agencySpecialDiscounts;
    @XmlElement(name = "AmountToReceive")
    protected BigDecimal amountToReceive;
    @XmlElementRef(name = "AttachedFile", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> attachedFile;
    @XmlElementRef(name = "BancoCuenta", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bancoCuenta;
    @XmlElementRef(name = "BancosId", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bancosId;
    @XmlElementRef(name = "BancosNombre", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bancosNombre;
    @XmlElementRef(name = "BankAccount", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bankAccount;
    @XmlElementRef(name = "BankCode", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bankCode;
    @XmlElementRef(name = "BeneficiarioCelular", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> beneficiarioCelular;
    @XmlElementRef(name = "BeneficiarioCiudad", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> beneficiarioCiudad;
    @XmlElementRef(name = "BeneficiarioDialCode", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> beneficiarioDialCode;
    @XmlElement(name = "BeneficiarioEnviarSMS")
    protected Boolean beneficiarioEnviarSMS;
    @XmlElementRef(name = "BeneficiarioEstado", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> beneficiarioEstado;
    @XmlElementRef(name = "BeneficiarioIdDescripcion", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> beneficiarioIdDescripcion;
    @XmlElementRef(name = "BeneficiarioIdTipo", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> beneficiarioIdTipo;
    @XmlElementRef(name = "BeneficiarioMensaje", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> beneficiarioMensaje;
    @XmlElementRef(name = "BeneficiarioNotas", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> beneficiarioNotas;
    @XmlElementRef(name = "BeneficiarioZip", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> beneficiarioZip;
    @XmlElement(name = "BeneficiaryID")
    protected Integer beneficiaryID;
    @XmlElementRef(name = "Boleto", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> boleto;
    @XmlElement(name = "CargosAdicionales")
    protected BigDecimal cargosAdicionales;
    @XmlElement(name = "CiudadBeneficiario")
    protected Integer ciudadBeneficiario;
    @XmlElementRef(name = "CiudadNombreBeneficiario", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ciudadNombreBeneficiario;
    @XmlElementRef(name = "CiudadNombreRemitente", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ciudadNombreRemitente;
    @XmlElementRef(name = "CiudadRemitente", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ciudadRemitente;
    @XmlElement(name = "ComisionAgencia")
    protected BigDecimal comisionAgencia;
    @XmlElement(name = "ComisionAgenciaFX")
    protected BigDecimal comisionAgenciaFX;
    @XmlElement(name = "ComisionCompaniaFX")
    protected BigDecimal comisionCompaniaFX;
    @XmlElement(name = "CompanyComision")
    protected BigDecimal companyComision;
    @XmlElementRef(name = "ComplianceBanksName", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> complianceBanksName;
    @XmlElementRef(name = "ComplianceBirthDate", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> complianceBirthDate;
    @XmlElementRef(name = "ComplianceDireccion2", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> complianceDireccion2;
    @XmlElementRef(name = "ComplianceEmployerAddress", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> complianceEmployerAddress;
    @XmlElementRef(name = "ComplianceEmployersName", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> complianceEmployersName;
    @XmlElementRef(name = "ComplianceHomeType", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> complianceHomeType;
    @XmlElementRef(name = "ComplianceIdExpirationDate", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> complianceIdExpirationDate;
    @XmlElementRef(name = "ComplianceIdIssuer", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> complianceIdIssuer;
    @XmlElementRef(name = "ComplianceIdNumber", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> complianceIdNumber;
    @XmlElementRef(name = "ComplianceIdType", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> complianceIdType;
    @XmlElementRef(name = "ComplianceOccupation", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> complianceOccupation;
    @XmlElementRef(name = "ComplianceOtherSendingReason", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> complianceOtherSendingReason;
    @XmlElementRef(name = "ComplianceOverLimitMessage", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> complianceOverLimitMessage;
    @XmlElementRef(name = "CompliancePhoneConfirmation", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> compliancePhoneConfirmation;
    @XmlElementRef(name = "CompliancePhoneType", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> compliancePhoneType;
    @XmlElementRef(name = "ComplianceRelationshipWithBeneficiary", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> complianceRelationshipWithBeneficiary;
    @XmlElementRef(name = "ComplianceSSN", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> complianceSSN;
    @XmlElementRef(name = "ComplianceSendingReason", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> complianceSendingReason;
    @XmlElementRef(name = "ComplianceSourceOfFunds", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> complianceSourceOfFunds;
    @XmlElementRef(name = "ComplianceSpecial", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> complianceSpecial;
    @XmlElementRef(name = "ComplianceTextType", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> complianceTextType;
    @XmlElementRef(name = "ComplianceWorkPhone", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> complianceWorkPhone;
    @XmlElementRef(name = "CorrespondentCode", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> correspondentCode;
    @XmlElementRef(name = "CustomerID", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> customerID;
    @XmlElementRef(name = "DestinatarioApellido", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> destinatarioApellido;
    @XmlElementRef(name = "DestinatarioNombre", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> destinatarioNombre;
    @XmlElementRef(name = "DestinationCurrency", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> destinationCurrency;
    @XmlElementRef(name = "DireccionBancoTexto", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> direccionBancoTexto;
    @XmlElementRef(name = "DireccionBeneficiario", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> direccionBeneficiario;
    @XmlElementRef(name = "DireccionCalleRemitente", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> direccionCalleRemitente;
    @XmlElementRef(name = "DireccionRemitente", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> direccionRemitente;
    @XmlElement(name = "EnableSave")
    protected Boolean enableSave;
    @XmlElement(name = "ExchangeRate")
    protected Double exchangeRate;
    @XmlElementRef(name = "ExchangeRateEffective", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> exchangeRateEffective;
    @XmlElement(name = "ExisteTarifa")
    protected Boolean existeTarifa;
    @XmlElement(name = "Fee")
    protected BigDecimal fee;
    @XmlElement(name = "FeeDiferencia")
    protected BigDecimal feeDiferencia;
    @XmlElement(name = "FeeExchangeRateUp")
    protected Double feeExchangeRateUp;
    @XmlElement(name = "FeeExchangeRateUpCant")
    protected Double feeExchangeRateUpCant;
    @XmlElement(name = "FeesByExachangeRate")
    protected BigDecimal feesByExachangeRate;
    @XmlElement(name = "FormaPago")
    protected Integer formaPago;
    @XmlElement(name = "ForzarNuevoRemitente")
    protected Boolean forzarNuevoRemitente;
    @XmlElement(name = "GiroGratis")
    protected Boolean giroGratis;
    @XmlElementRef(name = "HDFieldBeneficiary", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> hdFieldBeneficiary;
    @XmlElement(name = "HDFieldExchRate")
    protected BigDecimal hdFieldExchRate;
    @XmlElement(name = "HDFieldSales")
    protected BigDecimal hdFieldSales;
    @XmlElementRef(name = "HdFieldCompliance", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> hdFieldCompliance;
    @XmlElement(name = "HiloAmount")
    protected BigDecimal hiloAmount;
    @XmlElementRef(name = "IDNo", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> idNo;
    @XmlElementRef(name = "InformacionAdicionalRemitenteBeneficiario", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> informacionAdicionalRemitenteBeneficiario;
    @XmlElement(name = "IsBlocked")
    protected Boolean isBlocked;
    @XmlElement(name = "IsSuspended")
    protected Boolean isSuspended;
    @XmlElementRef(name = "LegalIdBeneficiario", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> legalIdBeneficiario;
    @XmlElement(name = "MTSID")
    protected Integer mtsid;
    @XmlElement(name = "MarkUp")
    protected Double markUp;
    @XmlElementRef(name = "MovilRemitente", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> movilRemitente;
    @XmlElement(name = "NetAmount")
    protected BigDecimal netAmount;
    @XmlElement(name = "OFACBeneficiario")
    protected Boolean ofacBeneficiario;
    @XmlElementRef(name = "OFACBeneficiaryBirthDate", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ofacBeneficiaryBirthDate;
    @XmlElementRef(name = "OFACBeneficiaryPlaceOfBirth", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ofacBeneficiaryPlaceOfBirth;
    @XmlElementRef(name = "OFACCountryOfNationality", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ofacCountryOfNationality;
    @XmlElementRef(name = "OFACPlaceOfBirth", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ofacPlaceOfBirth;
    @XmlElement(name = "OFACRemitente")
    protected Boolean ofacRemitente;
    @XmlElementRef(name = "OFACRemitenteObliga", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ofacRemitenteObliga;
    @XmlElementRef(name = "OFACSenderBirthDate", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ofacSenderBirthDate;
    @XmlElementRef(name = "OfficeCode", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> officeCode;
    @XmlElementRef(name = "OfficeNombre", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> officeNombre;
    @XmlElementRef(name = "OriginalCurrency", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> originalCurrency;
    @XmlElementRef(name = "OriginalPaymentMethod", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> originalPaymentMethod;
    @XmlElement(name = "Others")
    protected BigDecimal others;
    @XmlElementRef(name = "OverLimitMessage", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> overLimitMessage;
    @XmlElementRef(name = "PEPBeneficiarioMessage", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pepBeneficiarioMessage;
    @XmlElement(name = "PEPBeneficiarioScore")
    protected BigDecimal pepBeneficiarioScore;
    @XmlElementRef(name = "PEPRemitenteMessage", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pepRemitenteMessage;
    @XmlElement(name = "PEPRemitenteScore")
    protected BigDecimal pepRemitenteScore;
    @XmlElementRef(name = "POBofacBen", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> poBofacBen;
    @XmlElement(name = "PaisBeneficiario")
    protected Integer paisBeneficiario;
    @XmlElementRef(name = "PaisBeneficiarioNombre", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> paisBeneficiarioNombre;
    @XmlElement(name = "Promotion")
    protected Integer promotion;
    @XmlElementRef(name = "PuntosRemitenteIdCard", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> puntosRemitenteIdCard;
    @XmlElement(name = "RealExchangeRate")
    protected Double realExchangeRate;
    @XmlElementRef(name = "RelationshipWithSenders", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> relationshipWithSenders;
    @XmlElementRef(name = "RemitenteApellido", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> remitenteApellido;
    @XmlElementRef(name = "RemitenteEmail", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> remitenteEmail;
    @XmlElementRef(name = "RemitenteEstado", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> remitenteEstado;
    @XmlElementRef(name = "RemitenteNombre", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> remitenteNombre;
    @XmlElementRef(name = "RemitentePais", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> remitentePais;
    @XmlElementRef(name = "RemitentePaisNombre", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> remitentePaisNombre;
    @XmlElementRef(name = "RemitenteTelefono", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> remitenteTelefono;
    @XmlElementRef(name = "RemitenteZip", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> remitenteZip;
    @XmlElementRef(name = "RoutingNumber", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> routingNumber;
    @XmlElement(name = "SaveSenderReceiver")
    protected Boolean saveSenderReceiver;
    @XmlElementRef(name = "SenderAchAccount", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> senderAchAccount;
    @XmlElementRef(name = "SenderAchRouting", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> senderAchRouting;
    @XmlElementRef(name = "SenderAchType", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> senderAchType;
    @XmlElementRef(name = "SenderBirthDate", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> senderBirthDate;
    @XmlElement(name = "SenderID")
    protected Integer senderID;
    @XmlElementRef(name = "ServicioCodigo", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> servicioCodigo;
    @XmlElement(name = "ServicioId")
    protected Integer servicioId;
    @XmlElementRef(name = "SucursalBanco", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sucursalBanco;
    @XmlElementRef(name = "SuspendMessage", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> suspendMessage;
    @XmlElementRef(name = "SuspendUserType", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> suspendUserType;
    @XmlElementRef(name = "TasaError", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tasaError;
    @XmlElementRef(name = "TelefonoBeneficiario", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> telefonoBeneficiario;
    @XmlElementRef(name = "TempCompliance", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tempCompliance;
    @XmlElementRef(name = "TempGiroRepetido", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tempGiroRepetido;
    @XmlElementRef(name = "ThirdPartyReceipt", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> thirdPartyReceipt;
    @XmlElementRef(name = "TipoCuentaCodigo", namespace = "http://schemas.datacontract.org/2004/07/gmtpay", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipoCuentaCodigo;
    @XmlElement(name = "TotalAditionalCharges")
    protected BigDecimal totalAditionalCharges;
    @XmlElement(name = "TotalAmount")
    protected BigDecimal totalAmount;
    @XmlElement(name = "newTransaction_TipoCalculo")
    protected Integer newTransactionTipoCalculo;

    /**
     * Gets the value of the agenciaCodigo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAgenciaCodigo() {
        return agenciaCodigo;
    }

    /**
     * Sets the value of the agenciaCodigo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAgenciaCodigo(JAXBElement<String> value) {
        this.agenciaCodigo = value;
    }

    /**
     * Gets the value of the agencySpecialDiscounts property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAgencySpecialDiscounts() {
        return agencySpecialDiscounts;
    }

    /**
     * Sets the value of the agencySpecialDiscounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAgencySpecialDiscounts(JAXBElement<String> value) {
        this.agencySpecialDiscounts = value;
    }

    /**
     * Gets the value of the amountToReceive property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmountToReceive() {
        return amountToReceive;
    }

    /**
     * Sets the value of the amountToReceive property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmountToReceive(BigDecimal value) {
        this.amountToReceive = value;
    }

    /**
     * Gets the value of the attachedFile property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAttachedFile() {
        return attachedFile;
    }

    /**
     * Sets the value of the attachedFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAttachedFile(JAXBElement<String> value) {
        this.attachedFile = value;
    }

    /**
     * Gets the value of the bancoCuenta property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBancoCuenta() {
        return bancoCuenta;
    }

    /**
     * Sets the value of the bancoCuenta property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBancoCuenta(JAXBElement<String> value) {
        this.bancoCuenta = value;
    }

    /**
     * Gets the value of the bancosId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBancosId() {
        return bancosId;
    }

    /**
     * Sets the value of the bancosId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBancosId(JAXBElement<String> value) {
        this.bancosId = value;
    }

    /**
     * Gets the value of the bancosNombre property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBancosNombre() {
        return bancosNombre;
    }

    /**
     * Sets the value of the bancosNombre property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBancosNombre(JAXBElement<String> value) {
        this.bancosNombre = value;
    }

    /**
     * Gets the value of the bankAccount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBankAccount() {
        return bankAccount;
    }

    /**
     * Sets the value of the bankAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBankAccount(JAXBElement<String> value) {
        this.bankAccount = value;
    }

    /**
     * Gets the value of the bankCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBankCode() {
        return bankCode;
    }

    /**
     * Sets the value of the bankCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBankCode(JAXBElement<String> value) {
        this.bankCode = value;
    }

    /**
     * Gets the value of the beneficiarioCelular property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBeneficiarioCelular() {
        return beneficiarioCelular;
    }

    /**
     * Sets the value of the beneficiarioCelular property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBeneficiarioCelular(JAXBElement<String> value) {
        this.beneficiarioCelular = value;
    }

    /**
     * Gets the value of the beneficiarioCiudad property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBeneficiarioCiudad() {
        return beneficiarioCiudad;
    }

    /**
     * Sets the value of the beneficiarioCiudad property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBeneficiarioCiudad(JAXBElement<String> value) {
        this.beneficiarioCiudad = value;
    }

    /**
     * Gets the value of the beneficiarioDialCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBeneficiarioDialCode() {
        return beneficiarioDialCode;
    }

    /**
     * Sets the value of the beneficiarioDialCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBeneficiarioDialCode(JAXBElement<String> value) {
        this.beneficiarioDialCode = value;
    }

    /**
     * Gets the value of the beneficiarioEnviarSMS property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBeneficiarioEnviarSMS() {
        return beneficiarioEnviarSMS;
    }

    /**
     * Sets the value of the beneficiarioEnviarSMS property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBeneficiarioEnviarSMS(Boolean value) {
        this.beneficiarioEnviarSMS = value;
    }

    /**
     * Gets the value of the beneficiarioEstado property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBeneficiarioEstado() {
        return beneficiarioEstado;
    }

    /**
     * Sets the value of the beneficiarioEstado property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBeneficiarioEstado(JAXBElement<String> value) {
        this.beneficiarioEstado = value;
    }

    /**
     * Gets the value of the beneficiarioIdDescripcion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBeneficiarioIdDescripcion() {
        return beneficiarioIdDescripcion;
    }

    /**
     * Sets the value of the beneficiarioIdDescripcion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBeneficiarioIdDescripcion(JAXBElement<String> value) {
        this.beneficiarioIdDescripcion = value;
    }

    /**
     * Gets the value of the beneficiarioIdTipo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBeneficiarioIdTipo() {
        return beneficiarioIdTipo;
    }

    /**
     * Sets the value of the beneficiarioIdTipo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBeneficiarioIdTipo(JAXBElement<String> value) {
        this.beneficiarioIdTipo = value;
    }

    /**
     * Gets the value of the beneficiarioMensaje property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBeneficiarioMensaje() {
        return beneficiarioMensaje;
    }

    /**
     * Sets the value of the beneficiarioMensaje property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBeneficiarioMensaje(JAXBElement<String> value) {
        this.beneficiarioMensaje = value;
    }

    /**
     * Gets the value of the beneficiarioNotas property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBeneficiarioNotas() {
        return beneficiarioNotas;
    }

    /**
     * Sets the value of the beneficiarioNotas property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBeneficiarioNotas(JAXBElement<String> value) {
        this.beneficiarioNotas = value;
    }

    /**
     * Gets the value of the beneficiarioZip property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBeneficiarioZip() {
        return beneficiarioZip;
    }

    /**
     * Sets the value of the beneficiarioZip property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBeneficiarioZip(JAXBElement<String> value) {
        this.beneficiarioZip = value;
    }

    /**
     * Gets the value of the beneficiaryID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBeneficiaryID() {
        return beneficiaryID;
    }

    /**
     * Sets the value of the beneficiaryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBeneficiaryID(Integer value) {
        this.beneficiaryID = value;
    }

    /**
     * Gets the value of the boleto property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBoleto() {
        return boleto;
    }

    /**
     * Sets the value of the boleto property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBoleto(JAXBElement<String> value) {
        this.boleto = value;
    }

    /**
     * Gets the value of the cargosAdicionales property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCargosAdicionales() {
        return cargosAdicionales;
    }

    /**
     * Sets the value of the cargosAdicionales property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCargosAdicionales(BigDecimal value) {
        this.cargosAdicionales = value;
    }

    /**
     * Gets the value of the ciudadBeneficiario property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCiudadBeneficiario() {
        return ciudadBeneficiario;
    }

    /**
     * Sets the value of the ciudadBeneficiario property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCiudadBeneficiario(Integer value) {
        this.ciudadBeneficiario = value;
    }

    /**
     * Gets the value of the ciudadNombreBeneficiario property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCiudadNombreBeneficiario() {
        return ciudadNombreBeneficiario;
    }

    /**
     * Sets the value of the ciudadNombreBeneficiario property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCiudadNombreBeneficiario(JAXBElement<String> value) {
        this.ciudadNombreBeneficiario = value;
    }

    /**
     * Gets the value of the ciudadNombreRemitente property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCiudadNombreRemitente() {
        return ciudadNombreRemitente;
    }

    /**
     * Sets the value of the ciudadNombreRemitente property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCiudadNombreRemitente(JAXBElement<String> value) {
        this.ciudadNombreRemitente = value;
    }

    /**
     * Gets the value of the ciudadRemitente property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCiudadRemitente() {
        return ciudadRemitente;
    }

    /**
     * Sets the value of the ciudadRemitente property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCiudadRemitente(JAXBElement<String> value) {
        this.ciudadRemitente = value;
    }

    /**
     * Gets the value of the comisionAgencia property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getComisionAgencia() {
        return comisionAgencia;
    }

    /**
     * Sets the value of the comisionAgencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setComisionAgencia(BigDecimal value) {
        this.comisionAgencia = value;
    }

    /**
     * Gets the value of the comisionAgenciaFX property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getComisionAgenciaFX() {
        return comisionAgenciaFX;
    }

    /**
     * Sets the value of the comisionAgenciaFX property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setComisionAgenciaFX(BigDecimal value) {
        this.comisionAgenciaFX = value;
    }

    /**
     * Gets the value of the comisionCompaniaFX property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getComisionCompaniaFX() {
        return comisionCompaniaFX;
    }

    /**
     * Sets the value of the comisionCompaniaFX property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setComisionCompaniaFX(BigDecimal value) {
        this.comisionCompaniaFX = value;
    }

    /**
     * Gets the value of the companyComision property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCompanyComision() {
        return companyComision;
    }

    /**
     * Sets the value of the companyComision property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCompanyComision(BigDecimal value) {
        this.companyComision = value;
    }

    /**
     * Gets the value of the complianceBanksName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getComplianceBanksName() {
        return complianceBanksName;
    }

    /**
     * Sets the value of the complianceBanksName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setComplianceBanksName(JAXBElement<String> value) {
        this.complianceBanksName = value;
    }

    /**
     * Gets the value of the complianceBirthDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getComplianceBirthDate() {
        return complianceBirthDate;
    }

    /**
     * Sets the value of the complianceBirthDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setComplianceBirthDate(JAXBElement<XMLGregorianCalendar> value) {
        this.complianceBirthDate = value;
    }

    /**
     * Gets the value of the complianceDireccion2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getComplianceDireccion2() {
        return complianceDireccion2;
    }

    /**
     * Sets the value of the complianceDireccion2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setComplianceDireccion2(JAXBElement<String> value) {
        this.complianceDireccion2 = value;
    }

    /**
     * Gets the value of the complianceEmployerAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getComplianceEmployerAddress() {
        return complianceEmployerAddress;
    }

    /**
     * Sets the value of the complianceEmployerAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setComplianceEmployerAddress(JAXBElement<String> value) {
        this.complianceEmployerAddress = value;
    }

    /**
     * Gets the value of the complianceEmployersName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getComplianceEmployersName() {
        return complianceEmployersName;
    }

    /**
     * Sets the value of the complianceEmployersName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setComplianceEmployersName(JAXBElement<String> value) {
        this.complianceEmployersName = value;
    }

    /**
     * Gets the value of the complianceHomeType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getComplianceHomeType() {
        return complianceHomeType;
    }

    /**
     * Sets the value of the complianceHomeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setComplianceHomeType(JAXBElement<String> value) {
        this.complianceHomeType = value;
    }

    /**
     * Gets the value of the complianceIdExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getComplianceIdExpirationDate() {
        return complianceIdExpirationDate;
    }

    /**
     * Sets the value of the complianceIdExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setComplianceIdExpirationDate(JAXBElement<XMLGregorianCalendar> value) {
        this.complianceIdExpirationDate = value;
    }

    /**
     * Gets the value of the complianceIdIssuer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getComplianceIdIssuer() {
        return complianceIdIssuer;
    }

    /**
     * Sets the value of the complianceIdIssuer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setComplianceIdIssuer(JAXBElement<String> value) {
        this.complianceIdIssuer = value;
    }

    /**
     * Gets the value of the complianceIdNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getComplianceIdNumber() {
        return complianceIdNumber;
    }

    /**
     * Sets the value of the complianceIdNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setComplianceIdNumber(JAXBElement<String> value) {
        this.complianceIdNumber = value;
    }

    /**
     * Gets the value of the complianceIdType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getComplianceIdType() {
        return complianceIdType;
    }

    /**
     * Sets the value of the complianceIdType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setComplianceIdType(JAXBElement<String> value) {
        this.complianceIdType = value;
    }

    /**
     * Gets the value of the complianceOccupation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getComplianceOccupation() {
        return complianceOccupation;
    }

    /**
     * Sets the value of the complianceOccupation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setComplianceOccupation(JAXBElement<String> value) {
        this.complianceOccupation = value;
    }

    /**
     * Gets the value of the complianceOtherSendingReason property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getComplianceOtherSendingReason() {
        return complianceOtherSendingReason;
    }

    /**
     * Sets the value of the complianceOtherSendingReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setComplianceOtherSendingReason(JAXBElement<String> value) {
        this.complianceOtherSendingReason = value;
    }

    /**
     * Gets the value of the complianceOverLimitMessage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getComplianceOverLimitMessage() {
        return complianceOverLimitMessage;
    }

    /**
     * Sets the value of the complianceOverLimitMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setComplianceOverLimitMessage(JAXBElement<String> value) {
        this.complianceOverLimitMessage = value;
    }

    /**
     * Gets the value of the compliancePhoneConfirmation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCompliancePhoneConfirmation() {
        return compliancePhoneConfirmation;
    }

    /**
     * Sets the value of the compliancePhoneConfirmation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCompliancePhoneConfirmation(JAXBElement<String> value) {
        this.compliancePhoneConfirmation = value;
    }

    /**
     * Gets the value of the compliancePhoneType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCompliancePhoneType() {
        return compliancePhoneType;
    }

    /**
     * Sets the value of the compliancePhoneType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCompliancePhoneType(JAXBElement<String> value) {
        this.compliancePhoneType = value;
    }

    /**
     * Gets the value of the complianceRelationshipWithBeneficiary property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getComplianceRelationshipWithBeneficiary() {
        return complianceRelationshipWithBeneficiary;
    }

    /**
     * Sets the value of the complianceRelationshipWithBeneficiary property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setComplianceRelationshipWithBeneficiary(JAXBElement<String> value) {
        this.complianceRelationshipWithBeneficiary = value;
    }

    /**
     * Gets the value of the complianceSSN property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getComplianceSSN() {
        return complianceSSN;
    }

    /**
     * Sets the value of the complianceSSN property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setComplianceSSN(JAXBElement<String> value) {
        this.complianceSSN = value;
    }

    /**
     * Gets the value of the complianceSendingReason property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getComplianceSendingReason() {
        return complianceSendingReason;
    }

    /**
     * Sets the value of the complianceSendingReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setComplianceSendingReason(JAXBElement<String> value) {
        this.complianceSendingReason = value;
    }

    /**
     * Gets the value of the complianceSourceOfFunds property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getComplianceSourceOfFunds() {
        return complianceSourceOfFunds;
    }

    /**
     * Sets the value of the complianceSourceOfFunds property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setComplianceSourceOfFunds(JAXBElement<String> value) {
        this.complianceSourceOfFunds = value;
    }

    /**
     * Gets the value of the complianceSpecial property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getComplianceSpecial() {
        return complianceSpecial;
    }

    /**
     * Sets the value of the complianceSpecial property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setComplianceSpecial(JAXBElement<String> value) {
        this.complianceSpecial = value;
    }

    /**
     * Gets the value of the complianceTextType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getComplianceTextType() {
        return complianceTextType;
    }

    /**
     * Sets the value of the complianceTextType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setComplianceTextType(JAXBElement<String> value) {
        this.complianceTextType = value;
    }

    /**
     * Gets the value of the complianceWorkPhone property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getComplianceWorkPhone() {
        return complianceWorkPhone;
    }

    /**
     * Sets the value of the complianceWorkPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setComplianceWorkPhone(JAXBElement<String> value) {
        this.complianceWorkPhone = value;
    }

    /**
     * Gets the value of the correspondentCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCorrespondentCode() {
        return correspondentCode;
    }

    /**
     * Sets the value of the correspondentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCorrespondentCode(JAXBElement<String> value) {
        this.correspondentCode = value;
    }

    /**
     * Gets the value of the customerID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCustomerID() {
        return customerID;
    }

    /**
     * Sets the value of the customerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCustomerID(JAXBElement<String> value) {
        this.customerID = value;
    }

    /**
     * Gets the value of the destinatarioApellido property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDestinatarioApellido() {
        return destinatarioApellido;
    }

    /**
     * Sets the value of the destinatarioApellido property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDestinatarioApellido(JAXBElement<String> value) {
        this.destinatarioApellido = value;
    }

    /**
     * Gets the value of the destinatarioNombre property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDestinatarioNombre() {
        return destinatarioNombre;
    }

    /**
     * Sets the value of the destinatarioNombre property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDestinatarioNombre(JAXBElement<String> value) {
        this.destinatarioNombre = value;
    }

    /**
     * Gets the value of the destinationCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDestinationCurrency() {
        return destinationCurrency;
    }

    /**
     * Sets the value of the destinationCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDestinationCurrency(JAXBElement<String> value) {
        this.destinationCurrency = value;
    }

    /**
     * Gets the value of the direccionBancoTexto property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDireccionBancoTexto() {
        return direccionBancoTexto;
    }

    /**
     * Sets the value of the direccionBancoTexto property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDireccionBancoTexto(JAXBElement<String> value) {
        this.direccionBancoTexto = value;
    }

    /**
     * Gets the value of the direccionBeneficiario property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDireccionBeneficiario() {
        return direccionBeneficiario;
    }

    /**
     * Sets the value of the direccionBeneficiario property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDireccionBeneficiario(JAXBElement<String> value) {
        this.direccionBeneficiario = value;
    }

    /**
     * Gets the value of the direccionCalleRemitente property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDireccionCalleRemitente() {
        return direccionCalleRemitente;
    }

    /**
     * Sets the value of the direccionCalleRemitente property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDireccionCalleRemitente(JAXBElement<String> value) {
        this.direccionCalleRemitente = value;
    }

    /**
     * Gets the value of the direccionRemitente property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDireccionRemitente() {
        return direccionRemitente;
    }

    /**
     * Sets the value of the direccionRemitente property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDireccionRemitente(JAXBElement<String> value) {
        this.direccionRemitente = value;
    }

    /**
     * Gets the value of the enableSave property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableSave() {
        return enableSave;
    }

    /**
     * Sets the value of the enableSave property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableSave(Boolean value) {
        this.enableSave = value;
    }

    /**
     * Gets the value of the exchangeRate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getExchangeRate() {
        return exchangeRate;
    }

    /**
     * Sets the value of the exchangeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setExchangeRate(Double value) {
        this.exchangeRate = value;
    }

    /**
     * Gets the value of the exchangeRateEffective property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExchangeRateEffective() {
        return exchangeRateEffective;
    }

    /**
     * Sets the value of the exchangeRateEffective property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExchangeRateEffective(JAXBElement<String> value) {
        this.exchangeRateEffective = value;
    }

    /**
     * Gets the value of the existeTarifa property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExisteTarifa() {
        return existeTarifa;
    }

    /**
     * Sets the value of the existeTarifa property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExisteTarifa(Boolean value) {
        this.existeTarifa = value;
    }

    /**
     * Gets the value of the fee property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFee() {
        return fee;
    }

    /**
     * Sets the value of the fee property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFee(BigDecimal value) {
        this.fee = value;
    }

    /**
     * Gets the value of the feeDiferencia property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFeeDiferencia() {
        return feeDiferencia;
    }

    /**
     * Sets the value of the feeDiferencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFeeDiferencia(BigDecimal value) {
        this.feeDiferencia = value;
    }

    /**
     * Gets the value of the feeExchangeRateUp property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFeeExchangeRateUp() {
        return feeExchangeRateUp;
    }

    /**
     * Sets the value of the feeExchangeRateUp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFeeExchangeRateUp(Double value) {
        this.feeExchangeRateUp = value;
    }

    /**
     * Gets the value of the feeExchangeRateUpCant property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFeeExchangeRateUpCant() {
        return feeExchangeRateUpCant;
    }

    /**
     * Sets the value of the feeExchangeRateUpCant property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFeeExchangeRateUpCant(Double value) {
        this.feeExchangeRateUpCant = value;
    }

    /**
     * Gets the value of the feesByExachangeRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFeesByExachangeRate() {
        return feesByExachangeRate;
    }

    /**
     * Sets the value of the feesByExachangeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFeesByExachangeRate(BigDecimal value) {
        this.feesByExachangeRate = value;
    }

    /**
     * Gets the value of the formaPago property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFormaPago() {
        return formaPago;
    }

    /**
     * Sets the value of the formaPago property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFormaPago(Integer value) {
        this.formaPago = value;
    }

    /**
     * Gets the value of the forzarNuevoRemitente property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isForzarNuevoRemitente() {
        return forzarNuevoRemitente;
    }

    /**
     * Sets the value of the forzarNuevoRemitente property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setForzarNuevoRemitente(Boolean value) {
        this.forzarNuevoRemitente = value;
    }

    /**
     * Gets the value of the giroGratis property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGiroGratis() {
        return giroGratis;
    }

    /**
     * Sets the value of the giroGratis property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGiroGratis(Boolean value) {
        this.giroGratis = value;
    }

    /**
     * Gets the value of the hdFieldBeneficiary property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHDFieldBeneficiary() {
        return hdFieldBeneficiary;
    }

    /**
     * Sets the value of the hdFieldBeneficiary property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHDFieldBeneficiary(JAXBElement<String> value) {
        this.hdFieldBeneficiary = value;
    }

    /**
     * Gets the value of the hdFieldExchRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHDFieldExchRate() {
        return hdFieldExchRate;
    }

    /**
     * Sets the value of the hdFieldExchRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHDFieldExchRate(BigDecimal value) {
        this.hdFieldExchRate = value;
    }

    /**
     * Gets the value of the hdFieldSales property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHDFieldSales() {
        return hdFieldSales;
    }

    /**
     * Sets the value of the hdFieldSales property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHDFieldSales(BigDecimal value) {
        this.hdFieldSales = value;
    }

    /**
     * Gets the value of the hdFieldCompliance property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHdFieldCompliance() {
        return hdFieldCompliance;
    }

    /**
     * Sets the value of the hdFieldCompliance property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHdFieldCompliance(JAXBElement<String> value) {
        this.hdFieldCompliance = value;
    }

    /**
     * Gets the value of the hiloAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHiloAmount() {
        return hiloAmount;
    }

    /**
     * Sets the value of the hiloAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHiloAmount(BigDecimal value) {
        this.hiloAmount = value;
    }

    /**
     * Gets the value of the idNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIDNo() {
        return idNo;
    }

    /**
     * Sets the value of the idNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIDNo(JAXBElement<String> value) {
        this.idNo = value;
    }

    /**
     * Gets the value of the informacionAdicionalRemitenteBeneficiario property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInformacionAdicionalRemitenteBeneficiario() {
        return informacionAdicionalRemitenteBeneficiario;
    }

    /**
     * Sets the value of the informacionAdicionalRemitenteBeneficiario property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInformacionAdicionalRemitenteBeneficiario(JAXBElement<String> value) {
        this.informacionAdicionalRemitenteBeneficiario = value;
    }

    /**
     * Gets the value of the isBlocked property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsBlocked() {
        return isBlocked;
    }

    /**
     * Sets the value of the isBlocked property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsBlocked(Boolean value) {
        this.isBlocked = value;
    }

    /**
     * Gets the value of the isSuspended property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSuspended() {
        return isSuspended;
    }

    /**
     * Sets the value of the isSuspended property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSuspended(Boolean value) {
        this.isSuspended = value;
    }

    /**
     * Gets the value of the legalIdBeneficiario property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLegalIdBeneficiario() {
        return legalIdBeneficiario;
    }

    /**
     * Sets the value of the legalIdBeneficiario property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLegalIdBeneficiario(JAXBElement<String> value) {
        this.legalIdBeneficiario = value;
    }

    /**
     * Gets the value of the mtsid property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMTSID() {
        return mtsid;
    }

    /**
     * Sets the value of the mtsid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMTSID(Integer value) {
        this.mtsid = value;
    }

    /**
     * Gets the value of the markUp property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMarkUp() {
        return markUp;
    }

    /**
     * Sets the value of the markUp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMarkUp(Double value) {
        this.markUp = value;
    }

    /**
     * Gets the value of the movilRemitente property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMovilRemitente() {
        return movilRemitente;
    }

    /**
     * Sets the value of the movilRemitente property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMovilRemitente(JAXBElement<String> value) {
        this.movilRemitente = value;
    }

    /**
     * Gets the value of the netAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNetAmount() {
        return netAmount;
    }

    /**
     * Sets the value of the netAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNetAmount(BigDecimal value) {
        this.netAmount = value;
    }

    /**
     * Gets the value of the ofacBeneficiario property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOFACBeneficiario() {
        return ofacBeneficiario;
    }

    /**
     * Sets the value of the ofacBeneficiario property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOFACBeneficiario(Boolean value) {
        this.ofacBeneficiario = value;
    }

    /**
     * Gets the value of the ofacBeneficiaryBirthDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOFACBeneficiaryBirthDate() {
        return ofacBeneficiaryBirthDate;
    }

    /**
     * Sets the value of the ofacBeneficiaryBirthDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOFACBeneficiaryBirthDate(JAXBElement<String> value) {
        this.ofacBeneficiaryBirthDate = value;
    }

    /**
     * Gets the value of the ofacBeneficiaryPlaceOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOFACBeneficiaryPlaceOfBirth() {
        return ofacBeneficiaryPlaceOfBirth;
    }

    /**
     * Sets the value of the ofacBeneficiaryPlaceOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOFACBeneficiaryPlaceOfBirth(JAXBElement<String> value) {
        this.ofacBeneficiaryPlaceOfBirth = value;
    }

    /**
     * Gets the value of the ofacCountryOfNationality property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOFACCountryOfNationality() {
        return ofacCountryOfNationality;
    }

    /**
     * Sets the value of the ofacCountryOfNationality property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOFACCountryOfNationality(JAXBElement<String> value) {
        this.ofacCountryOfNationality = value;
    }

    /**
     * Gets the value of the ofacPlaceOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOFACPlaceOfBirth() {
        return ofacPlaceOfBirth;
    }

    /**
     * Sets the value of the ofacPlaceOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOFACPlaceOfBirth(JAXBElement<String> value) {
        this.ofacPlaceOfBirth = value;
    }

    /**
     * Gets the value of the ofacRemitente property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOFACRemitente() {
        return ofacRemitente;
    }

    /**
     * Sets the value of the ofacRemitente property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOFACRemitente(Boolean value) {
        this.ofacRemitente = value;
    }

    /**
     * Gets the value of the ofacRemitenteObliga property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOFACRemitenteObliga() {
        return ofacRemitenteObliga;
    }

    /**
     * Sets the value of the ofacRemitenteObliga property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOFACRemitenteObliga(JAXBElement<String> value) {
        this.ofacRemitenteObliga = value;
    }

    /**
     * Gets the value of the ofacSenderBirthDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOFACSenderBirthDate() {
        return ofacSenderBirthDate;
    }

    /**
     * Sets the value of the ofacSenderBirthDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOFACSenderBirthDate(JAXBElement<String> value) {
        this.ofacSenderBirthDate = value;
    }

    /**
     * Gets the value of the officeCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOfficeCode() {
        return officeCode;
    }

    /**
     * Sets the value of the officeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOfficeCode(JAXBElement<String> value) {
        this.officeCode = value;
    }

    /**
     * Gets the value of the officeNombre property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOfficeNombre() {
        return officeNombre;
    }

    /**
     * Sets the value of the officeNombre property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOfficeNombre(JAXBElement<String> value) {
        this.officeNombre = value;
    }

    /**
     * Gets the value of the originalCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOriginalCurrency() {
        return originalCurrency;
    }

    /**
     * Sets the value of the originalCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOriginalCurrency(JAXBElement<String> value) {
        this.originalCurrency = value;
    }

    /**
     * Gets the value of the originalPaymentMethod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOriginalPaymentMethod() {
        return originalPaymentMethod;
    }

    /**
     * Sets the value of the originalPaymentMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOriginalPaymentMethod(JAXBElement<String> value) {
        this.originalPaymentMethod = value;
    }

    /**
     * Gets the value of the others property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOthers() {
        return others;
    }

    /**
     * Sets the value of the others property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOthers(BigDecimal value) {
        this.others = value;
    }

    /**
     * Gets the value of the overLimitMessage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOverLimitMessage() {
        return overLimitMessage;
    }

    /**
     * Sets the value of the overLimitMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOverLimitMessage(JAXBElement<String> value) {
        this.overLimitMessage = value;
    }

    /**
     * Gets the value of the pepBeneficiarioMessage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPEPBeneficiarioMessage() {
        return pepBeneficiarioMessage;
    }

    /**
     * Sets the value of the pepBeneficiarioMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPEPBeneficiarioMessage(JAXBElement<String> value) {
        this.pepBeneficiarioMessage = value;
    }

    /**
     * Gets the value of the pepBeneficiarioScore property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPEPBeneficiarioScore() {
        return pepBeneficiarioScore;
    }

    /**
     * Sets the value of the pepBeneficiarioScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPEPBeneficiarioScore(BigDecimal value) {
        this.pepBeneficiarioScore = value;
    }

    /**
     * Gets the value of the pepRemitenteMessage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPEPRemitenteMessage() {
        return pepRemitenteMessage;
    }

    /**
     * Sets the value of the pepRemitenteMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPEPRemitenteMessage(JAXBElement<String> value) {
        this.pepRemitenteMessage = value;
    }

    /**
     * Gets the value of the pepRemitenteScore property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPEPRemitenteScore() {
        return pepRemitenteScore;
    }

    /**
     * Sets the value of the pepRemitenteScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPEPRemitenteScore(BigDecimal value) {
        this.pepRemitenteScore = value;
    }

    /**
     * Gets the value of the poBofacBen property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPOBofacBen() {
        return poBofacBen;
    }

    /**
     * Sets the value of the poBofacBen property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPOBofacBen(JAXBElement<String> value) {
        this.poBofacBen = value;
    }

    /**
     * Gets the value of the paisBeneficiario property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPaisBeneficiario() {
        return paisBeneficiario;
    }

    /**
     * Sets the value of the paisBeneficiario property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPaisBeneficiario(Integer value) {
        this.paisBeneficiario = value;
    }

    /**
     * Gets the value of the paisBeneficiarioNombre property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPaisBeneficiarioNombre() {
        return paisBeneficiarioNombre;
    }

    /**
     * Sets the value of the paisBeneficiarioNombre property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPaisBeneficiarioNombre(JAXBElement<String> value) {
        this.paisBeneficiarioNombre = value;
    }

    /**
     * Gets the value of the promotion property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPromotion() {
        return promotion;
    }

    /**
     * Sets the value of the promotion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPromotion(Integer value) {
        this.promotion = value;
    }

    /**
     * Gets the value of the puntosRemitenteIdCard property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPuntosRemitenteIdCard() {
        return puntosRemitenteIdCard;
    }

    /**
     * Sets the value of the puntosRemitenteIdCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPuntosRemitenteIdCard(JAXBElement<String> value) {
        this.puntosRemitenteIdCard = value;
    }

    /**
     * Gets the value of the realExchangeRate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRealExchangeRate() {
        return realExchangeRate;
    }

    /**
     * Sets the value of the realExchangeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRealExchangeRate(Double value) {
        this.realExchangeRate = value;
    }

    /**
     * Gets the value of the relationshipWithSenders property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRelationshipWithSenders() {
        return relationshipWithSenders;
    }

    /**
     * Sets the value of the relationshipWithSenders property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRelationshipWithSenders(JAXBElement<String> value) {
        this.relationshipWithSenders = value;
    }

    /**
     * Gets the value of the remitenteApellido property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRemitenteApellido() {
        return remitenteApellido;
    }

    /**
     * Sets the value of the remitenteApellido property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRemitenteApellido(JAXBElement<String> value) {
        this.remitenteApellido = value;
    }

    /**
     * Gets the value of the remitenteEmail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRemitenteEmail() {
        return remitenteEmail;
    }

    /**
     * Sets the value of the remitenteEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRemitenteEmail(JAXBElement<String> value) {
        this.remitenteEmail = value;
    }

    /**
     * Gets the value of the remitenteEstado property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRemitenteEstado() {
        return remitenteEstado;
    }

    /**
     * Sets the value of the remitenteEstado property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRemitenteEstado(JAXBElement<String> value) {
        this.remitenteEstado = value;
    }

    /**
     * Gets the value of the remitenteNombre property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRemitenteNombre() {
        return remitenteNombre;
    }

    /**
     * Sets the value of the remitenteNombre property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRemitenteNombre(JAXBElement<String> value) {
        this.remitenteNombre = value;
    }

    /**
     * Gets the value of the remitentePais property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRemitentePais() {
        return remitentePais;
    }

    /**
     * Sets the value of the remitentePais property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRemitentePais(JAXBElement<String> value) {
        this.remitentePais = value;
    }

    /**
     * Gets the value of the remitentePaisNombre property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRemitentePaisNombre() {
        return remitentePaisNombre;
    }

    /**
     * Sets the value of the remitentePaisNombre property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRemitentePaisNombre(JAXBElement<String> value) {
        this.remitentePaisNombre = value;
    }

    /**
     * Gets the value of the remitenteTelefono property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRemitenteTelefono() {
        return remitenteTelefono;
    }

    /**
     * Sets the value of the remitenteTelefono property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRemitenteTelefono(JAXBElement<String> value) {
        this.remitenteTelefono = value;
    }

    /**
     * Gets the value of the remitenteZip property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRemitenteZip() {
        return remitenteZip;
    }

    /**
     * Sets the value of the remitenteZip property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRemitenteZip(JAXBElement<String> value) {
        this.remitenteZip = value;
    }

    /**
     * Gets the value of the routingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRoutingNumber() {
        return routingNumber;
    }

    /**
     * Sets the value of the routingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRoutingNumber(JAXBElement<String> value) {
        this.routingNumber = value;
    }

    /**
     * Gets the value of the saveSenderReceiver property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSaveSenderReceiver() {
        return saveSenderReceiver;
    }

    /**
     * Sets the value of the saveSenderReceiver property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSaveSenderReceiver(Boolean value) {
        this.saveSenderReceiver = value;
    }

    /**
     * Gets the value of the senderAchAccount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSenderAchAccount() {
        return senderAchAccount;
    }

    /**
     * Sets the value of the senderAchAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSenderAchAccount(JAXBElement<String> value) {
        this.senderAchAccount = value;
    }

    /**
     * Gets the value of the senderAchRouting property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSenderAchRouting() {
        return senderAchRouting;
    }

    /**
     * Sets the value of the senderAchRouting property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSenderAchRouting(JAXBElement<String> value) {
        this.senderAchRouting = value;
    }

    /**
     * Gets the value of the senderAchType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSenderAchType() {
        return senderAchType;
    }

    /**
     * Sets the value of the senderAchType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSenderAchType(JAXBElement<String> value) {
        this.senderAchType = value;
    }

    /**
     * Gets the value of the senderBirthDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getSenderBirthDate() {
        return senderBirthDate;
    }

    /**
     * Sets the value of the senderBirthDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setSenderBirthDate(JAXBElement<XMLGregorianCalendar> value) {
        this.senderBirthDate = value;
    }

    /**
     * Gets the value of the senderID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSenderID() {
        return senderID;
    }

    /**
     * Sets the value of the senderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSenderID(Integer value) {
        this.senderID = value;
    }

    /**
     * Gets the value of the servicioCodigo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getServicioCodigo() {
        return servicioCodigo;
    }

    /**
     * Sets the value of the servicioCodigo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setServicioCodigo(JAXBElement<String> value) {
        this.servicioCodigo = value;
    }

    /**
     * Gets the value of the servicioId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getServicioId() {
        return servicioId;
    }

    /**
     * Sets the value of the servicioId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setServicioId(Integer value) {
        this.servicioId = value;
    }

    /**
     * Gets the value of the sucursalBanco property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSucursalBanco() {
        return sucursalBanco;
    }

    /**
     * Sets the value of the sucursalBanco property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSucursalBanco(JAXBElement<String> value) {
        this.sucursalBanco = value;
    }

    /**
     * Gets the value of the suspendMessage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSuspendMessage() {
        return suspendMessage;
    }

    /**
     * Sets the value of the suspendMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSuspendMessage(JAXBElement<String> value) {
        this.suspendMessage = value;
    }

    /**
     * Gets the value of the suspendUserType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSuspendUserType() {
        return suspendUserType;
    }

    /**
     * Sets the value of the suspendUserType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSuspendUserType(JAXBElement<String> value) {
        this.suspendUserType = value;
    }

    /**
     * Gets the value of the tasaError property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTasaError() {
        return tasaError;
    }

    /**
     * Sets the value of the tasaError property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTasaError(JAXBElement<String> value) {
        this.tasaError = value;
    }

    /**
     * Gets the value of the telefonoBeneficiario property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTelefonoBeneficiario() {
        return telefonoBeneficiario;
    }

    /**
     * Sets the value of the telefonoBeneficiario property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTelefonoBeneficiario(JAXBElement<String> value) {
        this.telefonoBeneficiario = value;
    }

    /**
     * Gets the value of the tempCompliance property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTempCompliance() {
        return tempCompliance;
    }

    /**
     * Sets the value of the tempCompliance property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTempCompliance(JAXBElement<String> value) {
        this.tempCompliance = value;
    }

    /**
     * Gets the value of the tempGiroRepetido property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTempGiroRepetido() {
        return tempGiroRepetido;
    }

    /**
     * Sets the value of the tempGiroRepetido property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTempGiroRepetido(JAXBElement<String> value) {
        this.tempGiroRepetido = value;
    }

    /**
     * Gets the value of the thirdPartyReceipt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getThirdPartyReceipt() {
        return thirdPartyReceipt;
    }

    /**
     * Sets the value of the thirdPartyReceipt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setThirdPartyReceipt(JAXBElement<String> value) {
        this.thirdPartyReceipt = value;
    }

    /**
     * Gets the value of the tipoCuentaCodigo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipoCuentaCodigo() {
        return tipoCuentaCodigo;
    }

    /**
     * Sets the value of the tipoCuentaCodigo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipoCuentaCodigo(JAXBElement<String> value) {
        this.tipoCuentaCodigo = value;
    }

    /**
     * Gets the value of the totalAditionalCharges property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalAditionalCharges() {
        return totalAditionalCharges;
    }

    /**
     * Sets the value of the totalAditionalCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalAditionalCharges(BigDecimal value) {
        this.totalAditionalCharges = value;
    }

    /**
     * Gets the value of the totalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    /**
     * Sets the value of the totalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalAmount(BigDecimal value) {
        this.totalAmount = value;
    }

    /**
     * Gets the value of the newTransactionTipoCalculo property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNewTransactionTipoCalculo() {
        return newTransactionTipoCalculo;
    }

    /**
     * Sets the value of the newTransactionTipoCalculo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNewTransactionTipoCalculo(Integer value) {
        this.newTransactionTipoCalculo = value;
    }

}
