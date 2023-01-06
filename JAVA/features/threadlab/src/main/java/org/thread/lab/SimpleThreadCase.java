package org.thread.lab;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.thread.lab.facade.BarchProcessImpl;
import org.thread.lab.facade.BatchProcess;
import org.thread.lab.utils.UtilsThreadLab;

import java.util.stream.IntStream;

/**
 * Simple case, differents way to do fine or bad the synchronized method
 */
public class SimpleThreadCase implements Runnable {
	private final static Logger LOGGER = LoggerFactory.getLogger(SimpleThreadCase.class);

	private final String threadName;

	private Integer number;

	private final BatchProcess batchProcess;

	private final static int SIMPLE_PROCESS = 0;
	private final static int SIMPLE_PROCESS_SYNCRONIZED_METHOD = 1;
	private final static int SIMPLE_PROCESS_SYNCRONIZED_METHOD_STATIC = 2;
	private final static int SIMPLE_PROCESS_SYNCRONIZED_WITH_THIS = 3;

	private static int MODE;


	public static void main(String[] args) {
		MODE = SIMPLE_PROCESS_SYNCRONIZED_WITH_THIS;
		Integer number = 0;

		SimpleThreadCase runnable1 = new SimpleThreadCase("thread1", number);
		Thread thread1 = new Thread(runnable1);
		thread1.start();

		SimpleThreadCase runnable2 = new SimpleThreadCase("thread2", number);
		Thread thread2 = new Thread(runnable2);
		thread2.start();

		SimpleThreadCase runnable3 = new SimpleThreadCase("thread3", number);
		Thread thread3 = new Thread(runnable3);
		thread3.start();

		SimpleThreadCase runnable4 = new SimpleThreadCase("thread4", number);
		Thread thread4 = new Thread(runnable4);
		thread4.start();

		try {
			thread1.join();
			thread2.join();
			thread3.join();
			thread4.join();
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
	}

	public SimpleThreadCase(String threadName, Integer number) {
		this.threadName = threadName;
		this.batchProcess = new BarchProcessImpl();
		this.number = number;
	}

	public void run() {
		LOGGER.info("{} -> start", UtilsThreadLab.getCurrentTime());
		IntStream.range(0, 3).forEach(idx->{
			switch (this.MODE) {
			case SIMPLE_PROCESS:
				this.number = this.batchProcess.simpleProcess(this.number);
				break;
			case SIMPLE_PROCESS_SYNCRONIZED_METHOD:
				this.number = this.batchProcess.nonStaticsimpleProcessSyncroniced(this.number);
				break;
			case SIMPLE_PROCESS_SYNCRONIZED_METHOD_STATIC:
				this.number = BarchProcessImpl.simpleProcessSyncroniced(this.number);
				break;
			case SIMPLE_PROCESS_SYNCRONIZED_WITH_THIS:
				this.number = this.batchProcess.simpleProcessSyncronicedWithThis(this.number);
				break;
			}

			LOGGER.info("number -> {}", this.number);
		});
	}
}
