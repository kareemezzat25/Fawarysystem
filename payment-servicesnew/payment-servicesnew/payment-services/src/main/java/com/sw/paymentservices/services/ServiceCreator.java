package com.sw.paymentservices.services;

import java.util.Scanner;

public class ServiceCreator {
    public Service createService(Services serviceType,String name) {
        Service service = null;

        switch (serviceType) {
            case MOBILE_RECHARGE:{
                service = new Mobilerecharge();
            }

            case INTERNET_PAYMENT:{
                service = new InternetPayment();
            }

            case LANDLINE:{
                service = new Landline();
            }

            case DONATIONS:{

                if(name=="h"){
                    Donations h=new CancerHospital();
                    service = h;
                }
                if(name=="S"){
                    Donations h=new Schooles();
                    service = h;
                }
                if(name=="N"){
                    Donations h=new NGOs();
                    service = h;
                }
            }
        }

        return service;
    }

}
