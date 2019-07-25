package com.example.mvptemplate.di.module;

import android.app.Application;
import android.content.Context;

import com.example.mvptemplate.data.DataManager;
import com.example.mvptemplate.data.db.DbHelper;
import com.example.mvptemplate.data.db.DbHelperImpl;
import com.example.mvptemplate.di.ApplicationContext;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class ApplicationModule {

    private final Application mApplication;

    public ApplicationModule(Application application) {
        mApplication = application;
    }

    @Provides
    @ApplicationContext
    Context provideContext() {
        return mApplication;
    }

    @Provides
    Application provideApplication() {
        return mApplication;
    }

    @Provides
    @Singleton
    DataManager provideDataManager(DataManager appDataManager) {
        return appDataManager;
    }

    @Provides
    @Singleton
    DbHelper provideDbHelper(DbHelperImpl appDbHelper) {
        return appDbHelper;
    }

}
