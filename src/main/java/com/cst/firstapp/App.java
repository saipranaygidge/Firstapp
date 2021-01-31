package com.cst.firstapp;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
	
	public int num1;
	public int num2;
	
	
    public int getNum1() {
		return num1;
	}


	public void setNum1(int num1) {
		this.num1 = num1;
	}


	public int getNum2() {
		return num2;
	}


	public void setNum2(int num2) {
		this.num2 = num2;
	}

	 public int addfunction(int num1,int num2) {
		 return num1+num2; 
	 }
	 public int subfunction(int num1,int num2) {
		 return num1-num2;
	 }
	 
	 public int Prodfunction(int num1,int num2) {
		 return num1*num2;
		 
	 }

	public static void main( String[] args )
    {
        App calculator=new App();
        Scanner input= new Scanner(System.in);
        System.out.println("enter number 1");
        int num1=input.nextInt();
        calculator.setNum1(num1);
        System.out.println("enter number 2");
        int num2=input.nextInt();
        calculator.setNum1(num2);
        System.out.println("The sum is:"+calculator.addfunction(num1, num2));
        System.out.println("The differnece is:"+calculator.subfunction(num1, num2));
        System.out.println("The product is:"+calculator.Prodfunction(num1, num2));
    }
    
}
