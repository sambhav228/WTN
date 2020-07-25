package com.wtn.stud.entity;

public class Student {
private String name;
private int id;
private int age;
private int count;
private int[][] reg=new int [6][2];
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int[][] getReg() {
	return reg;
}
public void setReg(int[][] reg) {
	this.reg = reg;
}
public boolean registerCourse(int CourseId)
{

	if(count== 6){
		return false;
	}
	else{
		for(int i=0;i<count;i++)
		{
			if(reg[0][i]==CourseId){
				return false;
			}
		}
	}
	
	reg[0][count]=CourseId;
	count++;
	return true;
	
}
public boolean UnregisterCourse(int CourseId)
{
	
	boolean result =false;
	return result;
	
}


	
}
