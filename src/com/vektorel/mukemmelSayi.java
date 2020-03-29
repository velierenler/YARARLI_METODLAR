package com.vektorel;

//import java.util.Scanner;

/* Genel aciklama: Bu program su adýmlar ile yazildi
 * once bir sayinin bölenleri bulundu 
 * bunun icin mod islemi ile kalaný sýfýr veren sayýlar
 * if in de yardýmý ile ekrana yazdýrýldý
 * sonra bu sayýlarýn toplamý alýndý ve for ile bu sayýlar toplatýldý
 * tekrar bir if ile bu toplam sayiya esit mi degil mi kontrol edildi esitse ekrana yazdirildi
 * sonra kullanicidan bir deger istendi ve kontrol edildi
 * sonra bu kýsým gizlendi ve baska bir for dongusunun icerisine alindi ve belirli bir
 * sayiya kadar olan mukemmel sayilar bulundu. */
public class mukemmelSayi {

	public static void main(String[] args) {

//		System.out.println("Bu program girdiginiz sayinin mukemmel sayi olup olmdigini sorgular");
//		System.out.println("Lütfen bir sayi giriniz..:");
//		Scanner sc = new Scanner(System.in);
//		int a=sc.nextInt();
		
		int toplam = 1;
		for (int j = 3; j < 999999999; j++) {
			for (int i = 2; i < j; i++) {

				if (j % i == 0)
					toplam = toplam + i;
				// System.out.println(i);
				// System.out.println(b);
			}
			if (toplam == j)
				System.out.println(toplam + " sayisi bir mukemmel sayidir.");
			else
				toplam = 1;

		}
//		for (int i = 2; i <a; i++) {
//			
//			if(a%i==0)
//			toplam=toplam+i;	
//			//System.out.println(i);
//			//System.out.println(b);
//		}
//		if (toplam==a)
//		System.out.println(toplam+" sayisi bir mukemmel sayidir.");
//		else
//			System.out.println(a+" sayisi bir mukemmel sayi degildir.");
//		

	}

}
