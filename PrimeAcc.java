package com.tns.framework;

public abstract class PrimeAcc extends ShopAcc{
	
	private boolean isPrime = true;
	private static final float deliveryCharges = 0f;
	
	//constructor (source- constructor using fields)
	public PrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		
		super(accNo, accNm, charges);
		this.isPrime = isPrime;
	}
	
	public boolean getisPrime(){
		return this.isPrime;
	}
	
	public float getDeliverycharges() {
		return deliveryCharges;
	}
	
	//@Override methods 
	public void bookProduct(float bookproduct) {
		System.out.println(bookproduct); 
	}
	
	public String toString() {
		return "You are a Prime Member your delivery charges on any product is " + deliveryCharges + "\n"
				+ super.toString();
	}

	

}
