package com.lftechnology.msb.sdk.exception;

import com.lftechnology.msb.moneytun.exception.WhiteWingBadRequestException;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class WhiteWingBadRequestExceptionMapper implements ExceptionMapper<WhiteWingBadRequestException> {

    @Override
    public Response toResponse(WhiteWingBadRequestException exception) {
        return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(new Object()).type(MediaType.APPLICATION_JSON).build();
    }
}
