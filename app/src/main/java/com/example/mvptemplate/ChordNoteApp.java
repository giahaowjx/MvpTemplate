package com.example.mvptemplate;

import android.app.Application;

import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.interceptors.HttpLoggingInterceptor;
import com.example.mvptemplate.data.DataManager;
import com.example.mvptemplate.di.component.ApplicationComponent;
import com.example.mvptemplate.di.component.DaggerApplicationComponent;
import com.example.mvptemplate.di.module.ApplicationModule;

import javax.inject.Inject;

public class ChordNoteApp extends Application {

    @Inject
    DataManager manager;

    private ApplicationComponent mApplicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        mApplicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this)).build();

        mApplicationComponent.inject(this);

        AndroidNetworking.initialize(getApplicationContext());
        if (BuildConfig.DEBUG) {
            AndroidNetworking.enableLogging(HttpLoggingInterceptor.Level.BODY);
        }
    }

    public ApplicationComponent getComponent() {
        return mApplicationComponent;
    }

}
