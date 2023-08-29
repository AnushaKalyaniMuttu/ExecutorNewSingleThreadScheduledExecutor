package com.bean;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ExecutorNewSingleThreadScheduledExecutor {
	/*
	 * Java Thread Pools
	 * 1.FixedThreadPool   Executor.newFixedThreadPool(int nThreads);
	 * 2.CacheThreadPool   Executor.newCachedThreadPool();
	 * 3.ScheduledThreadPool Executor.newScheduledThreadPool(int corePollSize);
	 * 4.SingleThreadedExecutor Executer.newSingleThreadScheduledExecutor();
	 */
	public static void main(String[] args) {
	
	ScheduledExecutorService service=Executors.newSingleThreadScheduledExecutor();
	
	service.execute(new Task());
	}

	static class Task implements Runnable{
		public void run() {
			System.out.println(Thread.currentThread().getName());
		}
	}
}
