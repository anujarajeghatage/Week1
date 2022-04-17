package com.tns.client;

import com.tns.Application.GSNormalAcc;
import com.tns.Application.GSPrimeAcc;
import com.tns.Application.GSShopFactory;
import com.tns.framework.ShopFactory;
import com.tns.framework.NormalAcc;
import com.tns.framework.PrimeAcc;
import com.tns.framework.ShopAcc;

public class Client {

	public static void main(String[] args) {
	
		
		// Step 1 - Step a
				GSShopFactory gssfactory = new GSShopFactory();
				gssfactory.getNewPrimeAccount(111, "tanu", 500, true);
				gssfactory.getNewNormalAccount(221, "kalpana", 8258, 70);
				
				
				// Step 2
				GSPrimeAcc gsprime = new GSPrimeAcc();
				gsprime.getAccNm();
				gsprime.getAccNo();
				gsprime.getCharges();
				// Step 4 / Step d.
				gsprime.bookProduct(500);
				
				// Step 5 / Step e.
				gsprime.toString();
				
				// Step 3
				GSNormalAcc gsnormal = new GSNormalAcc(); 
				gsnormal.getAccNm();
				gsnormal.getAccNo();
				gsnormal.getCharges();
				gsnormal.getDeliveryCharge();
				
				// Step 4 / Step d.
				gsnormal.bookProduct(500);
				// Step 5 / Step e.
				gsnormal.toString();
			
				

			}

	}

}
