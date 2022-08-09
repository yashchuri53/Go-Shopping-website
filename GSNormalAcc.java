package com.tns.application;

import com.tns.framework.NormalAcc;


public class GSNormalAcc extends NormalAcc {

	// constructor 
	 public GSNormalAcc(int accNo, String accNm, float charges, boolean isPrime) {
			
			super(accNo, accNm, charges, isPrime);
			
		}
	 
	 // method
	 public void bookProduct(float charges) {
	    	
	    	super.bookProduct(charges);
	    }
		
	 //@Override (source gen tostring)
	 public String toString() {
		 return super.toString();
	 }
}
