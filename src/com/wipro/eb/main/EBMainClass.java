package com.wipro.eb.main;
import com.wipro.eb.entity.*;
public class EBMainClass {
	public static void main(String a[])
	{
		
		
		System.out.println(new ConnectionService().generateBill(30,100,"Commercial"));
	}

}
