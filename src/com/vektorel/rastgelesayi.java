package com.vektorel;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class rastgelesayi {

	public static void main(final String[] args) throws Exception {
		
      try {
    	//"Random" sinifindan bir rSayi nesnesi oluþturalim.
  		Random rSayi = new Random();
  		// Boþ bir (integer tipinde) liste olusturuyoruz ama bu listeyi "LinkedHashSet" ile tekil(birbirinin ayni olmayan) hale getirelim.
  		Set<Integer> sList = new LinkedHashSet<Integer>(); 
  		
  		// Burda kullanicidan deger talep edelim.
  		System.out.println("***Rastgele sayilari olusturan programa hosgeldiniz...***");
  		System.out.println("Rastgele sayilari kaça adar yazdirmak istersiniz ? :");
  		Scanner sc = new Scanner(System.in);
  		int i=sc.nextInt(); 
  		sc.close();
  		while (sList.size() < i) { 
           sList.add(rSayi.nextInt(i)+1);
        }
  		
        System.out.println(i+" kadar birbirinin benzeri olmayan rastgele sayilar");
        System.out.println(sList);
	} catch (Exception e) {
		System.out.println("Lütfen pozitif bir sayi giriniz..:");
		
	}
   }
	
	
	
}