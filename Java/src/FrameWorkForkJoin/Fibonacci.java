package FrameWorkForkJoin;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class Fibonacci extends RecursiveTask<Integer> {
	private final int n;

	public Fibonacci(int n) {
		this.n = n;
	}

	protected Integer compute() {
		int podwynik = 0;
		if (n <= 1) {
			podwynik= n;
		}else{
		Fibonacci f1 = new Fibonacci(n - 1);
		f1.fork();
		Fibonacci f2 = new Fibonacci(n - 2);
			//System.out.println(Thread.currentThread().getName());
		podwynik= f2.compute() + f1.join();}
		System.out.println(podwynik);
		return podwynik;
	}
	
	public static void main(String[] args) {
		ForkJoinPool pool = new ForkJoinPool(3);
		int f = pool.invoke(new Fibonacci(7)); // który wyraz
		System.out.println("f(6) = " + f);
	}
}