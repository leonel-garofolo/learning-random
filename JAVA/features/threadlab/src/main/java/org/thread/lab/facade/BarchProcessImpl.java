package org.thread.lab.facade;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.thread.lab.SimpleThreadCase;
import org.thread.lab.utils.UtilsThreadLab;

public class BarchProcessImpl implements BatchProcess{

	private final static Logger LOGGER = LoggerFactory.getLogger(SimpleThreadCase.class);

	@Override
	public Integer simpleProcess(Integer number) {
		return process("simpleProcess", number);
	}

	@Override
	public Integer nonStaticsimpleProcessSyncroniced(Integer number) {
		return process("simpleProcessSyncroniced", number);
	}

	/**
	 * Block process between thread
	 * @param number
	 * @return
	 */
	public static synchronized Integer simpleProcessSyncroniced(Integer number) {
		return process("simpleProcessSyncroniced", number);
	}

	/**
	 * Best practices to manager trheads by object
	 * @param number
	 * @return
	 */
	@Override
	public Integer simpleProcessSyncronicedWithThis(Integer number) {
		synchronized (number) {
			return process("simpleProcessSyncronicedWithThis", number);
		}
	}

	private static Integer process(String process, Integer number){
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
		number += 1;
		LOGGER.info("{} -> {} number:{}", UtilsThreadLab.getCurrentTime(), process, number);
		return number;
	}
}
