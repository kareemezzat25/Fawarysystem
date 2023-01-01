package com.sw.paymentservices.payment;

import com.sw.paymentservices.providers.*;
import com.sw.paymentservices.services.*;
import com.sw.paymentservices.transaction.Transaction;
import com.sw.paymentservices.userAccount.Authentication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@RestController
public class PaymentController {
	Mobilerecharge m =new Mobilerecharge();
    Donations d;
    InternetPayment i=new InternetPayment();
    Transaction T=new Transaction();
    static int id=1;
    Landline l=new Landline();
    Authentication User=new Authentication();
    @GetMapping(value = "/consumeFromwallet")
    public ResponseEntity<String> consumeFromwallet(@RequestParam("amount") double amount, @RequestParam("Accnum") String Accnum, @RequestParam("nameservice") String nameservice){
        CreditCardPayment py=new CreditCardPayment(amount,Accnum);
        T.listTransaction.add(new Transaction(User.getUserName(), id,amount,nameservice,"wallet"));
        id++;
        return ResponseEntity.ok(py.payfromWallet(amount)+"\n"+py.paymentDetails());
    }
    @GetMapping(value = "/Mobilerecharge/Cash")
    public ResponseEntity<String> getMobilerechargeCash( @RequestParam("amount") double amount, @RequestParam("provider")String provider, @RequestParam("num")String num){
        if(Objects.equals(provider, "Vodafone")){
            Provider p=new Vodafone();

            if(p.checknumber(num)){
                m.setPayment(m.setMobilerechargeByCash());
                T.listTransaction.add(new Transaction(User.getUserName(),id,amount,"mobile recharge", "cash"));
                id++;
                return ResponseEntity.ok(m.Pay(amount,m.setMobilerechargeByCash()));
            }
        }
        else if(Objects.equals(provider, "We")){
            Provider p=new We();
            if(p.checknumber(num)){  m.setPayment(m.setMobilerechargeByCash());
                T.listTransaction.add(new Transaction(User.getUserName(),id,amount,"mobile recharge", "cash"));
                id++;
                return ResponseEntity.ok(m.Pay(amount,m.setMobilerechargeByCash()));}

        }
        else if(Objects.equals(provider, "Etisalat")){
            Provider p=new Etisalat();
            if(p.checknumber(num)){  m.setPayment(m.setMobilerechargeByCash());
                T.listTransaction.add(new Transaction(User.getUserName(),id,amount,"mobile recharge", "cash"));
                id++;
                return ResponseEntity.ok(m.Pay(amount,m.setMobilerechargeByCash()));}

        }
        else if(Objects.equals(provider, "Orange")){
            Provider p=new Orange();
            if(p.checknumber(num)){
                m.setPayment(m.setMobilerechargeByCash());
                T.listTransaction.add(new Transaction(User.getUserName(),id,amount,"mobile recharge", "cash"));
                id++;
                return ResponseEntity.ok(m.Pay(amount,m.setMobilerechargeByCash()));}

        }
        return ResponseEntity.ok("invalid number");


    }
    @GetMapping(value = "/Mobilerecharge")
    public ResponseEntity<String> getMobilerechargeCredit(@RequestParam("Accnum") String Accnum , @RequestParam("amount") double amount, @RequestParam("provider")String provider, @RequestParam("num")String num){
        if(Objects.equals(provider, "Vodafone")){
            Provider p=new Vodafone();

            if(p.checknumber(num)){
                m.setPayment(m.setMobilerechargeByCard(Accnum,amount));
                T.listTransaction.add(new Transaction(User.getUserName(),id,amount,"mobile recharge","creditcard"));
                id++;
                return ResponseEntity.ok(m.Pay(amount,m.setMobilerechargeByCard(Accnum,amount)));
            }
        }
        else if(Objects.equals(provider, "We")){
            Provider p=new We();
            if(p.checknumber(num)){ m.setPayment(m.setMobilerechargeByCard(Accnum,amount));
                T.listTransaction.add(new Transaction(User.getUserName(),id,amount,"mobile recharge","creditcard"));
                id++;
                return ResponseEntity.ok(m.Pay(amount,m.setMobilerechargeByCard(Accnum,amount)));}

        }
        else if(Objects.equals(provider, "Etisalat")){
            Provider p=new Etisalat();
            if(p.checknumber(num)){ m.setPayment(m.setMobilerechargeByCard(Accnum,amount));
                T.listTransaction.add(new Transaction(User.getUserName(),id,amount,"mobile recharge","creditcard"));
                id++;
                return ResponseEntity.ok(m.Pay(amount,m.setMobilerechargeByCard(Accnum,amount)));}

        }
        else if(Objects.equals(provider, "Orange")){
            Provider p=new Orange();
            if(p.checknumber(num)){ m.setPayment(m.setMobilerechargeByCard(Accnum,amount));
                T.listTransaction.add(new Transaction(User.getUserName(),id,amount,"mobile recharge","creditcard"));
                id++;
                return ResponseEntity.ok(m.Pay(amount,m.setMobilerechargeByCard(Accnum,amount)));}

        }
        return ResponseEntity.ok("invalid number");

    }
    @GetMapping(value = "/Internet/Cash")
    public  ResponseEntity<String> getInternetCash(@RequestParam("amount") double amount, @RequestParam("provider")String provider, @RequestParam("num")String num){
        if(Objects.equals(provider, "Vodafone")){
            Provider p=new Vodafone();

            if(p.checknumber(num)){
                i.setPayment(i.setinternetByCash());
                T.listTransaction.add(new Transaction(User.getUserName(),id,amount,"internet","cash"));
                id++;
                return ResponseEntity.ok(i.Pay(amount,i.setinternetByCash()));
            }
        }
        else if(Objects.equals(provider, "We")){
            Provider p=new We();
            if(p.checknumber(num)){ i.setPayment(i.setinternetByCash());
                T.listTransaction.add(new Transaction(User.getUserName(),id,amount,"internet","cash"));
                id++;
                return ResponseEntity.ok(i.Pay(amount,i.setinternetByCash()));}

        }
        else if(Objects.equals(provider, "Etisalat")){
            Provider p=new Etisalat();
            if(p.checknumber(num)){ i.setPayment(i.setinternetByCash());
                T.listTransaction.add(new Transaction(User.getUserName(),id,amount,"internet","cash"));
                id++;
                return ResponseEntity.ok(i.Pay(amount,i.setinternetByCash()));}

        }
        else if(Objects.equals(provider, "Orange")){
            Provider p=new Orange();
            if(p.checknumber(num)){ i.setPayment(i.setinternetByCash());
                T.listTransaction.add(new Transaction(User.getUserName(),id,amount,"internet","cash"));
                id++;
                return ResponseEntity.ok(i.Pay(amount,i.setinternetByCash()));}

        }
        return ResponseEntity.ok("invalid number");

    }
    @GetMapping(value = "/Internet")
    public ResponseEntity<String> getInternetCredit(@RequestParam("Accnum") String Accnum ,@RequestParam("amount") double amount, @RequestParam("provider")String provider, @RequestParam("num")String num){
        if(Objects.equals(provider, "Vodafone")){
            Provider p=new Vodafone();

            if(p.checknumber(num)){
                i.setPayment(i.setinternetByCard(Accnum,amount));
                T.listTransaction.add(new Transaction(User.getUserName(),id,amount,"internet","creditcard"));
                id++;
                return ResponseEntity.ok(i.Pay(amount,i.setinternetByCard(Accnum,amount)));
            }
        }
        else if(Objects.equals(provider, "We")){
            Provider p=new We();
            if(p.checknumber(num)){ i.setPayment(i.setinternetByCard(Accnum,amount));
                T.listTransaction.add(new Transaction(User.getUserName(),id,amount,"internet","creditcard"));
                id++;
                return ResponseEntity.ok(i.Pay(amount,i.setinternetByCard(Accnum,amount)));}

        }
        else if(Objects.equals(provider, "Etisalat")){
            Provider p=new Etisalat();
            if(p.checknumber(num)){ i.setPayment(i.setinternetByCard(Accnum,amount));
                T.listTransaction.add(new Transaction(User.getUserName(),id,amount,"internet","creditcard"));
                id++;
                return ResponseEntity.ok(i.Pay(amount,i.setinternetByCard(Accnum,amount)));}

        }
        else if(Objects.equals(provider, "Orange")){
            Provider p=new Orange();
            if(p.checknumber(num)){ i.setPayment(i.setinternetByCard(Accnum,amount));
                T.listTransaction.add(new Transaction(User.getUserName(),id,amount,"internet","creditcard"));
                id++;
                return ResponseEntity.ok(i.Pay(amount,i.setinternetByCard(Accnum,amount)));}

        }
        return ResponseEntity.ok("invalid number");

    }
    @GetMapping(value = "/Landline")
    public ResponseEntity<String> getlandlidCredit(@RequestParam("Accnum") String Accnum ,@RequestParam("amount") double amount,@RequestParam("r") String r){
        Receipt re;
    	l.setPayment(l.setPaymentCredit(Accnum,amount));
        re=l.setReceipt(r,amount,l.setPaymentCredit(Accnum,amount));
        T.listTransaction.add(new Transaction(User.getUserName(),id,amount,"Landline","creditcard"));
        id++;
        return ResponseEntity.ok(l.Pay(amount,l.setPaymentCredit(Accnum,amount))+"   "+re.makeReceipt());
    }
    @GetMapping(value = "/Landline/Cash")
    public ResponseEntity<String> getLadlineCash( @RequestParam("amount") double amount,@RequestParam("r") String r){
        Receipt re;
        l.setPayment(l.setPaymentCash());
        re=l.setReceipt(r,amount,l.setPaymentCash());

        T.listTransaction.add(new Transaction(User.getUserName(),id,amount,"Landline","cash"));
        id++;
        return ResponseEntity.ok(l.Pay(amount,l.setPaymentCash())+"   "+re.makeReceipt());
    }
    @GetMapping(value = "/donation/Hospital")
    public ResponseEntity<String> getDonationCreditHospital(@RequestParam("Accnum") String Accnum ,@RequestParam("amount") double amount){

            d=new CancerHospital();
            d.setPayment( d.setDonationsByCard(Accnum,amount));
            System.out.println("Hospital");
            T.listTransaction.add(new Transaction(User.getUserName(),id,amount,"Dontation","creditcard"));
            id++;
            return ResponseEntity.ok(d.Pay(amount,d.setDonationsByCard(Accnum,amount)));
        }
    @GetMapping(value = "/donation/Schooles")
        public ResponseEntity<String> getDonationCreditSchooles(@RequestParam("Accnum") String Accnum ,@RequestParam("amount") double amount){
            d=new Schooles();
            d.setPayment( d.setDonationsByCard(Accnum,amount));
            T.listTransaction.add(new Transaction(User.getUserName(),id,amount,"Dontation","creditcard"));
            id++;
            return  ResponseEntity.ok(d.Pay(amount,d.setDonationsByCard(Accnum,amount)));
        }
    @GetMapping(value = "/donation/NGOs")
        public ResponseEntity<String> getDonationCreditNGOs(@RequestParam("Accnum") String Accnum ,@RequestParam("amount") double amount){

            d=new NGOs();
            d.setPayment( d.setDonationsByCard(Accnum,amount));
            System.out.println("NGOs");
            T.listTransaction.add(new Transaction(User.getUserName(),id,amount,"Dontation","creditcard"));
            id++;
            return ResponseEntity.ok(d.Pay(amount,d.setDonationsByCard(Accnum,amount)));
    }
    @GetMapping(value = "/donation/Hospital/Cash")
    public ResponseEntity<String> getDonationtCashHospital(@RequestParam("amount") double amount){

            d=new CancerHospital();
            d.setPayment(d.setDonationsByCash());
            T.listTransaction.add(new Transaction(User.getUserName(), id,amount,"Dontation","cash"));
            id++;
            return ResponseEntity.ok(d.Pay(amount,d.setDonationsByCash()));
        }
    @GetMapping(value = "/donation/Schools/Cash")
    public ResponseEntity<String> getDonationtCashSchool(@RequestParam("amount") double amount){
            d=new Schooles();
            d.setPayment(d.setDonationsByCash());
            T.listTransaction.add(new Transaction(User.getUserName(),id,amount,"Dontation","cash"));
            id++;
            return ResponseEntity.ok(d.Pay(amount,d.setDonationsByCash()));
        }
    @GetMapping(value = "/donation/NGOs/Cash")
    public ResponseEntity<String> getDonationtCashNGOs(@RequestParam("amount") double amount){

            d=new NGOs();
            d.setPayment(d.setDonationsByCash());
            T.listTransaction.add(new Transaction(User.getUserName(),id,amount,"Dontation","cash"));
            id++;
        return ResponseEntity.ok(d.Pay(amount,d.setDonationsByCash()));
    }




}
