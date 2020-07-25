package com.project.week8;
import java.util.*;

public class Palindrome {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of list : ");
		int n=sc.nextInt();
		ArrayList< String > words = new ArrayList< String >(n);    
		ArrayList<String> palwords=new ArrayList<String>(n);
		System.out.print("Enter the words:");
        for(int i=0;i<n;i++)     
           words.add(sc.next());
        for(String ele:words) {
        	if(isPalindrome(ele)) {
        		palwords.add(ele);
        	}
        }
        System.out.println("The list of palindromic words are:\n"+palwords);
	}
	static boolean isPalindrome(String s)
    {
		int i,n=s.length();
		for(i=0;i<n;i++) {
			if(s.charAt(i)!=s.charAt(n-i-1))
				return false;
		}
		return true;
    }

}
