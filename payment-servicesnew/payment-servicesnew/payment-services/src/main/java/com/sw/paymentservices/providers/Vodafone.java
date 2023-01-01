package com.sw.paymentservices.providers;

public class Vodafone implements Provider{
    public String number;
    @Override
public boolean checknumber(String number) {

    if(number.length()==11&&number.charAt(0)=='0'&&number.charAt(1)=='1'&&number.charAt(2)=='0')
    {
        return true;
    }
    else
        return false;
}
}

