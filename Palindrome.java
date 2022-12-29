package week1.day2;

import java.util.Iterator;

public class Palindrome {

	public static void main(String[] args) {
		int temp,rev=0,a;
		int num=34343;
		a=num;
		for (;num!=0;num=num/10) {
			temp=num%10;
			rev=(rev*10)+temp;
			
		}
if(a==rev) {
	System.out.println(rev+" is a Palindrome");
}
else {
	System.out.println(rev+" is not a Palindrome");
}
	}

}
