package com.majedalmoqbeli.examplefresco;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;

public class BaseActivity extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Fresco.initialize(this);
    }
}
