package com.example.mvptemplate.di.component;

import com.example.mvptemplate.di.module.ActivityModule;
import com.example.mvptemplate.di.scope.PerActivity;

import dagger.Component;

@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {
}
