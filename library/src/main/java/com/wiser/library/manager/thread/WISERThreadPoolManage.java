package com.wiser.library.manager.thread;

import java.util.concurrent.ExecutorService;

import javax.inject.Inject;

/**
 * @author Wiser
 * 
 *         线程池管理
 */
public class WISERThreadPoolManage {

	@Inject public WISERThreadPoolManage() {}

	/**
	 * 线程服务-网络线程池
	 **/
	private WISERHttpExecutorService wiserHttpExecutorService;

	/**
	 * 线程服务-并行工作线程池
	 **/
	private WISERWorkExecutorService wiserWorkExecutorService;

	/**
	 * 线程服务-串行工作线程池
	 **/
	private WISERSingleWorkExecutorService	wiserSingleWorkExecutorService;

	public synchronized ExecutorService getHttpExecutorService() {
		if (wiserHttpExecutorService == null) {
			wiserHttpExecutorService = new WISERHttpExecutorService();
		}
		return wiserHttpExecutorService;
	}

	public synchronized ExecutorService getSingleWorkExecutorService() {
		if (wiserSingleWorkExecutorService == null) {
			wiserSingleWorkExecutorService = new WISERSingleWorkExecutorService();
		}
		return wiserSingleWorkExecutorService;
	}

	public synchronized ExecutorService getWorkExecutorService() {
		if (wiserWorkExecutorService == null) {
			wiserWorkExecutorService = new WISERWorkExecutorService();
		}
		return wiserWorkExecutorService;
	}

	public synchronized void finish() {
		if (wiserHttpExecutorService != null) {
			wiserHttpExecutorService.shutdown();
			wiserHttpExecutorService = null;
		}
		if (wiserSingleWorkExecutorService != null) {
			wiserSingleWorkExecutorService.shutdown();
			wiserSingleWorkExecutorService = null;
		}
		if (wiserWorkExecutorService != null) {
			wiserWorkExecutorService.shutdown();
			wiserWorkExecutorService = null;
		}
	}

}
