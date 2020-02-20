package housestandards;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class main {
	public static void func()  {
		Scanner input=new Scanner(System.in);
		OutputStreamWriter out=new OutputStreamWriter(System.out);
		int opt,sq,ans,a;
		try {
		out.write("1.standard materials \n2.above standard materials \n3.high standard materials \nenter your option : ");
		out.flush();
		opt=input.nextInt();
		out.write("enter total area of the house in square feet : ");
		out.flush();
		sq=input.nextInt();
		out.write("enter fully automatic or not  if yes type 1 ,otherwise type 2 :   ");
		out.flush();
		a=input.nextInt();
		ans=estimate.func(opt,sq,a);
		out.write("\n total amount is : "+ans+"INR");
		out.flush();
		}
		catch(Exception e) {
			System.out.println(e);
		
		}
		
	}

}
