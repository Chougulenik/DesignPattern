package com.spring.designpattern;

public class FactoryMain {

	public static void main(String[] args) {
		
		MobileFactory factory = new MobileFactory();
		Mobile mobile = factory.getNewMobile(60000);
		mobile.mobilePrice();		
	}
}
