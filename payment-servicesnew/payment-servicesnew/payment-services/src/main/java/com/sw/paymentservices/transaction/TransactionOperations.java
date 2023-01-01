package com.sw.paymentservices.transaction;

import com.sw.paymentservices.userAccount.Authentication;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class TransactionOperations {
	Transaction T=new Transaction();
	public  List<Transaction> userTransactions=new ArrayList<>();
	public List<Transaction> getPaymentList()
	{

		List<Transaction> payment=new ArrayList<>();
		for(Transaction transaction:T.listTransaction)
		{
			if(!transaction.paymentMethod.equals("wallet"))
			{
				payment.add(transaction);
			}
		}
		return payment;
	}
	public List<Transaction> getListTransactionUser(String name)
	{
		for(Transaction transaction:T.listTransaction)
		{
			if(transaction.nameUser.equals(name))
			{
				userTransactions.add(transaction);
			}
		}
		return userTransactions;
	}
	public List<Transaction> getAddToWalletList()
	{
		List<Transaction> wallet=new ArrayList<>();
		for(Transaction transaction:T.listTransaction)
		{
			if(transaction.paymentMethod.equals("wallet"))
			{
				wallet.add(transaction);
			}
		}
		return wallet;
	}
	public String requestRefund(int id,double amount )
	{
		for(Transaction transaction:T.listTransaction)
		{
			if(transaction.getId()==id)
			{
				transaction.paidPrice=amount;
				T.listRefund.add(transaction);
				return "refund is Done";
			}
		}
		return "The Transaction id doesn't exist";
	}
	public List<Transaction> getListRefund()
	{
		return T.listRefund;
	}
	

}
