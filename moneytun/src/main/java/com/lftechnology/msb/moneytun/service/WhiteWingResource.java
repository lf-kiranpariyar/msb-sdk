package com.lftechnology.msb.moneytun.service;

import com.lftechnology.msb.moneytun.dto.*;

import javax.ws.rs.*;

@Path("/")
@Consumes("application/json")
public interface WhiteWingResource {

    //TODO : Probably We should Break This Service Into Multiple Interface.

    @GET
    @Produces("application/json")
    @Path("countrylist")
    ListResponse<Country> getCountry();

    @GET
    @Produces("application/json")
    @Path("deliverymethodlist")
    ListResponse<DeliveryMethod> getDeliveryMethod();

    @GET
    @Produces("application/json")
    @Path("token")
    Token getSecretToken(@QueryParam("id") String accessToken);

    @POST
    @Produces("application/json")
    @Path("statelist")
    ListResponse<State> getState(Country country);

    @POST
    @Produces("application/json")
    @Path("city")
    ListResponse<City> getState(City city);

    @POST
    @Produces("application/json")
    @Path("city")
    ListResponse<City> getCity(City city);

    @GET
    @Produces("application/json")
    @Path("currencylist")
    ListResponse<Currency> getState(Currency currency);

    @GET
    @Produces("application/json")
    @Path("payerlist")
    ListResponse<Payer> getPayer(@QueryParam("isocode") String countryISOCode, Payer payer);

    @GET
    @Produces("application/json")
    @Path("payerlist")
    TransactionResponse getTransactionDetails(@HeaderParam("TransferNumber") String referenceNumber);


    @POST
    @Produces("application/json")
    @Path("transaction")
    TransactionResponse createTransaction(@QueryParam("id") String action, Transaction transaction);

    @GET
    @Produces("application/json")
    @Path("transaction")
    TransactionResponse getTransactionDetail(@HeaderParam("TransferNumber") String referenceNumber,@QueryParam("id") String action);



}
