

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;




public class reverse {


	public void reverse1(String hello) {

		char[] ch=hello.toCharArray();

		for(int i=ch.length-1;i>=0;i--)
		{
			System.out.println(ch[i]);
		}

	}

	public void reverse2(StringBuilder hello) {



		for(int i=0;i<hello.length();i++)
		{
			System.out.println(hello.charAt(i));
		}

	}

	public void reverse3(String hello) {

		char[] c=hello.toCharArray();

		int right=c.length-1;
		for(int left=0;left<right;left++,right--)
		{
			char t=c[left];
			c[left]=c[right];
			c[right]=t;
		}

		for(char c1:c)
		{
			System.out.println(c1);
		}



	}

	public void reverse4(String hello) {

		char c[]=hello.toCharArray();
		LinkedList<Character> ch =new LinkedList<>();
		for(char c1:c)
		{
			ch.add(c1);
		}
		Collections.reverse(ch);
		ListIterator it=ch.listIterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}



	}

	public void reverse5(String hello) {

		byte[] temp=hello.getBytes();
		byte[] newb=new byte[temp.length];
		for(int i=0;i<newb.length;i++)
		{
			newb[i]=temp[newb.length-i-1];
		}
		System.out.println(new String(newb));

	}

	public static void main(String[] args) {
		reverse s1=new reverse();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s="abllo";
		s1.reverse5(s);



	}
}


