package com.wipro.eb.entity;

public class Commercial extends Connection {
	public static final float[] slabs={5.2f,6.8f,8.3f};
	public Commercial(int cr,int pr)
	{
		super(cr,pr);//Connection();
		}
	public float computeBill(){
		return 100;
	}
	float duty()
	{
		
	}

}
