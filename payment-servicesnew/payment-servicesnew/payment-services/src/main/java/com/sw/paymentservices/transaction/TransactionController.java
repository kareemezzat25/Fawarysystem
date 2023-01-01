package com.sw.paymentservices.transaction;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TransactionController {
    TransactionOperations transactionOperations;
    public TransactionController(TransactionOperations transactionOperations)
    {
        this.transactionOperations=transactionOperations;
    }
    @GetMapping(value = "/Transaction/paymenttransaction")
    public ResponseEntity<List<Transaction>> getListPayment()
    {
        return ResponseEntity.ok(transactionOperations.getPaymentList());
    }
    @GetMapping(value = "/Transaction/wallettransaction")
    public ResponseEntity<List<Transaction>> getListAddToWallet()
    {
        return ResponseEntity.ok(transactionOperations.getAddToWalletList());
    }
    @PutMapping (value="/user/refund/{id}/{amount}")
    public ResponseEntity<String> requestRefund(@PathVariable ("id") int id, @PathVariable ("amount") double amount)
    {
        return ResponseEntity.ok(transactionOperations.requestRefund(id,amount));
    }
    @GetMapping(value="/user/Transactions/{name}")
    public ResponseEntity<List<Transaction>>getUserTransaction(@PathVariable ("name") String name)
    {
        return ResponseEntity.ok(transactionOperations.getListTransactionUser(name));
    }
    @GetMapping(value="/Transaction/refunduser")
    public ResponseEntity<List<Transaction>>getListRefund()
    {
        return ResponseEntity.ok(transactionOperations.getListRefund());
    }
}
