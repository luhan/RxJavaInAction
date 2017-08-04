package com.safframework.study.app;

import android.annotation.TargetApi;
import android.content.ComponentCallbacks2;
import android.support.v7.app.AppCompatActivity;

import com.safframework.study.rximageloader.Utils;

/**
 * Created by Tony Shen on 2017/6/23.
 */

public class BaseActivity extends AppCompatActivity {

    @Override
    public void onLowMemory() {
        super.onLowMemory();
//        app.imageLoader.clearMemCache();
    }

    @Override
    @TargetApi(14)
    public void onTrimMemory(int level) {
        if (Utils.isICSOrHigher()) {
            super.onTrimMemory(level);

            if (level >= ComponentCallbacks2.TRIM_MEMORY_RUNNING_LOW) {
//                app.imageLoader.clearMemCache();
            }
        }
    }
}