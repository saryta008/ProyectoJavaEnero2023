package com.mycompany.ejemplojava2023;

public class EjemploJava2023 {
    public static void main (String [] Args) {
		int r [] = new int [10];
		int suma=0;
		
		for (int i=0; i<r.length; i++) {
			r[i]=(int)(Math.random()*100+1);
			//con esto hago la suma pero hay otra forma
			//suma=suma+r[i];
			System.out.println(r[i]);
		}
		for(int n: r) {
			suma=suma+n;
		}
		System.out.println(suma);
	}

}