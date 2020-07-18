package com.epam.tddjunit;

public class DeleteA
{

	public String delete1(String string)
	{
		if(string.charAt(0)=='A')
		{
			if(string.charAt(1)=='A')
			return string.substring(2,string.length());
			else
			return (string.substring(1,string.length()));
		}
		else if(string.charAt(1)=='A')
			return string.substring(0,1)+string.substring(2,string.length());
		
		else
			return string;
	}
}