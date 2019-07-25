package com.example.mvptemplate.di.module;

import android.app.Service;

import dagger.Module;

@Module
public class ServiceModule {

    private Service mService;

    public ServiceModule(Service service) {
        mService = service;
    }

}
