package com.epam.Remove;

public class Removingina {
	public static String rem(String s)
	{
	
		String res="";
		int k=0,c=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='A'|| s.charAt(i)=='a') {
				c++;
			}
			
			if(s.charAt(i)!='A'&& s.charAt(i)!='a')
			{
				k=i;
				break;
			}	
	       }
		if(c==s.length())
			return res;
		else
		return res+s.substring(k,s.length());
	    
	}

}
