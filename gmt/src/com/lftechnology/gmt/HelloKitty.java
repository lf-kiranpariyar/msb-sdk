package com.lftechnology.gmt;

public class HelloKitty {

    public static void main(String[] args) {

        System.setProperty("com.sun.xml.ws.transport.http.client.HttpTransportPipe.dump", "true");
        System.setProperty("com.sun.xml.internal.ws.transport.http.client.HttpTransportPipe.dump", "true");
        System.setProperty("com.sun.xml.ws.transport.http.HttpAdapter.dump", "true");
        System.setProperty("com.sun.xml.internal.ws.transport.http.HttpAdapter.dump", "true");
        Service1 service1 = new Service1();
        IService1 iService1 = service1.getBasicHttpBindingIService1();

        ArrayOfwsSelectPayersByCountryCodeResult aspbccr =iService1.payersConsult("MACH", "machnet_user", "ODlOMWxLUTdScQ==", "US", "");


        aspbccr.getWsSelectPayersByCountryCodeResult().forEach(i->{
            System.out.println(i.getPayerName().getValue());
        });
    }
}
