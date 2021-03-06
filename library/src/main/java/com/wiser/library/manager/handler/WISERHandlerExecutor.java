package com.wiser.library.manager.handler;

import java.util.concurrent.Executor;

import javax.inject.Inject;

import android.os.Handler;
import android.os.Looper;

import androidx.annotation.NonNull;

/**
 * @author Wiser
 * @version 版本
 */
public class WISERHandlerExecutor implements Executor {

	@Inject public WISERHandlerExecutor() {}

	private final Handler handler = new Handler(Looper.getMainLooper());

	@Override public void execute(@NonNull Runnable runnable) {
		handler.post(runnable);
	}

	public void execute(@NonNull Runnable runnable, long delayMillis) {
		handler.postDelayed(runnable, delayMillis);
	}

	public Handler getHandler() {
		return handler;
	}
}