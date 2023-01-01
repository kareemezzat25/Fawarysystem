package com.sw.paymentservices.discount;

import com.sw.paymentservices.services.Services;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Vector;

@RestController
public class DiscountController {

    static DiscountController discountController = null;
    DiscountOperations discountOperations=new DiscountOperations();

    // Singleton Design Pattern Method
    public static DiscountController getInstance() {
        if (discountController == null) {
            discountController = new DiscountController();
        }
        return discountController;
    }


    @PostMapping(value = "/service/setdiscount")
    public ResponseEntity<String> setDiscountPercentage(@RequestParam("service") String service, @RequestParam("discountprecentage") int discountPercentage) {
        discountOperations.addDiscount(service,discountPercentage);
        // default price
        return ResponseEntity.ok("The amount after discount : " + discountOperations.calcDiscount(service, discountPercentage));
    }

    @DeleteMapping(value = "/service/discount/remove")
    public ResponseEntity<String> removeFromDiscounted(@RequestParam("service") String service) {
        //discountedServices.remove(service);
        return ResponseEntity.ok(discountOperations.removeDiscount(service));
    }
    // Getters Methods
    @GetMapping(value = "/discountedservices")
    public ResponseEntity<HashMap> getDiscountedServices() {
        return ResponseEntity.ok(discountOperations.getDiscountedServices());
    }
    @GetMapping(value="/service/discount")
    public int getDiscountPercentage(@RequestParam("service") String service) {
        return discountOperations.getdiscountservice(service);
    }

    @GetMapping(value="/service/checkdiscount")
    public boolean isDiscounted(@RequestParam("service")String service) {
        return discountOperations.isDiscounted(service);
    }
}

