package Cgpa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.*;
//import javax.swing.text.html.HTMLDocument.Iterator;

public class Student {

	
	public int id ;
	public String name;
	public  double cgpa;
	Student(int id, String name ,double cgpa)
	{
		this.id = id;
		this.name = name;
		this.cgpa = cgpa;
} 
	
	
	
	static ArrayList arr;

	public static void main(String[] args) 
	{
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the number of students");
		
		int n=in.nextInt();
		int flag=0,p=0,q=0,r=0;
		if(n>=2 && n<=1000)
		{
			arr=new ArrayList<Student>(n);
			flag=1;
		}
		else
		{
	     System.out.println("Enter number of students from 2 to 1000");
		}
		
		if(flag==1)
		{
		for(int i=0;i<n;i++)
		{
	    System.out.println("enter the details about student number "+(i+1));
		
	    int id1=in.nextInt();
		if(id1>=0 && id1<=10000){p=1;}                            //to add constraints for id
		
		String name1= in.next();
		if(name1.length()>=5 && name1.length()<=35){q=1;}       //to add constraints for name
		
		
		double cgpa1= in.nextDouble();                       
		if(cgpa1>=0.00 && cgpa1<=4.00){r=1;}					  //to add constraint for CGPA
				
		
		if(p==1 && q==1 && r==1)                            //to add up all constraints
		{
		arr.add(new Student(id1,name1,cgpa1));
		}
		}
		}
		
		
		Collections.sort(arr, new Comparision());

		Iterator itr=arr.iterator();  
		while(itr.hasNext())
		{  
			Student st=(Student)itr.next();  
			System.out.println(st.name); 
}
	}




}


