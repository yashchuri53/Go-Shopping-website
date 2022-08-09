package com.tns.application;
import java.util.Scanner ;

import com.tns.framework.NormalAcc;
import com.tns.framework.PrimeAcc;
import com.tns.framework.ShopFactory;

public class Main {
	static Scanner sc = new Scanner(System.in);
	
	static int order() {
		NormalAcc user = new GSNormalAcc(0, "", 0, false);
		PrimeAcc puser = new GSPrimeAcc(0, "default", 0, true);
	

		String[] items = { "Mobile", "Laptop", "Watch", "Shirt", "T-shirt" };
		int charges[] = { 10000, 50000, 2000, 800, 400 };

		System.out.println("Enter product number(1-5):");
//		Product Number
		int productNo = sc.nextInt();
		switch (productNo) {
		case 1: {
			System.out.println(items[0] + " Rs." + charges[0]);
			user.bookProduct(productNo);
			break;
		}
		case 2: {
			System.out.println(items[1] + " Rs." + charges[1]);
			user.bookProduct(productNo);
			break;
		}
		case 3: {
			System.out.println(items[2] + " Rs." + charges[2]);
			user.bookProduct(productNo);
			break;
		}
		case 4: {
			System.out.println(items[3] + " Rs." + charges[3]);
			user.bookProduct(productNo);
			break;
		}
		case 5: {
			System.out.println(items[4] + " Rs." + charges[4]);
			user.bookProduct(productNo);
			break;
		}
		}

		return charges[productNo - 1];
	}

	/* Entry Point */
	public static void main(String[] args) {
		int choice;
		boolean f1 = true;
		boolean f2 = false ;
		float total;
		int subAmt ;
		
		String username = null;
		
//		Object Creation
		PrimeAcc puser = new GSPrimeAcc(111, "default", 0, true);
		NormalAcc nuser = new GSNormalAcc(222, "", 0, false);

		
		

		System.out.println("WELCOME TO GO SHOPPING\n");
		
				System.out.println("Account Type\n1. Prime \n2. Normal\n");
				choice = sc.nextInt();

				switch (choice) {
				case 1:// Prime Account
					puser = new GSPrimeAcc(1, username, 0, true);
					System.out.println(puser.toString());

					total = order() + puser.getDeliverycharges();
					System.out.println("Total amount to pay Rs." + total);
					break;

				case 2:// Normal Account
					nuser = new GSNormalAcc(2, username, 0,false );
					System.out.println(nuser.toString());

					total = order() + nuser.getDeliveryCharges();
					System.out.println("Total amount to pay Rs." + total);
					break;
			}
				
	}
}
	

