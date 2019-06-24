package com.epam.pep;

public class RemoveCharA {

	public String remove(String string) {
		String result = null;
		int stringlength=string.length();
		if(stringlength<2)
		{
			if(string.charAt(0)=='A')
			{
				result="";
			}
			else
			{
				result=string;
			}
			return result;
		}
		
		char first = string.charAt(0);
		char second = string.charAt(1);
		
		if(first == 'A' && second=='A')
		{
			result=string.substring(2);
		}
		else if(first=='A')
		{
			result=string.substring(1);
		}
		else if(second=='A')
		{
			result=string.charAt(0)+string.substring(2);
		}
		else
		{
			result=string;
		}
		return result;
	}

}
