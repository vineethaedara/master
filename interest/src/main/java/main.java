import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class main {
	


	public static void present() {
		Scanner input=new Scanner(System.in);
		int p,t,r,n;
		String v;
		double i;
		
		OutputStreamWriter out=new OutputStreamWriter(System.out);
		try {
		out.write("enter the p value : ");
		out.flush();
		p=input.nextInt();
		out.write("enter the t value : ");
		out.flush();
		t=input.nextInt();
		out.write("enter the r value : ");
		out.flush();
		r=input.nextInt();
		out.write("enter the n value : ");
		out.flush();
		n=input.nextInt();
	    i=simpleinterest.calculate(p,t,r);
	    
		 v=Double.toString(i);
		out.write("Simple Interest : "+v+"\n\n");
		out.flush();
		i=compoundinterest.calculate(p,t,r,n);
		v=Double.toString(i);
		out.write("Compound Interest : "+v);
		out.flush();
		}
		catch(Exception e) {
			System.out.println(e);
		}

		
		
	}
}
