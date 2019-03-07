package com.mine;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PattrnMatch {

	public static void main(String[] args) {
		String s = "abc${name}def${email}ghi${Author}";
	    Pattern p = Pattern.compile("\\$\\{.*?\\}");
	    Matcher m = p.matcher(s);
	    
	    while(m.find()){
	        String b =  m.group();
	       // System.out.println(b);
	        System.out.println(b.substring(2, b.length()-1));
	    }

	}

}
