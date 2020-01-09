package com.yanbing.blockcanary;

import android.app.Application;
import android.content.Context;

import com.yanbing.blockcanary.blockcanary.BlockCanary;

public class BlockCanaryApplication extends Application {
    private static Context sContext;

    @Override
    public void onCreate() {
        super.onCreate();
        sContext=this;
        BlockCanary.install(this,new AppContext()).start();
    }

    public static Context getAppContext() {
        return sContext;
    }
}
