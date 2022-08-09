package com.tns.framework;

public abstract class ShopAcc {

	private int accNo;
	private String accNm;
	private float charges;
	
	//deliveryCharges
	private static final float deliveryCharges = 0;

	public float getDeliverycharges() {
		return deliveryCharges;
	}
	
	// constructor 
	public ShopAcc(int accNo, String accNm, float charges) {
		this.accNo = accNo;
		this.accNm = accNm;
		this.charges = charges;
	}
	//source generate getters and setters  
	public int getAccNo(){
		return accNo;
	}
	
	public String getAccNm() {
		return accNm;
	}
	
	public void setAccNm(String accNm) {
		this.accNm = accNm;
	}
	
	public float getCharges() {
		return charges;
	}
	
	// Methods 
	public void bookProduct(float book) {
		System.out.println("Your order is Placed");
		
	}
	
	public void items(float item) {
		
	};
	
	// source to generate tostring 
	public String toString() {
		return "You are a Prime Member your delivery charges on any product is " + deliveryCharges + "\n"
				+ super.toString();
	}
}
