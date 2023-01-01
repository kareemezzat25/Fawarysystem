package com.sw.paymentservices.services;
import java.util.ArrayList;
import java.util.Vector;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ServiceController {
    private ServiceData obj=new ServiceData();
    private Mobilerecharge mobile=new Mobilerecharge();
    private InternetPayment internet=new InternetPayment();
    private Donations don;

    Vector<String> ser= new Vector<String>();
    @GetMapping(value = "/SearchForService")
    public ResponseEntity<Vector<String>> searchForService(){
        obj.service();
        ser=obj.getServices();
        return ResponseEntity.ok(ser);
    }

    @PostMapping(value = "/addinginternetProvider")

    public  ResponseEntity<String>  addinginternetProvider(@RequestParam("name") String name){
        internet.setProvider(name);
        return ResponseEntity.status(HttpStatus.CREATED).body("add new provider for internet done");

    }
    @PostMapping(value = "/addingmobileProvider")
    public ResponseEntity<String> addingmobileProvider(@RequestParam("name") String name){
        mobile.setProvider(name);
        return ResponseEntity.status(HttpStatus.CREATED).body("add new provider for mobile done");
    }

    @GetMapping(value = "/SearchForServiceusingname/donations")
    public ResponseEntity< ArrayList >getdonationtions(){
        return ResponseEntity.ok(don.getDonations());
    }
    @GetMapping(value = "/SearchForServiceusingname/MobileRecharge")
    public ResponseEntity<Vector > getmobile(){
        return ResponseEntity.ok(mobile.getProviders());
    }
    @GetMapping(value = "/SearchForServiceusingname/Internet")
    public ResponseEntity<Vector > getinternet(){

        return ResponseEntity.ok( internet.getProviders());
    }
    @GetMapping(value = "/SearchForServiceusingname/Landline")
    public ResponseEntity<Vector> getlandline(){

        return ResponseEntity.ok( obj.getLandline());
    }

}
