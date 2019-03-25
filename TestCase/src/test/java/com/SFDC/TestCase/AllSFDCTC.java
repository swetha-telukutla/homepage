package com.SFDC.TestCase;

public class AllSFDCTC {

	public static void main(String[] args) throws InterruptedException {
		SFDCTC1 tc1 = new SFDCTC1();
		SFDCTC2 tc2=new SFDCTC2();
		SFDCTC3 tc3=new SFDCTC3();
		SFDCTC4A tc4a=new SFDCTC4A();
		//SFDCTC4B tc4b=new SFDCTC4B();
		SFDCTC5 tc5=new SFDCTC5();
		tc1.Testcase1();
		tc2.TestCase2();
		tc3.TestCase3();
		tc4a.TestCase4A();
		//tc4b.TestCase4b();
		tc5.TestCase5();
		
		
		
		
		
	}
}
