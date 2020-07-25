package com.wipro.eb.service;
import com.wipro.eb.exception.*;

public class ConnectionService {
	public boolean validate(int cr, int pr ,String t)throws InvalidtypeReadingException{
		boolean valid =true;
		if(cr<pr || pr<0 || cr<0)
		{
			valid =false;
			throw new InvalidtypeReadingException();
		}
		if(!(t.equalsIgnoreCase("Commercial")|| t.equalsIgnoreCase("Domestic"))){
			valid =false;
			throw new InvalidtypeReadingException();
		}
		
		return valid;
		
	}
	public float calculateBillAmt(int cr,int pr,String t){
		float result=0;
		try{
		if(this.validate(cr, pr, t)){
			Connection c;
			if()
			
		}
		else{
			
		}
		
	}
	catch(IncorrectReadingException ire){
		result =-1;
		
	}
catch(InvalidtypeReadingException ice){
	result =-2;
}
	return result;
	}
	public String generateBill(int cr,int pr,String t)
	{
		float result=this.calculateBillAmt(cr, pr, t);
		if(result==-1)
		{
			return "Incorrect Reading";
		}
		else if(r==-2)
		{
			return "Incorrect Connection Type";
		}
		else
			System.out.printf(String.format("Amount to be paid: %.2f",result));
	}
}

