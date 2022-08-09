package com.tns.framework;

public abstract class NormalAcc extends ShopAcc {

	
	private final static float deliveryCharges = 50;

	public static float getDeliveryCharges() {
		return deliveryCharges;
	}
	
	//constructor (source- constructor using fields)
	public NormalAcc(int accNo, String accNm, float charges, boolean isPrime) {
		super(accNo, accNm, charges);
	}

	

	//methods 
	public void bookProduct(float book) {
		System.out.println("Your order is Placed");

	}


	public String toString() {
		return "You are a Normal Member your delivery charges on any product is " + deliveryCharges + "	\nIf "
				+ super.toString();
	}
}
