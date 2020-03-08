package com.vektorel;

public class cift {

	public static void main(String[] args) {

		int toplamc = 0;
		int toplamt = 0;
		for (int i = 9000; i <= 10000; i++) {
			if (i % 2 == 0)
				toplamc = i + toplamc;
			else
				toplamt = i + toplamt;

		}

		System.out.println("9000 ile 10.000 arasindaki cift sayilarin toplami..:" + toplamc);
		System.out.println("9000 ile 10.000 arasindaki tek sayilarin toplami..:" + toplamt);

	}

}
