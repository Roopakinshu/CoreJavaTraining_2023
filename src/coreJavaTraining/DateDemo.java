package coreJavaTraining;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d =new Date();
		System.out.println(d.toString());
		
		SimpleDateFormat sdf=new SimpleDateFormat("M/d/yyyy");
		System.out.println(sdf.format(d)); //to print date which has come in Fri Sep 01 16:09:49 IST 2023 format to M/d/yyyy
		SimpleDateFormat sd=new SimpleDateFormat("M/d/yyyy hh:mm:ss");
		System.out.println(sd.format(d));
	}
	}


