package com.spring.designpattern;

public class MobileFactory {
	
	public Mobile getNewMobile(int price) {
		
		if(price == 60000) {
			return new Apple();
		}
		else if(price == 20000) {
			return new Motorola();
		}
		else {
			return new Samsung();
		}		
	}
}
