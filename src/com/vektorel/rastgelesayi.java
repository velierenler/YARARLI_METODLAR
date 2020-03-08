package com.vektorel;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public class rastgelesayi {

	public static void main(final String[] args) throws Exception {
     
		Random randNum = new Random();
      
		Set<Integer>set = new LinkedHashSet<Integer>();
      
		while (set.size() < 10) {
         set.add(randNum.nextInt(10)+1);
      }
      System.out.println("Random numbers with no duplicates = "+set);
   }
	
	
	
}