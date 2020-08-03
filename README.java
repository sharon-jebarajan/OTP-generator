import java.util.*;
import java.io.*;
import java.util.Random;
class README
{
	public static void main(String args[])
	{
		System.out.println(generate(6));
	}
	private static char[] generate(int n)
	{
		String numbers="1234567890";
		Random r = new Random();
		char[] otp = new char[n];
		for(int i=0;i<n;i++)
		{
			otp[i]=numbers.charAt(r.nextInt(numbers.length()));
		}
		return otp;
	}
}
