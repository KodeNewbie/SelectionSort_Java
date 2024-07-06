package com.project;

import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter size of array : ");
		int arrLimit = scanner.nextInt();
		
		int arr[] = new int[arrLimit];
		
		System.out.println("Enter the elements : ");
		for(int i=0; i<arrLimit; i++) arr[i] = scanner.nextInt();
		
		scanner.close();
		
		selectionSort(arr, arrLimit);
		
		System.out.println("Sorted array : ");
		
		for(int i=0; i<arrLimit; i++) System.out.print(arr[i] + "  ");

	}

	private static void selectionSort(int[] arr, int arrLimit) 
	{
		for (int i=0; i<arrLimit-1; i++)
		{
			for(int j=i+1; j<arrLimit; j++)
			{
				if(arr[i]>arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
	}

}
