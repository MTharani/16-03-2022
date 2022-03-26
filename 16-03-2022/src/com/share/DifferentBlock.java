package com.share;

public class DifferentBlock 
{
    static
    {
    	System.out.println("static block");
    }
    //normal block
    {
    	System.out.println("Normal block");
    	System.out.println("normal block will excute object creation");
    }
    public DifferentBlock() 
    {
		System.out.println("Constructor block");
	}
    void display()
    {
    	System.out.println("Method block");
    	System.out.println("Method block will excute to call the object");
    }
	public static void main(String[] args) 
	{
		System.out.println("Main block");
		DifferentBlock db=new DifferentBlock();
		db.display();
		

	}

}
