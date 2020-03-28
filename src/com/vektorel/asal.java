package com.vektorel;

public class asal {

	public static void main(String[] args) {

		// j ile baslayan for dongusu hangi sayiya kadar kontrol yapýlacagýný;
		// i ile baslayan ikinci for döngüsü ise modu alinacak sayiyi sayar
		// ilk if dongusunde % ---> yani mod islemi sonucu sifir cikarsa bu sayi asal degildir demektir 
		// ve "durum" degiskenini 0--> Sifir iken 1--> Bir yapar
		// boylece sadece asal olan sayilar ekrana yazdirilir.
		int durum = 0;
		System.out.println("2 Sayisi Asal Sayidir");
		for (int j = 3; j <= 1001; j++) {
			
			for (int i = 2; i < j; i++) {

				if (j % i == 0)
					durum = 1;
			}

			if (durum == 0)
				System.out.println(j + " Sayisi Asal Sayidir.");
			else
				durum = 0;

		}

	}

}
