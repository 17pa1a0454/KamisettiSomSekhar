import java.util.Scanner;
import java.util.*;
import java.io.*;

public class NewYearGift {
    public static void main(String args[]) {
    	Scanner in=new Scanner(System.in);
    	int i,sum=0;
     System.out.println("How many Sweets are required?");
     int s=in.nextInt();
     
    System.out.println("How many Chocolates are required?");
     int c=in.nextInt();
     
     System.out.println("How many Candies are required?");
     int cl=in.nextInt();
   
   ArrayList<Sweets> sa=new ArrayList<Sweets>(s);
   ArrayList<Choclates> ca=new ArrayList<Choclates>(c);
   ArrayList<Candies> cal=new ArrayList<Candies>(cl);
   
   System.out.println("Enter name of Sweets with price as you required");
   
   for(i=0;i<s;i++)
	   sa.add(new Sweets(in.next(),in.nextInt()));
System.out.println("Enter name of Choclates with price as you required");
   
   for(i=0;i<c;i++)
	   ca.add(new Choclates(in.next(),in.nextInt()));
System.out.println("Enter name of Candies with price as you required");
   
   for(i=0;i<cl;i++)
	   cal.add(new Candies(in.next(),in.nextInt()));
   
   for(i=0;i<s;i++)
	    sum+=sa.get(i).price;
   for(i=0;i<c;i++)
	    sum+=ca.get(i).price;
   for(i=0;i<cl;i++)
	    sum+=cal.get(i).price;
   System.out.printf("OverAll weigth is %d\n\n",sum);
   
   System.out.println("\nEnter both lower limit price and higher limit price");
   int lowlimit=in.nextInt();
   int highlimit=in.nextInt();
   
   System.out.println("\nFor below Lower limit prices");
   
   System.out.println("\nSweets are :");
   for(i=0;i<s;i++) {
	   if(sa.get(i).price<=lowlimit)
		   System.out.printf("%s %d\n",sa.get(i).name,sa.get(i).price);
   }
	   System.out.println("\nChoclates are :");
	   for(i=0;i<c;i++) {
		   if(ca.get(i).price<=lowlimit)
			   System.out.printf("%s %d\n",ca.get(i).name,ca.get(i).price);
	   }
		   System.out.println("\nCandies are :");
		   for(i=0;i<s;i++) {
			   if(cal.get(i).price<=lowlimit)
				   System.out.printf("%s %d\n",cal.get(i).name,cal.get(i).price);
		   }	   
			   
			   
			   System.out.println("\nFor above Lower limit prices and below high limit price ");
			   
			   System.out.println("\nSweets are :");
			   for(i=0;i<s;i++) {
				   if(sa.get(i).price>lowlimit&&sa.get(i).price<=highlimit)
					   System.out.printf("%s %d\n",sa.get(i).name,sa.get(i).price);
			   }	  
				   System.out.println("\nChoclates are :");
				   for(i=0;i<c;i++) {
					   if(ca.get(i).price>lowlimit&&ca.get(i).price<=highlimit)
						   System.out.printf("%s %d\n",ca.get(i).name,ca.get(i).price);
				   }	
					   System.out.println("\nCandies are :");
					   for(i=0;i<s;i++) {
						   if(cal.get(i).price>lowlimit&&cal.get(i).price<=highlimit)
							   System.out.printf("%s %d\n",cal.get(i).name,cal.get(i).price);
   }
		   System.out.println("\nFor above High limit prices");
					   
		     System.out.println("\nSweets are :");
			   for(i=0;i<s;i++) {
					   if(sa.get(i).price>highlimit)
						  System.out.printf("%s %d\n",sa.get(i).name,sa.get(i).price);
					   }
			 System.out.println("\nChoclates are :");
			   for(i=0;i<c;i++) {
					   if(ca.get(i).price>highlimit)
						   System.out.printf("%s %d\n",ca.get(i).name,ca.get(i).price);
						   }
		   System.out.println("\nCandies are :");
			   for(i=0;i<s;i++) {
					   if(cal.get(i).price>highlimit)
						   System.out.printf("%s %d\n",cal.get(i).name,cal.get(i).price);
							   }
    }
}