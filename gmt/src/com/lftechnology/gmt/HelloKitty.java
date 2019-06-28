package com.lftechnology.gmt;

import org.apache.commons.codec.binary.Hex;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HelloKitty {

    public static void main(String[] args) throws Exception {

        System.setProperty("com.sun.xml.ws.transport.http.client.HttpTransportPipe.dump", "true");
        System.setProperty("com.sun.xml.internal.ws.transport.http.client.HttpTransportPipe.dump", "true");
        System.setProperty("com.sun.xml.ws.transport.http.HttpAdapter.dump", "true");
        System.setProperty("com.sun.xml.internal.ws.transport.http.HttpAdapter.dump", "true");
        System.setProperty("com.sun.xml.internal.ws.transport.http.HttpAdapter.dumpTreshold", "999999");
        System.setProperty("com.sun.xml.ws.transport.http.HttpAdapter.dumpTreshold", "999999");

        Service1 service1 = new Service1();
        IService1 iService1 = service1.getBasicHttpBindingIService1();

        /**
         * SenderName String 40 Sender name M
         * SenderLastName String 40 Sender last name M
         * SenderAddress String 50 Sender’s billing address Billing address M
         * SenderAddressStreet String 50 Sender’s apartament number Billing address O
         * SenderZip String 10 Sender postal code Billing address M
         * SenderCity String 50 City of the transaction's origin Billing address M
         * SenderCountryCode String 2 String 2 ISO 3166-1 alpha 2: United
         * States = US
         * ISO 3166-2: Alaska = AL M
         * SenderState Country code of the transaction's
         * origin
         * State of the transaction's origin
         * SenderResidenceAddress String 50 Sender’s residential address If same as billing address, set M
         * same value on both fields
         * M
         * SenderResidenceAddressExtra String 25
         * SenderResidenceZip String 10 Sender’s apartment number or
         * additional address information
         * Sender’s residential zip code
         * SenderResidenceCity String 50 Sender’s city of residence
         * Notes Req.
         * If not provided, new sender
         * might be created O
         * M
         * M
         * M
         * SenderResidenceCountryCode String 2 Sender’s country of residence
         * ISO 3166-1 alpha 2: United
         * States = US
         * ISO 3166-2: Alaska = AL,
         * Florida = FL, etc.
         * M
         * SenderResidenceState String 2 Sender’s state of residence SenderPhone String 50 Sender telephone number M
         * SenderEmail String 50 Sender email M
         * SenderIP String 50 Sender’s public IP M
         */

        System.out.println(encode("5g18qffxkubjl6d","{\"delta\": {\"users\": [2217190288]}, \"list_folder\": {\"accounts\": [\"dbid:AACiKjbFeNirVcJkzIf0118v0CZRVCVIqH8\"]}}"));

        System.out.println(String.format("%s", "abc"));

        ObjectFactory objectFactory = new ObjectFactory();

        WsSender wsSender = new WsSender();
        wsSender.setSenderName(objectFactory.createWsSenderSenderName("Pawal"));
        wsSender.setSenderLastName(objectFactory.createWsSenderSenderLastName("Adhikari"));
        wsSender.setSenderAddressStreet(objectFactory.createWsSenderSenderAddressStreet("121 Street"));
        wsSender.setSenderAddress(objectFactory.createWsSenderSenderAddress("New York"));
        wsSender.setSenderZip(objectFactory.createWsSenderSenderZip("12345"));
        wsSender.setSenderCity(objectFactory.createWsSenderSenderCity("Dallas"));
        wsSender.setSenderCountryCode(objectFactory.createWsSenderSenderCountryCode("US"));
        wsSender.setSenderState(objectFactory.createWsSenderSenderState("US-AL"));
        wsSender.setSenderResidenceAddress(objectFactory.createWsSenderSenderResidenceAddress("Hello"));
        wsSender.setSenderResidenceAddressExtra(objectFactory.createWsSenderSenderResidenceAddressExtra("Extra"));
        wsSender.setSenderResidenceZip(objectFactory.createWsSenderSenderResidenceZip("12345"));
        wsSender.setSenderResidenceCity(objectFactory.createWsSenderSenderResidenceCity("Dallas"));
        wsSender.setSenderResidenceCountryCode(objectFactory.createWsSenderSenderResidenceCountryCode("US"));
        wsSender.setSenderEmail(objectFactory.createWsSenderSenderEmail("adhpawal@gmail.com"));
        wsSender.setSenderIP(objectFactory.createWsSenderSenderIP("35.198.0.64"));
        wsSender.setSenderPhone(objectFactory.createWsSenderSenderPhone("1234567890"));
        wsSender.setSenderTrackingNumber(objectFactory.createWsSenderSenderTrackingNumber("HJOLA1231"));
        wsSender.setSenderResidenceState(objectFactory.createWsSenderSenderResidenceState("US-AL"));
        wsSender.setSenderGender(objectFactory.createWsSenderSenderGender("Male"));
        wsSender.setSenderMaritalStatus(objectFactory.createWsSenderSenderMaritalStatus("Single"));
        wsSender.setSenderCurrencyCode(objectFactory.createWsSenderSenderCurrencyCode("USD"));
        wsSender.setSenderIdType(objectFactory.createWsSenderSenderIdType("DRIVERS LICENSE"));
        wsSender.setSenderIdNumber(objectFactory.createWsSenderSenderIdNumber("12312312312"));

        XMLGregorianCalendar gDateFormatted1 =
                DatatypeFactory.newInstance().newXMLGregorianCalendar("1980-03-23T10:20:15");
        wsSender.setSenderBirthDate(objectFactory.createWsSenderSenderBirthDate(DatatypeFactory.newInstance().newXMLGregorianCalendar("1990-12-12")));
        wsSender.setSenderOccupation(objectFactory.createWsSenderSenderOccupation("Engineer"));



        /**
         * ReceiverID String 10 GMT’s identifier for the receiver ReceiverName String 40 Beneficiary name If not provided, new
         * O
         * receiver might be created
         * M
         * ReceiverLastName String 40 Beneficiary last name M
         * ReceiverAddress String 50 Beneficiary address C
         * ReceiverZip String 10 Beneficiary postal code C
         * ReceiverCountry String 50 ReceiverPhone String 50 Country code of the transaction's
         * destiny
         * Beneficiary telephone number ReceiverMobile String 15 Beneficiary mobile number C
         * ReceiverEmail String 50 Beneficiary email O
         * ReceiverIdNumber String 20 C
         * ReceiverIdType String 40 Identification number of Beneficiary
         * ID
         * Identification type of Beneficiary ID
         * ReceiverIdIssuer String 50 O
         * ReceiverBirthDate DateTime State or country issuer of the ID
         * CALIFORNIA, FLORIDA,
         * (if USA, send the state; for other
         * MEXICO, COLOMBIA... etc
         * places send the country)
         * Receiver’s date of birth (MM/dd/yyyy) 12/31/1980
         * ISO 3166-1 alpha 2: Mexico M
         * = MX
         * C
         * C
         * 8
         * CAPI Specification Document
         * ReceiverOccupation
         * String
         * Golden Money Transfer, Inc.
         * 50 Beneficiary's ocupation O
         * ReceiverCountryNationallity String 2 Receiver's nationality country P
         * ReceiverGender String 50 Beneficiary's gender ReceiverMoneyOrigin String 100 Beneficiary's money origi ReceiverMaritalStatus String 50 Beneficiary's marital status ReceiverCompany String 50 Name of the beneficiary employer ReceiverCurrency String 50 ReceiverPOB String 50 The code, which identifies the
         * destination currency
         * Place of birth of the receiver
         * Male, Female
         * O
         * O
         * Single, Married, Divorced, O
         * Widowed
         * O
         * ISO 4217: US Dollar = USD, O
         * Mexican Peso = MXN....etc
         * Necessary only if there’s O
         */

        WsReceiver wsReceiver = new WsReceiver();
        wsReceiver.setReceiverName(objectFactory.createWsReceiverReceiverName("Hello"));
        wsReceiver.setReceiverLastName(objectFactory.createWsReceiverReceiverLastName("Hi"));
        wsReceiver.setReceiverAddress(objectFactory.createWsReceiverReceiverAddress("Kolkata"));
        wsReceiver.setReceiverZip(objectFactory.createWsReceiverReceiverZip("456001"));
        wsReceiver.setReceiverCountry(objectFactory.createWsReceiverReceiverCountry("IN"));
        wsReceiver.setReceiverPhone(objectFactory.createWsReceiverReceiverPhone("1234567890"));
        wsReceiver.setReceiverCountryNationallity(objectFactory.createWsReceiverReceiverCountryNationallity("Indian"));


        WsTransferInfo wsTransferInfo = new WsTransferInfo();

        wsTransferInfo.setCorrespondentCode(objectFactory.createWsTransferInfoCorrespondentCode("RMT"));
        wsTransferInfo.setOfficeCode(objectFactory.createWsTransferInfoOfficeCode("1668"));
        wsTransferInfo.setServicioCodigo(objectFactory.createWsTransferInfoServicioCodigo("BD"));
        wsTransferInfo.setDestinationCurrency(objectFactory.createWsTransferInfoDestinationCurrency("INR"));

        wsTransferInfo.setExchangeRate(50.10);
        wsTransferInfo.setMTSID(1);
        wsTransferInfo.setOriginalPaymentMethod(objectFactory.createWsTransferInfoOriginalPaymentMethod("ACH"));
        wsTransferInfo.setOriginalCurrency(objectFactory.createWsTransferInfoOriginalCurrency("USD"));
        wsTransferInfo.setNetAmount(new BigDecimal(100.00));
        wsTransferInfo.setAmountToReceive(new BigDecimal(5010.00));
        wsTransferInfo.setFee(new BigDecimal(1));
        wsTransferInfo.setBeneficiarioCiudad(objectFactory.createWsTransferInfoBeneficiarioCiudad("Hariyana"));
        wsTransferInfo.setBeneficiarioEstado(objectFactory.createWsTransferInfoBeneficiarioEstado("Maharastha"));
        wsTransferInfo.setBankAccount(objectFactory.createWsTransferInfoBankAccount("1231231231231"));
        wsTransferInfo.setBancosNombre(objectFactory.createWsTransferInfoBancosNombre("United Bank of India"));
        wsTransferInfo.setBankCode(objectFactory.createWsTransferInfoBankCode("UTBI0"));
        wsTransferInfo.setTipoCuentaCodigo(objectFactory.createWsTransferInfoTipoCuentaCodigo("ACN"));
        wsTransferInfo.setSucursalBanco(objectFactory.createWsTransferInfoSucursalBanco("Haryana"));

/*
*/

    /*    */
    /*    iService1.ofacVerification("MACH", "machnet_user", "ODlOMWxLUTdScQ==", "Pawal", "Adhikari",);*/
/*
*/

    /*    iService1.complianceCheck("MACH", "machnet_user", "ODlOMWxLUTdScQ==", wsSender, wsReceiver, wsTransferInfo);*/


        iService1.getExchangeRates("MACH", "machnet_user", "ODlOMWxLUTdScQ==","INR");
     //ArrayOfwsSelectPayersByCountryCodeResult aspbccr =iService1.payersConsult("MACH", "machnet_user", "ODlOMWxLUTdScQ==", "IN", "");


      /*  aspbccr.getWsSelectPayersByCountryCodeResult().forEach(i->{
            i.getPayerBanks().getValue().wsSelectPayerBanksResult.forEach(jhel->{
                System.out.println(jhel.getBankName().getValue());
            });
        });*/
    }

    public static XMLGregorianCalendar getXmlDate(Date date) throws DatatypeConfigurationException {
        return DatatypeFactory.newInstance().newXMLGregorianCalendar(new SimpleDateFormat("yyyy-MM-dd").format(date));
    }


}
