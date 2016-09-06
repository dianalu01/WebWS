package com.admazing.Lib;

public class categoryObserver extends Observer{
	
	public categoryObserver(AdmazingWSImpl subject){
		this.subject=subject;
		this.subject.attach(this);
	}

	@Override
	public void update() {
		System.out.println( "Update Category: "); 
		System.out.println( this.subject.observers.size()+":::::::::::::");
	   
		
	}
	

}
