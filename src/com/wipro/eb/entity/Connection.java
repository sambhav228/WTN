package com.wipro.eb.entity;

public abstract class Connection {
	//members
	protected int previousReading;
	protected int currentReading;
	//protected float[] slabs=new float[3];
	protected Connection(int cr,int pr){
		this.currentReading=cr;
		this.previousReading=pr;
	}
	public abstract float computeBill();

}
