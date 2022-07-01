package com.practice.Q6;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Question6 {

	public static void main(String[] args) throws ParseException {
		Scanner sc=new Scanner(System.in);
		try
		{
		String s=sc.next();
		 
		SimpleDateFormat da=new SimpleDateFormat("yy-mm-dd");
		
      Date d1=da.parse(s);
      da.format(d1);
      System.out.println(d1);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}

}
