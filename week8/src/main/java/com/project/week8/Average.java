package com.project.week8;
import java.util.*;

public class Average {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of the list: ");
		int n=sc.nextInt();
		int i;
		ArrayList<Integer> arr=new ArrayList<Integer>(n);
		Average obj=new Average();
		System.out.print("Enter the Elements in the list:");
		for(i=0;i<n;i++)
		{
			int x=sc.nextInt();
			arr.add(x);}
			System.out.println("Average is :"+obj.calculateAverage(arr));
		
	}
	
	private double calculateAverage(List <Integer> arr) {
		OptionalDouble average = arr.stream()
	            .mapToDouble(a -> a)
	            .average();
		return average.isPresent() ? average.getAsDouble() : 0; 
		}

}

