package com.merkconnectUIautomation.core;

public class TestException extends Exception
{
	private String fieldName;
	
	public TestException (String FieldName, String ErrorMessage )
	{
		super(ErrorMessage);
		this.fieldName= FieldName;
	}
	
	public TestException (String ErrorMessage )
	{
		super(ErrorMessage);
	}
	
	public void setFieldName (String FieldName )
	{
		this.fieldName= FieldName;
	}
	
	public String getFieldName ()
	{
		return fieldName;
	}
}
