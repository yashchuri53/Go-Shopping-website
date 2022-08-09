package com.tns.application;

import com.tns.framework.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc {

	private static final float charges = 0;

	//constructor (source- constructor using fields)
    public GSPrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		
		super(accNo, accNm, charges, isPrime);
		
	}
    
    // getter setter 
    public float getCharge() {
    	return GSPrimeAcc.charges;
    }
    
    //method
    public void bookProduct(float charges) {
    	super.bookProduct(charges);
    }
    //@Override source gen tostring
	public String toString() {
		 return super.toString();
	 }
}

