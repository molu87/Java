package FrameWorkForkJoin;

import java.util.concurrent.ForkJoinPool;

public class ForkJoin {	 
 public static void main (String [] args) {
	//Przyk³ad uruchomienia zadan
	 ForkJoinPool forkJoinPool = new ForkJoinPool(3);
	 long suma = forkJoinPool.invoke(new Sumowanie(1, 1000000));
	  System.out.println("Suma = " + suma);
		
 }
}