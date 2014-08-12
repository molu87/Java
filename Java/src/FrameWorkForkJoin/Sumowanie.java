package FrameWorkForkJoin;

import java.util.concurrent.RecursiveTask;

class Sumowanie extends RecursiveTask<Long> {
	
	private static final long serialVersionUID = 1L;
	private final long start, koniec;

	Sumowanie(long start, long koniec) {
		this.start = start;
		this.koniec = koniec;
	}

	@Override
	public Long compute() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName());
		long suma = 0;
		final long Porcja = 1000;
		if (koniec - start > Porcja) {
			long polowa = (koniec - start) / 2;
			Sumowanie s1 = new Sumowanie(start, start + polowa);
			
			s1.fork();
			Sumowanie s2 = new Sumowanie(start + polowa + 1, koniec);
			suma = s2.compute() + s1.join();
			System.out.println(Thread.currentThread().getName());
		} else {
			System.out.println(Thread.currentThread().getName());
			suma = sumujBezposrednio();
		}
		return suma;
	}

	// Ma³e sumy obliczaj sekwencyjnie
	public long sumujBezposrednio() {
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName());
		long suma = 0;
		for (long i = start; i <= koniec; ++i) {
			suma += i;
		}
		return suma;
	}
}
