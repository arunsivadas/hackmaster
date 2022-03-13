package org.phone;

public class Phone {
	
	public void phoneInfo(int phneid) {
		System.out.println(phneid);	
	}
	
	public void phoneInfo(long phneno) {
		System.out.println(phneno);

	}
	public void phneInfo(String address) {

		System.out.println(address);
		
	}
	public static void main(String[] args) {
	Phone p=new Phone();
	p.phoneInfo(10001);
	p.phoneInfo(9789153328L);
	p.phneInfo("Coimbatore");
	
		
	}
	
}
