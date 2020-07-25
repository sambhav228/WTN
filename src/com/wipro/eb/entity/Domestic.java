package com.wipro.eb.entity;

public class Domestic extends Connection{
	
	//members
	public static final float[] slabs={2.3f,4.2f,5.5f};
		Domestic(int cr,int pr){
			super(cr,pr);//Connection();
			}
		public float computeBill(){
			int units=this.currentreading-this.previousReading;
			return (units<=50)?units*slabs[0]:((units<=100)?50*slabs[0]+);
		}
}
