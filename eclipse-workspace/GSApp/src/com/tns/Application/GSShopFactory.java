package com.tns.Application;

import com.tns.framework.ShopFactory;
import com.tns.framework.NormalAcc;
import com.tns.framework.PrimeAcc;
import com.tns.framework.ShopAcc;

public class GSShopFactory implements ShopFactory{

	

	@Override
	public GSPrimeAcc getNewPrimeAccount(int AccNo, String accNm, float charges, boolean isPrime) 
	{
		GSPrimeAcc gsprime = new GSPrimeAcc();
		return gsprime;
	}

	@Override
	public GSNormalAcc getNewNormalAccount(int AccNo, String accNm, float charges, float deliveryCharges) 
	{
		GSNormalAcc gsnormal = new GSNormalAcc(AccNo, accNm, deliveryCharges, deliveryCharges);
		return gsnormal;
	}
	
	
}
