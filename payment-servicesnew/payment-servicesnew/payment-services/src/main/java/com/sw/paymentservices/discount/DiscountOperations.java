package com.sw.paymentservices.discount;

import org.springframework.stereotype.Service;

import java.util.HashMap;
@Service

public class DiscountOperations {
    Discount discount=new Discount();
    public void addDiscount(String serviceType , int discountPercentage)
    {
        discount.serviceDiscount.put(serviceType,discountPercentage);

    }
    public double calcDiscount (String serviceType , int discountPercentage) {
        discount.amount = discount.servicePrice.get(serviceType)-(discount.servicePrice.get(serviceType) * discountPercentage) / 100;
        return discount.amount;
    }
    public String removeDiscount(String service) {
        if (discount.serviceDiscount.containsKey(service)) {
            discount.serviceDiscount.remove(service);
            return "The discount is removed";
        }
        else
        {
            return "The service doesn't have discount";
        }
    }
    public HashMap getDiscountedServices()
    {
        return discount.serviceDiscount;
    }
    public boolean isDiscounted(String service)
    {
        return discount.serviceDiscount.containsKey(service);

    }

    public int getdiscountservice(String service)
    {
        return discount.serviceDiscount.get(service);
    }


}
