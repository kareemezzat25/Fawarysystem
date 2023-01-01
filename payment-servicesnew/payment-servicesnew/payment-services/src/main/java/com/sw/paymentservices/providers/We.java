package com.sw.paymentservices.providers;

public class We implements Provider{
    @Override
    public boolean checknumber(String number) {

        if(number.length()==11&&number.charAt(0)=='0'&&number.charAt(1)=='1'&&number.charAt(2)=='5')
        {
            return true;
        }
        else
            return false;
    }
}

