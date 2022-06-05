package com.maven;

public class PrimeNum {
 public static boolean checkPrime(int num) {
	 for(int i=2;i<=num/i;++i) {
		 if(num % i==0) {
			 return false;
		 }
	 }
	return true;
 }
 }

