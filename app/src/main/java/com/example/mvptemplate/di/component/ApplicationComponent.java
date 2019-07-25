package com.example.mvptemplate.di.component;

import com.example.mvptemplate.ChordNoteApp;
import com.example.mvptemplate.di.module.ApplicationModule;

import javax.inject.Inject;
import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(ChordNoteApp app);
}
