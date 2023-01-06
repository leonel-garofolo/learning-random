package org.thread.lab.facade;

public interface BatchProcess {

	//not block any process thread
	Integer simpleProcess(Integer number);

	Integer nonStaticsimpleProcessSyncroniced(Integer number);


	//block method between thread by object
	Integer simpleProcessSyncronicedWithThis(Integer number);
}
