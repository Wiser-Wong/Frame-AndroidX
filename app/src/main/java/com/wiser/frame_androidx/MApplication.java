package com.wiser.frame_androidx;

import android.app.Application;

import com.wiser.library.helper.WISERHelper;

/**
 * @author Wiser Created on 2020-01-07
 * <p>
 * 描述
 */
public class MApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        WISERHelper.newBind().Inject(this,true);
    }
}
